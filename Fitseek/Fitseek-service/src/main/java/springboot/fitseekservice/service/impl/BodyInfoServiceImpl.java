package springboot.fitseekservice.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import springboot.fitseekcommon.Exception.CustomException;
import springboot.fitseekcommon.Exception.Response;
import springboot.fitseekcommon.POJO.DO.BodyInfo;
import springboot.fitseekcommon.POJO.DTO.BodyInfoDTO;
import springboot.fitseekservice.mapper.BodyInfoMapper;
import springboot.fitseekservice.service.BodyInfoService;

/**
 * @author Yu'S'hui'shen
 * @date 2025/4/26
 * @description 实现BodyInfoService接口
 */
@Service
public class BodyInfoServiceImpl implements BodyInfoService {

    Logger logger = LoggerFactory.getLogger(BodyInfoServiceImpl.class);

    private final BodyInfoMapper bodyInfoMapper;

    public BodyInfoServiceImpl(BodyInfoMapper bodyInfoMapper) {
        this.bodyInfoMapper = bodyInfoMapper;
    }

    @Override
    public Response<String> insertBodyInfo(BodyInfoDTO bodyInfoDTO) {
        BodyInfo bodyInfo = convertToBodyInfo(bodyInfoDTO);
        bodyInfoMapper.insert(bodyInfo);
        return Response.success("插入成功");
    }

    @Override
    public Response<String> updateBodyInfo(BodyInfoDTO bodyInfoDTO) {
        BodyInfo bodyInfo = convertToBodyInfo(bodyInfoDTO);
        bodyInfoMapper.updateById(bodyInfo);
        return Response.success("更新成功");
    }

    @Override
    public Response<BodyInfoDTO> selectBodyInfo(Long userId) throws CustomException {
        Long bodyId = bodyInfoMapper.getBodyIdByUserId(userId);
        if (bodyId == null) {
            // 处理查询失败的情况
            throw new CustomException("身体素质基本信息为空",400);
        }
        BodyInfo bodyInfo = bodyInfoMapper.selectById(bodyId);
        if(bodyInfo == null) {
            // 处理查询失败的情况
            throw new CustomException("查询失败",500);
        }
        return Response.success("查询成功", convertToBodyInfoDTO(bodyInfo));
    }

    private BodyInfoDTO convertToBodyInfoDTO(BodyInfo bodyInfo) {
        BodyInfoDTO bodyInfoDTO = new BodyInfoDTO();
        bodyInfoDTO.setBodyId(bodyInfo.getBodyId());
        bodyInfoDTO.setGender(bodyInfo.getGender());
        bodyInfoDTO.setAge(bodyInfo.getAge());
        bodyInfoDTO.setHeight(bodyInfo.getHeight());
        bodyInfoDTO.setWeight(bodyInfo.getWeight());
        bodyInfoDTO.setHobby1(bodyInfo.getHobby1());
        bodyInfoDTO.setHobby2(bodyInfo.getHobby2());
        bodyInfoDTO.setHobby3(bodyInfo.getHobby3());
        bodyInfoDTO.setHobby4(bodyInfo.getHobby4());
        bodyInfoDTO.setExerciseFrequency(bodyInfo.getExerciseFrequency());
        bodyInfoDTO.setExerciseDuration(bodyInfo.getExerciseDuration());
        return bodyInfoDTO;
    }

    private BodyInfo convertToBodyInfo(BodyInfoDTO bodyInfoDTO) {
        BodyInfo bodyInfo = new BodyInfo();
        bodyInfo.setBodyId(bodyInfoDTO.getBodyId());
        bodyInfo.setGender(bodyInfoDTO.getGender());
        bodyInfo.setAge(bodyInfoDTO.getAge());
        bodyInfo.setHeight(bodyInfoDTO.getHeight());
        bodyInfo.setWeight(bodyInfoDTO.getWeight());
        bodyInfo.setHobby1(bodyInfoDTO.getHobby1());
        bodyInfo.setHobby2(bodyInfoDTO.getHobby2());
        bodyInfo.setHobby3(bodyInfoDTO.getHobby3());
        bodyInfo.setHobby4(bodyInfoDTO.getHobby4());
        bodyInfo.setExerciseFrequency(bodyInfoDTO.getExerciseFrequency());
        bodyInfo.setExerciseDuration(bodyInfoDTO.getExerciseDuration());
        return bodyInfo;
    }
}
