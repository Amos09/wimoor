package com.wimoor.amazon.adv.sp.dao;

import com.wimoor.amazon.adv.sp.pojo.AmzAdvReportAsins;
import com.wimoor.amazon.base.BaseMapper;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AmzAdvReportAsinsMapper extends BaseMapper<AmzAdvReportAsins> {

    void insertBatch(List<AmzAdvReportAsins> list);

    List<Map<String, Object>> getAsins(Map<String, Object> param);
}