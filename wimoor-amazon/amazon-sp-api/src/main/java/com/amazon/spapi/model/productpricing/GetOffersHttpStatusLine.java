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

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * The HTTP status line associated with the response.  For more information, consult [RFC
 * 2616](https://www.w3.org/Protocols/rfc2616/rfc2616-sec6.html).
 */
@ApiModel(description = "The HTTP status line associated with the response.  For more information, consult [RFC 2616](https://www.w3.org/Protocols/rfc2616/rfc2616-sec6.html).")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-30T16:09:49.847+08:00")
public class GetOffersHttpStatusLine {

    @SerializedName("statusCode")
    private Integer statusCode = null;

    @SerializedName("reasonPhrase")
    private String reasonPhrase = null;

    public GetOffersHttpStatusLine statusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * The HTTP response Status Code. minimum: 100 maximum: 599
     *
     * @return statusCode
     **/
    @ApiModelProperty(value = "The HTTP response Status Code.")
    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public GetOffersHttpStatusLine reasonPhrase(String reasonPhrase) {
        this.reasonPhrase = reasonPhrase;
        return this;
    }

    /**
     * The HTTP response Reason-Phase.
     *
     * @return reasonPhrase
     **/
    @ApiModelProperty(value = "The HTTP response Reason-Phase.")
    public String getReasonPhrase() {
        return reasonPhrase;
    }

    public void setReasonPhrase(String reasonPhrase) {
        this.reasonPhrase = reasonPhrase;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetOffersHttpStatusLine getOffersHttpStatusLine = (GetOffersHttpStatusLine) o;
        return Objects.equals(this.statusCode, getOffersHttpStatusLine.statusCode) &&
                Objects.equals(this.reasonPhrase, getOffersHttpStatusLine.reasonPhrase);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statusCode, reasonPhrase);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetOffersHttpStatusLine {\n");

        sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
        sb.append("    reasonPhrase: ").append(toIndentedString(reasonPhrase)).append("\n");
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

