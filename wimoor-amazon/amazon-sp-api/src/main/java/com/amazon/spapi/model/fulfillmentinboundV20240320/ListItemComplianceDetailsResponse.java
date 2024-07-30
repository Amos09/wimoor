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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The &#x60;listItemComplianceDetails&#x60; response.
 */
@ApiModel(description = "The `listItemComplianceDetails` response.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-06-18T14:09:15.791+08:00")
public class ListItemComplianceDetailsResponse {
  @SerializedName("complianceDetails")
  private List<ComplianceDetail> complianceDetails = null;

  public ListItemComplianceDetailsResponse complianceDetails(List<ComplianceDetail> complianceDetails) {
    this.complianceDetails = complianceDetails;
    return this;
  }

  public ListItemComplianceDetailsResponse addComplianceDetailsItem(ComplianceDetail complianceDetailsItem) {
    if (this.complianceDetails == null) {
      this.complianceDetails = new ArrayList<ComplianceDetail>();
    }
    this.complianceDetails.add(complianceDetailsItem);
    return this;
  }

   /**
   * List of compliance details.
   * @return complianceDetails
  **/
  @ApiModelProperty(value = "List of compliance details.")
  public List<ComplianceDetail> getComplianceDetails() {
    return complianceDetails;
  }

  public void setComplianceDetails(List<ComplianceDetail> complianceDetails) {
    this.complianceDetails = complianceDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListItemComplianceDetailsResponse listItemComplianceDetailsResponse = (ListItemComplianceDetailsResponse) o;
    return Objects.equals(this.complianceDetails, listItemComplianceDetailsResponse.complianceDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(complianceDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListItemComplianceDetailsResponse {\n");
    
    sb.append("    complianceDetails: ").append(toIndentedString(complianceDetails)).append("\n");
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

