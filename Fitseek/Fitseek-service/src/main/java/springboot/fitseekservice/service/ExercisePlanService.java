package springboot.fitseekservice.service;

import springboot.fitseekcommon.POJO.DTO.ExerciseDTO;

/**
 * @author: YuShuishen
 */
public interface ExercisePlanService {

    // 生成计划
    String createPlan(ExerciseDTO exerciseDTO,String imageUrl);

}
