/*
 * Selling Partner API for Orders
 * The Selling Partner API for Orders helps you programmatically retrieve order information. These APIs let you develop fast, flexible, custom applications in areas like order synchronization, order research, and demand-based decision support tools. The Orders API supports orders that are two years old or less. Orders more than two years old will not show in the API response.  _Note:_ The Orders API supports orders from 2016 and after for the JP, AU, and SG marketplaces.
 *
 * OpenAPI spec version: v0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.orders;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Tax information about the marketplace.
 */
@ApiModel(description = "Tax information about the marketplace.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-30T16:09:47.159+08:00")
public class MarketplaceTaxInfo {

    @SerializedName("TaxClassifications")
    private List<TaxClassification> taxClassifications = null;

    public MarketplaceTaxInfo taxClassifications(List<TaxClassification> taxClassifications) {
        this.taxClassifications = taxClassifications;
        return this;
    }

    public MarketplaceTaxInfo addTaxClassificationsItem(TaxClassification taxClassificationsItem) {
        if (this.taxClassifications == null) {
            this.taxClassifications = new ArrayList<TaxClassification>();
        }
        this.taxClassifications.add(taxClassificationsItem);
        return this;
    }

    /**
     * A list of tax classifications that apply to the order.
     *
     * @return taxClassifications
     **/
    @ApiModelProperty(value = "A list of tax classifications that apply to the order.")
    public List<TaxClassification> getTaxClassifications() {
        return taxClassifications;
    }

    public void setTaxClassifications(List<TaxClassification> taxClassifications) {
        this.taxClassifications = taxClassifications;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MarketplaceTaxInfo marketplaceTaxInfo = (MarketplaceTaxInfo) o;
        return Objects.equals(this.taxClassifications, marketplaceTaxInfo.taxClassifications);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taxClassifications);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MarketplaceTaxInfo {\n");

        sb.append("    taxClassifications: ").append(toIndentedString(taxClassifications)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

