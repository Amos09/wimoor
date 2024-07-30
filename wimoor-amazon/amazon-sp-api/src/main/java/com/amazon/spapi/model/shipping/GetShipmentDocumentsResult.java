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
import com.amazon.spapi.model.shipping.PackageDocumentDetail;
import java.io.IOException;

/**
 * The payload for the getShipmentDocuments operation.
 */
@ApiModel(description = "The payload for the getShipmentDocuments operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-30T16:10:03.349+08:00")
public class GetShipmentDocumentsResult {
  @SerializedName("shipmentId")
  private String shipmentId = null;

  @SerializedName("packageDocumentDetail")
  private PackageDocumentDetail packageDocumentDetail = null;

  public GetShipmentDocumentsResult shipmentId(String shipmentId) {
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

  public GetShipmentDocumentsResult packageDocumentDetail(PackageDocumentDetail packageDocumentDetail) {
    this.packageDocumentDetail = packageDocumentDetail;
    return this;
  }

   /**
   * Get packageDocumentDetail
   * @return packageDocumentDetail
  **/
  @ApiModelProperty(required = true, value = "")
  public PackageDocumentDetail getPackageDocumentDetail() {
    return packageDocumentDetail;
  }

  public void setPackageDocumentDetail(PackageDocumentDetail packageDocumentDetail) {
    this.packageDocumentDetail = packageDocumentDetail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetShipmentDocumentsResult getShipmentDocumentsResult = (GetShipmentDocumentsResult) o;
    return Objects.equals(this.shipmentId, getShipmentDocumentsResult.shipmentId) &&
        Objects.equals(this.packageDocumentDetail, getShipmentDocumentsResult.packageDocumentDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipmentId, packageDocumentDetail);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetShipmentDocumentsResult {\n");
    
    sb.append("    shipmentId: ").append(toIndentedString(shipmentId)).append("\n");
    sb.append("    packageDocumentDetail: ").append(toIndentedString(packageDocumentDetail)).append("\n");
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

