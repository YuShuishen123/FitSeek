package springboot.fitseekcommon.DO;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author Yu'S'hui'shen
 */
@Data
@TableName("article_content")
public class ArticleContent {
    @TableId(value = "content_id", type = IdType.AUTO)
    private Long contentId;

    private String content;

    @TableField(value = "create_time", insertStrategy = FieldStrategy.NOT_NULL)
    private LocalDateTime createTime;

    @TableField(value = "update_time", updateStrategy = FieldStrategy.NOT_NULL)
    private LocalDateTime updateTime;
}
