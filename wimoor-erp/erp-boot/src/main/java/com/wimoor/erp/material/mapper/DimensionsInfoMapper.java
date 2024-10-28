package com.wimoor.erp.material.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wimoor.erp.material.pojo.entity.DimensionsInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DimensionsInfoMapper extends BaseMapper<DimensionsInfo> {

    DimensionsInfo findByAuthAsinSKU(@Param("shopId") String shopId, @Param("asinsku") String asinsku);

}