package com.wimoor.erp.purchase.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wimoor.erp.purchase.mapper.PurchaseWareHouseStatusMapper;
import com.wimoor.erp.purchase.pojo.entity.PurchaseWareHouseStatus;
import com.wimoor.erp.purchase.service.IPurchaseWareHouseStatusService;
import org.springframework.stereotype.Service;

@Service("purchaseWareHouseStatusService")
public class PurchaseWareHouseStatusServiceImpl extends
        ServiceImpl<PurchaseWareHouseStatusMapper, PurchaseWareHouseStatus> implements IPurchaseWareHouseStatusService {


}
