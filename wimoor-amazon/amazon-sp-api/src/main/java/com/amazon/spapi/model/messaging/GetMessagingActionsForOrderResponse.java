/*
 * Selling Partner API for Messaging
 * With the Messaging API you can build applications that send messages to buyers. You can get a list of message types that are available for an order that you specify, then call an operation that sends a message to the buyer for that order. The Messaging API returns responses that are formed according to the <a href=https://tools.ietf.org/html/draft-kelly-json-hal-08>JSON Hypertext Application Language</a> (HAL) standard.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.messaging;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.amazon.spapi.model.ErrorList;
import com.amazon.spapi.model.messaging.GetMessagingActionsForOrderResponseEmbedded;
import com.amazon.spapi.model.messaging.GetMessagingActionsForOrderResponseLinks;
import java.io.IOException;

/**
 * The response schema for the getMessagingActionsForOrder operation.
 */
@ApiModel(description = "The response schema for the getMessagingActionsForOrder operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-30T16:09:44.640+08:00")
public class GetMessagingActionsForOrderResponse {
  @SerializedName("_links")
  private GetMessagingActionsForOrderResponseLinks links = null;

  @SerializedName("_embedded")
  private GetMessagingActionsForOrderResponseEmbedded embedded = null;

  @SerializedName("errors")
  private ErrorList errors = null;

  public GetMessagingActionsForOrderResponse links(GetMessagingActionsForOrderResponseLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public GetMessagingActionsForOrderResponseLinks getLinks() {
    return links;
  }

  public void setLinks(GetMessagingActionsForOrderResponseLinks links) {
    this.links = links;
  }

  public GetMessagingActionsForOrderResponse embedded(GetMessagingActionsForOrderResponseEmbedded embedded) {
    this.embedded = embedded;
    return this;
  }

   /**
   * Get embedded
   * @return embedded
  **/
  @ApiModelProperty(value = "")
  public GetMessagingActionsForOrderResponseEmbedded getEmbedded() {
    return embedded;
  }

  public void setEmbedded(GetMessagingActionsForOrderResponseEmbedded embedded) {
    this.embedded = embedded;
  }

  public GetMessagingActionsForOrderResponse errors(ErrorList errors) {
    this.errors = errors;
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @ApiModelProperty(value = "")
  public ErrorList getErrors() {
    return errors;
  }

  public void setErrors(ErrorList errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMessagingActionsForOrderResponse getMessagingActionsForOrderResponse = (GetMessagingActionsForOrderResponse) o;
    return Objects.equals(this.links, getMessagingActionsForOrderResponse.links) &&
        Objects.equals(this.embedded, getMessagingActionsForOrderResponse.embedded) &&
        Objects.equals(this.errors, getMessagingActionsForOrderResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, embedded, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMessagingActionsForOrderResponse {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    embedded: ").append(toIndentedString(embedded)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

