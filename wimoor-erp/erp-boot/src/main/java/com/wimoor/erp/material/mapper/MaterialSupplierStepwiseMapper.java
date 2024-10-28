package com.wimoor.erp.material.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wimoor.erp.material.pojo.entity.MaterialSupplierStepwise;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MaterialSupplierStepwiseMapper extends BaseMapper<MaterialSupplierStepwise> {

    List<MaterialSupplierStepwise> selectSupplierByMainId(@Param("id") String id, @Param("supid") String supid);

}