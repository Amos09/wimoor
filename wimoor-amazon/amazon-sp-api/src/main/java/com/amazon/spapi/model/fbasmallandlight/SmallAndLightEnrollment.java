/*
 * Selling Partner API for FBA Small And Light
 * The Selling Partner API for FBA Small and Light lets you help sellers manage their listings in the Small and Light program. The program reduces the cost of fulfilling orders for small and lightweight FBA inventory. You can enroll or remove items from the program and check item eligibility and enrollment status. You can also preview the estimated program fees charged to a seller for items sold while enrolled in the program.
 *
 * OpenAPI spec version: v1
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.fbasmallandlight;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * The Small and Light enrollment status of the item indicated by the specified seller SKU.
 */
@ApiModel(description = "The Small and Light enrollment status of the item indicated by the specified seller SKU.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-30T16:09:31.421+08:00")
public class SmallAndLightEnrollment {

    @SerializedName("marketplaceId")
    private String marketplaceId = null;

    @SerializedName("sellerSKU")
    private String sellerSKU = null;

    @SerializedName("status")
    private SmallAndLightEnrollmentStatus status = null;

    public SmallAndLightEnrollment marketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
        return this;
    }

    /**
     * Get marketplaceId
     *
     * @return marketplaceId
     **/
    @ApiModelProperty(required = true, value = "")
    public String getMarketplaceId() {
        return marketplaceId;
    }

    public void setMarketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
    }

    public SmallAndLightEnrollment sellerSKU(String sellerSKU) {
        this.sellerSKU = sellerSKU;
        return this;
    }

    /**
     * Get sellerSKU
     *
     * @return sellerSKU
     **/
    @ApiModelProperty(required = true, value = "")
    public String getSellerSKU() {
        return sellerSKU;
    }

    public void setSellerSKU(String sellerSKU) {
        this.sellerSKU = sellerSKU;
    }

    public SmallAndLightEnrollment status(SmallAndLightEnrollmentStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     **/
    @ApiModelProperty(required = true, value = "")
    public SmallAndLightEnrollmentStatus getStatus() {
        return status;
    }

    public void setStatus(SmallAndLightEnrollmentStatus status) {
        this.status = status;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SmallAndLightEnrollment smallAndLightEnrollment = (SmallAndLightEnrollment) o;
        return Objects.equals(this.marketplaceId, smallAndLightEnrollment.marketplaceId) &&
                Objects.equals(this.sellerSKU, smallAndLightEnrollment.sellerSKU) &&
                Objects.equals(this.status, smallAndLightEnrollment.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marketplaceId, sellerSKU, status);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmallAndLightEnrollment {\n");

        sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
        sb.append("    sellerSKU: ").append(toIndentedString(sellerSKU)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

