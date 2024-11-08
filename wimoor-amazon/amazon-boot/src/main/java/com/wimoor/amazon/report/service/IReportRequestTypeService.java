package com.wimoor.amazon.report.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wimoor.amazon.report.pojo.entity.ReportRequestType;

/**
 * <p>
 * 亚马逊报表类型 服务类
 * </p>
 *
 * @author wimoor team
 * @since 2022-05-12
 */
public interface IReportRequestTypeService extends IService<ReportRequestType> {

    ReportRequestType findByTypeCode(String requestType);

}
