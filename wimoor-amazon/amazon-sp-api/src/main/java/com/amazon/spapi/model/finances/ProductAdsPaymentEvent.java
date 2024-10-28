/*
 * Selling Partner API for Finances
 * The Selling Partner API for Finances helps you obtain financial information relevant to a seller's business. You can obtain financial events for a given order, financial event group, or date range without having to wait until a statement period closes. You can also obtain financial event groups for a given date range.
 *
 * OpenAPI spec version: v0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.finances;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * A Sponsored Products payment event.
 */
@ApiModel(description = "A Sponsored Products payment event.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-30T16:09:34.728+08:00")
public class ProductAdsPaymentEvent {

    @SerializedName("postedDate")
    private String postedDate = null;

    @SerializedName("transactionType")
    private String transactionType = null;

    @SerializedName("invoiceId")
    private String invoiceId = null;

    @SerializedName("baseValue")
    private Currency baseValue = null;

    @SerializedName("taxValue")
    private Currency taxValue = null;

    @SerializedName("transactionValue")
    private Currency transactionValue = null;

    public ProductAdsPaymentEvent postedDate(String postedDate) {
        this.postedDate = postedDate;
        return this;
    }

    /**
     * The date and time when the financial event was posted.
     *
     * @return postedDate
     **/
    @ApiModelProperty(value = "The date and time when the financial event was posted.")
    public String getPostedDate() {
        return postedDate;
    }

    public void setPostedDate(String postedDate) {
        this.postedDate = postedDate;
    }

    public ProductAdsPaymentEvent transactionType(String transactionType) {
        this.transactionType = transactionType;
        return this;
    }

    /**
     * Indicates if the transaction is for a charge or a refund.  Possible values:  * charge - Charge  * refund -
     * Refund
     *
     * @return transactionType
     **/
    @ApiModelProperty(value = "Indicates if the transaction is for a charge or a refund.  Possible values:  * charge - Charge  * refund - Refund")
    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public ProductAdsPaymentEvent invoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
        return this;
    }

    /**
     * Identifier for the invoice that the transaction appears in.
     *
     * @return invoiceId
     **/
    @ApiModelProperty(value = "Identifier for the invoice that the transaction appears in.")
    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public ProductAdsPaymentEvent baseValue(Currency baseValue) {
        this.baseValue = baseValue;
        return this;
    }

    /**
     * Base amount of the transaction, before tax.
     *
     * @return baseValue
     **/
    @ApiModelProperty(value = "Base amount of the transaction, before tax.")
    public Currency getBaseValue() {
        return baseValue;
    }

    public void setBaseValue(Currency baseValue) {
        this.baseValue = baseValue;
    }

    public ProductAdsPaymentEvent taxValue(Currency taxValue) {
        this.taxValue = taxValue;
        return this;
    }

    /**
     * Tax amount of the transaction.
     *
     * @return taxValue
     **/
    @ApiModelProperty(value = "Tax amount of the transaction.")
    public Currency getTaxValue() {
        return taxValue;
    }

    public void setTaxValue(Currency taxValue) {
        this.taxValue = taxValue;
    }

    public ProductAdsPaymentEvent transactionValue(Currency transactionValue) {
        this.transactionValue = transactionValue;
        return this;
    }

    /**
     * The total amount of the transaction. Equal to baseValue + taxValue.
     *
     * @return transactionValue
     **/
    @ApiModelProperty(value = "The total amount of the transaction. Equal to baseValue + taxValue.")
    public Currency getTransactionValue() {
        return transactionValue;
    }

    public void setTransactionValue(Currency transactionValue) {
        this.transactionValue = transactionValue;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProductAdsPaymentEvent productAdsPaymentEvent = (ProductAdsPaymentEvent) o;
        return Objects.equals(this.postedDate, productAdsPaymentEvent.postedDate) &&
                Objects.equals(this.transactionType, productAdsPaymentEvent.transactionType) &&
                Objects.equals(this.invoiceId, productAdsPaymentEvent.invoiceId) &&
                Objects.equals(this.baseValue, productAdsPaymentEvent.baseValue) &&
                Objects.equals(this.taxValue, productAdsPaymentEvent.taxValue) &&
                Objects.equals(this.transactionValue, productAdsPaymentEvent.transactionValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postedDate, transactionType, invoiceId, baseValue, taxValue, transactionValue);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductAdsPaymentEvent {\n");

        sb.append("    postedDate: ").append(toIndentedString(postedDate)).append("\n");
        sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
        sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
        sb.append("    baseValue: ").append(toIndentedString(baseValue)).append("\n");
        sb.append("    taxValue: ").append(toIndentedString(taxValue)).append("\n");
        sb.append("    transactionValue: ").append(toIndentedString(transactionValue)).append("\n");
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

