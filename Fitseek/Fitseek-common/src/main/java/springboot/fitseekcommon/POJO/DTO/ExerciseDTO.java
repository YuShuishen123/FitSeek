package springboot.fitseekcommon.POJO.DTO;

import lombok.Data;

import java.time.LocalDate;

/**
 * YuShuishen
 * 该实体用于规定前端调用计划生成接口实所需要提升的json参数格式
 */
@Data
public class ExerciseDTO {
    private Long userId;
    private String planName;
    private String planType;
    private String planGoal;
    private LocalDate startDate;
    private LocalDate endDate;
    private String exerciseIntensity;
    private String medicalHistory;
    private String planDescription;
}
