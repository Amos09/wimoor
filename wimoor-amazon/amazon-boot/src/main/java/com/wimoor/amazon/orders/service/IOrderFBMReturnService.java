package com.wimoor.amazon.orders.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.wimoor.amazon.orders.pojo.dto.AmazonOrdersReturnDTO;
import com.wimoor.amazon.orders.pojo.vo.AmazonOrdersReturnVo;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;

public interface IOrderFBMReturnService {

    IPage<AmazonOrdersReturnVo> selectReturnsList(AmazonOrdersReturnDTO condition);

    public void downloadReturnlist(SXSSFWorkbook workbook, AmazonOrdersReturnDTO condition);
}
