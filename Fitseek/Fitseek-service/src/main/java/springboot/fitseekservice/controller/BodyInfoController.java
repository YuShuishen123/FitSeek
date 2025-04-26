package springboot.fitseekservice.controller;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springboot.fitseekcommon.Exception.Response;
import springboot.fitseekcommon.POJO.DTO.BodyInfoDTO;
import springboot.fitseekservice.service.BodyInfoService;

/**
 * @author Yu'S'hui'shen
 * @date 2025/4/26
 * @description 身体素质表控制器
 */
@RestController
@RequestMapping("/bodyInfo")
public class BodyInfoController {

    private final BodyInfoService bodyInfoService;

    public BodyInfoController(BodyInfoService bodyInfoService) {
        this.bodyInfoService = bodyInfoService;
    }

    @GetMapping("/selectBodyInfo")
    public Response<BodyInfoDTO> selectBodyInfo(Long userId) {

        // 后期从用户登陆信息中获取用户id,或者直接从请求头中获取用户id
        return bodyInfoService.selectBodyInfo(userId);
    }

    @GetMapping("/insertBodyInfo")
    public Response<String> insertBodyInfo(@Valid @RequestBody BodyInfoDTO bodyInfoDTO) {
        return bodyInfoService.insertBodyInfo(bodyInfoDTO);
    }

    @GetMapping("/updateBodyInfo")
    public Response<String> updateBodyInfo(@Valid @RequestBody BodyInfoDTO bodyInfoDTO) {
        return bodyInfoService.updateBodyInfo(bodyInfoDTO);
    }
}
