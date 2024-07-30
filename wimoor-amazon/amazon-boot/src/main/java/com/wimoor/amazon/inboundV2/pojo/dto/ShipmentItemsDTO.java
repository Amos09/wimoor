package com.wimoor.amazon.inboundV2.pojo.dto;

import com.wimoor.amazon.common.pojo.entity.QueryApiPageDTO;

import lombok.Data;
import lombok.EqualsAndHashCode;
@Data
@EqualsAndHashCode(callSuper = true)
public class ShipmentItemsDTO extends QueryApiPageDTO {
	String formid;
	String shipmentid;
}
