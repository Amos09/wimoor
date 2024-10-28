package com.wimoor.amazon.auth.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wimoor.amazon.auth.pojo.entity.FollowOffer;
import java.util.List;
import java.util.Map;

public interface IFollowOfferService extends IService<FollowOffer> {

    List<Map<String, Object>> getNeedUpdate();

    int updateSellerName(String sellerid, String sellerName, int refreshnum);
}
