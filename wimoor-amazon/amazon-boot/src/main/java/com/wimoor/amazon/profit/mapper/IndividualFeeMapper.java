package com.wimoor.amazon.profit.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wimoor.amazon.profit.pojo.entity.IndividualFee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IndividualFeeMapper extends BaseMapper<IndividualFee> {

    IndividualFee getByCountry(String country);
}