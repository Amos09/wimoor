package com.wimoor.amazon.inbound.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wimoor.amazon.inbound.pojo.entity.ShipAddress;
import java.util.List;

public interface IShipAddressService extends IService<ShipAddress> {

    IPage<ShipAddress> findByCondition(Page<?> page, String shopid, String groupid, String marketplaceid,
            String disable, String search);

    List<ShipAddress> getDefaultFromAdress(String shopid);

}
