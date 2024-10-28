package com.wimoor.erp.ship.pojo.dto;

import com.wimoor.erp.material.pojo.vo.MaterialVO;
import java.util.List;
import lombok.Data;

@Data
public class QuotaInfoDTO {

    List<MaterialVO> list;
    String warehouseid;
    String formid;
    String type;
}
