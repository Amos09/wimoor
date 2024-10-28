package com.wimoor.amazon.product.pojo.dto;


import com.wimoor.common.pojo.entity.BasePageQuery;
import io.swagger.annotations.ApiModel;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "ProductPresaleListDTO对象", description = "获取计划的商品列表")
public class ProductPresaleListDTO extends BasePageQuery {

    String groupid;
    String shopid;
    String sku;
    String msku;
    String marketplaceid;
    String asin;
    String owner;
    Boolean needplan;
    String month;
    Date fromDate;
    Date toDate;
}
