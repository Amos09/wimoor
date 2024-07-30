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
 * The enforcement action taken by Amazon that affect the publishing or status of a listing
 */
@ApiModel(description = "The enforcement action taken by Amazon that affect the publishing or status of a listing")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-30T16:09:40.926+08:00")
public class IssueEnforcementAction {
  @SerializedName("action")
  private String action = null;

  public IssueEnforcementAction action(String action) {
    this.action = action;
    return this;
  }

   /**
   * The enforcement action name.   Possible values:   * &#x60;LISTING_SUPPRESSED&#x60; - This enforcement takes down the current listing item&#39;s buyability.   * &#x60;ATTRIBUTE_SUPPRESSED&#x60; - An attribute&#39;s value on the listing item is invalid, which causes it to be rejected by Amazon.   * &#x60;CATALOG_ITEM_REMOVED&#x60; - This catalog item is inactive on Amazon, and all offers against it in the applicable marketplace are non-buyable.   * &#x60;SEARCH_SUPPRESSED&#x60; - This value indicates that the catalog item is hidden from search results.
   * @return action
  **/
  @ApiModelProperty(example = "LISTING_SUPPRESSED", required = true, value = "The enforcement action name.   Possible values:   * `LISTING_SUPPRESSED` - This enforcement takes down the current listing item's buyability.   * `ATTRIBUTE_SUPPRESSED` - An attribute's value on the listing item is invalid, which causes it to be rejected by Amazon.   * `CATALOG_ITEM_REMOVED` - This catalog item is inactive on Amazon, and all offers against it in the applicable marketplace are non-buyable.   * `SEARCH_SUPPRESSED` - This value indicates that the catalog item is hidden from search results.")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueEnforcementAction issueEnforcementAction = (IssueEnforcementAction) o;
    return Objects.equals(this.action, issueEnforcementAction.action);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueEnforcementAction {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
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

