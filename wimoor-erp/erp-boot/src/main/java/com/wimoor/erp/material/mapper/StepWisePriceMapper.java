package com.wimoor.erp.material.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wimoor.erp.material.pojo.entity.StepWisePrice;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StepWisePriceMapper extends BaseMapper<StepWisePrice> {

    void deleteIsNull();


    List<StepWisePrice> selectByMaterial(String material);

    void deleteByMaterial(String material);

    Map<String, Object> selectAssByMaterial(@Param("material") String materialid);
}