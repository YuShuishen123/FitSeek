package springboot.fitseekservice.util;


import com.google.gson.Gson;
import com.google.gson.JsonObject;
import feign.Feign;
import feign.Response;
import feign.okhttp.OkHttpClient;
import springboot.fitseekservice.feignClient.AiFeignClient;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * AI 客户端工具类，用于封装流式 AI 调用
 * @author Yu'S'hui'shen
 */
public class AiClientUtil {
    private static final String API_URL = "https://ark.cn-beijing.volces.com";
    private static final String API_KEY = "8c14b5fe-096a-49f5-9cee-7307dbbb7b55";
    private static final int TYPING_DELAY_MS = 50;
    private static final AiFeignClient aiService;

    // 静态初始化 Feign 客户端
    static {
        aiService = Feign.builder()
                .client(new OkHttpClient())
                .target(AiFeignClient.class, API_URL);
    }

    /**
     * 调用 AI 并逐字打印回复
     * @param prompt 用户输入的提示语
     */
    public static void callAi(String prompt) {
        try {
            // 构造请求体
            JsonObject requestBody = buildRequestBody(prompt);

            // 调用 API 并处理流式响应
            try (Response response = aiService.streamResponse(requestBody.toString(), API_KEY)) {
                try (BufferedReader reader = new BufferedReader(
                        new InputStreamReader(response.body().asInputStream(), StandardCharsets.UTF_8))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        if (line.startsWith("data:")) {
                            String jsonStr = line.substring(5).trim();
                            try {
                                JsonObject jsonLine = new Gson().fromJson(jsonStr, JsonObject.class);
                                if (jsonLine.has("choices")) {
                                    JsonObject choice = jsonLine.getAsJsonArray("choices")
                                            .get(0).getAsJsonObject();
                                    if (choice.has("delta")) {
                                        JsonObject delta = choice.getAsJsonObject("delta");
                                        if (delta.has("content")) {
                                            String content = delta.get("content").getAsString();
                                            printTypingEffect(content);
                                        }
                                    }
                                }
                            } catch (Exception e) {
                                continue; // 跳过解析失败的行
                            }
                        }
                    }
                }
            }
            System.out.println(); // 最后换行
        } catch (Exception e) {
            System.out.println("\nAI 调用失败: " + e.getMessage());
        }
    }

    // 构造请求体
    private static JsonObject buildRequestBody(String prompt) {
        JsonObject requestBody = new JsonObject();
        requestBody.addProperty("model", "bot-20250226202102-rm7vh");
        requestBody.addProperty("stream", true);
        JsonObject streamOptions = new JsonObject();
        streamOptions.addProperty("include_usage", true);
        requestBody.add("stream_options", streamOptions);

        // 构造 messages 数组
        List<JsonObject> messages = new ArrayList<>();
        JsonObject systemMessage = new JsonObject();
        systemMessage.addProperty("role", "system");
        systemMessage.addProperty("content", "You are a helpful assistant.");
        JsonObject userMessage = new JsonObject();
        userMessage.addProperty("role", "user");
        userMessage.addProperty("content", prompt );
        messages.add(systemMessage);
        messages.add(userMessage);
        requestBody.add("messages", new Gson().toJsonTree(messages));

        return requestBody;
    }

    // 逐字打印效果
    private static void printTypingEffect(String text) throws InterruptedException {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            System.out.flush();
            Thread.sleep(TYPING_DELAY_MS);
        }
    }
}
