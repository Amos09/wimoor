package com.wimoor.amazon.profit.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wimoor.amazon.profit.pojo.entity.InplaceFee;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface InplaceFeeMapper extends BaseMapper<InplaceFee> {

    List<InplaceFee> findAll();

    List<InplaceFee> findByCountry(String country);
}