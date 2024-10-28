package com.wimoor.erp.assembly.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.wimoor.common.mvc.BizException;
import com.wimoor.common.user.UserInfo;
import com.wimoor.erp.assembly.pojo.entity.AssemblyEntryInstock;
import com.wimoor.erp.assembly.pojo.entity.AssemblyForm;
import java.util.List;
import java.util.Map;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;

public interface IAssemblyEntryInstockService extends IService<AssemblyEntryInstock> {

    List<Map<String, Object>> selectByFormId(String formid);

    public Map<String, Object> saveAssemblyInStock(AssemblyEntryInstock entity, AssemblyForm assemblyForm,
            UserInfo user) throws BizException;

    Map<String, Object> saveMineAndinStock(AssemblyEntryInstock entity, UserInfo user) throws BizException;

    Integer findhasAssemblyFromShipment(String shipmentid);

    public List<AssemblyEntryInstock> findAssemblyFromShipment(String shipmentid);

    public void cancelInStock(UserInfo user, AssemblyEntryInstock entity);

    public void findProcessHandle(SXSSFWorkbook workbook, Map<String, Object> param);

    public void changeAssemblyFormWarehouse(UserInfo user, String number, String warehouseid);

    List<AssemblyEntryInstock> findAssemblyFrom(String formid);
}
