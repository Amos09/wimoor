/*
 * Selling Partner API for Sales
 * The Selling Partner API for Sales provides APIs related to sales performance.
 *
 * OpenAPI spec version: v1
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.sales;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * The currency type and the amount.
 */
@ApiModel(description = "The currency type and the amount.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-30T15:15:42.325+08:00")
public class Money {

    @SerializedName("currencyCode")
    private String currencyCode = null;

    @SerializedName("amount")
    private String amount = null;

    public Money currencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    /**
     * Three-digit currency code. In ISO 4217 format.
     *
     * @return currencyCode
     **/
    @ApiModelProperty(required = true, value = "Three-digit currency code. In ISO 4217 format.")
    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Money amount(String amount) {
        this.amount = amount;
        return this;
    }

    /**
     * The currency amount.
     *
     * @return amount
     **/
    @ApiModelProperty(required = true, value = "The currency amount.")
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Money money = (Money) o;
        return Objects.equals(this.currencyCode, money.currencyCode) &&
                Objects.equals(this.amount, money.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currencyCode, amount);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Money {\n");

        sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

