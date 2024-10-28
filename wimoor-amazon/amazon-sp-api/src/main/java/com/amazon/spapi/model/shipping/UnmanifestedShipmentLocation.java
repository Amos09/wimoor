/*
 * Amazon Shipping API
 * The Amazon Shipping API is designed to support outbound shipping use cases both for orders originating on Amazon-owned marketplaces as well as external channels/marketplaces. With these APIs, you can request shipping rates, create shipments, cancel shipments, and track shipments.
 *
 * OpenAPI spec version: v2
 * Contact: swa-api-core@amazon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.shipping;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * UnmanifestedShipmentLocation info
 */
@ApiModel(description = "UnmanifestedShipmentLocation info ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-30T16:10:03.349+08:00")
public class UnmanifestedShipmentLocation {

    @SerializedName("address")
    private Address address = null;

    @SerializedName("lastManifestDate")
    private String lastManifestDate = null;

    public UnmanifestedShipmentLocation address(Address address) {
        this.address = address;
        return this;
    }

    /**
     * Get address
     *
     * @return address
     **/
    @ApiModelProperty(value = "")
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public UnmanifestedShipmentLocation lastManifestDate(String lastManifestDate) {
        this.lastManifestDate = lastManifestDate;
        return this;
    }

    /**
     * Its Last Manifest Date.
     *
     * @return lastManifestDate
     **/
    @ApiModelProperty(value = "Its Last Manifest Date.")
    public String getLastManifestDate() {
        return lastManifestDate;
    }

    public void setLastManifestDate(String lastManifestDate) {
        this.lastManifestDate = lastManifestDate;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UnmanifestedShipmentLocation unmanifestedShipmentLocation = (UnmanifestedShipmentLocation) o;
        return Objects.equals(this.address, unmanifestedShipmentLocation.address) &&
                Objects.equals(this.lastManifestDate, unmanifestedShipmentLocation.lastManifestDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, lastManifestDate);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnmanifestedShipmentLocation {\n");

        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    lastManifestDate: ").append(toIndentedString(lastManifestDate)).append("\n");
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

