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
import com.amazon.spapi.model.shipping.DateRange;
import com.amazon.spapi.model.shipping.OperatingHours;
import java.io.IOException;

/**
 * Defines exceptions to standard operating hours for certain date ranges.
 */
@ApiModel(description = "Defines exceptions to standard operating hours for certain date ranges.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-30T16:10:03.349+08:00")
public class ExceptionOperatingHours {
  @SerializedName("dateRange")
  private DateRange dateRange = null;

  @SerializedName("operatingHours")
  private OperatingHours operatingHours = null;

  public ExceptionOperatingHours dateRange(DateRange dateRange) {
    this.dateRange = dateRange;
    return this;
  }

   /**
   * Get dateRange
   * @return dateRange
  **/
  @ApiModelProperty(value = "")
  public DateRange getDateRange() {
    return dateRange;
  }

  public void setDateRange(DateRange dateRange) {
    this.dateRange = dateRange;
  }

  public ExceptionOperatingHours operatingHours(OperatingHours operatingHours) {
    this.operatingHours = operatingHours;
    return this;
  }

   /**
   * Get operatingHours
   * @return operatingHours
  **/
  @ApiModelProperty(value = "")
  public OperatingHours getOperatingHours() {
    return operatingHours;
  }

  public void setOperatingHours(OperatingHours operatingHours) {
    this.operatingHours = operatingHours;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExceptionOperatingHours exceptionOperatingHours = (ExceptionOperatingHours) o;
    return Objects.equals(this.dateRange, exceptionOperatingHours.dateRange) &&
        Objects.equals(this.operatingHours, exceptionOperatingHours.operatingHours);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateRange, operatingHours);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExceptionOperatingHours {\n");
    
    sb.append("    dateRange: ").append(toIndentedString(dateRange)).append("\n");
    sb.append("    operatingHours: ").append(toIndentedString(operatingHours)).append("\n");
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
