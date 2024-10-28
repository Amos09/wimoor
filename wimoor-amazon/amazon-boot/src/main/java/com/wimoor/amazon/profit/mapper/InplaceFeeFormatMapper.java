package com.wimoor.amazon.profit.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wimoor.amazon.profit.pojo.entity.InplaceFeeFormat;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface InplaceFeeFormatMapper extends BaseMapper<InplaceFeeFormat> {

    InplaceFeeFormat findByInvplaceFeeId(@Param("invplaceFee") String invplaceFee,
            @Param("isStandard") boolean isStandard, @Param("country") String country,
            @Param("producttierId") String producttierId);

    InplaceFeeFormat findByProductTierId(String productTierId);

}
