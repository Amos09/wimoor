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


package com.amazon.spapi.model.fulfillmentinboundV20240320;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The &#x60;ListShipmentContentUpdatePreviews&#x60; response.
 */
@ApiModel(description = "The `ListShipmentContentUpdatePreviews` response.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-06-18T14:09:15.791+08:00")
public class ListShipmentContentUpdatePreviewsResponse {
  @SerializedName("contentUpdatePreviews")
  private List<ContentUpdatePreview> contentUpdatePreviews = new ArrayList<ContentUpdatePreview>();

  @SerializedName("pagination")
  private Pagination pagination = null;

  public ListShipmentContentUpdatePreviewsResponse contentUpdatePreviews(List<ContentUpdatePreview> contentUpdatePreviews) {
    this.contentUpdatePreviews = contentUpdatePreviews;
    return this;
  }

  public ListShipmentContentUpdatePreviewsResponse addContentUpdatePreviewsItem(ContentUpdatePreview contentUpdatePreviewsItem) {
    this.contentUpdatePreviews.add(contentUpdatePreviewsItem);
    return this;
  }

   /**
   * A list of content update previews in a shipment.
   * @return contentUpdatePreviews
  **/
  @ApiModelProperty(required = true, value = "A list of content update previews in a shipment.")
  public List<ContentUpdatePreview> getContentUpdatePreviews() {
    return contentUpdatePreviews;
  }

  public void setContentUpdatePreviews(List<ContentUpdatePreview> contentUpdatePreviews) {
    this.contentUpdatePreviews = contentUpdatePreviews;
  }

  public ListShipmentContentUpdatePreviewsResponse pagination(Pagination pagination) {
    this.pagination = pagination;
    return this;
  }

   /**
   * Get pagination
   * @return pagination
  **/
  @ApiModelProperty(value = "")
  public Pagination getPagination() {
    return pagination;
  }

  public void setPagination(Pagination pagination) {
    this.pagination = pagination;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListShipmentContentUpdatePreviewsResponse listShipmentContentUpdatePreviewsResponse = (ListShipmentContentUpdatePreviewsResponse) o;
    return Objects.equals(this.contentUpdatePreviews, listShipmentContentUpdatePreviewsResponse.contentUpdatePreviews) &&
        Objects.equals(this.pagination, listShipmentContentUpdatePreviewsResponse.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentUpdatePreviews, pagination);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListShipmentContentUpdatePreviewsResponse {\n");
    
    sb.append("    contentUpdatePreviews: ").append(toIndentedString(contentUpdatePreviews)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
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

