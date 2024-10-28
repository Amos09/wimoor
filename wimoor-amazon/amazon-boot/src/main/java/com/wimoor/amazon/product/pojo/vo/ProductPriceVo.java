package com.wimoor.amazon.product.pojo.vo;


import io.swagger.annotations.ApiModel;
import java.util.Date;
import lombok.Data;

@Data
@ApiModel(value = "ProductPriceVo对象", description = "价格调价列表")
public class ProductPriceVo {

    String gname;
    String mname;
    String pname;
    String sku;
    String image;
    String standardprice;
    String oldstandardprice;
    String feedid;
    String status;
    String statusText;
    String operator;
    Date opttime;
    Date successdate;
    String fnsku;
    String ftype;
    String saleprice;

}
