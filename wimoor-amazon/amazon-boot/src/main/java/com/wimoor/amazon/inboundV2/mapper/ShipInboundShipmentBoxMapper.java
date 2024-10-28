package com.wimoor.amazon.inboundV2.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wimoor.amazon.inboundV2.pojo.entity.ShipInboundShipmentBox;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ShipInboundShipmentBoxMapper extends BaseMapper<ShipInboundShipmentBox> {

    List<Map<String, Object>> findShipInboundBox(String shipmentid);

}
