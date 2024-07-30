/*
 * Selling Partner API for Finances
 * The Selling Partner API for Finances helps you obtain financial information relevant to a seller's business. You can obtain financial events for a given order, financial event group, or date range without having to wait until a statement period closes. You can also obtain financial event groups for a given date range.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.finances;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.amazon.spapi.model.finances.Currency;
import com.amazon.spapi.model.finances.TaxWithheldComponentList;
import java.io.IOException;

/**
 * A retrocharge or retrocharge reversal.
 */
@ApiModel(description = "A retrocharge or retrocharge reversal.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-30T16:09:34.728+08:00")
public class RetrochargeEvent {
  @SerializedName("RetrochargeEventType")
  private String retrochargeEventType = null;

  @SerializedName("AmazonOrderId")
  private String amazonOrderId = null;

  @SerializedName("PostedDate")
  private String postedDate = null;

  @SerializedName("BaseTax")
  private Currency baseTax = null;

  @SerializedName("ShippingTax")
  private Currency shippingTax = null;

  @SerializedName("MarketplaceName")
  private String marketplaceName = null;

  @SerializedName("RetrochargeTaxWithheldList")
  private TaxWithheldComponentList retrochargeTaxWithheldList = null;

  public RetrochargeEvent retrochargeEventType(String retrochargeEventType) {
    this.retrochargeEventType = retrochargeEventType;
    return this;
  }

   /**
   * The type of event.  Possible values:  * Retrocharge  * RetrochargeReversal
   * @return retrochargeEventType
  **/
  @ApiModelProperty(value = "The type of event.  Possible values:  * Retrocharge  * RetrochargeReversal")
  public String getRetrochargeEventType() {
    return retrochargeEventType;
  }

  public void setRetrochargeEventType(String retrochargeEventType) {
    this.retrochargeEventType = retrochargeEventType;
  }

  public RetrochargeEvent amazonOrderId(String amazonOrderId) {
    this.amazonOrderId = amazonOrderId;
    return this;
  }

   /**
   * An Amazon-defined identifier for an order.
   * @return amazonOrderId
  **/
  @ApiModelProperty(value = "An Amazon-defined identifier for an order.")
  public String getAmazonOrderId() {
    return amazonOrderId;
  }

  public void setAmazonOrderId(String amazonOrderId) {
    this.amazonOrderId = amazonOrderId;
  }

  public RetrochargeEvent postedDate(String postedDate) {
    this.postedDate = postedDate;
    return this;
  }

   /**
   * The date and time when the financial event was posted.
   * @return postedDate
  **/
  @ApiModelProperty(value = "The date and time when the financial event was posted.")
  public String getPostedDate() {
    return postedDate;
  }

  public void setPostedDate(String postedDate) {
    this.postedDate = postedDate;
  }

  public RetrochargeEvent baseTax(Currency baseTax) {
    this.baseTax = baseTax;
    return this;
  }

   /**
   * The base tax associated with the retrocharge event.
   * @return baseTax
  **/
  @ApiModelProperty(value = "The base tax associated with the retrocharge event.")
  public Currency getBaseTax() {
    return baseTax;
  }

  public void setBaseTax(Currency baseTax) {
    this.baseTax = baseTax;
  }

  public RetrochargeEvent shippingTax(Currency shippingTax) {
    this.shippingTax = shippingTax;
    return this;
  }

   /**
   * The shipping tax associated with the retrocharge event.
   * @return shippingTax
  **/
  @ApiModelProperty(value = "The shipping tax associated with the retrocharge event.")
  public Currency getShippingTax() {
    return shippingTax;
  }

  public void setShippingTax(Currency shippingTax) {
    this.shippingTax = shippingTax;
  }

  public RetrochargeEvent marketplaceName(String marketplaceName) {
    this.marketplaceName = marketplaceName;
    return this;
  }

   /**
   * The name of the marketplace where the retrocharge event occurred.
   * @return marketplaceName
  **/
  @ApiModelProperty(value = "The name of the marketplace where the retrocharge event occurred.")
  public String getMarketplaceName() {
    return marketplaceName;
  }

  public void setMarketplaceName(String marketplaceName) {
    this.marketplaceName = marketplaceName;
  }

  public RetrochargeEvent retrochargeTaxWithheldList(TaxWithheldComponentList retrochargeTaxWithheldList) {
    this.retrochargeTaxWithheldList = retrochargeTaxWithheldList;
    return this;
  }

   /**
   * A list of information about taxes withheld.
   * @return retrochargeTaxWithheldList
  **/
  @ApiModelProperty(value = "A list of information about taxes withheld.")
  public TaxWithheldComponentList getRetrochargeTaxWithheldList() {
    return retrochargeTaxWithheldList;
  }

  public void setRetrochargeTaxWithheldList(TaxWithheldComponentList retrochargeTaxWithheldList) {
    this.retrochargeTaxWithheldList = retrochargeTaxWithheldList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrochargeEvent retrochargeEvent = (RetrochargeEvent) o;
    return Objects.equals(this.retrochargeEventType, retrochargeEvent.retrochargeEventType) &&
        Objects.equals(this.amazonOrderId, retrochargeEvent.amazonOrderId) &&
        Objects.equals(this.postedDate, retrochargeEvent.postedDate) &&
        Objects.equals(this.baseTax, retrochargeEvent.baseTax) &&
        Objects.equals(this.shippingTax, retrochargeEvent.shippingTax) &&
        Objects.equals(this.marketplaceName, retrochargeEvent.marketplaceName) &&
        Objects.equals(this.retrochargeTaxWithheldList, retrochargeEvent.retrochargeTaxWithheldList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(retrochargeEventType, amazonOrderId, postedDate, baseTax, shippingTax, marketplaceName, retrochargeTaxWithheldList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrochargeEvent {\n");
    
    sb.append("    retrochargeEventType: ").append(toIndentedString(retrochargeEventType)).append("\n");
    sb.append("    amazonOrderId: ").append(toIndentedString(amazonOrderId)).append("\n");
    sb.append("    postedDate: ").append(toIndentedString(postedDate)).append("\n");
    sb.append("    baseTax: ").append(toIndentedString(baseTax)).append("\n");
    sb.append("    shippingTax: ").append(toIndentedString(shippingTax)).append("\n");
    sb.append("    marketplaceName: ").append(toIndentedString(marketplaceName)).append("\n");
    sb.append("    retrochargeTaxWithheldList: ").append(toIndentedString(retrochargeTaxWithheldList)).append("\n");
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

