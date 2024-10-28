package com.wimoor.amazon.common.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wimoor.amazon.common.pojo.entity.DimensionsInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DimensionsInfoMapper extends BaseMapper<DimensionsInfo> {

    DimensionsInfo findByAuthAsinSKU(@Param("shopId") String shopId, @Param("asinsku") String asinsku);

}