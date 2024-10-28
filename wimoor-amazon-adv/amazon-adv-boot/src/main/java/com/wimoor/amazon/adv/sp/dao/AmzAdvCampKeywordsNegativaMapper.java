package com.wimoor.amazon.adv.sp.dao;

import com.wimoor.amazon.adv.sp.pojo.AmzAdvCampKeywordsNegativa;
import com.wimoor.amazon.base.BaseMapper;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AmzAdvCampKeywordsNegativaMapper extends BaseMapper<AmzAdvCampKeywordsNegativa> {

    int insertBatch(List<AmzAdvCampKeywordsNegativa> list);

    List<Map<String, Object>> getCampaignNegativaKeywordsList(Map<String, Object> map);

}