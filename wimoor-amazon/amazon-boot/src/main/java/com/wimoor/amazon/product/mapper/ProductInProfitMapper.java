package com.wimoor.amazon.product.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wimoor.amazon.product.pojo.entity.ProductInProfit;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductInProfitMapper extends BaseMapper<ProductInProfit> {

    int insertBatch(List<ProductInProfit> list);

    int deleteProductInOrderAndProfitByDate();
}