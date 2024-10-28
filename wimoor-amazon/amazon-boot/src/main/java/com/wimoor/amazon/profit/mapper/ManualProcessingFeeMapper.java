package com.wimoor.amazon.profit.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wimoor.amazon.profit.pojo.entity.ManualProcessingFee;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ManualProcessingFeeMapper extends BaseMapper<ManualProcessingFee> {

    List<ManualProcessingFee> findByCountry(String country);
}