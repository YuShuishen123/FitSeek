package springboot.fitseekcommon.POJO.DO;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import org.apache.ibatis.type.JdbcType;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author Yu'S'hui'shen
 */
@Data
@TableName("user")
public class User {
    @TableId(type = IdType.AUTO)
    private Integer id;

    @TableField("user_id")
    private Long userId;

    private String phone;

    private String email;

    private String password;

    private String nickname;

    private String avatar;

    @TableField("background_img")
    private String backgroundImg;

    private String region;

    @TableField(value = "gender", jdbcType = JdbcType.CHAR)
    private String gender = "U";

    private LocalDate birthday;

    private String school;

    @TableField("register_time")
    private LocalDateTime registerTime;

    private String signature;

    @TableField("photo_album")
    private String photoAlbum;

    @TableField(value = "create_time", insertStrategy = FieldStrategy.NOT_NULL)
    private LocalDateTime createTime;

    @TableField(value = "update_time", updateStrategy = FieldStrategy.NOT_NULL)
    private LocalDateTime updateTime;
}