package springboot.fitseekcommon.POJO.DTO;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author Yu'S'hui'shen
 * @date 2025/4/26
 * @description 身体基本信息请求体
 */
@Validated
@Data
public class BodyInfoDTO {

    @Pattern(regexp = "^([MFU])$", message = "gender只能是'M'、'F'或'U'")
    private String gender = "U";

    private Integer age;

    private BigDecimal height;

    private BigDecimal weight;

    // 用户运动爱好，JSON数组格式，如["篮球","游泳"]
    @Size(max = 200, message = "sportHobbies列表长度不能超过4个")
    @Valid
    private List<String> sportHobbies;

    // 运动频率
    private String exerciseFrequency;

    // 运动时长
    private String exerciseDuration;

}
