package springboot.fitseekservice.service;

import springboot.fitseekcommon.Exception.CustomException;
import springboot.fitseekcommon.Exception.Response;
import springboot.fitseekcommon.POJO.DTO.BodyInfoDTO;

/**
 * @author Yu'S'hui'shen
 * @date 2025/4/26
 * @description  身体素质服务接口类
 */

public interface  BodyInfoService {

    // 插入体质信息
    Response<String> insertBodyInfo(BodyInfoDTO bodyInfoDTO);

    // 更新体质信息
    Response<String> updateBodyInfo(BodyInfoDTO bodyInfoDTO);

    // 查询体质信息
    Response<BodyInfoDTO> selectBodyInfo(Long userId) throws CustomException;

}
