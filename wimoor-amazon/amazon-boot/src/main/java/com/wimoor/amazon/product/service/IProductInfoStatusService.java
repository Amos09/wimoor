package com.wimoor.amazon.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wimoor.amazon.product.pojo.entity.ProductInfoStatusDefine;
import com.wimoor.common.user.UserInfo;
import java.util.List;

public interface IProductInfoStatusService extends IService<ProductInfoStatusDefine> {

    List<ProductInfoStatusDefine> getProStatusByShop(String shopid);

    int updateProductInfoStatus(boolean isupdate, UserInfo user, String id, String name, String remark, String color);

    int deleteProductInfoStatus(String id, String shopid);
}
