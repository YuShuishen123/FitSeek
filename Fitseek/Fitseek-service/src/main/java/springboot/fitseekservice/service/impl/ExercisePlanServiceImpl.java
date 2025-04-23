package springboot.fitseekservice.service.impl;

import springboot.fitseekcommon.POJO.DTO.ExerciseDTO;
import springboot.fitseekservice.mapper.ExercisePlanMapper;
import springboot.fitseekservice.service.ExercisePlanService;

public class ExercisePlanServiceImpl implements ExercisePlanService {

    ExercisePlanMapper exercisePlanMapper;

    public ExercisePlanServiceImpl(ExercisePlanMapper exercisePlanMapper) {
        this.exercisePlanMapper = exercisePlanMapper;
    }

    @Override
    public String createPlan(ExerciseDTO exerciseDTO,String imageUrl) {

        // 第一步:根据用户id获取该用户的body_info

        // 第二步:如果planType字段包含"体侧提分",则获取用户的physical_test内容

        // 第三步:将以上信息组合为完整的提示词,进行ai调用,以生成计划

        // 第四步:提取ai生成的计划,将其中的内容填写到计划表所需的字段,以组成一个完整的计划行

        // 第五步: 将计划行插入到计划表,将每日方案计划插入每日运动方案表

    }
}
