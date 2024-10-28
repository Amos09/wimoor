package com.wimoor.amazon.adv.sd.dao;

import com.wimoor.amazon.adv.sd.pojo.AmzAdvReportAsinsSD;
import com.wimoor.amazon.base.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AmzAdvReportAsinsSDMapper extends BaseMapper<AmzAdvReportAsinsSD> {

    void insertBatch(List<AmzAdvReportAsinsSD> list);

}