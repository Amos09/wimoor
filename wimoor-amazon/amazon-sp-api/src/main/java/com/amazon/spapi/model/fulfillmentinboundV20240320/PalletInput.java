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


package com.amazon.spapi.model.fulfillmentinboundV20240320;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Contains input information about a pallet to be used in the inbound plan.
 */
@ApiModel(description = "Contains input information about a pallet to be used in the inbound plan.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-06-18T14:09:15.791+08:00")
public class PalletInput {
  @SerializedName("dimensions")
  private Dimensions dimensions = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("stackability")
  private Stackability stackability = null;

  @SerializedName("weight")
  private Weight weight = null;

  public PalletInput dimensions(Dimensions dimensions) {
    this.dimensions = dimensions;
    return this;
  }

   /**
   * Get dimensions
   * @return dimensions
  **/
  @ApiModelProperty(value = "")
  public Dimensions getDimensions() {
    return dimensions;
  }

  public void setDimensions(Dimensions dimensions) {
    this.dimensions = dimensions;
  }

  public PalletInput quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * The number of containers where all other properties like weight or dimensions are identical.
   * minimum: 1
   * maximum: 10000
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "The number of containers where all other properties like weight or dimensions are identical.")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public PalletInput stackability(Stackability stackability) {
    this.stackability = stackability;
    return this;
  }

   /**
   * Get stackability
   * @return stackability
  **/
  @ApiModelProperty(value = "")
  public Stackability getStackability() {
    return stackability;
  }

  public void setStackability(Stackability stackability) {
    this.stackability = stackability;
  }

  public PalletInput weight(Weight weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/
  @ApiModelProperty(value = "")
  public Weight getWeight() {
    return weight;
  }

  public void setWeight(Weight weight) {
    this.weight = weight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PalletInput palletInput = (PalletInput) o;
    return Objects.equals(this.dimensions, palletInput.dimensions) &&
        Objects.equals(this.quantity, palletInput.quantity) &&
        Objects.equals(this.stackability, palletInput.stackability) &&
        Objects.equals(this.weight, palletInput.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dimensions, quantity, stackability, weight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PalletInput {\n");
    
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    stackability: ").append(toIndentedString(stackability)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

