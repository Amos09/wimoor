package com.wimoor.amazon.product.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wimoor.amazon.product.pojo.entity.ProductTypes;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductTypeMapper extends BaseMapper<ProductTypes> {

}
