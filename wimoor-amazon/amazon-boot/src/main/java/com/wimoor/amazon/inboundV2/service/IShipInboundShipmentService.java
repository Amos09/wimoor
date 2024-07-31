package com.wimoor.amazon.inboundV2.service;

 
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.streaming.SXSSFWorkbook;

import com.amazon.spapi.model.fulfillmentinboundV20240320.ListDeliveryWindowOptionsResponse;
import com.amazon.spapi.model.fulfillmentinboundV20240320.ListShipmentBoxesResponse;
import com.amazon.spapi.model.fulfillmentinboundV20240320.ListShipmentItemsResponse;
import com.amazon.spapi.model.fulfillmentinboundV20240320.Shipment;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wimoor.amazon.inbound.pojo.dto.ShipInboundShipmenSummaryDTO;
import com.wimoor.amazon.inbound.pojo.entity.ShipTransDetail;
import com.wimoor.amazon.inbound.pojo.vo.ShipInboundShipmenSummarytVo;
import com.wimoor.amazon.inbound.pojo.vo.SummaryShipmentVo;
import com.wimoor.amazon.inboundV2.pojo.dto.PlacementDTO;
import com.wimoor.amazon.inboundV2.pojo.dto.ShipmentItemsDTO;
import com.wimoor.amazon.inboundV2.pojo.dto.deliveryWindowDTO;
import com.wimoor.amazon.inboundV2.pojo.entity.ShipInboundDestinationAddress;
import com.wimoor.amazon.inboundV2.pojo.entity.ShipInboundOperation;
import com.wimoor.amazon.inboundV2.pojo.entity.ShipInboundPlan;
import com.wimoor.amazon.inboundV2.pojo.entity.ShipInboundShipment;
import com.wimoor.amazon.inboundV2.pojo.entity.ShipInboundShipmentBox;
import com.wimoor.amazon.inboundV2.pojo.entity.ShipInboundShipmentBoxItem;
import com.wimoor.amazon.inboundV2.pojo.entity.ShipInboundShipmentItem;
import com.wimoor.common.user.UserInfo;
 
 

public interface IShipInboundShipmentService extends IService<ShipInboundShipment>{

	IPage<ShipInboundShipmenSummarytVo> findByTraceCondition(ShipInboundShipmenSummaryDTO dto);
	
	Map<String, Object> listPlacementOptions(PlacementDTO dto);
	
	ShipInboundOperation confirmPlacementOption(UserInfo user,String planid, String placementOptionId);
	
	ShipInboundOperation generatePlacementOptions(String planid);

	Shipment getShipment(String planid, String shipmentId);

	ListShipmentItemsResponse getshipmentItems(ShipmentItemsDTO dto);

	ListShipmentBoxesResponse listShipmentBoxes(ShipmentItemsDTO dto);

	String saveShipment(UserInfo user, ShipInboundPlan inplan, List<String> shipmentid);

	ShipInboundOperation generateDeliveryWindowOptions(String formid, String shipmentId);

	public ListDeliveryWindowOptionsResponse listDeliveryWindowOptions(deliveryWindowDTO dto);

	ShipInboundOperation confirmDeliveryWindowOptions(deliveryWindowDTO dto);

	ShipInboundDestinationAddress getToAddress(String destination);

	String getShipmentStatusName(String shipmentstatus);

	ShipInboundShipmenSummarytVo summaryShipmentItemWithoutItem(String shipmentid);

	List<Map<String, Object>> findInboundItemByShipmentId(String shipmentid);

	SummaryShipmentVo showPlanListByPlanid(String shipmentid);

	Map<String, String> getPkgPaper(String string);
	
	String getLabelUrl(UserInfo user,String shipmentid,String pagetype,String labelType,String pannum);
	
	List<ShipInboundShipmentBox> findShipInboundBoxByShipment(String shipmentid);

	List<ShipInboundShipmentBoxItem> findShipInboundCaseByShipment(String shipmentid);
	
	ShipTransDetail getTransChannelInfo(String id);
	Map<String, Object> getSelfTransDataView(String shipmentid);
	

	List<Map<String, Object>> findShipInboundBox(String shipmentid);

	ShipInboundOperation saveTransTrance(UserInfo user, ShipInboundShipment ship, List<Map<String, Object>> boxinfo);

	void setExcelBoxDetail(UserInfo user, SXSSFWorkbook workbook, String shipmentid);

	void updateFeeByShipment(List<ShipInboundShipmentItem> list);
}