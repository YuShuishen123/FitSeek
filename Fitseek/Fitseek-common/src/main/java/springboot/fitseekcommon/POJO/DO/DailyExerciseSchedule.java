package springboot.fitseekcommon.POJO.DO;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author Yu'S'hui'shen
 */
@Data
@TableName("daily_exercise_schedule")
public class DailyExerciseSchedule {
    @TableId(value = "schedule_id", type = IdType.AUTO)
    private Long scheduleId;

    @TableField("plan_id")
    private Long planId;

    @TableField("schedule_date")
    private LocalDate scheduleDate;

    @TableField("is_checked")
    private Byte isChecked = 0;

    @TableField("schedule_content")
    private String scheduleContent;

    @TableField(value = "create_time", insertStrategy = FieldStrategy.NOT_NULL)
    private LocalDateTime createTime;

    @TableField(value = "update_time", updateStrategy = FieldStrategy.NOT_NULL)
    private LocalDateTime updateTime;
}
