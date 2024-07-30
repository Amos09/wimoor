/*
 * Selling Partner API for Services
 * With the Services API, you can build applications that help service providers get and modify their service orders and manage their resources.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.services;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Document that captured during service appointment fulfillment that portrays proof of completion
 */
@ApiModel(description = "Document that captured during service appointment fulfillment that portrays proof of completion")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-30T15:25:55.891+08:00")
public class FulfillmentDocument {
  @SerializedName("uploadDestinationId")
  private String uploadDestinationId = null;

  @SerializedName("contentSha256")
  private String contentSha256 = null;

  public FulfillmentDocument uploadDestinationId(String uploadDestinationId) {
    this.uploadDestinationId = uploadDestinationId;
    return this;
  }

   /**
   * The identifier of the upload destination. Get this value by calling the &#x60;createServiceDocumentUploadDestination&#x60; operation of the Services API.
   * @return uploadDestinationId
  **/
  @ApiModelProperty(value = "The identifier of the upload destination. Get this value by calling the `createServiceDocumentUploadDestination` operation of the Services API.")
  public String getUploadDestinationId() {
    return uploadDestinationId;
  }

  public void setUploadDestinationId(String uploadDestinationId) {
    this.uploadDestinationId = uploadDestinationId;
  }

  public FulfillmentDocument contentSha256(String contentSha256) {
    this.contentSha256 = contentSha256;
    return this;
  }

   /**
   * Sha256 hash of the file content. This value is used to determine if the file has been corrupted or tampered with during transit.
   * @return contentSha256
  **/
  @ApiModelProperty(value = "Sha256 hash of the file content. This value is used to determine if the file has been corrupted or tampered with during transit.")
  public String getContentSha256() {
    return contentSha256;
  }

  public void setContentSha256(String contentSha256) {
    this.contentSha256 = contentSha256;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FulfillmentDocument fulfillmentDocument = (FulfillmentDocument) o;
    return Objects.equals(this.uploadDestinationId, fulfillmentDocument.uploadDestinationId) &&
        Objects.equals(this.contentSha256, fulfillmentDocument.contentSha256);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uploadDestinationId, contentSha256);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FulfillmentDocument {\n");
    
    sb.append("    uploadDestinationId: ").append(toIndentedString(uploadDestinationId)).append("\n");
    sb.append("    contentSha256: ").append(toIndentedString(contentSha256)).append("\n");
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

