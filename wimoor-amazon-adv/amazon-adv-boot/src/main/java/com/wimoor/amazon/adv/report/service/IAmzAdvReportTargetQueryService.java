package com.wimoor.amazon.adv.report.service;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.wimoor.amazon.adv.common.service.IService;
import com.wimoor.amazon.adv.sp.pojo.AmzAdvReportTargetQuery;
import java.util.Map;


public interface IAmzAdvReportTargetQueryService extends IService<AmzAdvReportTargetQuery> {

    public PageList<Map<String, Object>> getProductTargeQueryList(Map<String, Object> map, PageBounds pageBounds);

    public Map<String, Object> getProductTargeQueryChart(Map<String, Object> map);

}
