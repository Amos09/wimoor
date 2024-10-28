package com.wimoor.amazon.adv.report.service;


import com.wimoor.amazon.adv.common.service.IAmzAdvHttpClientResponseHandler;
import java.util.Map;

public interface IAmzAdvReportHandlerService extends IAmzAdvHttpClientResponseHandler {


    public void readReport();

    public void readReport(String reportid);

    public Map<String, Object> getNeedRequestReport(String profileid, String non_segment, String isnow);


    public void requestReport();
}
