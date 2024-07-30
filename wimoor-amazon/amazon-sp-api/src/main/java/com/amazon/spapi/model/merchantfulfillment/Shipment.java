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
 * The details of a shipment, including the shipment status.
 */
@ApiModel(description = "The details of a shipment, including the shipment status.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-30T16:09:43.032+08:00")
public class Shipment {
  @SerializedName("ShipmentId")
  private String shipmentId = null;

  @SerializedName("AmazonOrderId")
  private String amazonOrderId = null;

  @SerializedName("SellerOrderId")
  private String sellerOrderId = null;

  @SerializedName("ItemList")
  private ItemList itemList = null;

  @SerializedName("ShipFromAddress")
  private Address shipFromAddress = null;

  @SerializedName("ShipToAddress")
  private Address shipToAddress = null;

  @SerializedName("PackageDimensions")
  private PackageDimensions packageDimensions = null;

  @SerializedName("Weight")
  private Weight weight = null;

  @SerializedName("Insurance")
  private CurrencyAmount insurance = null;

  @SerializedName("ShippingService")
  private ShippingService shippingService = null;

  @SerializedName("Label")
  private Label label = null;

  @SerializedName("Status")
  private ShipmentStatus status = null;

  @SerializedName("TrackingId")
  private String trackingId = null;

  @SerializedName("CreatedDate")
  private String createdDate = null;

  @SerializedName("LastUpdatedDate")
  private String lastUpdatedDate = null;

  public Shipment shipmentId(String shipmentId) {
    this.shipmentId = shipmentId;
    return this;
  }

   /**
   * Get shipmentId
   * @return shipmentId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getShipmentId() {
    return shipmentId;
  }

  public void setShipmentId(String shipmentId) {
    this.shipmentId = shipmentId;
  }

  public Shipment amazonOrderId(String amazonOrderId) {
    this.amazonOrderId = amazonOrderId;
    return this;
  }

   /**
   * Get amazonOrderId
   * @return amazonOrderId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAmazonOrderId() {
    return amazonOrderId;
  }

  public void setAmazonOrderId(String amazonOrderId) {
    this.amazonOrderId = amazonOrderId;
  }

  public Shipment sellerOrderId(String sellerOrderId) {
    this.sellerOrderId = sellerOrderId;
    return this;
  }

   /**
   * Get sellerOrderId
   * @return sellerOrderId
  **/
  @ApiModelProperty(value = "")
  public String getSellerOrderId() {
    return sellerOrderId;
  }

  public void setSellerOrderId(String sellerOrderId) {
    this.sellerOrderId = sellerOrderId;
  }

  public Shipment itemList(ItemList itemList) {
    this.itemList = itemList;
    return this;
  }

   /**
   * Get itemList
   * @return itemList
  **/
  @ApiModelProperty(required = true, value = "")
  public ItemList getItemList() {
    return itemList;
  }

  public void setItemList(ItemList itemList) {
    this.itemList = itemList;
  }

  public Shipment shipFromAddress(Address shipFromAddress) {
    this.shipFromAddress = shipFromAddress;
    return this;
  }

   /**
   * The address of the sender.
   * @return shipFromAddress
  **/
  @ApiModelProperty(required = true, value = "The address of the sender.")
  public Address getShipFromAddress() {
    return shipFromAddress;
  }

  public void setShipFromAddress(Address shipFromAddress) {
    this.shipFromAddress = shipFromAddress;
  }

  public Shipment shipToAddress(Address shipToAddress) {
    this.shipToAddress = shipToAddress;
    return this;
  }

   /**
   * The destination address for the shipment.
   * @return shipToAddress
  **/
  @ApiModelProperty(required = true, value = "The destination address for the shipment.")
  public Address getShipToAddress() {
    return shipToAddress;
  }

  public void setShipToAddress(Address shipToAddress) {
    this.shipToAddress = shipToAddress;
  }

  public Shipment packageDimensions(PackageDimensions packageDimensions) {
    this.packageDimensions = packageDimensions;
    return this;
  }

   /**
   * Get packageDimensions
   * @return packageDimensions
  **/
  @ApiModelProperty(required = true, value = "")
  public PackageDimensions getPackageDimensions() {
    return packageDimensions;
  }

  public void setPackageDimensions(PackageDimensions packageDimensions) {
    this.packageDimensions = packageDimensions;
  }

  public Shipment weight(Weight weight) {
    this.weight = weight;
    return this;
  }

   /**
   * The package weight.
   * @return weight
  **/
  @ApiModelProperty(required = true, value = "The package weight.")
  public Weight getWeight() {
    return weight;
  }

  public void setWeight(Weight weight) {
    this.weight = weight;
  }

  public Shipment insurance(CurrencyAmount insurance) {
    this.insurance = insurance;
    return this;
  }

