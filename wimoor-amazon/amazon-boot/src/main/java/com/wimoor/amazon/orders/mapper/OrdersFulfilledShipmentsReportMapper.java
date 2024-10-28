package com.wimoor.amazon.orders.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wimoor.amazon.orders.pojo.entity.OrdersFulfilledShipmentsReport;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrdersFulfilledShipmentsReportMapper extends BaseMapper<OrdersFulfilledShipmentsReport> {

    int insertBatch(List<OrdersFulfilledShipmentsReport> list);

    int moveBatch(@Param("amazonauthid") String amazonauthid);

    List<OrdersFulfilledShipmentsReport> list(Map<String, Object> param);
}
