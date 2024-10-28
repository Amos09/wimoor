package com.wimoor.amazon.profit.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wimoor.amazon.profit.pojo.entity.FBAFormat;
import java.math.BigDecimal;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface FBAFormatMapper extends BaseMapper<FBAFormat> {

    FBAFormat findByProductTierIdAndIsMedia(@Param("productTierId") String productTierId,
            @Param("isMedia") Boolean isMedia, @Param("country") String country);

    FBAFormat findByProductTierIdNew(@Param("productTierId") String productTierId,
            @Param("isClothing") boolean isClothing, @Param("country") String country);

    FBAFormat findEUfbaFormat(@Param("fenpeiType") String fenpeiType, @Param("productTierId") String productTierId,
            @Param("country") String country, @Param("weight") BigDecimal weight);

    FBAFormat findByProductTierIdAndWeightSL(@Param("productTierId") String productTierId,
            @Param("outboundWeight") BigDecimal outboundWeight, @Param("fenpeiType") String fenpeiType,
            @Param("country") String country);

    FBAFormat findByProductTierIdAndWeight(@Param("productTierId") String productTierId,
            @Param("outboundWeight") BigDecimal outboundWeight, @Param("country") String country);


    FBAFormat findByProductTierAndType(@Param("productTierId") String productTierId,
            @Param("shipmentType") String shipmentType, @Param("country") String country);

}
