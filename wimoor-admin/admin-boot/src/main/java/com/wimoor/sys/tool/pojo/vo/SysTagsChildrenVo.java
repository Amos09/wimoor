package com.wimoor.sys.tool.pojo.vo;


import io.swagger.annotations.ApiModel;
import java.io.Serializable;
import lombok.Data;

@Data
@ApiModel("系统子标签对象")
public class SysTagsChildrenVo implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 2725817142330167823L;

    String value;

    String label;
}
