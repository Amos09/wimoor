package com.wimoor.erp.stock.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wimoor.erp.stock.pojo.entity.DispatchFormEntry;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DispatchFormEntryMapper extends BaseMapper<DispatchFormEntry> {

    List<Map<String, Object>> selectByFormid(@Param("formid") String formid);

    List<Map<String, Object>> findFormDetailByFormid(@Param("formid") String formid,
            @Param("warehouseid") String warehouseid,
            @Param("warehouseid2") String warehouseid2, @Param("shopid") String shopid);
}