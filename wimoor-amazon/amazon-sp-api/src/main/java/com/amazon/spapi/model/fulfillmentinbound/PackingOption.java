/*
 * The Selling Partner API for FBA inbound operations.
 * The Selling Partner API for Fulfillment By Amazon (FBA) Inbound. The FBA Inbound API enables building inbound workflows to create, manage, and send shipments into Amazon's fulfillment network. The API has interoperability with the Send-to-Amazon user interface.
 *
 * OpenAPI spec version: 2024-03-20
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.amazon.spapi.model.fulfillmentinbound;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.threeten.bp.OffsetDateTime;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A packing option contains a set of pack groups plus additional information about the packing option, such as any discounts or fees if it&#39;s selected.
 */
@ApiModel(description = "A packing option contains a set of pack groups plus additional information about the packing option, such as any discounts or fees if it's selected.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-04-03T09:34:42.612+08:00")
public class PackingOption {
  @SerializedName("discounts")
  private List<Incentive> discounts = new ArrayList<Incentive>();

  @SerializedName("expiration")
  private OffsetDateTime expiration = null;

  @SerializedName("fees")
  private List<Incentive> fees = new ArrayList<Incentive>();

  @SerializedName("inboundPlanId")
  private String inboundPlanId = null;

  @SerializedName("packingGroups")
  private List<String> packingGroups = new ArrayList<String>();

  @SerializedName("packingOptionId")
  private String packingOptionId = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("supportedShippingConfigurations")
  private List<ShippingConfiguration> supportedShippingConfigurations = new ArrayList<ShippingConfiguration>();

  public PackingOption discounts(List<Incentive> discounts) {
    this.discounts = discounts;
    return this;
  }

  public PackingOption addDiscountsItem(Incentive discountsItem) {
    this.discounts.add(discountsItem);
    return this;
  }

   /**
   * Discount for the offered option.
   * @return discounts
  **/
  @ApiModelProperty(required = true, value = "Discount for the offered option.")
  public List<Incentive> getDiscounts() {
    return discounts;
  }

  public void setDiscounts(List<Incentive> discounts) {
    this.discounts = discounts;
  }

  public PackingOption expiration(OffsetDateTime expiration) {
    this.expiration = expiration;
    return this;
  }

   /**
   * The timestamp at which this packing option becomes no longer valid. This is in ISO 8601 datetime format with pattern &#x60;yyyy-MM-ddTHH:mm:ss.sssZ&#x60;.
   * @return expiration
  **/
  @ApiModelProperty(value = "The timestamp at which this packing option becomes no longer valid. This is in ISO 8601 datetime format with pattern `yyyy-MM-ddTHH:mm:ss.sssZ`.")
  public OffsetDateTime getExpiration() {
    return expiration;
  }

  public void setExpiration(OffsetDateTime expiration) {
    this.expiration = expiration;
  }

  public PackingOption fees(List<Incentive> fees) {
    this.fees = fees;
    return this;
  }

  public PackingOption addFeesItem(Incentive feesItem) {
    this.fees.add(feesItem);
    return this;
  }

   /**
   * Fee for the offered option.
   * @return fees
  **/
  @ApiModelProperty(required = true, value = "Fee for the offered option.")
  public List<Incentive> getFees() {
    return fees;
  }

  public void setFees(List<Incentive> fees) {
    this.fees = fees;
  }

  public PackingOption inboundPlanId(String inboundPlanId) {
    this.inboundPlanId = inboundPlanId;
    return this;
  }

   /**
   * Identifier to an inbound plan.
   * @return inboundPlanId
  **/
  @ApiModelProperty(required = true, value = "Identifier to an inbound plan.")
  public String getInboundPlanId() {
    return inboundPlanId;
  }

  public void setInboundPlanId(String inboundPlanId) {
    this.inboundPlanId = inboundPlanId;
  }

  public PackingOption packingGroups(List<String> packingGroups) {
    this.packingGroups = packingGroups;
    return this;
  }

  public PackingOption addPackingGroupsItem(String packingGroupsItem) {
    this.packingGroups.add(packingGroupsItem);
    return this;
  }

   /**
   * Packing group IDs.
   * @return packingGroups
  **/
  @ApiModelProperty(required = true, value = "Packing group IDs.")
  public List<String> getPackingGroups() {
    return packingGroups;
  }

  public void setPackingGroups(List<String> packingGroups) {
    this.packingGroups = packingGroups;
  }

  public PackingOption packingOptionId(String packingOptionId) {
    this.packingOptionId = packingOptionId;
    return this;
  }

   /**
   * Identifier to a packing option.
   * @return packingOptionId
  **/
  @ApiModelProperty(required = true, value = "Identifier to a packing option.")
  public String getPackingOptionId() {
    return packingOptionId;
  }

  public void setPackingOptionId(String packingOptionId) {
    this.packingOptionId = packingOptionId;
  }

  public PackingOption status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the packing option. Can be &#x60;OFFERED&#x60;, &#x60;ACCEPTED&#x60;, or &#x60;EXPIRED&#x60;.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "The status of the packing option. Can be `OFFERED`, `ACCEPTED`, or `EXPIRED`.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public PackingOption supportedShippingConfigurations(List<ShippingConfiguration> supportedShippingConfigurations) {
    this.supportedShippingConfigurations = supportedShippingConfigurations;
    return this;
  }

  public PackingOption addSupportedShippingConfigurationsItem(ShippingConfiguration supportedShippingConfigurationsItem) {
    this.supportedShippingConfigurations.add(supportedShippingConfigurationsItem);
    return this;
  }

   /**
   * List of supported shipping modes.
   * @return supportedShippingConfigurations
  **/
  @ApiModelProperty(required = true, value = "List of supported shipping modes.")
  public List<ShippingConfiguration> getSupportedShippingConfigurations() {
    return supportedShippingConfigurations;
  }

  public void setSupportedShippingConfigurations(List<ShippingConfiguration> supportedShippingConfigurations) {
    this.supportedShippingConfigurations = supportedShippingConfigurations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PackingOption packingOption = (PackingOption) o;
    return Objects.equals(this.discounts, packingOption.discounts) &&
        Objects.equals(this.expiration, packingOption.expiration) &&
        Objects.equals(this.fees, packingOption.fees) &&
        Objects.equals(this.inboundPlanId, packingOption.inboundPlanId) &&
        Objects.equals(this.packingGroups, packingOption.packingGroups) &&
        Objects.equals(this.packingOptionId, packingOption.packingOptionId) &&
        Objects.equals(this.status, packingOption.status) &&
        Objects.equals(this.supportedShippingConfigurations, packingOption.supportedShippingConfigurations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discounts, expiration, fees, inboundPlanId, packingGroups, packingOptionId, status, supportedShippingConfigurations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PackingOption {\n");
    
    sb.append("    discounts: ").append(toIndentedString(discounts)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    fees: ").append(toIndentedString(fees)).append("\n");
    sb.append("    inboundPlanId: ").append(toIndentedString(inboundPlanId)).append("\n");
    sb.append("    packingGroups: ").append(toIndentedString(packingGroups)).append("\n");
    sb.append("    packingOptionId: ").append(toIndentedString(packingOptionId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    supportedShippingConfigurations: ").append(toIndentedString(supportedShippingConfigurations)).append("\n");
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

