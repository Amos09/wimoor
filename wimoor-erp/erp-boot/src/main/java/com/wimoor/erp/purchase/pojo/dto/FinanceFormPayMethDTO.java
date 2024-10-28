package com.wimoor.erp.purchase.pojo.dto;

import io.swagger.annotations.ApiModel;
import java.util.List;
import lombok.Data;

@Data
@ApiModel(value = "FinanceFormPayMethDTO对象", description = "请款单付款方式")
public class FinanceFormPayMethDTO {

    String paymethod;
    String payacc;
    List<String> entryList;
}
