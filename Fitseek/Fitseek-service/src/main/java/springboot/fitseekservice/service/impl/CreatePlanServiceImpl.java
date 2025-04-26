package springboot.fitseekservice.service.impl;

import org.springframework.stereotype.Service;
import springboot.fitseekservice.service.CreatePlanService;
import springboot.fitseekservice.util.AiClientUtil;

/**
 * @author Yu'S'hui'shen
 * @description 调用大模型生成计划详细内容接口
 */
@Service
public class CreatePlanServiceImpl implements CreatePlanService {
    @Override
    public String createPlan(String prompt) {
        return AiClientUtil.callAi(prompt);
    }
}