   /**
   * If DeclaredValue was specified in a previous call to the createShipment operation, then Insurance indicates the amount that the carrier will use to insure the shipment. If DeclaredValue was not specified with a previous call to the createShipment operation, then the shipment will be insured for the carrier&#39;s minimum insurance amount, or the combined sale prices that the items are listed for in the shipment, whichever is less.
   * @return insurance
  **/
  @ApiModelProperty(required = true, value = "If DeclaredValue was specified in a previous call to the createShipment operation, then Insurance indicates the amount that the carrier will use to insure the shipment. If DeclaredValue was not specified with a previous call to the createShipment operation, then the shipment will be insured for the carrier's minimum insurance amount, or the combined sale prices that the items are listed for in the shipment, whichever is less.")
  public CurrencyAmount getInsurance() {
    return insurance;
  }

  public void setInsurance(CurrencyAmount insurance) {
    this.insurance = insurance;
  }

  public Shipment shippingService(ShippingService shippingService) {
    this.shippingService = shippingService;
    return this;
  }

   /**
   * Get shippingService
   * @return shippingService
  **/
  @ApiModelProperty(required = true, value = "")
  public ShippingService getShippingService() {
    return shippingService;
  }

  public void setShippingService(ShippingService shippingService) {
    this.shippingService = shippingService;
  }

  public Shipment label(Label label) {
    this.label = label;
    return this;
  }

   /**
   * Data for creating a shipping label and dimensions for printing the label. If the shipment is canceled, an empty Label is returned.
   * @return label
  **/
  @ApiModelProperty(required = true, value = "Data for creating a shipping label and dimensions for printing the label. If the shipment is canceled, an empty Label is returned.")
  public Label getLabel() {
    return label;
  }

  public void setLabel(Label label) {
    this.label = label;
  }

  public Shipment status(ShipmentStatus status) {
    this.status = status;
    return this;
  }

   /**
   * The shipment status.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "The shipment status.")
  public ShipmentStatus getStatus() {
    return status;
  }

  public void setStatus(ShipmentStatus status) {
    this.status = status;
  }

  public Shipment trackingId(String trackingId) {
    this.trackingId = trackingId;
    return this;
  }

   /**
   * Get trackingId
   * @return trackingId
  **/
  @ApiModelProperty(value = "")
  public String getTrackingId() {
    return trackingId;
  }

  public void setTrackingId(String trackingId) {
    this.trackingId = trackingId;
  }

  public Shipment createdDate(String createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * The date and time the shipment was created.
   * @return createdDate
  **/
  @ApiModelProperty(required = true, value = "The date and time the shipment was created.")
  public String getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }

  public Shipment lastUpdatedDate(String lastUpdatedDate) {
    this.lastUpdatedDate = lastUpdatedDate;
    return this;
  }

   /**
   * The date and time of the last update.
   * @return lastUpdatedDate
  **/
  @ApiModelProperty(value = "The date and time of the last update.")
  public String getLastUpdatedDate() {
    return lastUpdatedDate;
  }

  public void setLastUpdatedDate(String lastUpdatedDate) {
    this.lastUpdatedDate = lastUpdatedDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Shipment shipment = (Shipment) o;
    return Objects.equals(this.shipmentId, shipment.shipmentId) &&
        Objects.equals(this.amazonOrderId, shipment.amazonOrderId) &&
        Objects.equals(this.sellerOrderId, shipment.sellerOrderId) &&
        Objects.equals(this.itemList, shipment.itemList) &&
        Objects.equals(this.shipFromAddress, shipment.shipFromAddress) &&
        Objects.equals(this.shipToAddress, shipment.shipToAddress) &&
        Objects.equals(this.packageDimensions, shipment.packageDimensions) &&
        Objects.equals(this.weight, shipment.weight) &&
        Objects.equals(this.insurance, shipment.insurance) &&
        Objects.equals(this.shippingService, shipment.shippingService) &&
        Objects.equals(this.label, shipment.label) &&
        Objects.equals(this.status, shipment.status) &&
        Objects.equals(this.trackingId, shipment.trackingId) &&
        Objects.equals(this.createdDate, shipment.createdDate) &&
        Objects.equals(this.lastUpdatedDate, shipment.lastUpdatedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipmentId, amazonOrderId, sellerOrderId, itemList, shipFromAddress, shipToAddress, packageDimensions, weight, insurance, shippingService, label, status, trackingId, createdDate, lastUpdatedDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Shipment {\n");
    
    sb.append("    shipmentId: ").append(toIndentedString(shipmentId)).append("\n");
    sb.append("    amazonOrderId: ").append(toIndentedString(amazonOrderId)).append("\n");
    sb.append("    sellerOrderId: ").append(toIndentedString(sellerOrderId)).append("\n");
    sb.append("    itemList: ").append(toIndentedString(itemList)).append("\n");
    sb.append("    shipFromAddress: ").append(toIndentedString(shipFromAddress)).append("\n");
    sb.append("    shipToAddress: ").append(toIndentedString(shipToAddress)).append("\n");
    sb.append("    packageDimensions: ").append(toIndentedString(packageDimensions)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    insurance: ").append(toIndentedString(insurance)).append("\n");
    sb.append("    shippingService: ").append(toIndentedString(shippingService)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    trackingId: ").append(toIndentedString(trackingId)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    lastUpdatedDate: ").append(toIndentedString(lastUpdatedDate)).append("\n");
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

