package springboot.fitseekservice.service;

/**
 * @author: YuShuishen
 * 创建计划服务接口
 */
public interface CreatePlanService {
    /**
     * 创建计划
     * @param prompt  提示语
     * @return 完整json格式计划
     */
    String createPlan(String prompt);
}
