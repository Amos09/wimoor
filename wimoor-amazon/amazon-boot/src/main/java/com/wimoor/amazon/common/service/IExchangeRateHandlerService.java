package com.wimoor.amazon.common.service;

import com.wimoor.common.mvc.BizException;
import java.math.BigDecimal;
import java.util.Map;

public interface IExchangeRateHandlerService {

    public Map<String, BigDecimal> currencyChangeRate(String toCurrency) throws BizException;

    public Map<String, BigDecimal> currencyChangeRateByLocal(String shopid, String toCurrency) throws BizException;

    public BigDecimal changeCurrencyByLocal(String from, String to, BigDecimal money) throws BizException;

    public BigDecimal changeCurrencyByLocal(String from, String to, BigDecimal money, int point) throws BizException;

    public BigDecimal changeCurrencyByLocal(String shopid, String from, String to, BigDecimal money)
            throws BizException;

    public BigDecimal changeCurrencyByLocal(String shopid, String from, String to, BigDecimal money, int point)
            throws BizException;
}
