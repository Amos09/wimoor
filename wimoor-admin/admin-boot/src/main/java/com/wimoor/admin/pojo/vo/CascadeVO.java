package com.wimoor.admin.pojo.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 级联视图对象
 */
@Data
@Accessors(chain = true)
public class CascadeVO {

    private Long value;

    private String label;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<CascadeVO> children;
}
