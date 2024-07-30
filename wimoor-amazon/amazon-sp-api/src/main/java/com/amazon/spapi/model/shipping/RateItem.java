/*
 * Amazon Shipping API
 * The Amazon Shipping API is designed to support outbound shipping use cases both for orders originating on Amazon-owned marketplaces as well as external channels/marketplaces. With these APIs, you can request shipping rates, create shipments, cancel shipments, and track shipments.
 *
 * OpenAPI spec version: v2
 * Contact: swa-api-core@amazon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.shipping;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.amazon.spapi.model.shipping.Currency;
import com.amazon.spapi.model.shipping.RateItemID;
import com.amazon.spapi.model.shipping.RateItemType;
import java.io.IOException;

/**
 * Rate Item for shipping (base cost, transaction fee, confirmation, insurance, etc.) Data source definition: 
 */
@ApiModel(description = "Rate Item for shipping (base cost, transaction fee, confirmation, insurance, etc.) Data source definition: ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-30T16:10:03.349+08:00")
public class RateItem {
  @SerializedName("rateItemID")
  private RateItemID rateItemID = null;

  @SerializedName("rateItemType")
  private RateItemType rateItemType = null;

  @SerializedName("rateItemCharge")
  private Currency rateItemCharge = null;

  @SerializedName("rateItemNameLocalization")
  private String rateItemNameLocalization = null;

  public RateItem rateItemID(RateItemID rateItemID) {
    this.rateItemID = rateItemID;
    return this;
  }

   /**
   * Get rateItemID
   * @return rateItemID
  **/
  @ApiModelProperty(value = "")
  public RateItemID getRateItemID() {
    return rateItemID;
  }

  public void setRateItemID(RateItemID rateItemID) {
    this.rateItemID = rateItemID;
  }

  public RateItem rateItemType(RateItemType rateItemType) {
    this.rateItemType = rateItemType;
    return this;
  }

   /**
   * Get rateItemType
   * @return rateItemType
  **/
  @ApiModelProperty(value = "")
  public RateItemType getRateItemType() {
    return rateItemType;
  }

  public void setRateItemType(RateItemType rateItemType) {
    this.rateItemType = rateItemType;
  }

  public RateItem rateItemCharge(Currency rateItemCharge) {
    this.rateItemCharge = rateItemCharge;
    return this;
  }

   /**
   * Get rateItemCharge
   * @return rateItemCharge
  **/
  @ApiModelProperty(value = "")
  public Currency getRateItemCharge() {
    return rateItemCharge;
  }

  public void setRateItemCharge(Currency rateItemCharge) {
    this.rateItemCharge = rateItemCharge;
  }

  public RateItem rateItemNameLocalization(String rateItemNameLocalization) {
    this.rateItemNameLocalization = rateItemNameLocalization;
    return this;
  }

   /**
   * Used for the localization.
   * @return rateItemNameLocalization
  **/
  @ApiModelProperty(value = "Used for the localization.")
  public String getRateItemNameLocalization() {
    return rateItemNameLocalization;
  }

  public void setRateItemNameLocalization(String rateItemNameLocalization) {
    this.rateItemNameLocalization = rateItemNameLocalization;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RateItem rateItem = (RateItem) o;
    return Objects.equals(this.rateItemID, rateItem.rateItemID) &&
        Objects.equals(this.rateItemType, rateItem.rateItemType) &&
        Objects.equals(this.rateItemCharge, rateItem.rateItemCharge) &&
        Objects.equals(this.rateItemNameLocalization, rateItem.rateItemNameLocalization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rateItemID, rateItemType, rateItemCharge, rateItemNameLocalization);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateItem {\n");
    
    sb.append("    rateItemID: ").append(toIndentedString(rateItemID)).append("\n");
    sb.append("    rateItemType: ").append(toIndentedString(rateItemType)).append("\n");
    sb.append("    rateItemCharge: ").append(toIndentedString(rateItemCharge)).append("\n");
    sb.append("    rateItemNameLocalization: ").append(toIndentedString(rateItemNameLocalization)).append("\n");
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

