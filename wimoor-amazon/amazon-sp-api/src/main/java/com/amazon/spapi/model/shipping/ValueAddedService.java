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
import com.amazon.spapi.model.shipping.Currency;
import java.io.IOException;

/**
 * A value-added service available for purchase with a shipment service offering.
 */
@ApiModel(description = "A value-added service available for purchase with a shipment service offering.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-30T16:10:03.349+08:00")
public class ValueAddedService {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("cost")
  private Currency cost = null;

  public ValueAddedService id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The identifier for the value-added service.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The identifier for the value-added service.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ValueAddedService name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the value-added service.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the value-added service.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ValueAddedService cost(Currency cost) {
    this.cost = cost;
    return this;
  }

   /**
   * The cost of the value-added service.
   * @return cost
  **/
  @ApiModelProperty(required = true, value = "The cost of the value-added service.")
  public Currency getCost() {
    return cost;
  }

  public void setCost(Currency cost) {
    this.cost = cost;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValueAddedService valueAddedService = (ValueAddedService) o;
    return Objects.equals(this.id, valueAddedService.id) &&
        Objects.equals(this.name, valueAddedService.name) &&
        Objects.equals(this.cost, valueAddedService.cost);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, cost);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValueAddedService {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
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

