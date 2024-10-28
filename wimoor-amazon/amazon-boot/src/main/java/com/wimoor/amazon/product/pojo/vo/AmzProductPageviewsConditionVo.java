package com.wimoor.amazon.product.pojo.vo;

import io.swagger.annotations.ApiModel;
import java.math.BigInteger;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 流量报表
 * </p>
 *
 * @author wimoor team
 * @since 2022-06-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "AmzProductPageviews汇总结果", description = "流量报表")
public class AmzProductPageviewsConditionVo {

    private BigInteger amazonAuthid;
    private String marketplaceid;
    private Date byday;

    private Date opttime;
}
