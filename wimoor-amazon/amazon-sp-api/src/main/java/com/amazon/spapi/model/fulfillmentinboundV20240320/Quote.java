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

import org.threeten.bp.OffsetDateTime;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The estimated shipping cost associated with the transportation option.
 */
@ApiModel(description = "The estimated shipping cost associated with the transportation option.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-06-18T14:09:15.791+08:00")
public class Quote {
  @SerializedName("cost")
  private Currency cost = null;

  @SerializedName("expiration")
  private OffsetDateTime expiration = null;

  @SerializedName("voidableUntil")
  private OffsetDateTime voidableUntil = null;

  public Quote cost(Currency cost) {
    this.cost = cost;
    return this;
  }

   /**
   * Get cost
   * @return cost
  **/
  @ApiModelProperty(required = true, value = "")
  public Currency getCost() {
    return cost;
  }

  public void setCost(Currency cost) {
    this.cost = cost;
  }

  public Quote expiration(OffsetDateTime expiration) {
    this.expiration = expiration;
    return this;
  }

   /**
   * The timestamp at which this transportation option quote becomes no longer valid. This is based in ISO 8601 datetime with pattern &#x60;yyyy-MM-ddTHH:mm:ss.sssZ&#x60;.
   * @return expiration
  **/
  @ApiModelProperty(value = "The timestamp at which this transportation option quote becomes no longer valid. This is based in ISO 8601 datetime with pattern `yyyy-MM-ddTHH:mm:ss.sssZ`.")
  public OffsetDateTime getExpiration() {
    return expiration;
  }

  public void setExpiration(OffsetDateTime expiration) {
    this.expiration = expiration;
  }

  public Quote voidableUntil(OffsetDateTime voidableUntil) {
    this.voidableUntil = voidableUntil;
    return this;
  }

   /**
   * Voidable until timestamp.
   * @return voidableUntil
  **/
  @ApiModelProperty(value = "Voidable until timestamp.")
  public OffsetDateTime getVoidableUntil() {
    return voidableUntil;
  }

  public void setVoidableUntil(OffsetDateTime voidableUntil) {
    this.voidableUntil = voidableUntil;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Quote quote = (Quote) o;
    return Objects.equals(this.cost, quote.cost) &&
        Objects.equals(this.expiration, quote.expiration) &&
        Objects.equals(this.voidableUntil, quote.voidableUntil);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cost, expiration, voidableUntil);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Quote {\n");
    
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    voidableUntil: ").append(toIndentedString(voidableUntil)).append("\n");
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
