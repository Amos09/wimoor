package com.wimoor.erp.assembly.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wimoor.erp.assembly.pojo.entity.AssemblyFormEntry;
import java.util.List;
import java.util.Map;

public interface IAssemblyFormEntryService extends IService<AssemblyFormEntry> {

    List<Map<String, Object>> selectByFormid(String formid);

    List<AssemblyFormEntry> selectEntityByFormid(String formid);

    List<Map<String, Object>> selectAssemblyFormByPurchaseEntryId(String entryid);


}
