package com.wimoor.amazon.orders.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wimoor.amazon.orders.pojo.entity.AmzOrdersInvoiceVat;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AmzOrdersInvoiceVatMapper extends BaseMapper<AmzOrdersInvoiceVat> {

    AmzOrdersInvoiceVat selectbyGroupAndCountry(@Param("groupid") String groupid, @Param("country") String country);

}
