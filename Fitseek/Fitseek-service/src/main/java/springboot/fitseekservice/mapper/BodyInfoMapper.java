package springboot.fitseekservice.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import springboot.fitseekcommon.POJO.DO.BodyInfo;

import java.io.Serializable;

/**
 * @author Yu'S'hui'shen
 * @date 2025/4/26
 * @description 用户身体信息数据持久化层
 */
@Mapper
public interface BodyInfoMapper extends BaseMapper<BodyInfo> {

    /**
     * @param bodyInfo 用户身体信息实体
     * @return 添加结果
     */
    @Override
    int insert(BodyInfo bodyInfo);

    @Override
    int updateById(BodyInfo bodyInfo);

    @Override
    BodyInfo selectById(Serializable id);

}
