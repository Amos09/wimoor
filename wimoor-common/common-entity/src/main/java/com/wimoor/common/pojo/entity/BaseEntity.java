package com.wimoor.common.pojo.entity;


import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.annotation.TableId;
import com.wimoor.util.UUIDUtil;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;


@Data
public class BaseEntity implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @TableId(value = "id")
    @ApiModelProperty(value = "ID")
    String id;

    public String getId() {
        if (id == null) {
            id = UUIDUtil.getUUIDshort();
        }
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean idIsNULL() {
        return StrUtil.isBlank(id);
    }
}
