package com.wimoor.erp.purchase.alibaba.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wimoor.erp.purchase.alibaba.pojo.entity.PurchaseFormEntryAlibabaInfoExt;
import java.math.BigDecimal;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PurchaseFormEntryAlibabaInfoExtMapper extends BaseMapper<PurchaseFormEntryAlibabaInfoExt> {

    BigDecimal getPriceByAlibabaOrder(@Param("orderid") String orderid, @Param("acct") String acct);
}