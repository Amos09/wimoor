package com.wimoor.amazon.common.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wimoor.amazon.common.pojo.entity.ExchangeRateCustomer;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ExchangeRateCustomerMapper extends BaseMapper<ExchangeRateCustomer> {

    List<Map<String, Object>> getMyExchangeRate(String shopid);

    List<Map<String, Object>> getMyExchangeRateByDay(String shopid, String byday);
}
