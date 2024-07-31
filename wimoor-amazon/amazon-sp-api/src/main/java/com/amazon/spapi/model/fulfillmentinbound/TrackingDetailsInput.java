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
 * Tracking information input for Less-Than-Truckload (LTL) and Small Parcel Delivery (SPD) shipments.
 */
@ApiModel(description = "Tracking information input for Less-Than-Truckload (LTL) and Small Parcel Delivery (SPD) shipments.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-04-03T09:34:42.612+08:00")
public class TrackingDetailsInput {
  @SerializedName("ltlTrackingDetail")
  private LtlTrackingDetailInput ltlTrackingDetail = null;

  @SerializedName("spdTrackingDetail")
  private SpdTrackingDetailInput spdTrackingDetail = null;

  public TrackingDetailsInput ltlTrackingDetail(LtlTrackingDetailInput ltlTrackingDetail) {
    this.ltlTrackingDetail = ltlTrackingDetail;
    return this;
  }

   /**
   * Get ltlTrackingDetail
   * @return ltlTrackingDetail
  **/
  @ApiModelProperty(value = "")
  public LtlTrackingDetailInput getLtlTrackingDetail() {
    return ltlTrackingDetail;
  }

  public void setLtlTrackingDetail(LtlTrackingDetailInput ltlTrackingDetail) {
    this.ltlTrackingDetail = ltlTrackingDetail;
  }

  public TrackingDetailsInput spdTrackingDetail(SpdTrackingDetailInput spdTrackingDetail) {
    this.spdTrackingDetail = spdTrackingDetail;
    return this;
  }

   /**
   * Get spdTrackingDetail
   * @return spdTrackingDetail
  **/
  @ApiModelProperty(value = "")
  public SpdTrackingDetailInput getSpdTrackingDetail() {
    return spdTrackingDetail;
  }

  public void setSpdTrackingDetail(SpdTrackingDetailInput spdTrackingDetail) {
    this.spdTrackingDetail = spdTrackingDetail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackingDetailsInput trackingDetailsInput = (TrackingDetailsInput) o;
    return Objects.equals(this.ltlTrackingDetail, trackingDetailsInput.ltlTrackingDetail) &&
        Objects.equals(this.spdTrackingDetail, trackingDetailsInput.spdTrackingDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ltlTrackingDetail, spdTrackingDetail);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackingDetailsInput {\n");
    
    sb.append("    ltlTrackingDetail: ").append(toIndentedString(ltlTrackingDetail)).append("\n");
    sb.append("    spdTrackingDetail: ").append(toIndentedString(spdTrackingDetail)).append("\n");
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
