package springboot.fitseekcommon.DO;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import org.apache.ibatis.type.JdbcType;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author Yu'S'hui'shen
 */
@Data
@TableName("body_info")
public class BodyInfo {
    @TableId(value = "body_id", type = IdType.AUTO)
    private Integer bodyId;

    @TableField(value = "gender", jdbcType = JdbcType.CHAR)
    private String gender = "U";

    private Integer age;

    private BigDecimal height;

    private BigDecimal weight;

    @TableField("sport_hobbies")
    private String sportHobbies;

    @TableField("exercise_frequency")
    private String exerciseFrequency = "未知";

    @TableField("exercise_duration")
    private String exerciseDuration = "未知";

    @TableField(value = "create_time", insertStrategy = FieldStrategy.NOT_NULL)
    private LocalDateTime createTime;

    @TableField(value = "update_time", updateStrategy = FieldStrategy.NOT_NULL)
    private LocalDateTime updateTime;
}