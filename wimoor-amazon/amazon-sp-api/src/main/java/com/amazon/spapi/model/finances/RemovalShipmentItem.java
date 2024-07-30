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
import java.io.IOException;

/**
 * Item-level information for a removal shipment.
 */
@ApiModel(description = "Item-level information for a removal shipment.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-30T16:09:34.728+08:00")
public class RemovalShipmentItem {
  @SerializedName("RemovalShipmentItemId")
  private String removalShipmentItemId = null;

  @SerializedName("TaxCollectionModel")
  private String taxCollectionModel = null;

  @SerializedName("FulfillmentNetworkSKU")
  private String fulfillmentNetworkSKU = null;

  @SerializedName("Quantity")
  private Integer quantity = null;

  @SerializedName("Revenue")
  private Currency revenue = null;

  @SerializedName("FeeAmount")
  private Currency feeAmount = null;

  @SerializedName("TaxAmount")
  private Currency taxAmount = null;

  @SerializedName("TaxWithheld")
  private Currency taxWithheld = null;

  public RemovalShipmentItem removalShipmentItemId(String removalShipmentItemId) {
    this.removalShipmentItemId = removalShipmentItemId;
    return this;
  }

   /**
   * An identifier for an item in a removal shipment.
   * @return removalShipmentItemId
  **/
  @ApiModelProperty(value = "An identifier for an item in a removal shipment.")
  public String getRemovalShipmentItemId() {
    return removalShipmentItemId;
  }

  public void setRemovalShipmentItemId(String removalShipmentItemId) {
    this.removalShipmentItemId = removalShipmentItemId;
  }

  public RemovalShipmentItem taxCollectionModel(String taxCollectionModel) {
    this.taxCollectionModel = taxCollectionModel;
    return this;
  }

   /**
   * The tax collection model applied to the item.  Possible values:  * MarketplaceFacilitator - Tax is withheld and remitted to the taxing authority by Amazon on behalf of the seller.  * Standard - Tax is paid to the seller and not remitted to the taxing authority by Amazon.
   * @return taxCollectionModel
  **/
  @ApiModelProperty(value = "The tax collection model applied to the item.  Possible values:  * MarketplaceFacilitator - Tax is withheld and remitted to the taxing authority by Amazon on behalf of the seller.  * Standard - Tax is paid to the seller and not remitted to the taxing authority by Amazon.")
  public String getTaxCollectionModel() {
    return taxCollectionModel;
  }

  public void setTaxCollectionModel(String taxCollectionModel) {
    this.taxCollectionModel = taxCollectionModel;
  }

  public RemovalShipmentItem fulfillmentNetworkSKU(String fulfillmentNetworkSKU) {
    this.fulfillmentNetworkSKU = fulfillmentNetworkSKU;
    return this;
  }

   /**
   * The Amazon fulfillment network SKU for the item.
   * @return fulfillmentNetworkSKU
  **/
  @ApiModelProperty(value = "The Amazon fulfillment network SKU for the item.")
  public String getFulfillmentNetworkSKU() {
    return fulfillmentNetworkSKU;
  }

  public void setFulfillmentNetworkSKU(String fulfillmentNetworkSKU) {
    this.fulfillmentNetworkSKU = fulfillmentNetworkSKU;
  }

  public RemovalShipmentItem quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * The quantity of the item.
   * @return quantity
  **/
  @ApiModelProperty(value = "The quantity of the item.")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public RemovalShipmentItem revenue(Currency revenue) {
    this.revenue = revenue;
    return this;
  }

   /**
   * The total amount paid to the seller for the removed item.
   * @return revenue
  **/
  @ApiModelProperty(value = "The total amount paid to the seller for the removed item.")
  public Currency getRevenue() {
    return revenue;
  }

  public void setRevenue(Currency revenue) {
    this.revenue = revenue;
  }

  public RemovalShipmentItem feeAmount(Currency feeAmount) {
    this.feeAmount = feeAmount;
    return this;
  }

   /**
   * The fee that Amazon charged to the seller for the removal of the item. The amount is a negative number.
   * @return feeAmount
  **/
  @ApiModelProperty(value = "The fee that Amazon charged to the seller for the removal of the item. The amount is a negative number.")
  public Currency getFeeAmount() {
    return feeAmount;
  }

  public void setFeeAmount(Currency feeAmount) {
    this.feeAmount = feeAmount;
  }

  public RemovalShipmentItem taxAmount(Currency taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }

   /**
   * Tax collected on the revenue.
   * @return taxAmount
  **/
  @ApiModelProperty(value = "Tax collected on the revenue.")
  public Currency getTaxAmount() {
    return taxAmount;
  }

  public void setTaxAmount(Currency taxAmount) {
    this.taxAmount = taxAmount;
  }

  public RemovalShipmentItem taxWithheld(Currency taxWithheld) {
    this.taxWithheld = taxWithheld;
    return this;
  }

   /**
   * The tax withheld and remitted to the taxing authority by Amazon on behalf of the seller. If TaxCollectionModel&#x3D;MarketplaceFacilitator, then TaxWithheld&#x3D;TaxAmount (except the TaxWithheld amount is a negative number). Otherwise TaxWithheld&#x3D;0.
   * @return taxWithheld
  **/
  @ApiModelProperty(value = "The tax withheld and remitted to the taxing authority by Amazon on behalf of the seller. If TaxCollectionModel=MarketplaceFacilitator, then TaxWithheld=TaxAmount (except the TaxWithheld amount is a negative number). Otherwise TaxWithheld=0.")
  public Currency getTaxWithheld() {
    return taxWithheld;
  }

  public void setTaxWithheld(Currency taxWithheld) {
    this.taxWithheld = taxWithheld;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemovalShipmentItem removalShipmentItem = (RemovalShipmentItem) o;
    return Objects.equals(this.removalShipmentItemId, removalShipmentItem.removalShipmentItemId) &&
        Objects.equals(this.taxCollectionModel, removalShipmentItem.taxCollectionModel) &&
        Objects.equals(this.fulfillmentNetworkSKU, removalShipmentItem.fulfillmentNetworkSKU) &&
        Objects.equals(this.quantity, removalShipmentItem.quantity) &&
        Objects.equals(this.revenue, removalShipmentItem.revenue) &&
        Objects.equals(this.feeAmount, removalShipmentItem.feeAmount) &&
        Objects.equals(this.taxAmount, removalShipmentItem.taxAmount) &&
        Objects.equals(this.taxWithheld, removalShipmentItem.taxWithheld);
  }

  @Override
  public int hashCode() {
    return Objects.hash(removalShipmentItemId, taxCollectionModel, fulfillmentNetworkSKU, quantity, revenue, feeAmount, taxAmount, taxWithheld);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemovalShipmentItem {\n");
    
    sb.append("    removalShipmentItemId: ").append(toIndentedString(removalShipmentItemId)).append("\n");
    sb.append("    taxCollectionModel: ").append(toIndentedString(taxCollectionModel)).append("\n");
    sb.append("    fulfillmentNetworkSKU: ").append(toIndentedString(fulfillmentNetworkSKU)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    revenue: ").append(toIndentedString(revenue)).append("\n");
    sb.append("    feeAmount: ").append(toIndentedString(feeAmount)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    taxWithheld: ").append(toIndentedString(taxWithheld)).append("\n");
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

