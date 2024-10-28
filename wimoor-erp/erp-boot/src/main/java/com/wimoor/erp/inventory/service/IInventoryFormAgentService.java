package com.wimoor.erp.inventory.service;

import com.wimoor.common.mvc.BizException;
import com.wimoor.erp.inventory.pojo.entity.InventoryParameter;
import java.util.List;

public interface IInventoryFormAgentService {

    public Boolean outbound(List<InventoryParameter> paramList) throws BizException;

    public Boolean undoOutbound(List<InventoryParameter> paramList) throws BizException;

    public Boolean out(List<InventoryParameter> paramList) throws BizException;

    public Boolean undoOut(List<InventoryParameter> paramList) throws BizException;

    public Integer inStockByDirect(InventoryParameter invpara) throws BizException;

    public Integer inStockByRead(InventoryParameter invpara) throws BizException;

    public Integer outStockByDirect(InventoryParameter invpara) throws BizException;

    public Integer outStockByRead(InventoryParameter invpara) throws BizException;

    public Integer inStockDirectCancel(InventoryParameter invpara) throws BizException;

    public Integer outStockReadyCancel(InventoryParameter invpara) throws BizException;

    public Integer outStockDirectCancel(InventoryParameter invpara) throws BizException;

    public Integer inStockReadyCancel(InventoryParameter invpara) throws BizException;

    Integer outStockByReadChange(InventoryParameter invpara) throws BizException;

    Integer outStockReadyChange(InventoryParameter invpara) throws BizException;
}
