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
 * Whether to include a packing slip.
 */
@ApiModel(description = "Whether to include a packing slip.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-30T16:09:43.032+08:00")
public class LabelFormatOptionRequest {
  @SerializedName("IncludePackingSlipWithLabel")
  private Boolean includePackingSlipWithLabel = null;

  public LabelFormatOptionRequest includePackingSlipWithLabel(Boolean includePackingSlipWithLabel) {
    this.includePackingSlipWithLabel = includePackingSlipWithLabel;
    return this;
  }

   /**
   * When true, include a packing slip with the label.
   * @return includePackingSlipWithLabel
  **/
  @ApiModelProperty(value = "When true, include a packing slip with the label.")
  public Boolean isIncludePackingSlipWithLabel() {
    return includePackingSlipWithLabel;
  }

  public void setIncludePackingSlipWithLabel(Boolean includePackingSlipWithLabel) {
    this.includePackingSlipWithLabel = includePackingSlipWithLabel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LabelFormatOptionRequest labelFormatOptionRequest = (LabelFormatOptionRequest) o;
    return Objects.equals(this.includePackingSlipWithLabel, labelFormatOptionRequest.includePackingSlipWithLabel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includePackingSlipWithLabel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LabelFormatOptionRequest {\n");
    
    sb.append("    includePackingSlipWithLabel: ").append(toIndentedString(includePackingSlipWithLabel)).append("\n");
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

