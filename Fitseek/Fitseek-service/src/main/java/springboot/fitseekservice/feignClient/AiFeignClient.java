package springboot.fitseekservice.feignClient;


import feign.Headers;
import feign.RequestLine;
import feign.Response;
/**
 * @author Yu'S'hui'shen
 */
public interface AiFeignClient {
    @RequestLine("POST /api/v3/bots/chat/completions")
    @Headers({
            "Authorization: Bearer {apiKey}",
            "Content-Type: application/json"
    })
    Response streamResponse(String requestBody, @feign.Param("apiKey") String apiKey);
}
