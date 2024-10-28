package com.wimoor.amazon.inbound.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wimoor.amazon.inbound.pojo.entity.ShipInboundBox;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ShipInboundBoxMapper extends BaseMapper<ShipInboundBox> {

    List<Map<String, Object>> findShipInboundBox(String shipmentid);

}