package com.wimoor.erp.ship.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wimoor.erp.ship.pojo.entity.ShipInboundShipmentTemplateFile;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ShipInboundShipmentTemplateFileMapper extends BaseMapper<ShipInboundShipmentTemplateFile> {

    ShipInboundShipmentTemplateFile findCustomsByNameAndShopid(@Param("shopid") String shopid,
            @Param("filename") String filename);

    List<Map<String, Object>> selectCustomsRecordByShop(String shopid);

}