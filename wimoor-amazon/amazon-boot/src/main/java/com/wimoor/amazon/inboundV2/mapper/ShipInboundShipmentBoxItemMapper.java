package com.wimoor.amazon.inboundV2.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wimoor.amazon.inboundV2.pojo.entity.ShipInboundShipmentBoxItem;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ShipInboundShipmentBoxItemMapper extends BaseMapper<ShipInboundShipmentBoxItem> {

    List<ShipInboundShipmentBoxItem> findByShipment(String shipmentid);

}
