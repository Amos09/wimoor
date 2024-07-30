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
import com.amazon.spapi.model.shipping.ServiceIds;
import java.io.IOException;

/**
 * Service Selection Criteria.
 */
@ApiModel(description = "Service Selection Criteria.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-30T16:10:03.349+08:00")
public class ServiceSelection {
  @SerializedName("serviceId")
  private ServiceIds serviceId = null;

  public ServiceSelection serviceId(ServiceIds serviceId) {
    this.serviceId = serviceId;
    return this;
  }

   /**
   * Get serviceId
   * @return serviceId
  **/
  @ApiModelProperty(required = true, value = "")
  public ServiceIds getServiceId() {
    return serviceId;
  }

  public void setServiceId(ServiceIds serviceId) {
    this.serviceId = serviceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceSelection serviceSelection = (ServiceSelection) o;
    return Objects.equals(this.serviceId, serviceSelection.serviceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceSelection {\n");
    
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
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

