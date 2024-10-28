package com.wimoor.sys.tool.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wimoor.sys.tool.pojo.entity.SysQueryField;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author wimoor team
 * @since 2023-04-26
 */
@Mapper
public interface SysQueryFieldMapper extends BaseMapper<SysQueryField> {

    List<Map<String, Object>> findAllVersionByUser(@Param("userid") String userid, @Param("fquery") String queryname);

    List<SysQueryField> findByUserUsed(@Param("userid") String userid, @Param("fquery") String queryname);
}
