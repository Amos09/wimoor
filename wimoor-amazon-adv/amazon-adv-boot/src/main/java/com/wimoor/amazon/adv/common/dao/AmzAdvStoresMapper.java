package com.wimoor.amazon.adv.common.dao;

import com.wimoor.amazon.adv.common.pojo.AmzAdvStores;
import com.wimoor.amazon.base.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AmzAdvStoresMapper extends BaseMapper<AmzAdvStores> {

    void insertBatch(List<AmzAdvStores> list);
}