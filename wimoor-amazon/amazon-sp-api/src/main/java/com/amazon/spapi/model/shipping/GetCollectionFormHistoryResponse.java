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
import com.amazon.spapi.model.shipping.CollectionFormsHistoryRecordList;
import java.io.IOException;

/**
 * The Response  for the GetCollectionFormHistoryResponse operation.
 */
@ApiModel(description = "The Response  for the GetCollectionFormHistoryResponse operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-30T16:10:03.349+08:00")
public class GetCollectionFormHistoryResponse {
  @SerializedName("collectionFormsHistoryRecordList")
  private CollectionFormsHistoryRecordList collectionFormsHistoryRecordList = null;

  @SerializedName("lastRefreshedDate")
  private String lastRefreshedDate = null;

  public GetCollectionFormHistoryResponse collectionFormsHistoryRecordList(CollectionFormsHistoryRecordList collectionFormsHistoryRecordList) {
    this.collectionFormsHistoryRecordList = collectionFormsHistoryRecordList;
    return this;
  }

   /**
   * Get collectionFormsHistoryRecordList
   * @return collectionFormsHistoryRecordList
  **/
  @ApiModelProperty(value = "")
  public CollectionFormsHistoryRecordList getCollectionFormsHistoryRecordList() {
    return collectionFormsHistoryRecordList;
  }

  public void setCollectionFormsHistoryRecordList(CollectionFormsHistoryRecordList collectionFormsHistoryRecordList) {
    this.collectionFormsHistoryRecordList = collectionFormsHistoryRecordList;
  }

  public GetCollectionFormHistoryResponse lastRefreshedDate(String lastRefreshedDate) {
    this.lastRefreshedDate = lastRefreshedDate;
    return this;
  }

   /**
   * Last Refereshed Date of collection
   * @return lastRefreshedDate
  **/
  @ApiModelProperty(value = "Last Refereshed Date of collection")
  public String getLastRefreshedDate() {
    return lastRefreshedDate;
  }

  public void setLastRefreshedDate(String lastRefreshedDate) {
    this.lastRefreshedDate = lastRefreshedDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCollectionFormHistoryResponse getCollectionFormHistoryResponse = (GetCollectionFormHistoryResponse) o;
    return Objects.equals(this.collectionFormsHistoryRecordList, getCollectionFormHistoryResponse.collectionFormsHistoryRecordList) &&
        Objects.equals(this.lastRefreshedDate, getCollectionFormHistoryResponse.lastRefreshedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collectionFormsHistoryRecordList, lastRefreshedDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCollectionFormHistoryResponse {\n");
    
    sb.append("    collectionFormsHistoryRecordList: ").append(toIndentedString(collectionFormsHistoryRecordList)).append("\n");
    sb.append("    lastRefreshedDate: ").append(toIndentedString(lastRefreshedDate)).append("\n");
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
