/*
 * Selling Partner API for Pricing
 * The Selling Partner API for Pricing helps you programmatically retrieve product pricing and offer information for Amazon Marketplace products.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.productpricing;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Competitive pricing information for the item.
 */
@ApiModel(description = "Competitive pricing information for the item.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-30T16:09:49.847+08:00")
public class CompetitivePricingType {
  @SerializedName("CompetitivePrices")
  private CompetitivePriceList competitivePrices = null;

  @SerializedName("NumberOfOfferListings")
  private NumberOfOfferListingsList numberOfOfferListings = null;

  @SerializedName("TradeInValue")
  private MoneyType tradeInValue = null;

  public CompetitivePricingType competitivePrices(CompetitivePriceList competitivePrices) {
    this.competitivePrices = competitivePrices;
    return this;
  }

   /**
   * Get competitivePrices
   * @return competitivePrices
  **/
  @ApiModelProperty(required = true, value = "")
  public CompetitivePriceList getCompetitivePrices() {
    return competitivePrices;
  }

  public void setCompetitivePrices(CompetitivePriceList competitivePrices) {
    this.competitivePrices = competitivePrices;
  }

  public CompetitivePricingType numberOfOfferListings(NumberOfOfferListingsList numberOfOfferListings) {
    this.numberOfOfferListings = numberOfOfferListings;
    return this;
  }

   /**
   * Get numberOfOfferListings
   * @return numberOfOfferListings
  **/
  @ApiModelProperty(required = true, value = "")
  public NumberOfOfferListingsList getNumberOfOfferListings() {
    return numberOfOfferListings;
  }

  public void setNumberOfOfferListings(NumberOfOfferListingsList numberOfOfferListings) {
    this.numberOfOfferListings = numberOfOfferListings;
  }

  public CompetitivePricingType tradeInValue(MoneyType tradeInValue) {
    this.tradeInValue = tradeInValue;
    return this;
  }

   /**
   * The trade-in value of the item in the trade-in program.
   * @return tradeInValue
  **/
  @ApiModelProperty(value = "The trade-in value of the item in the trade-in program.")
  public MoneyType getTradeInValue() {
    return tradeInValue;
  }

  public void setTradeInValue(MoneyType tradeInValue) {
    this.tradeInValue = tradeInValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompetitivePricingType competitivePricingType = (CompetitivePricingType) o;
    return Objects.equals(this.competitivePrices, competitivePricingType.competitivePrices) &&
        Objects.equals(this.numberOfOfferListings, competitivePricingType.numberOfOfferListings) &&
        Objects.equals(this.tradeInValue, competitivePricingType.tradeInValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(competitivePrices, numberOfOfferListings, tradeInValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompetitivePricingType {\n");
    
    sb.append("    competitivePrices: ").append(toIndentedString(competitivePrices)).append("\n");
    sb.append("    numberOfOfferListings: ").append(toIndentedString(numberOfOfferListings)).append("\n");
    sb.append("    tradeInValue: ").append(toIndentedString(tradeInValue)).append("\n");
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

