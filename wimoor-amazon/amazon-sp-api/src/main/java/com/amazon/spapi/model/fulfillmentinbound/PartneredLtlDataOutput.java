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
import com.amazon.spapi.model.fulfillmentinbound.Contact;
import com.amazon.spapi.model.fulfillmentinbound.PalletList;
import com.amazon.spapi.model.fulfillmentinbound.PartneredEstimate;
import com.amazon.spapi.model.fulfillmentinbound.SellerFreightClass;
import com.amazon.spapi.model.fulfillmentinbound.Weight;
import java.io.IOException;

/**
 * Information returned by Amazon about a Less Than Truckload/Full Truckload (LTL/FTL) shipment by an Amazon-partnered carrier.
 */
@ApiModel(description = "Information returned by Amazon about a Less Than Truckload/Full Truckload (LTL/FTL) shipment by an Amazon-partnered carrier.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-30T14:56:00.161+08:00")
public class PartneredLtlDataOutput {
  @SerializedName("Contact")
  private Contact contact = null;

  @SerializedName("BoxCount")
  private Integer boxCount = null;

  @SerializedName("SellerFreightClass")
  private SellerFreightClass sellerFreightClass = null;

  @SerializedName("FreightReadyDate")
  private String freightReadyDate = null;

  @SerializedName("PalletList")
  private PalletList palletList = null;

  @SerializedName("TotalWeight")
  private Weight totalWeight = null;

  @SerializedName("SellerDeclaredValue")
  private Amount sellerDeclaredValue = null;

  @SerializedName("AmazonCalculatedValue")
  private Amount amazonCalculatedValue = null;

  @SerializedName("PreviewPickupDate")
  private String previewPickupDate = null;

  @SerializedName("PreviewDeliveryDate")
  private String previewDeliveryDate = null;

  @SerializedName("PreviewFreightClass")
  private SellerFreightClass previewFreightClass = null;

  @SerializedName("AmazonReferenceId")
  private String amazonReferenceId = null;

  @SerializedName("IsBillOfLadingAvailable")
  private Boolean isBillOfLadingAvailable = null;

  @SerializedName("PartneredEstimate")
  private PartneredEstimate partneredEstimate = null;

  @SerializedName("CarrierName")
  private String carrierName = null;

  public PartneredLtlDataOutput contact(Contact contact) {
    this.contact = contact;
    return this;
  }

   /**
   * Contact information for the person in the seller&#39;s organization who is responsible for the shipment. Used by the carrier if they have questions about the shipment.
   * @return contact
  **/
  @ApiModelProperty(required = true, value = "Contact information for the person in the seller's organization who is responsible for the shipment. Used by the carrier if they have questions about the shipment.")
  public Contact getContact() {
    return contact;
  }

  public void setContact(Contact contact) {
    this.contact = contact;
  }

  public PartneredLtlDataOutput boxCount(Integer boxCount) {
    this.boxCount = boxCount;
    return this;
  }

   /**
   * The number of boxes in the shipment.
   * @return boxCount
  **/
  @ApiModelProperty(required = true, value = "The number of boxes in the shipment.")
  public Integer getBoxCount() {
    return boxCount;
  }

  public void setBoxCount(Integer boxCount) {
    this.boxCount = boxCount;
  }

  public PartneredLtlDataOutput sellerFreightClass(SellerFreightClass sellerFreightClass) {
    this.sellerFreightClass = sellerFreightClass;
    return this;
  }

   /**
   * Get sellerFreightClass
   * @return sellerFreightClass
  **/
  @ApiModelProperty(value = "")
  public SellerFreightClass getSellerFreightClass() {
    return sellerFreightClass;
  }

  public void setSellerFreightClass(SellerFreightClass sellerFreightClass) {
    this.sellerFreightClass = sellerFreightClass;
  }

  public PartneredLtlDataOutput freightReadyDate(String freightReadyDate) {
    this.freightReadyDate = freightReadyDate;
    return this;
  }

   /**
   * The date that the shipment will be ready to be picked up by the carrier. Must be in YYYY-MM-DD format.
   * @return freightReadyDate
  **/
  @ApiModelProperty(required = true, value = "The date that the shipment will be ready to be picked up by the carrier. Must be in YYYY-MM-DD format.")
  public String getFreightReadyDate() {
    return freightReadyDate;
  }

  public void setFreightReadyDate(String freightReadyDate) {
    this.freightReadyDate = freightReadyDate;
  }

  public PartneredLtlDataOutput palletList(PalletList palletList) {
    this.palletList = palletList;
    return this;
  }

   /**
   * Get palletList
   * @return palletList
  **/
  @ApiModelProperty(required = true, value = "")
  public PalletList getPalletList() {
    return palletList;
  }

  public void setPalletList(PalletList palletList) {
    this.palletList = palletList;
  }

