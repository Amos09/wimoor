package com.wimoor.erp.stock.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wimoor.erp.stock.pojo.entity.OutWarehouseFormEntry;
import java.util.List;
import java.util.Map;

public interface IOutWarehouseFormEntryService extends IService<OutWarehouseFormEntry> {

    List<Map<String, Object>> selectByFormid(String formid);

    void deleteByFormid(String formid);

    List<Map<String, Object>> findFormDetailByFormid(String string);

    public Map<String, Object> findLast(String shopid, String warehouseid, String materialid);
}
