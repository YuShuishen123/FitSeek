package springboot.fitseekservice.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
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
     * @param userId 用户id
     * @return 查询结果
     */
    @Select("select body_id from user_body where user_id = #{userId}")
    Long getBodyIdByUserId(@Param("userId") Long userId);

    /**
     * @param bodyInfo 用户身体信息实体
     * @return 添加结果
     */
    @Override
    int insert(BodyInfo bodyInfo);

    @Override
    int updateById(@Param("et") BodyInfo entity);

    @Override
    BodyInfo selectById(Serializable id);

}
