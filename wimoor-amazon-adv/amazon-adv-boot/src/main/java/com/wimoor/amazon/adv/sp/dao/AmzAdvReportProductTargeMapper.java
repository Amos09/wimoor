package com.wimoor.amazon.adv.sp.dao;

import com.wimoor.amazon.adv.sp.pojo.AmzAdvReportProductTargets;
import com.wimoor.amazon.adv.sp.pojo.AmzAdvReportProductTargetsAttributed;
import com.wimoor.amazon.adv.sp.pojo.AmzAdvReportProductTargetsAttributedSame;
import com.wimoor.amazon.base.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AmzAdvReportProductTargeMapper extends BaseMapper<AmzAdvReportProductTargets> {

    void insertBatch(List<AmzAdvReportProductTargets> list);

    void insertBatchAttributed(List<AmzAdvReportProductTargetsAttributed> listAttributed);

    void insertBatchAttributedSame(List<AmzAdvReportProductTargetsAttributedSame> listAttributedSame);
}