package springboot.fitseekcommon.POJO.DO;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author Yu'S'hui'shen
 */
@Data
@TableName("article_content_relation")
public class ArticleContentRelation {
    @TableId(value = "article_id", type = IdType.INPUT)
    private Long articleId;

    @TableId(value = "content_id", type = IdType.INPUT)
    private Long contentId;
}
