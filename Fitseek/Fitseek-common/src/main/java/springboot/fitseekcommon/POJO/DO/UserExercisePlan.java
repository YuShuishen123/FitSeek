package springboot.fitseekcommon.POJO.DO;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author Yu'S'hui'shen
 */
@Data
@TableName("user_exercise_plan")
public class UserExercisePlan {
    @TableId(value = "user_id", type = IdType.INPUT)
    private Long userId;

    @TableId(value = "plan_id", type = IdType.INPUT)
    private Long planId;
}
