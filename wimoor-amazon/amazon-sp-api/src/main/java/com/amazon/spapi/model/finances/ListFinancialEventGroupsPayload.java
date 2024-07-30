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
import com.amazon.spapi.model.finances.FinancialEventGroupList;
import java.io.IOException;

/**
 * The payload for the listFinancialEventGroups operation.
 */
@ApiModel(description = "The payload for the listFinancialEventGroups operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-30T16:09:34.728+08:00")
public class ListFinancialEventGroupsPayload {
  @SerializedName("NextToken")
  private String nextToken = null;

  @SerializedName("FinancialEventGroupList")
  private FinancialEventGroupList financialEventGroupList = null;

  public ListFinancialEventGroupsPayload nextToken(String nextToken) {
    this.nextToken = nextToken;
    return this;
  }

   /**
   * When present and not empty, pass this string token in the next request to return the next response page.
   * @return nextToken
  **/
  @ApiModelProperty(value = "When present and not empty, pass this string token in the next request to return the next response page.")
  public String getNextToken() {
    return nextToken;
  }

  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }

  public ListFinancialEventGroupsPayload financialEventGroupList(FinancialEventGroupList financialEventGroupList) {
    this.financialEventGroupList = financialEventGroupList;
    return this;
  }

   /**
   * Get financialEventGroupList
   * @return financialEventGroupList
  **/
  @ApiModelProperty(value = "")
  public FinancialEventGroupList getFinancialEventGroupList() {
    return financialEventGroupList;
  }

  public void setFinancialEventGroupList(FinancialEventGroupList financialEventGroupList) {
    this.financialEventGroupList = financialEventGroupList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListFinancialEventGroupsPayload listFinancialEventGroupsPayload = (ListFinancialEventGroupsPayload) o;
    return Objects.equals(this.nextToken, listFinancialEventGroupsPayload.nextToken) &&
        Objects.equals(this.financialEventGroupList, listFinancialEventGroupsPayload.financialEventGroupList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextToken, financialEventGroupList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListFinancialEventGroupsPayload {\n");
    
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
    sb.append("    financialEventGroupList: ").append(toIndentedString(financialEventGroupList)).append("\n");
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

