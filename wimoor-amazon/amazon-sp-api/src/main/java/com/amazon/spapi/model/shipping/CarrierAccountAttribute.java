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
import java.io.IOException;

/**
 * Attribute Properties required by carrier
 */
@ApiModel(description = "Attribute Properties required by carrier")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-30T16:10:03.349+08:00")
public class CarrierAccountAttribute {
  @SerializedName("attributeName")
  private String attributeName = null;

  @SerializedName("propertyGroup")
  private String propertyGroup = null;

  @SerializedName("value")
  private String value = null;

  public CarrierAccountAttribute attributeName(String attributeName) {
    this.attributeName = attributeName;
    return this;
  }

   /**
   * Attribute Name .
   * @return attributeName
  **/
  @ApiModelProperty(value = "Attribute Name .")
  public String getAttributeName() {
    return attributeName;
  }

  public void setAttributeName(String attributeName) {
    this.attributeName = attributeName;
  }

  public CarrierAccountAttribute propertyGroup(String propertyGroup) {
    this.propertyGroup = propertyGroup;
    return this;
  }

   /**
   * Property Group.
   * @return propertyGroup
  **/
  @ApiModelProperty(value = "Property Group.")
  public String getPropertyGroup() {
    return propertyGroup;
  }

  public void setPropertyGroup(String propertyGroup) {
    this.propertyGroup = propertyGroup;
  }

  public CarrierAccountAttribute value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Value .
   * @return value
  **/
  @ApiModelProperty(value = "Value .")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CarrierAccountAttribute carrierAccountAttribute = (CarrierAccountAttribute) o;
    return Objects.equals(this.attributeName, carrierAccountAttribute.attributeName) &&
        Objects.equals(this.propertyGroup, carrierAccountAttribute.propertyGroup) &&
        Objects.equals(this.value, carrierAccountAttribute.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeName, propertyGroup, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarrierAccountAttribute {\n");
    
    sb.append("    attributeName: ").append(toIndentedString(attributeName)).append("\n");
    sb.append("    propertyGroup: ").append(toIndentedString(propertyGroup)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
