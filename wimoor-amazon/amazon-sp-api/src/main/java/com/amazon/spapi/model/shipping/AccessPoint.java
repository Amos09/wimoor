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
import com.amazon.spapi.model.shipping.AccessPointType;
import com.amazon.spapi.model.shipping.AccessibilityAttributes;
import com.amazon.spapi.model.shipping.Address;
import com.amazon.spapi.model.shipping.DayOfWeekTimeMap;
import com.amazon.spapi.model.shipping.ExceptionOperatingHours;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Access point details
 */
@ApiModel(description = "Access point details")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-30T16:10:03.349+08:00")
public class AccessPoint {
  @SerializedName("accessPointId")
  private String accessPointId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("timezone")
  private String timezone = null;

  @SerializedName("type")
  private AccessPointType type = null;

  @SerializedName("accessibilityAttributes")
  private AccessibilityAttributes accessibilityAttributes = null;

  @SerializedName("address")
  private Address address = null;

  @SerializedName("exceptionOperatingHours")
  private List<ExceptionOperatingHours> exceptionOperatingHours = null;

  /**
   * Gets or Sets assistanceType
   */
  @JsonAdapter(AssistanceTypeEnum.Adapter.class)
  public enum AssistanceTypeEnum {
    STAFF_ASSISTED("STAFF_ASSISTED"),
    
    SELF_ASSISTED("SELF_ASSISTED");

    private String value;

    AssistanceTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AssistanceTypeEnum fromValue(String text) {
      for (AssistanceTypeEnum b : AssistanceTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AssistanceTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AssistanceTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AssistanceTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AssistanceTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("assistanceType")
  private AssistanceTypeEnum assistanceType = null;

  @SerializedName("score")
  private String score = null;

  @SerializedName("standardOperatingHours")
  private DayOfWeekTimeMap standardOperatingHours = null;

  public AccessPoint accessPointId(String accessPointId) {
    this.accessPointId = accessPointId;
    return this;
  }

   /**
   * Get accessPointId
   * @return accessPointId
  **/
  @ApiModelProperty(value = "")
  public String getAccessPointId() {
    return accessPointId;
  }

  public void setAccessPointId(String accessPointId) {
    this.accessPointId = accessPointId;
  }

  public AccessPoint name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of entity (store/hub etc) where this access point is located
   * @return name
  **/
  @ApiModelProperty(value = "Name of entity (store/hub etc) where this access point is located")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AccessPoint timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Timezone of access point
   * @return timezone
  **/
  @ApiModelProperty(value = "Timezone of access point")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public AccessPoint type(AccessPointType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public AccessPointType getType() {
    return type;
  }

  public void setType(AccessPointType type) {
    this.type = type;
  }

  public AccessPoint accessibilityAttributes(AccessibilityAttributes accessibilityAttributes) {
    this.accessibilityAttributes = accessibilityAttributes;
    return this;
  }

   /**
   * Get accessibilityAttributes
   * @return accessibilityAttributes
  **/
  @ApiModelProperty(value = "")
  public AccessibilityAttributes getAccessibilityAttributes() {
    return accessibilityAttributes;
  }

  public void setAccessibilityAttributes(AccessibilityAttributes accessibilityAttributes) {
    this.accessibilityAttributes = accessibilityAttributes;
  }

  public AccessPoint address(Address address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public AccessPoint exceptionOperatingHours(List<ExceptionOperatingHours> exceptionOperatingHours) {
    this.exceptionOperatingHours = exceptionOperatingHours;
    return this;
  }

  public AccessPoint addExceptionOperatingHoursItem(ExceptionOperatingHours exceptionOperatingHoursItem) {
    if (this.exceptionOperatingHours == null) {
      this.exceptionOperatingHours = new ArrayList<ExceptionOperatingHours>();
    }
    this.exceptionOperatingHours.add(exceptionOperatingHoursItem);
    return this;
  }

   /**
   * Get exceptionOperatingHours
   * @return exceptionOperatingHours
  **/
  @ApiModelProperty(value = "")
  public List<ExceptionOperatingHours> getExceptionOperatingHours() {
    return exceptionOperatingHours;
  }

  public void setExceptionOperatingHours(List<ExceptionOperatingHours> exceptionOperatingHours) {
    this.exceptionOperatingHours = exceptionOperatingHours;
  }

  public AccessPoint assistanceType(AssistanceTypeEnum assistanceType) {
    this.assistanceType = assistanceType;
    return this;
  }

   /**
   * Get assistanceType
   * @return assistanceType
  **/
  @ApiModelProperty(value = "")
  public AssistanceTypeEnum getAssistanceType() {
    return assistanceType;
  }

  public void setAssistanceType(AssistanceTypeEnum assistanceType) {
    this.assistanceType = assistanceType;
  }

  public AccessPoint score(String score) {
    this.score = score;
    return this;
  }

   /**
   * The score of access point, based on proximity to postal code and sorting preference. This can be used to sort access point results on shipper&#39;s end.
   * @return score
  **/
  @ApiModelProperty(value = "The score of access point, based on proximity to postal code and sorting preference. This can be used to sort access point results on shipper's end.")
  public String getScore() {
    return score;
  }

  public void setScore(String score) {
    this.score = score;
  }

  public AccessPoint standardOperatingHours(DayOfWeekTimeMap standardOperatingHours) {
    this.standardOperatingHours = standardOperatingHours;
    return this;
  }

   /**
   * Get standardOperatingHours
   * @return standardOperatingHours
  **/
  @ApiModelProperty(value = "")
  public DayOfWeekTimeMap getStandardOperatingHours() {
    return standardOperatingHours;
  }

  public void setStandardOperatingHours(DayOfWeekTimeMap standardOperatingHours) {
    this.standardOperatingHours = standardOperatingHours;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessPoint accessPoint = (AccessPoint) o;
    return Objects.equals(this.accessPointId, accessPoint.accessPointId) &&
        Objects.equals(this.name, accessPoint.name) &&
        Objects.equals(this.timezone, accessPoint.timezone) &&
        Objects.equals(this.type, accessPoint.type) &&
        Objects.equals(this.accessibilityAttributes, accessPoint.accessibilityAttributes) &&
        Objects.equals(this.address, accessPoint.address) &&
        Objects.equals(this.exceptionOperatingHours, accessPoint.exceptionOperatingHours) &&
        Objects.equals(this.assistanceType, accessPoint.assistanceType) &&
        Objects.equals(this.score, accessPoint.score) &&
        Objects.equals(this.standardOperatingHours, accessPoint.standardOperatingHours);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessPointId, name, timezone, type, accessibilityAttributes, address, exceptionOperatingHours, assistanceType, score, standardOperatingHours);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessPoint {\n");
    
    sb.append("    accessPointId: ").append(toIndentedString(accessPointId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    accessibilityAttributes: ").append(toIndentedString(accessibilityAttributes)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    exceptionOperatingHours: ").append(toIndentedString(exceptionOperatingHours)).append("\n");
    sb.append("    assistanceType: ").append(toIndentedString(assistanceType)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    standardOperatingHours: ").append(toIndentedString(standardOperatingHours)).append("\n");
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

