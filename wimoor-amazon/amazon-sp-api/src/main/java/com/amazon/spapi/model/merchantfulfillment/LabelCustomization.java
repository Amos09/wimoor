/*
 * Selling Partner API for Merchant Fulfillment
 * The Selling Partner API for Merchant Fulfillment helps you build applications that let sellers purchase shipping for non-Prime and Prime orders using Amazon’s Buy Shipping Services.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.merchantfulfillment;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Custom text for shipping labels.
 */
@ApiModel(description = "Custom text for shipping labels.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-30T16:09:43.032+08:00")
public class LabelCustomization {
  @SerializedName("CustomTextForLabel")
  private String customTextForLabel = null;

  @SerializedName("StandardIdForLabel")
  private StandardIdForLabel standardIdForLabel = null;

  public LabelCustomization customTextForLabel(String customTextForLabel) {
    this.customTextForLabel = customTextForLabel;
    return this;
  }

   /**
   * Get customTextForLabel
   * @return customTextForLabel
  **/
  @ApiModelProperty(value = "")
  public String getCustomTextForLabel() {
    return customTextForLabel;
  }

  public void setCustomTextForLabel(String customTextForLabel) {
    this.customTextForLabel = customTextForLabel;
  }

  public LabelCustomization standardIdForLabel(StandardIdForLabel standardIdForLabel) {
    this.standardIdForLabel = standardIdForLabel;
    return this;
  }

   /**
   * Get standardIdForLabel
   * @return standardIdForLabel
  **/
  @ApiModelProperty(value = "")
  public StandardIdForLabel getStandardIdForLabel() {
    return standardIdForLabel;
  }

  public void setStandardIdForLabel(StandardIdForLabel standardIdForLabel) {
    this.standardIdForLabel = standardIdForLabel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LabelCustomization labelCustomization = (LabelCustomization) o;
    return Objects.equals(this.customTextForLabel, labelCustomization.customTextForLabel) &&
        Objects.equals(this.standardIdForLabel, labelCustomization.standardIdForLabel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customTextForLabel, standardIdForLabel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LabelCustomization {\n");
    
    sb.append("    customTextForLabel: ").append(toIndentedString(customTextForLabel)).append("\n");
    sb.append("    standardIdForLabel: ").append(toIndentedString(standardIdForLabel)).append("\n");
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

