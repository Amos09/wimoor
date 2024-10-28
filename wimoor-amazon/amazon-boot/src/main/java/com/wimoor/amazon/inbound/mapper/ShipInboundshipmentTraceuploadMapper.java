package com.wimoor.amazon.inbound.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wimoor.amazon.inbound.pojo.entity.ShipInboundshipmentTraceupload;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author wimoor team
 * @since 2023-07-26
 */
@Mapper
public interface ShipInboundshipmentTraceuploadMapper extends BaseMapper<ShipInboundshipmentTraceupload> {

    List<ShipInboundshipmentTraceupload> listByAuth();

}
