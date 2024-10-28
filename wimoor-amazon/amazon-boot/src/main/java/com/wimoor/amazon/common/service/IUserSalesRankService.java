package com.wimoor.amazon.common.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wimoor.amazon.common.pojo.entity.UserSalesRank;
import java.util.Date;
import java.util.Map;

public interface IUserSalesRankService extends IService<UserSalesRank> {

    void summaryAllUserSales();

    public IPage<Map<String, Object>> findRankByShop(Page<?> page, String shopid, String daytype);

    public Date getSummaryLastDate();
}
