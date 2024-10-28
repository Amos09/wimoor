package com.wimoor.amazon.adv.report.dao;

import com.wimoor.amazon.adv.report.pojo.AmzAdvRptQuery;
import com.wimoor.amazon.base.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AmzAdvRptQueryMapper extends BaseMapper<AmzAdvRptQuery> {

    AmzAdvRptQuery selectByName(@Param("query") String query);
}