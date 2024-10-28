package com.wimoor.amazon.common.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wimoor.amazon.common.pojo.entity.EstimatedSales;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EstimatedSalesMapper extends BaseMapper<EstimatedSales> {

    EstimatedSales findEstimatedSales(Map<String, Object> param);


}