  public PartneredLtlDataOutput totalWeight(Weight totalWeight) {
    this.totalWeight = totalWeight;
    return this;
  }

   /**
   * The total weight of the shipment.
   * @return totalWeight
  **/
  @ApiModelProperty(required = true, value = "The total weight of the shipment.")
  public Weight getTotalWeight() {
    return totalWeight;
  }

  public void setTotalWeight(Weight totalWeight) {
    this.totalWeight = totalWeight;
  }

  public PartneredLtlDataOutput sellerDeclaredValue(Amount sellerDeclaredValue) {
    this.sellerDeclaredValue = sellerDeclaredValue;
    return this;
  }

   /**
   * Your declaration of the total value of the inventory in the shipment.
   * @return sellerDeclaredValue
  **/
  @ApiModelProperty(value = "Your declaration of the total value of the inventory in the shipment.")
  public Amount getSellerDeclaredValue() {
    return sellerDeclaredValue;
  }

  public void setSellerDeclaredValue(Amount sellerDeclaredValue) {
    this.sellerDeclaredValue = sellerDeclaredValue;
  }

  public PartneredLtlDataOutput amazonCalculatedValue(Amount amazonCalculatedValue) {
    this.amazonCalculatedValue = amazonCalculatedValue;
    return this;
  }

   /**
   * Estimate by Amazon of the total value of the inventory in the shipment.
   * @return amazonCalculatedValue
  **/
  @ApiModelProperty(value = "Estimate by Amazon of the total value of the inventory in the shipment.")
  public Amount getAmazonCalculatedValue() {
    return amazonCalculatedValue;
  }

  public void setAmazonCalculatedValue(Amount amazonCalculatedValue) {
    this.amazonCalculatedValue = amazonCalculatedValue;
  }

  public PartneredLtlDataOutput previewPickupDate(String previewPickupDate) {
    this.previewPickupDate = previewPickupDate;
    return this;
  }

   /**
   * The estimated date that the shipment will be picked up by the carrier, in YYYY-MM-DD format.
   * @return previewPickupDate
  **/
  @ApiModelProperty(required = true, value = "The estimated date that the shipment will be picked up by the carrier, in YYYY-MM-DD format.")
  public String getPreviewPickupDate() {
    return previewPickupDate;
  }

  public void setPreviewPickupDate(String previewPickupDate) {
    this.previewPickupDate = previewPickupDate;
  }

  public PartneredLtlDataOutput previewDeliveryDate(String previewDeliveryDate) {
    this.previewDeliveryDate = previewDeliveryDate;
    return this;
  }

   /**
   * The estimated date that the shipment will be delivered to an Amazon fulfillment center, in YYYY-MM-DD format.
   * @return previewDeliveryDate
  **/
  @ApiModelProperty(required = true, value = "The estimated date that the shipment will be delivered to an Amazon fulfillment center, in YYYY-MM-DD format.")
  public String getPreviewDeliveryDate() {
    return previewDeliveryDate;
  }

  public void setPreviewDeliveryDate(String previewDeliveryDate) {
    this.previewDeliveryDate = previewDeliveryDate;
  }

  public PartneredLtlDataOutput previewFreightClass(SellerFreightClass previewFreightClass) {
    this.previewFreightClass = previewFreightClass;
    return this;
  }

   /**
   * The freight class of the shipment as estimated by Amazon if you did not include a freight class when you called the putTransportDetails operation.
   * @return previewFreightClass
  **/
  @ApiModelProperty(required = true, value = "The freight class of the shipment as estimated by Amazon if you did not include a freight class when you called the putTransportDetails operation.")
  public SellerFreightClass getPreviewFreightClass() {
    return previewFreightClass;
  }

  public void setPreviewFreightClass(SellerFreightClass previewFreightClass) {
    this.previewFreightClass = previewFreightClass;
  }

  public PartneredLtlDataOutput amazonReferenceId(String amazonReferenceId) {
    this.amazonReferenceId = amazonReferenceId;
    return this;
  }

   /**
   * A unique identifier created by Amazon that identifies this Amazon-partnered, Less Than Truckload/Full Truckload (LTL/FTL) shipment.
   * @return amazonReferenceId
  **/
  @ApiModelProperty(required = true, value = "A unique identifier created by Amazon that identifies this Amazon-partnered, Less Than Truckload/Full Truckload (LTL/FTL) shipment.")
  public String getAmazonReferenceId() {
    return amazonReferenceId;
  }

  public void setAmazonReferenceId(String amazonReferenceId) {
    this.amazonReferenceId = amazonReferenceId;
  }

  public PartneredLtlDataOutput isBillOfLadingAvailable(Boolean isBillOfLadingAvailable) {
    this.isBillOfLadingAvailable = isBillOfLadingAvailable;
    return this;
  }

