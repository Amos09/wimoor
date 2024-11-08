package com.wimoor.amazon.product.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wimoor.amazon.product.pojo.entity.ProductFollow;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProductFollowMapper extends BaseMapper<ProductFollow> {

    ProductFollow selectByMarketplaceAsin(@Param("asin") String asin,
            @Param("marketplaceid") String marketplaceid,
            @Param("amazonAuthId") String amazonAuthId);

}