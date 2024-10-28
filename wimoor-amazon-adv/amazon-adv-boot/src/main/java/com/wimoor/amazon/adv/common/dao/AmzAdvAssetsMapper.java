package com.wimoor.amazon.adv.common.dao;

import com.wimoor.amazon.adv.common.pojo.AmzAdvAssets;
import com.wimoor.amazon.base.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AmzAdvAssetsMapper extends BaseMapper<AmzAdvAssets> {

    void insertBatch(List<AmzAdvAssets> list);
}