/*
 * Selling Partner API for Merchant Fulfillment
 * The Selling Partner API for Merchant Fulfillment helps you build applications that let sellers purchase shipping for non-Prime and Prime orders using Amazon’s Buy Shipping Services.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.merchantfulfillment;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Information about a rejected shipping service
 */
@ApiModel(description = "Information about a rejected shipping service")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-30T16:09:43.032+08:00")
public class RejectedShippingService {
  @SerializedName("CarrierName")
  private String carrierName = null;

  @SerializedName("ShippingServiceName")
  private String shippingServiceName = null;

  @SerializedName("ShippingServiceId")
  private String shippingServiceId = null;

  @SerializedName("RejectionReasonCode")
  private String rejectionReasonCode = null;

  @SerializedName("RejectionReasonMessage")
  private String rejectionReasonMessage = null;

  public RejectedShippingService carrierName(String carrierName) {
    this.carrierName = carrierName;
    return this;
  }

   /**
   * The rejected shipping carrier name. e.g. USPS
   * @return carrierName
  **/
  @ApiModelProperty(required = true, value = "The rejected shipping carrier name. e.g. USPS")
  public String getCarrierName() {
    return carrierName;
  }

  public void setCarrierName(String carrierName) {
    this.carrierName = carrierName;
  }

  public RejectedShippingService shippingServiceName(String shippingServiceName) {
    this.shippingServiceName = shippingServiceName;
    return this;
  }

   /**
   * The rejected shipping service localized name. e.g. FedEx Standard Overnight
   * @return shippingServiceName
  **/
  @ApiModelProperty(required = true, value = "The rejected shipping service localized name. e.g. FedEx Standard Overnight")
  public String getShippingServiceName() {
    return shippingServiceName;
  }

  public void setShippingServiceName(String shippingServiceName) {
    this.shippingServiceName = shippingServiceName;
  }

  public RejectedShippingService shippingServiceId(String shippingServiceId) {
    this.shippingServiceId = shippingServiceId;
    return this;
  }

   /**
   * The rejected shipping service identifier. e.g. FEDEX_PTP_STANDARD_OVERNIGHT
   * @return shippingServiceId
  **/
  @ApiModelProperty(required = true, value = "The rejected shipping service identifier. e.g. FEDEX_PTP_STANDARD_OVERNIGHT")
  public String getShippingServiceId() {
    return shippingServiceId;
  }

  public void setShippingServiceId(String shippingServiceId) {
    this.shippingServiceId = shippingServiceId;
  }

  public RejectedShippingService rejectionReasonCode(String rejectionReasonCode) {
    this.rejectionReasonCode = rejectionReasonCode;
    return this;
  }

   /**
   * A reason code meant to be consumed programatically. e.g. CARRIER_CANNOT_SHIP_TO_POBOX
   * @return rejectionReasonCode
  **/
  @ApiModelProperty(required = true, value = "A reason code meant to be consumed programatically. e.g. CARRIER_CANNOT_SHIP_TO_POBOX")
  public String getRejectionReasonCode() {
    return rejectionReasonCode;
  }

  public void setRejectionReasonCode(String rejectionReasonCode) {
    this.rejectionReasonCode = rejectionReasonCode;
  }

  public RejectedShippingService rejectionReasonMessage(String rejectionReasonMessage) {
    this.rejectionReasonMessage = rejectionReasonMessage;
    return this;
  }

   /**
   * A localized human readable description of the rejected reason.
   * @return rejectionReasonMessage
  **/
  @ApiModelProperty(value = "A localized human readable description of the rejected reason.")
  public String getRejectionReasonMessage() {
    return rejectionReasonMessage;
  }

  public void setRejectionReasonMessage(String rejectionReasonMessage) {
    this.rejectionReasonMessage = rejectionReasonMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RejectedShippingService rejectedShippingService = (RejectedShippingService) o;
    return Objects.equals(this.carrierName, rejectedShippingService.carrierName) &&
        Objects.equals(this.shippingServiceName, rejectedShippingService.shippingServiceName) &&
        Objects.equals(this.shippingServiceId, rejectedShippingService.shippingServiceId) &&
        Objects.equals(this.rejectionReasonCode, rejectedShippingService.rejectionReasonCode) &&
        Objects.equals(this.rejectionReasonMessage, rejectedShippingService.rejectionReasonMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carrierName, shippingServiceName, shippingServiceId, rejectionReasonCode, rejectionReasonMessage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RejectedShippingService {\n");
    
    sb.append("    carrierName: ").append(toIndentedString(carrierName)).append("\n");
    sb.append("    shippingServiceName: ").append(toIndentedString(shippingServiceName)).append("\n");
    sb.append("    shippingServiceId: ").append(toIndentedString(shippingServiceId)).append("\n");
    sb.append("    rejectionReasonCode: ").append(toIndentedString(rejectionReasonCode)).append("\n");
    sb.append("    rejectionReasonMessage: ").append(toIndentedString(rejectionReasonMessage)).append("\n");
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

