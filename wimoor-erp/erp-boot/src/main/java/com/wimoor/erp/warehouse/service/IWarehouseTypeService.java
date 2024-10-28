package com.wimoor.erp.warehouse.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.wimoor.erp.warehouse.pojo.entity.WarehouseType;
import java.util.List;

public interface IWarehouseTypeService extends IService<WarehouseType> {

    public List<WarehouseType> findByShopid(String shopid);
}
