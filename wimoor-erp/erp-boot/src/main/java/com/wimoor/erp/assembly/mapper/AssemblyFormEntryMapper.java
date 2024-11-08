package com.wimoor.erp.assembly.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wimoor.erp.assembly.pojo.entity.AssemblyFormEntry;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AssemblyFormEntryMapper extends BaseMapper<AssemblyFormEntry> {

    List<Map<String, Object>> selectByFormid(String formid);

    List<AssemblyFormEntry> selectEntityByFormid(String formid);

    List<Map<String, Object>> selectAssemblyFormByPurchaseEntryId(String entryid);

}
