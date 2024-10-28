package com.wimoor.amazon.auth.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wimoor.amazon.auth.pojo.entity.FollowOffer;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface FollowOfferMapper
        extends BaseMapper<FollowOffer> {

    List<Map<String, Object>> getNeedUpdate();

    int updateSellerName(@Param("sellerid") String sellerid, @Param("sellerName") String sellerName,
            @Param("refreshnum") int refreshnum);
}