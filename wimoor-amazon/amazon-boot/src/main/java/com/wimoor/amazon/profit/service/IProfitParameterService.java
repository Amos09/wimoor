package com.wimoor.amazon.profit.service;

import com.wimoor.common.user.UserInfo;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;


public interface IProfitParameterService {

    Map<String, String> findInplacefee(String country);

    Map<String, BigDecimal> findManualProcessingFee();

    List<BigDecimal> getStorageFeeMap(String country);

    Map<String, String> findNoBindPointNameByGroup(UserInfo user, String groupid);

}
