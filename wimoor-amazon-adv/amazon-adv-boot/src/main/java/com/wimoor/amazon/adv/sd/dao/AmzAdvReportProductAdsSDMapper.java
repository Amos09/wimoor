package com.wimoor.amazon.adv.sd.dao;

import com.wimoor.amazon.adv.sd.pojo.AmzAdvReportProductAdsSD;
import com.wimoor.amazon.adv.sd.pojo.AmzAdvReportProductAdsSDAttributed;
import com.wimoor.amazon.adv.sd.pojo.AmzAdvReportProductAdsSDAttributedNew;
import com.wimoor.amazon.adv.sd.pojo.AmzAdvReportProductAdsSDAttributedSame;
import com.wimoor.amazon.adv.sd.pojo.AmzAdvReportProductAdsSDAttributedView;
import com.wimoor.amazon.base.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AmzAdvReportProductAdsSDMapper extends BaseMapper<AmzAdvReportProductAdsSD> {

    void insertBatch(List<AmzAdvReportProductAdsSD> list);

    void insertBatchAttributed(List<AmzAdvReportProductAdsSDAttributed> listAttributed);

    void insertBatchAttributedView(List<AmzAdvReportProductAdsSDAttributedView> listAttributedView);

    void insertBatchAttributedSame(List<AmzAdvReportProductAdsSDAttributedSame> listAttributedSame);

    void insertBatchAttributedNew(List<AmzAdvReportProductAdsSDAttributedNew> listAttributedNew);
}