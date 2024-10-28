package com.wimoor.amazon.profit.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wimoor.amazon.profit.pojo.entity.FBALabelingFee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface FBALabelingFeeMapper extends BaseMapper<FBALabelingFee> {

    FBALabelingFee getPriceByProductTierId(@Param("isStandard") Boolean isStandard, @Param("country") String country);
}
