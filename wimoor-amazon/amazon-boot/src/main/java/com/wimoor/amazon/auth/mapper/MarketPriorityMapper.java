package com.wimoor.amazon.auth.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wimoor.amazon.auth.pojo.entity.MarketPriority;
import com.wimoor.amazon.auth.pojo.entity.Marketplace;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MarketPriorityMapper extends BaseMapper<MarketPriority> {

    List<Marketplace> findMarketplaceByGroup(String groupid);

}
