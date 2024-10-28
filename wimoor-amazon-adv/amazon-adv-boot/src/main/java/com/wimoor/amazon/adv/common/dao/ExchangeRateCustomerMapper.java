package com.wimoor.amazon.adv.common.dao;

import com.wimoor.amazon.adv.common.pojo.ExchangeRateCustomer;
import com.wimoor.amazon.base.BaseMapper;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ExchangeRateCustomerMapper extends BaseMapper<ExchangeRateCustomer> {

    List<Map<String, Object>> getMyExchangeRate(String shopid);
}