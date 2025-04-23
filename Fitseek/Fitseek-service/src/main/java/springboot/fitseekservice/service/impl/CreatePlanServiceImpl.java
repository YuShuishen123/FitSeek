package springboot.fitseekservice.service.impl;

import org.springframework.stereotype.Service;
import springboot.fitseekservice.service.CreatePlanService;
import springboot.fitseekservice.util.AiClientUtil;

@Service
public class CreatePlanServiceImpl implements CreatePlanService {
    @Override
    public String createPlan(String prompt) {
        return AiClientUtil.callAi(prompt);
    }
}
