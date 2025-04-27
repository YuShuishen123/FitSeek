package springboot.fitseekcommon.POJO.DTO;

import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import java.math.BigDecimal;

/**
 * @author Yu'S'hui'shen
 * @date 2025/4/26
 * @description 身体基本信息请求体
 */
@Validated
@Data
public class BodyInfoDTO {

    private Integer bodyId;

    @Pattern(regexp = "^([MFU])$", message = "gender只能是'M'、'F'或'U'")
    private String gender = "U";
    private Integer age;
    private BigDecimal height;
    private BigDecimal weight;
    private String hobby1;
    private String hobby2;
    private String hobby3;
    private String hobby4;
    // 运动频率
    private String exerciseFrequency;
    // 运动时长
    private String exerciseDuration;

}
