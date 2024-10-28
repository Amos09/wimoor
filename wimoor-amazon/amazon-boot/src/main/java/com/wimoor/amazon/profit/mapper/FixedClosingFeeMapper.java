package com.wimoor.amazon.profit.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wimoor.amazon.profit.pojo.entity.FixedClosingFee;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FixedClosingFeeMapper extends BaseMapper<FixedClosingFee> {

    List<FixedClosingFee> findByCountry(String country);
}
