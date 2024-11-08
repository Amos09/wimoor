package com.wimoor.amazon.adv.common.dao;

import com.wimoor.amazon.adv.common.pojo.ExchangeRate;
import com.wimoor.amazon.base.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface ExchangeRateMapper extends BaseMapper<ExchangeRate> {

    ExchangeRate selectByName(String name);

    ExchangeRate selectMineByName(@Param("name") String name, @Param("shopid") String shopid);

    List<ExchangeRate> getExchangeRateLimit();
}