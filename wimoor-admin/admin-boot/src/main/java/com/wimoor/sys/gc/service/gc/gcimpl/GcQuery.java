package com.wimoor.sys.gc.service.gc.gcimpl;

import cn.hutool.core.util.IdUtil;
import com.wimoor.sys.gc.config.GcConfig;
import com.wimoor.sys.gc.constant.TpParamConstant;
import com.wimoor.sys.gc.model.po.DbFieldPO;
import com.wimoor.sys.gc.service.gc.GcSevice;
import com.wimoor.sys.gc.util.GcFileUtil;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

@SuppressWarnings("all")
@Component
@Slf4j
public class GcQuery extends BaseGcImpl implements GcSevice {

    /**
     * 模板key
     */
    public static final String KEY_NAME = "X-Query";


    @Override
    public void run(GcConfig gcConfig) {
        log.info("开始生成: {}", KEY_NAME);
        List<DbFieldPO> dbFields = gcConfig.getDbFields();
        this.generateParameters(gcConfig, dbFields);
        // 开始生成文件并进行数据替换
        GcFileUtil.replacBrBwWritee(gcConfig, GcFileUtil.getBrBwPath(gcConfig, KEY_NAME));
    }


    private void generateParameters(GcConfig gcConfig, List<DbFieldPO> data) {
        //数据拼接(所有字段)
        StringBuffer fields = new StringBuffer();
        int position = 0;
        for (DbFieldPO fieldMap : data) {
            // 判断是否需要生成查询
            Boolean isSearch = fieldMap.getIsSearch() == null ? false : fieldMap.getIsSearch();
            if (!isSearch) {
                continue;
            }
            String type = fieldMap.getType();
            String desc = fieldMap.getDesc();
            String fieldName = fieldMap.getName();
            desc = super.removeDescTheNewlineCharacter(desc, fieldName);
            String typeDetail = fieldMap.getTypeDetail();
            // 1、生成注释
            Boolean entitySwagger = Boolean.valueOf(gcConfig.getDefaultTemplateParam(TpParamConstant.ENTITY_SWAGGER));
            if (entitySwagger) {
                // 字段注释信息-->  Swagger2 模式
                fields.append("\r\n    @ApiModelProperty(value = \"" + desc + "\" ,position = " + position++ + ")");
            } else {
                // 字段注释信息-->  doc 注释
                fields.append("\r\n    /** \r\n     * " + desc + " \r\n     */");
            }
            // 2、生成必填参数jsr验证(先判断是否为必填参数)
            String isNull = fieldMap.getIsNull();
            String jsrModel = super.jsrModel(isNull, type, typeDetail, desc, false);
            if (StringUtils.isNotBlank(jsrModel)) {
                fields.append("\r\n" + jsrModel);
            }
            // 3、生成字段
            fields.append("\r\n    " + super.jxModel(gcConfig, fieldName, type, true) + "\r\n");
        }
        // 数据保存到替换对象类,使模板中可以读取
        gcConfig.setTemplateParam("entitys", fields.toString());
        gcConfig.setTemplateParam("serialVersionUID", IdUtil.getSnowflakeNextIdStr());
    }
}
