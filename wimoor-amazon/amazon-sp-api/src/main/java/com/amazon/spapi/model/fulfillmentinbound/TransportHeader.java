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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.amazon.spapi.model.fulfillmentinbound.ShipmentType;
import java.io.IOException;

/**
 * The shipping identifier, information about whether the shipment is by an Amazon-partnered carrier, and information about whether the shipment is Small Parcel or Less Than Truckload/Full Truckload (LTL/FTL).
 */
@ApiModel(description = "The shipping identifier, information about whether the shipment is by an Amazon-partnered carrier, and information about whether the shipment is Small Parcel or Less Than Truckload/Full Truckload (LTL/FTL).")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-30T14:56:00.161+08:00")
public class TransportHeader {
  @SerializedName("SellerId")
  private String sellerId = null;

  @SerializedName("ShipmentId")
  private String shipmentId = null;

  @SerializedName("IsPartnered")
  private Boolean isPartnered = null;

  @SerializedName("ShipmentType")
  private ShipmentType shipmentType = null;

  public TransportHeader sellerId(String sellerId) {
    this.sellerId = sellerId;
    return this;
  }

   /**
   * The Amazon seller identifier.
   * @return sellerId
  **/
  @ApiModelProperty(required = true, value = "The Amazon seller identifier.")
  public String getSellerId() {
    return sellerId;
  }

  public void setSellerId(String sellerId) {
    this.sellerId = sellerId;
  }

  public TransportHeader shipmentId(String shipmentId) {
    this.shipmentId = shipmentId;
    return this;
  }

   /**
   * A shipment identifier originally returned by the createInboundShipmentPlan operation.
   * @return shipmentId
  **/
  @ApiModelProperty(required = true, value = "A shipment identifier originally returned by the createInboundShipmentPlan operation.")
  public String getShipmentId() {
    return shipmentId;
  }

  public void setShipmentId(String shipmentId) {
    this.shipmentId = shipmentId;
  }

  public TransportHeader isPartnered(Boolean isPartnered) {
    this.isPartnered = isPartnered;
    return this;
  }

   /**
   * Indicates whether a putTransportDetails request is for a partnered carrier.  Possible values:  * true – Request is for an Amazon-partnered carrier.  * false – Request is for a non-Amazon-partnered carrier.
   * @return isPartnered
  **/
  @ApiModelProperty(required = true, value = "Indicates whether a putTransportDetails request is for a partnered carrier.  Possible values:  * true – Request is for an Amazon-partnered carrier.  * false – Request is for a non-Amazon-partnered carrier.")
  public Boolean isIsPartnered() {
    return isPartnered;
  }

  public void setIsPartnered(Boolean isPartnered) {
    this.isPartnered = isPartnered;
  }

  public TransportHeader shipmentType(ShipmentType shipmentType) {
    this.shipmentType = shipmentType;
    return this;
  }

   /**
   * Get shipmentType
   * @return shipmentType
  **/
  @ApiModelProperty(required = true, value = "")
  public ShipmentType getShipmentType() {
    return shipmentType;
  }

  public void setShipmentType(ShipmentType shipmentType) {
    this.shipmentType = shipmentType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransportHeader transportHeader = (TransportHeader) o;
    return Objects.equals(this.sellerId, transportHeader.sellerId) &&
        Objects.equals(this.shipmentId, transportHeader.shipmentId) &&
        Objects.equals(this.isPartnered, transportHeader.isPartnered) &&
        Objects.equals(this.shipmentType, transportHeader.shipmentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sellerId, shipmentId, isPartnered, shipmentType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransportHeader {\n");
    
    sb.append("    sellerId: ").append(toIndentedString(sellerId)).append("\n");
    sb.append("    shipmentId: ").append(toIndentedString(shipmentId)).append("\n");
    sb.append("    isPartnered: ").append(toIndentedString(isPartnered)).append("\n");
    sb.append("    shipmentType: ").append(toIndentedString(shipmentType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

