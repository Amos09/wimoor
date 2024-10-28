package com.wimoor.amazon.inbound.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wimoor.amazon.inbound.pojo.entity.ShipInboundBox;
import java.util.List;
import java.util.Map;

public interface IShipInboundBoxService extends IService<ShipInboundBox> {

    public List<ShipInboundBox> findListByShipmentId(String shipmentid);

    public List<Map<String, Object>> findShipInboundBox(String shipmentid);
}
