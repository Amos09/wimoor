/*
 * Selling Partner API for Fulfillment Inbound
 * The Selling Partner API for Fulfillment Inbound lets you create applications that create and update inbound shipments of inventory to Amazon's fulfillment network.
 *
 * OpenAPI spec version: v0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.fulfillmentinbound;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * Inbound shipment information used to create an inbound shipment. Returned by the createInboundShipmentPlan
 * operation.
 */
@ApiModel(description = "Inbound shipment information used to create an inbound shipment. Returned by the createInboundShipmentPlan operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-30T14:56:00.161+08:00")
public class InboundShipmentPlan {

    @SerializedName("ShipmentId")
    private String shipmentId = null;

    @SerializedName("DestinationFulfillmentCenterId")
    private String destinationFulfillmentCenterId = null;

    @SerializedName("ShipToAddress")
    private Address shipToAddress = null;

    @SerializedName("LabelPrepType")
    private LabelPrepType labelPrepType = null;

    @SerializedName("Items")
    private InboundShipmentPlanItemList items = null;

    @SerializedName("EstimatedBoxContentsFee")
    private BoxContentsFeeDetails estimatedBoxContentsFee = null;

    public InboundShipmentPlan shipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
        return this;
    }

    /**
     * A shipment identifier originally returned by the createInboundShipmentPlan operation.
     *
     * @return shipmentId
     **/
    @ApiModelProperty(required = true, value = "A shipment identifier originally returned by the createInboundShipmentPlan operation.")
    public String getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }

    public InboundShipmentPlan destinationFulfillmentCenterId(String destinationFulfillmentCenterId) {
        this.destinationFulfillmentCenterId = destinationFulfillmentCenterId;
        return this;
    }

    /**
     * An Amazon fulfillment center identifier created by Amazon.
     *
     * @return destinationFulfillmentCenterId
     **/
    @ApiModelProperty(required = true, value = "An Amazon fulfillment center identifier created by Amazon.")
    public String getDestinationFulfillmentCenterId() {
        return destinationFulfillmentCenterId;
    }

    public void setDestinationFulfillmentCenterId(String destinationFulfillmentCenterId) {
        this.destinationFulfillmentCenterId = destinationFulfillmentCenterId;
    }

    public InboundShipmentPlan shipToAddress(Address shipToAddress) {
        this.shipToAddress = shipToAddress;
        return this;
    }

    /**
     * The address of the Amazon fulfillment center to which to ship the items.
     *
     * @return shipToAddress
     **/
    @ApiModelProperty(required = true, value = "The address of the Amazon fulfillment center to which to ship the items.")
    public Address getShipToAddress() {
        return shipToAddress;
    }

    public void setShipToAddress(Address shipToAddress) {
        this.shipToAddress = shipToAddress;
    }

    public InboundShipmentPlan labelPrepType(LabelPrepType labelPrepType) {
        this.labelPrepType = labelPrepType;
        return this;
    }

    /**
     * Get labelPrepType
     *
     * @return labelPrepType
     **/
    @ApiModelProperty(required = true, value = "")
    public LabelPrepType getLabelPrepType() {
        return labelPrepType;
    }

    public void setLabelPrepType(LabelPrepType labelPrepType) {
        this.labelPrepType = labelPrepType;
    }

    public InboundShipmentPlan items(InboundShipmentPlanItemList items) {
        this.items = items;
        return this;
    }

    /**
     * SKU and quantity information for the items in the shipment.
     *
     * @return items
     **/
    @ApiModelProperty(required = true, value = "SKU and quantity information for the items in the shipment.")
    public InboundShipmentPlanItemList getItems() {
        return items;
    }

    public void setItems(InboundShipmentPlanItemList items) {
        this.items = items;
    }

    public InboundShipmentPlan estimatedBoxContentsFee(BoxContentsFeeDetails estimatedBoxContentsFee) {
        this.estimatedBoxContentsFee = estimatedBoxContentsFee;
        return this;
    }

    /**
     * Get estimatedBoxContentsFee
     *
     * @return estimatedBoxContentsFee
     **/
    @ApiModelProperty(value = "")
    public BoxContentsFeeDetails getEstimatedBoxContentsFee() {
        return estimatedBoxContentsFee;
    }

    public void setEstimatedBoxContentsFee(BoxContentsFeeDetails estimatedBoxContentsFee) {
        this.estimatedBoxContentsFee = estimatedBoxContentsFee;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InboundShipmentPlan inboundShipmentPlan = (InboundShipmentPlan) o;
        return Objects.equals(this.shipmentId, inboundShipmentPlan.shipmentId) &&
                Objects.equals(this.destinationFulfillmentCenterId, inboundShipmentPlan.destinationFulfillmentCenterId)
                &&
                Objects.equals(this.shipToAddress, inboundShipmentPlan.shipToAddress) &&
                Objects.equals(this.labelPrepType, inboundShipmentPlan.labelPrepType) &&
                Objects.equals(this.items, inboundShipmentPlan.items) &&
                Objects.equals(this.estimatedBoxContentsFee, inboundShipmentPlan.estimatedBoxContentsFee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shipmentId, destinationFulfillmentCenterId, shipToAddress, labelPrepType, items,
                estimatedBoxContentsFee);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InboundShipmentPlan {\n");

        sb.append("    shipmentId: ").append(toIndentedString(shipmentId)).append("\n");
        sb.append("    destinationFulfillmentCenterId: ").append(toIndentedString(destinationFulfillmentCenterId))
                .append("\n");
        sb.append("    shipToAddress: ").append(toIndentedString(shipToAddress)).append("\n");
        sb.append("    labelPrepType: ").append(toIndentedString(labelPrepType)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    estimatedBoxContentsFee: ").append(toIndentedString(estimatedBoxContentsFee)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

