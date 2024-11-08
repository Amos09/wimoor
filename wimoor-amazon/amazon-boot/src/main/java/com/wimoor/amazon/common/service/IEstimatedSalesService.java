package com.wimoor.amazon.common.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wimoor.amazon.common.pojo.entity.EstimatedSales;
import com.wimoor.common.user.UserInfo;
import java.util.Map;

public interface IEstimatedSalesService extends IService<EstimatedSales> {

    EstimatedSales findEstimatedSales(Map<String, Object> param);

    Boolean updateEstimatedSale(UserInfo user, Map<String, Object> param);

    Boolean checkEstimatedSaleIsinvalid(EstimatedSales estimatedSales);

    void checkEstimatedSaleIsinvalid();

    int deleteEstimatedSale(UserInfo user, Map<String, Object> param);
}
