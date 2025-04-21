package springboot.fitseekcommon.DO;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author Yu'S'hui'shen
 */
@Data
@TableName("user_physical_test")
public class UserPhysicalTest {
    @TableId(value = "user_id", type = IdType.INPUT)
    private Long userId;

    @TableId(value = "test_id", type = IdType.INPUT)
    private Long testId;
}