   /**
   * Indicates whether the bill of lading for the shipment is available.
   * @return isBillOfLadingAvailable
  **/
  @ApiModelProperty(required = true, value = "Indicates whether the bill of lading for the shipment is available.")
  public Boolean isIsBillOfLadingAvailable() {
    return isBillOfLadingAvailable;
  }

  public void setIsBillOfLadingAvailable(Boolean isBillOfLadingAvailable) {
    this.isBillOfLadingAvailable = isBillOfLadingAvailable;
  }

  public PartneredLtlDataOutput partneredEstimate(PartneredEstimate partneredEstimate) {
    this.partneredEstimate = partneredEstimate;
    return this;
  }

   /**
   * The estimated shipping cost using an Amazon-partnered carrier.
   * @return partneredEstimate
  **/
  @ApiModelProperty(value = "The estimated shipping cost using an Amazon-partnered carrier.")
  public PartneredEstimate getPartneredEstimate() {
    return partneredEstimate;
  }

  public void setPartneredEstimate(PartneredEstimate partneredEstimate) {
    this.partneredEstimate = partneredEstimate;
  }

  public PartneredLtlDataOutput carrierName(String carrierName) {
    this.carrierName = carrierName;
    return this;
  }

   /**
   * The carrier for the inbound shipment.
   * @return carrierName
  **/
  @ApiModelProperty(required = true, value = "The carrier for the inbound shipment.")
  public String getCarrierName() {
    return carrierName;
  }

  public void setCarrierName(String carrierName) {
    this.carrierName = carrierName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartneredLtlDataOutput partneredLtlDataOutput = (PartneredLtlDataOutput) o;
    return Objects.equals(this.contact, partneredLtlDataOutput.contact) &&
        Objects.equals(this.boxCount, partneredLtlDataOutput.boxCount) &&
        Objects.equals(this.sellerFreightClass, partneredLtlDataOutput.sellerFreightClass) &&
        Objects.equals(this.freightReadyDate, partneredLtlDataOutput.freightReadyDate) &&
        Objects.equals(this.palletList, partneredLtlDataOutput.palletList) &&
        Objects.equals(this.totalWeight, partneredLtlDataOutput.totalWeight) &&
        Objects.equals(this.sellerDeclaredValue, partneredLtlDataOutput.sellerDeclaredValue) &&
        Objects.equals(this.amazonCalculatedValue, partneredLtlDataOutput.amazonCalculatedValue) &&
        Objects.equals(this.previewPickupDate, partneredLtlDataOutput.previewPickupDate) &&
        Objects.equals(this.previewDeliveryDate, partneredLtlDataOutput.previewDeliveryDate) &&
        Objects.equals(this.previewFreightClass, partneredLtlDataOutput.previewFreightClass) &&
        Objects.equals(this.amazonReferenceId, partneredLtlDataOutput.amazonReferenceId) &&
        Objects.equals(this.isBillOfLadingAvailable, partneredLtlDataOutput.isBillOfLadingAvailable) &&
        Objects.equals(this.partneredEstimate, partneredLtlDataOutput.partneredEstimate) &&
        Objects.equals(this.carrierName, partneredLtlDataOutput.carrierName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contact, boxCount, sellerFreightClass, freightReadyDate, palletList, totalWeight, sellerDeclaredValue, amazonCalculatedValue, previewPickupDate, previewDeliveryDate, previewFreightClass, amazonReferenceId, isBillOfLadingAvailable, partneredEstimate, carrierName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartneredLtlDataOutput {\n");
    
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    boxCount: ").append(toIndentedString(boxCount)).append("\n");
    sb.append("    sellerFreightClass: ").append(toIndentedString(sellerFreightClass)).append("\n");
    sb.append("    freightReadyDate: ").append(toIndentedString(freightReadyDate)).append("\n");
    sb.append("    palletList: ").append(toIndentedString(palletList)).append("\n");
    sb.append("    totalWeight: ").append(toIndentedString(totalWeight)).append("\n");
    sb.append("    sellerDeclaredValue: ").append(toIndentedString(sellerDeclaredValue)).append("\n");
    sb.append("    amazonCalculatedValue: ").append(toIndentedString(amazonCalculatedValue)).append("\n");
    sb.append("    previewPickupDate: ").append(toIndentedString(previewPickupDate)).append("\n");
    sb.append("    previewDeliveryDate: ").append(toIndentedString(previewDeliveryDate)).append("\n");
    sb.append("    previewFreightClass: ").append(toIndentedString(previewFreightClass)).append("\n");
    sb.append("    amazonReferenceId: ").append(toIndentedString(amazonReferenceId)).append("\n");
    sb.append("    isBillOfLadingAvailable: ").append(toIndentedString(isBillOfLadingAvailable)).append("\n");
    sb.append("    partneredEstimate: ").append(toIndentedString(partneredEstimate)).append("\n");
    sb.append("    carrierName: ").append(toIndentedString(carrierName)).append("\n");
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

