package com.wimoor.erp.material.pojo.dto;

import io.swagger.annotations.ApiModel;
import java.util.List;
import java.util.Map;
import lombok.Data;

@Data
@ApiModel(value = "MaterialConsumableDTO对象", description = "material耗材")
public class MaterialConsumableDTO {

    String warehouseid;
    String number;

    List<Map<String, Object>> skulist;
}
