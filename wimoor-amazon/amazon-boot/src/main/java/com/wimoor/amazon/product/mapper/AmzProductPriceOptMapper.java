package com.wimoor.amazon.product.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wimoor.amazon.product.pojo.entity.AmzProductPriceOpt;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface AmzProductPriceOptMapper extends BaseMapper<AmzProductPriceOpt> {

    List<Map<String, Object>> findProPriceByUser(@Param("pid") String pid, @Param("ftype") String ftype);
}