package springboot.fitseekservice.service.impl;

import org.springframework.stereotype.Service;
import springboot.fitseekservice.service.AICreatePlanService;
import springboot.fitseekservice.util.AiClientUtil;

/**
 * @author Yu'S'hui'shen
 * @description 调用大模型生成计划详细内容接口
 */
@Service
public class AIAICreatePlanServiceImpl implements AICreatePlanService {
    @Override
    public String createPlan(String prompt) {
        return AiClientUtil.callAi(prompt);
    }
}
