package com.wimoor.amazon.common.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wimoor.amazon.common.pojo.entity.ImportRecord;
import java.util.List;


public interface IImportRecordService extends IService<ImportRecord> {

    List<ImportRecord> getImportRecord(String shopid, String importtype);

}
