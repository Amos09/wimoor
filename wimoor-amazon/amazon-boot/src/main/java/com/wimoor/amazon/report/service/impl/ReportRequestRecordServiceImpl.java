package com.wimoor.amazon.report.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wimoor.amazon.report.mapper.ReportRequestRecordMapper;
import com.wimoor.amazon.report.pojo.entity.ReportRequestRecord;
import com.wimoor.amazon.report.service.IReportRequestRecordService;
import java.util.Date;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


/**
 * 用户业务类
 */
@Service
@RequiredArgsConstructor
public class ReportRequestRecordServiceImpl extends
        ServiceImpl<ReportRequestRecordMapper, ReportRequestRecord> implements IReportRequestRecordService {

    @Override

    public Date lastUpdateRequestByType(Map<String, Object> param) {
        // TODO Auto-generated method stub
        return this.baseMapper.lastUpdateRequestByType(param);
    }

}
