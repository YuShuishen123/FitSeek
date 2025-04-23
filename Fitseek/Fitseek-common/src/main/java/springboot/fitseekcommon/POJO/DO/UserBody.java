package springboot.fitseekcommon.POJO.DO;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author Yu'S'hui'shen
 */
@Data
@TableName("user_body")
public class UserBody {
    @TableId(value = "user_id", type = IdType.INPUT)
    private Long userId;

    @TableId(value = "body_id", type = IdType.INPUT)
    private Long bodyId;
}
