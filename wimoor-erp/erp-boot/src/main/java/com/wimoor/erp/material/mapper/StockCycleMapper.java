package com.wimoor.erp.material.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wimoor.erp.material.pojo.entity.StockCycle;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockCycleMapper extends BaseMapper<StockCycle> {

    List<Map<String, Object>> selectByMaterial(String materialid);

    void deleteByMaterial(String materialid);
}