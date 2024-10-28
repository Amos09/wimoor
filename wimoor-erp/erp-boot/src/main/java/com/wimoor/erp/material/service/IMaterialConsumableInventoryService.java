package com.wimoor.erp.material.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wimoor.common.user.UserInfo;
import com.wimoor.erp.material.pojo.entity.MaterialConsumableInventory;
import java.math.BigDecimal;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author wimoor team
 * @since 2023-05-09
 */
public interface IMaterialConsumableInventoryService extends IService<MaterialConsumableInventory> {

    Boolean save(UserInfo user, String id, String warehouseid, BigDecimal residue);
}
