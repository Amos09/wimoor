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
import java.io.IOException;

/**
 * Period which taxwithholding on seller&#39;s account is calculated.
 */
@ApiModel(description = "Period which taxwithholding on seller's account is calculated.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-30T16:09:34.728+08:00")
public class TaxWithholdingPeriod {
  @SerializedName("StartDate")
  private String startDate = null;

  @SerializedName("EndDate")
  private String endDate = null;

  public TaxWithholdingPeriod startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Start of the time range.
   * @return startDate
  **/
  @ApiModelProperty(value = "Start of the time range.")
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public TaxWithholdingPeriod endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * End of the time range.
   * @return endDate
  **/
  @ApiModelProperty(value = "End of the time range.")
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxWithholdingPeriod taxWithholdingPeriod = (TaxWithholdingPeriod) o;
    return Objects.equals(this.startDate, taxWithholdingPeriod.startDate) &&
        Objects.equals(this.endDate, taxWithholdingPeriod.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxWithholdingPeriod {\n");
    
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

