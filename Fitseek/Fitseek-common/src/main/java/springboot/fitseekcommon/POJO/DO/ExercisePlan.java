package springboot.fitseekcommon.POJO.DO;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author Yu'S'hui'shen
 */
@Data
@TableName("exercise_plan")
public class ExercisePlan {
    @TableId(value = "plan_id", type = IdType.AUTO)
    private Long planId;

    @TableField("plan_name")
    private String planName;

    @TableField("plan_type")
    private String planType;

    @TableField("plan_goal")
    private String planGoal;

    @TableField("start_date")
    private LocalDate startDate;

    @TableField("end_date")
    private LocalDate endDate;

    @TableField("exercise_intensity")
    private String exerciseIntensity;

    @TableField("medical_history")
    private String medicalHistory;

    @TableField("plan_description")
    private String planDescription;

    @TableField("plan_image")
    private String planImage;

    @TableField("deepseek_advice")
    private String deepseekAdvice;

    @TableField("improvement_tips")
    private String improvementTips;

    @TableField("ai_message")
    private String aiMessage;

    @TableField(value = "create_time", insertStrategy = FieldStrategy.NOT_NULL)
    private LocalDateTime createTime;

    @TableField(value = "update_time", updateStrategy = FieldStrategy.NOT_NULL)
    private LocalDateTime updateTime;
}
