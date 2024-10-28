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


package com.amazon.spapi.model.fulfillmentinbound;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Contains input information to update Small Parcel Delivery (SPD) tracking information.
 */
@ApiModel(description = "Contains input information to update Small Parcel Delivery (SPD) tracking information.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-04-03T09:34:42.612+08:00")
public class SpdTrackingDetailInput {

    @SerializedName("spdTrackingItems")
    private List<SpdTrackingItemInput> spdTrackingItems = new ArrayList<SpdTrackingItemInput>();

    public SpdTrackingDetailInput spdTrackingItems(List<SpdTrackingItemInput> spdTrackingItems) {
        this.spdTrackingItems = spdTrackingItems;
        return this;
    }

    public SpdTrackingDetailInput addSpdTrackingItemsItem(SpdTrackingItemInput spdTrackingItemsItem) {
        this.spdTrackingItems.add(spdTrackingItemsItem);
        return this;
    }

    /**
     * List of Small Parcel Delivery (SPD) tracking items input.
     *
     * @return spdTrackingItems
     **/
    @ApiModelProperty(required = true, value = "List of Small Parcel Delivery (SPD) tracking items input.")
    public List<SpdTrackingItemInput> getSpdTrackingItems() {
        return spdTrackingItems;
    }

    public void setSpdTrackingItems(List<SpdTrackingItemInput> spdTrackingItems) {
        this.spdTrackingItems = spdTrackingItems;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SpdTrackingDetailInput spdTrackingDetailInput = (SpdTrackingDetailInput) o;
        return Objects.equals(this.spdTrackingItems, spdTrackingDetailInput.spdTrackingItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(spdTrackingItems);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SpdTrackingDetailInput {\n");

        sb.append("    spdTrackingItems: ").append(toIndentedString(spdTrackingItems)).append("\n");
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

