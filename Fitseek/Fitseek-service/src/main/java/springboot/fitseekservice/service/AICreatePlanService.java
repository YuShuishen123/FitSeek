package springboot.fitseekservice.service;

/**
 * @author Yu'S'hui'shen
 * @description 调用大模型生成计划详细内容接口
 */
public interface AICreatePlanService {
    /**
     * 创建计划
     * @param prompt  提示语
     * @return 完整json格式计划
     */
    String createPlan(String prompt);
}
