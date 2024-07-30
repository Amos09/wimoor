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
import com.amazon.spapi.model.fulfillmentinbound.Amount;
import java.io.IOException;

/**
 * The estimated shipping cost for a shipment using an Amazon-partnered carrier.
 */
@ApiModel(description = "The estimated shipping cost for a shipment using an Amazon-partnered carrier.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-30T14:56:00.161+08:00")
public class PartneredEstimate {
  @SerializedName("Amount")
  private Amount amount = null;

  @SerializedName("ConfirmDeadline")
  private String confirmDeadline = null;

  @SerializedName("VoidDeadline")
  private String voidDeadline = null;

  public PartneredEstimate amount(Amount amount) {
    this.amount = amount;
    return this;
  }

   /**
   * The amount that the Amazon-partnered carrier will charge to ship the inbound shipment.
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "The amount that the Amazon-partnered carrier will charge to ship the inbound shipment.")
  public Amount getAmount() {
    return amount;
  }

  public void setAmount(Amount amount) {
    this.amount = amount;
  }

  public PartneredEstimate confirmDeadline(String confirmDeadline) {
    this.confirmDeadline = confirmDeadline;
    return this;
  }

   /**
   * The date in ISO 8601 date time format by which this estimate must be confirmed. After this date the estimate is no longer valid and cannot be confirmed.  Returned only if the TransportStatus value of the inbound shipment is ESTIMATED.
   * @return confirmDeadline
  **/
  @ApiModelProperty(value = "The date in ISO 8601 date time format by which this estimate must be confirmed. After this date the estimate is no longer valid and cannot be confirmed.  Returned only if the TransportStatus value of the inbound shipment is ESTIMATED.")
  public String getConfirmDeadline() {
    return confirmDeadline;
  }

  public void setConfirmDeadline(String confirmDeadline) {
    this.confirmDeadline = confirmDeadline;
  }

  public PartneredEstimate voidDeadline(String voidDeadline) {
    this.voidDeadline = voidDeadline;
    return this;
  }

   /**
   * The date in ISO 8601 date time format after which a confirmed transportation request can no longer be voided. This date is 24 hours after a Small Parcel shipment transportation request is confirmed or one hour after a Less Than Truckload/Full Truckload (LTL/FTL) shipment transportation request is confirmed. After the void deadline passes the seller&#39;s account will be charged for the shipping cost.  Returned only if the TransportStatus value of the inbound shipment is CONFIRMED.
   * @return voidDeadline
  **/
  @ApiModelProperty(value = "The date in ISO 8601 date time format after which a confirmed transportation request can no longer be voided. This date is 24 hours after a Small Parcel shipment transportation request is confirmed or one hour after a Less Than Truckload/Full Truckload (LTL/FTL) shipment transportation request is confirmed. After the void deadline passes the seller's account will be charged for the shipping cost.  Returned only if the TransportStatus value of the inbound shipment is CONFIRMED.")
  public String getVoidDeadline() {
    return voidDeadline;
  }

  public void setVoidDeadline(String voidDeadline) {
    this.voidDeadline = voidDeadline;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartneredEstimate partneredEstimate = (PartneredEstimate) o;
    return Objects.equals(this.amount, partneredEstimate.amount) &&
        Objects.equals(this.confirmDeadline, partneredEstimate.confirmDeadline) &&
        Objects.equals(this.voidDeadline, partneredEstimate.voidDeadline);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, confirmDeadline, voidDeadline);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartneredEstimate {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    confirmDeadline: ").append(toIndentedString(confirmDeadline)).append("\n");
    sb.append("    voidDeadline: ").append(toIndentedString(voidDeadline)).append("\n");
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

