package springboot.fitseekcommon.DO;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author Yu'S'hui'shen
 */
@Data
@TableName("physical_test")
public class PhysicalTest {
    @TableId(value = "test_id", type = IdType.AUTO)
    private Long testId;

    @TableField("test_score")
    private BigDecimal testScore;

    private BigDecimal height;

    private BigDecimal weight;

    @TableField("run_50m")
    private BigDecimal run50m;

    @TableField("vital_capacity")
    private Integer vitalCapacity;

    @TableField("standing_jump")
    private Integer standingJump;

    @TableField("sit_and_reach")
    private BigDecimal sitAndReach;

    @TableField("sit_ups")
    private Integer sitUps;

    @TableField("pull_ups")
    private Integer pullUps;

    @TableField("run_800m")
    private Integer run800m;

    @TableField("run_1000m")
    private Integer run1000m;

    @TableField("test_time")
    private LocalDateTime testTime;

    @TableField(value = "create_time", insertStrategy = FieldStrategy.NOT_NULL)
    private LocalDateTime createTime;

    @TableField(value = "update_time", updateStrategy = FieldStrategy.NOT_NULL)
    private LocalDateTime updateTime;
}
