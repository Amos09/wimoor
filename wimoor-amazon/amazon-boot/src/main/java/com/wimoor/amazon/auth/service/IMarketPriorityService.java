package com.wimoor.amazon.auth.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.wimoor.amazon.auth.pojo.entity.MarketPriority;
import com.wimoor.amazon.auth.pojo.entity.Marketplace;
import com.wimoor.common.user.UserInfo;
import java.util.List;

public interface IMarketPriorityService extends IService<MarketPriority> {

    public String saveMarketPriority(UserInfo userinfo, List<MarketPriority> list);

    public List<Marketplace> findMarketplaceByGroup(String groupid);
}
