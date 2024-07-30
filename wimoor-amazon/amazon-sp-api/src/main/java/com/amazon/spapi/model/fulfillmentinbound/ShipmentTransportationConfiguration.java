/*
 * The Selling Partner API for FBA inbound operations.
 * The Selling Partner API for Fulfillment By Amazon (FBA) Inbound. The FBA Inbound API enables building inbound workflows to create, manage, and send shipments into Amazon's fulfillment network. The API has interoperability with the Send-to-Amazon user interface.
 *
 * OpenAPI spec version: 2024-03-20
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.fulfillmentinbound;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Details needed to generate the transportation options.
 */
@ApiModel(description = "Details needed to generate the transportation options.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-04-03T09:34:42.612+08:00")
public class ShipmentTransportationConfiguration {
  @SerializedName("contactInformation")
  private ContactInformation contactInformation = null;

  @SerializedName("palletInformation")
  private PalletInformation palletInformation = null;

  @SerializedName("readyToShipWindow")
  private WindowInput readyToShipWindow = null;

  @SerializedName("shipmentId")
  private String shipmentId = null;

  public ShipmentTransportationConfiguration contactInformation(ContactInformation contactInformation) {
    this.contactInformation = contactInformation;
    return this;
  }

   /**
   * Get contactInformation
   * @return contactInformation
  **/
  @ApiModelProperty(value = "")
  public ContactInformation getContactInformation() {
    return contactInformation;
  }

  public void setContactInformation(ContactInformation contactInformation) {
    this.contactInformation = contactInformation;
  }

  public ShipmentTransportationConfiguration palletInformation(PalletInformation palletInformation) {
    this.palletInformation = palletInformation;
    return this;
  }

   /**
   * Get palletInformation
   * @return palletInformation
  **/
  @ApiModelProperty(value = "")
  public PalletInformation getPalletInformation() {
    return palletInformation;
  }

  public void setPalletInformation(PalletInformation palletInformation) {
    this.palletInformation = palletInformation;
  }

  public ShipmentTransportationConfiguration readyToShipWindow(WindowInput readyToShipWindow) {
    this.readyToShipWindow = readyToShipWindow;
    return this;
  }

   /**
   * The range of dates within which the seller intends to ship their items. This is the pick-up date or “ready to ship” date, not an estimated delivery date. 
   * @return readyToShipWindow
  **/
  @ApiModelProperty(required = true, value = "The range of dates within which the seller intends to ship their items. This is the pick-up date or “ready to ship” date, not an estimated delivery date. ")
  public WindowInput getReadyToShipWindow() {
    return readyToShipWindow;
  }

  public void setReadyToShipWindow(WindowInput readyToShipWindow) {
    this.readyToShipWindow = readyToShipWindow;
  }

  public ShipmentTransportationConfiguration shipmentId(String shipmentId) {
    this.shipmentId = shipmentId;
    return this;
  }

   /**
   * Identifier to a shipment. A shipment contains the boxes and units being inbounded.
   * @return shipmentId
  **/
  @ApiModelProperty(required = true, value = "Identifier to a shipment. A shipment contains the boxes and units being inbounded.")
  public String getShipmentId() {
    return shipmentId;
  }

  public void setShipmentId(String shipmentId) {
    this.shipmentId = shipmentId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipmentTransportationConfiguration shipmentTransportationConfiguration = (ShipmentTransportationConfiguration) o;
    return Objects.equals(this.contactInformation, shipmentTransportationConfiguration.contactInformation) &&
        Objects.equals(this.palletInformation, shipmentTransportationConfiguration.palletInformation) &&
        Objects.equals(this.readyToShipWindow, shipmentTransportationConfiguration.readyToShipWindow) &&
        Objects.equals(this.shipmentId, shipmentTransportationConfiguration.shipmentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactInformation, palletInformation, readyToShipWindow, shipmentId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipmentTransportationConfiguration {\n");
    
    sb.append("    contactInformation: ").append(toIndentedString(contactInformation)).append("\n");
    sb.append("    palletInformation: ").append(toIndentedString(palletInformation)).append("\n");
    sb.append("    readyToShipWindow: ").append(toIndentedString(readyToShipWindow)).append("\n");
    sb.append("    shipmentId: ").append(toIndentedString(shipmentId)).append("\n");
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

