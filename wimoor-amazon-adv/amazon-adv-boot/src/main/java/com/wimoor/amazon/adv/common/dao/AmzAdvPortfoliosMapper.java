package com.wimoor.amazon.adv.common.dao;

import com.wimoor.amazon.adv.common.pojo.AmzAdvPortfolios;
import com.wimoor.amazon.base.BaseMapper;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AmzAdvPortfoliosMapper extends BaseMapper<AmzAdvPortfolios> {

    void insertBatch(List<AmzAdvPortfolios> list);

    List<AmzAdvPortfolios> getPortfoliosForProfileId(Map<String, Object> param);
}