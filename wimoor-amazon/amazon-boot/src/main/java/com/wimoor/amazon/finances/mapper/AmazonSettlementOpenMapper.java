package com.wimoor.amazon.finances.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wimoor.amazon.finances.pojo.entity.AmazonSettlementOpen;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AmazonSettlementOpenMapper extends BaseMapper<AmazonSettlementOpen> {

    void insertBatch(List<AmazonSettlementOpen> list);

}
