package com.wimoor.erp.ship.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wimoor.erp.ship.mapper.ShipTransDetailMapper;
import com.wimoor.erp.ship.pojo.entity.ShipTransDetail;
import com.wimoor.erp.ship.service.IShipTransDetailService;
import org.springframework.stereotype.Service;

@Service("shipTransDetailService")
public class ShipTransDetailServiceImpl extends ServiceImpl<ShipTransDetailMapper, ShipTransDetail> implements
        IShipTransDetailService {

    @Override
    public int usedTransType(String shopid, String transtype) {
        // TODO Auto-generated method stub
        return this.baseMapper.usedTransType(shopid, transtype);
    }


}
