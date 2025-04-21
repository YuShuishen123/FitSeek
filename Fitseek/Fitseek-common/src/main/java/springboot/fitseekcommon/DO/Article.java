package springboot.fitseekcommon.DO;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author Yu'S'hui'shen
 */
@Data
@TableName("article")
public class Article {
    @TableId(value = "article_id", type = IdType.AUTO)
    private Long articleId;

    private String title;

    private String summary;

    private String author;

    @TableField("publish_time")
    private LocalDateTime publishTime;

    private String source;

    private String location;

    private String images;

    private String category;

    @TableField("is_featured")
    private Byte isFeatured = 0;

    @TableField(value = "create_time", insertStrategy = FieldStrategy.NOT_NULL)
    private LocalDateTime createTime;

    @TableField(value = "update_time", updateStrategy = FieldStrategy.NOT_NULL)
    private LocalDateTime updateTime;
}
