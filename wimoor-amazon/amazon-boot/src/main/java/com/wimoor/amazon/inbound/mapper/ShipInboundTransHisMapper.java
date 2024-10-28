package com.wimoor.amazon.inbound.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wimoor.amazon.inbound.pojo.entity.ShipInboundTransHis;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ShipInboundTransHisMapper extends BaseMapper<ShipInboundTransHis> {

    List<Map<String, Object>> getSelfTransHis(@Param("shopid") String shopid, @Param("shipmentid") String shipmentid);


}