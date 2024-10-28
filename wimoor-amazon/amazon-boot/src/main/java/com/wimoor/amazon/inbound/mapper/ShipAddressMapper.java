package com.wimoor.amazon.inbound.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wimoor.amazon.inbound.pojo.entity.ShipAddress;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ShipAddressMapper extends BaseMapper<ShipAddress> {

    IPage<ShipAddress> findByCondition(Page<?> page, @Param("shopid") String shopid, @Param("groupid") String groupid,
            @Param("marketplaceid") String marketplaceid, @Param("disable") String disable,
            @Param("search") String search);
}