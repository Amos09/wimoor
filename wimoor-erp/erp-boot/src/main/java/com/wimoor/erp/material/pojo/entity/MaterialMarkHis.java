package com.wimoor.erp.material.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import javax.validation.constraints.Size;
import lombok.Data;

@Data
@TableName("t_erp_material_mark_his")
@ApiModel(value = "MaterialMark对象", description = "产品备注用于补发货规划")
public class MaterialMarkHis {

    @Size(max = 100, message = "信息不能超过100个字符")
    @TableField(value = "mark")
    private String mark;

    @ApiModelProperty(value = "修改人【系统填写】")
    @TableField(value = "operator")
    private String operator;

    @ApiModelProperty(value = "修改时间【系统填写】")
    @TableField(value = "opttime")
    private Date opttime;

    @ApiModelProperty(value = "产品ID")
    @TableField(value = "materialid")
    private String materialid;

    @ApiModelProperty(value = "备注类型")
    @TableField(value = "ftype")
    private String ftype;


}