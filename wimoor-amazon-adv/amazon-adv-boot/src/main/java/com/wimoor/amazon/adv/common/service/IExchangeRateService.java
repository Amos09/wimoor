package com.wimoor.amazon.adv.common.service;

import com.wimoor.amazon.adv.common.pojo.ExchangeRate;
import java.util.List;

public interface IExchangeRateService extends IService<ExchangeRate> {

    public List<ExchangeRate> getExchangeRateLimit();

    public ExchangeRate selectByName(String from);

    public ExchangeRate selectMineByName(String from, String shopid);
}
