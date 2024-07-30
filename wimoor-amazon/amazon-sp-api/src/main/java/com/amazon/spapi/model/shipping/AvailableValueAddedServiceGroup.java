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
import com.amazon.spapi.model.shipping.ValueAddedService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The value-added services available for purchase with a shipping service offering.
 */
@ApiModel(description = "The value-added services available for purchase with a shipping service offering.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-30T16:10:03.349+08:00")
public class AvailableValueAddedServiceGroup {
  @SerializedName("groupId")
  private String groupId = null;

  @SerializedName("groupDescription")
  private String groupDescription = null;

  @SerializedName("isRequired")
  private Boolean isRequired = null;

  @SerializedName("valueAddedServices")
  private List<ValueAddedService> valueAddedServices = null;

  public AvailableValueAddedServiceGroup groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * The type of the value-added service group.
   * @return groupId
  **/
  @ApiModelProperty(required = true, value = "The type of the value-added service group.")
  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public AvailableValueAddedServiceGroup groupDescription(String groupDescription) {
    this.groupDescription = groupDescription;
    return this;
  }

   /**
   * The name of the value-added service group.
   * @return groupDescription
  **/
  @ApiModelProperty(required = true, value = "The name of the value-added service group.")
  public String getGroupDescription() {
    return groupDescription;
  }

  public void setGroupDescription(String groupDescription) {
    this.groupDescription = groupDescription;
  }

  public AvailableValueAddedServiceGroup isRequired(Boolean isRequired) {
    this.isRequired = isRequired;
    return this;
  }

   /**
   * When true, one or more of the value-added services listed must be specified.
   * @return isRequired
  **/
  @ApiModelProperty(required = true, value = "When true, one or more of the value-added services listed must be specified.")
  public Boolean isIsRequired() {
    return isRequired;
  }

  public void setIsRequired(Boolean isRequired) {
    this.isRequired = isRequired;
  }

  public AvailableValueAddedServiceGroup valueAddedServices(List<ValueAddedService> valueAddedServices) {
    this.valueAddedServices = valueAddedServices;
    return this;
  }

  public AvailableValueAddedServiceGroup addValueAddedServicesItem(ValueAddedService valueAddedServicesItem) {
    if (this.valueAddedServices == null) {
      this.valueAddedServices = new ArrayList<ValueAddedService>();
    }
    this.valueAddedServices.add(valueAddedServicesItem);
    return this;
  }

   /**
   * A list of optional value-added services available for purchase with a shipping service offering.
   * @return valueAddedServices
  **/
  @ApiModelProperty(value = "A list of optional value-added services available for purchase with a shipping service offering.")
  public List<ValueAddedService> getValueAddedServices() {
    return valueAddedServices;
  }

  public void setValueAddedServices(List<ValueAddedService> valueAddedServices) {
    this.valueAddedServices = valueAddedServices;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailableValueAddedServiceGroup availableValueAddedServiceGroup = (AvailableValueAddedServiceGroup) o;
    return Objects.equals(this.groupId, availableValueAddedServiceGroup.groupId) &&
        Objects.equals(this.groupDescription, availableValueAddedServiceGroup.groupDescription) &&
        Objects.equals(this.isRequired, availableValueAddedServiceGroup.isRequired) &&
        Objects.equals(this.valueAddedServices, availableValueAddedServiceGroup.valueAddedServices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, groupDescription, isRequired, valueAddedServices);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableValueAddedServiceGroup {\n");
    
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    groupDescription: ").append(toIndentedString(groupDescription)).append("\n");
    sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
    sb.append("    valueAddedServices: ").append(toIndentedString(valueAddedServices)).append("\n");
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

