package com.wimoor.amazon.profit.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wimoor.amazon.profit.pojo.entity.OutboundWeightFormat;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OutboundWeightFormatMapper extends BaseMapper<OutboundWeightFormat> {

    OutboundWeightFormat findByProductTierId(@Param("productTierId") String productTierId);
}
