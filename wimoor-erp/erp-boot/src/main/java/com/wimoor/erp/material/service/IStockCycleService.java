package com.wimoor.erp.material.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wimoor.common.user.UserInfo;
import com.wimoor.erp.material.pojo.entity.StockCycle;
import java.util.List;
import java.util.Map;

public interface IStockCycleService extends IService<StockCycle> {

    List<Map<String, Object>> selectByMaterial(String id);

    void deleteByMaterial(String id);

    boolean updateStockCycle(StockCycle sc, UserInfo user);

    boolean updateMinCycle(Map<String, Object> map, UserInfo user);

    StockCycle findByMaterialAndWarehouse(String materialid, String warehouseid);
}
