package com.wimoor.amazon.adv.sd.dao;

import com.wimoor.amazon.adv.sd.pojo.AmzAdvReportAdGroupsSD;
import com.wimoor.amazon.adv.sd.pojo.AmzAdvReportAdGroupsSDAttributed;
import com.wimoor.amazon.adv.sd.pojo.AmzAdvReportAdGroupsSDAttributedNew;
import com.wimoor.amazon.adv.sd.pojo.AmzAdvReportAdGroupsSDAttributedSame;
import com.wimoor.amazon.adv.sd.pojo.AmzAdvReportAdGroupsSDAttributedView;
import com.wimoor.amazon.base.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AmzAdvReportAdGroupsSDMapper extends BaseMapper<AmzAdvReportAdGroupsSD> {

    void insertBatch(List<AmzAdvReportAdGroupsSD> list);

    void insertBatchAttributed(List<AmzAdvReportAdGroupsSDAttributed> listAttributed);


    void insertBatchAttributedView(List<AmzAdvReportAdGroupsSDAttributedView> listAttributedView);

    void insertBatchAttributedSame(List<AmzAdvReportAdGroupsSDAttributedSame> listAttributedSame);

    void insertBatchAttributedNew(List<AmzAdvReportAdGroupsSDAttributedNew> listAttributedNew);
}