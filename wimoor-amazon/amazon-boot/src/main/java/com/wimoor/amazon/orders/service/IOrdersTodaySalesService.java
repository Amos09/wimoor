package com.wimoor.amazon.orders.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import java.util.List;
import java.util.Map;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;

public interface IOrdersTodaySalesService {

    IPage<Map<String, Object>> selectOrderTodayList(Page<Object> page, Map<String, Object> paramMap);

    List<Map<String, Object>> getParamOfTodayOrder(Map<String, Object> paramMap);

    public void setProductSalesTodayExcelBook(SXSSFWorkbook workbook, Map<String, Object> param);
}
