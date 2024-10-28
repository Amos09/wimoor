package com.wimoor.amazon.profit.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wimoor.amazon.profit.pojo.entity.ProductFormat;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductFormatMapper extends BaseMapper<ProductFormat> {

    List<Map<String, Object>> findByCountry(String country);

    List<Map<String, Object>> findSmlProductTier(String country);
}
