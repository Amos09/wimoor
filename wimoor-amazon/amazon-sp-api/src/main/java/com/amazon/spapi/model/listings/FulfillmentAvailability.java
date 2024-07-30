/*
 * Selling Partner API for Listings Items
 * The Selling Partner API for Listings Items (Listings Items API) provides programmatic access to selling partner listings on Amazon. Use this API in collaboration with the Selling Partner API for Product Type Definitions, which you use to retrieve the information about Amazon product types needed to use the Listings Items API.  For more information, see the [Listings Items API Use Case Guide](https://developer-docs.amazon.com/sp-api/docs/listings-items-api-v2021-08-01-use-case-guide).
 *
 * OpenAPI spec version: 2021-08-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.listings;

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
 * The fulfillment availability details for the listings item.
 */
@ApiModel(description = "The fulfillment availability details for the listings item.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-30T16:09:40.926+08:00")
public class FulfillmentAvailability {
  @SerializedName("fulfillmentChannelCode")
  private String fulfillmentChannelCode = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  public FulfillmentAvailability fulfillmentChannelCode(String fulfillmentChannelCode) {
    this.fulfillmentChannelCode = fulfillmentChannelCode;
    return this;
  }

   /**
   * The code of the fulfillment network that will be used.
   * @return fulfillmentChannelCode
  **/
  @ApiModelProperty(required = true, value = "The code of the fulfillment network that will be used.")
  public String getFulfillmentChannelCode() {
    return fulfillmentChannelCode;
  }

  public void setFulfillmentChannelCode(String fulfillmentChannelCode) {
    this.fulfillmentChannelCode = fulfillmentChannelCode;
  }

  public FulfillmentAvailability quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * The quantity of the item you are making available for sale.
   * minimum: 0
   * @return quantity
  **/
  @ApiModelProperty(value = "The quantity of the item you are making available for sale.")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FulfillmentAvailability fulfillmentAvailability = (FulfillmentAvailability) o;
    return Objects.equals(this.fulfillmentChannelCode, fulfillmentAvailability.fulfillmentChannelCode) &&
        Objects.equals(this.quantity, fulfillmentAvailability.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fulfillmentChannelCode, quantity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FulfillmentAvailability {\n");
    
    sb.append("    fulfillmentChannelCode: ").append(toIndentedString(fulfillmentChannelCode)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

