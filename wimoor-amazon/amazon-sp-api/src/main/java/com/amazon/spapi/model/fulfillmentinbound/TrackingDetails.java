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
import java.util.Objects;

/**
 * Tracking information for Less-Than-Truckload (LTL) and Small Parcel Delivery (SPD) shipments.
 */
@ApiModel(description = "Tracking information for Less-Than-Truckload (LTL) and Small Parcel Delivery (SPD) shipments.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-04-03T09:34:42.612+08:00")
public class TrackingDetails {

    @SerializedName("ltlTrackingDetail")
    private LtlTrackingDetail ltlTrackingDetail = null;

    @SerializedName("spdTrackingDetail")
    private SpdTrackingDetail spdTrackingDetail = null;

    public TrackingDetails ltlTrackingDetail(LtlTrackingDetail ltlTrackingDetail) {
        this.ltlTrackingDetail = ltlTrackingDetail;
        return this;
    }

    /**
     * Get ltlTrackingDetail
     *
     * @return ltlTrackingDetail
     **/
    @ApiModelProperty(value = "")
    public LtlTrackingDetail getLtlTrackingDetail() {
        return ltlTrackingDetail;
    }

    public void setLtlTrackingDetail(LtlTrackingDetail ltlTrackingDetail) {
        this.ltlTrackingDetail = ltlTrackingDetail;
    }

    public TrackingDetails spdTrackingDetail(SpdTrackingDetail spdTrackingDetail) {
        this.spdTrackingDetail = spdTrackingDetail;
        return this;
    }

    /**
     * Get spdTrackingDetail
     *
     * @return spdTrackingDetail
     **/
    @ApiModelProperty(value = "")
    public SpdTrackingDetail getSpdTrackingDetail() {
        return spdTrackingDetail;
    }

    public void setSpdTrackingDetail(SpdTrackingDetail spdTrackingDetail) {
        this.spdTrackingDetail = spdTrackingDetail;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TrackingDetails trackingDetails = (TrackingDetails) o;
        return Objects.equals(this.ltlTrackingDetail, trackingDetails.ltlTrackingDetail) &&
                Objects.equals(this.spdTrackingDetail, trackingDetails.spdTrackingDetail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ltlTrackingDetail, spdTrackingDetail);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TrackingDetails {\n");

        sb.append("    ltlTrackingDetail: ").append(toIndentedString(ltlTrackingDetail)).append("\n");
        sb.append("    spdTrackingDetail: ").append(toIndentedString(spdTrackingDetail)).append("\n");
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

