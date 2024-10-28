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
 * Shipment source channel related information.
 */
@ApiModel(description = "Shipment source channel related information.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-30T16:10:03.349+08:00")
public class ChannelDetails {

    @SerializedName("channelType")
    private ChannelType channelType = null;

    @SerializedName("amazonOrderDetails")
    private AmazonOrderDetails amazonOrderDetails = null;

    @SerializedName("amazonShipmentDetails")
    private AmazonShipmentDetails amazonShipmentDetails = null;

    public ChannelDetails channelType(ChannelType channelType) {
        this.channelType = channelType;
        return this;
    }

    /**
     * Get channelType
     *
     * @return channelType
     **/
    @ApiModelProperty(required = true, value = "")
    public ChannelType getChannelType() {
        return channelType;
    }

    public void setChannelType(ChannelType channelType) {
        this.channelType = channelType;
    }

    public ChannelDetails amazonOrderDetails(AmazonOrderDetails amazonOrderDetails) {
        this.amazonOrderDetails = amazonOrderDetails;
        return this;
    }

    /**
     * Get amazonOrderDetails
     *
     * @return amazonOrderDetails
     **/
    @ApiModelProperty(value = "")
    public AmazonOrderDetails getAmazonOrderDetails() {
        return amazonOrderDetails;
    }

    public void setAmazonOrderDetails(AmazonOrderDetails amazonOrderDetails) {
        this.amazonOrderDetails = amazonOrderDetails;
    }

    public ChannelDetails amazonShipmentDetails(AmazonShipmentDetails amazonShipmentDetails) {
        this.amazonShipmentDetails = amazonShipmentDetails;
        return this;
    }

    /**
     * Get amazonShipmentDetails
     *
     * @return amazonShipmentDetails
     **/
    @ApiModelProperty(value = "")
    public AmazonShipmentDetails getAmazonShipmentDetails() {
        return amazonShipmentDetails;
    }

    public void setAmazonShipmentDetails(AmazonShipmentDetails amazonShipmentDetails) {
        this.amazonShipmentDetails = amazonShipmentDetails;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChannelDetails channelDetails = (ChannelDetails) o;
        return Objects.equals(this.channelType, channelDetails.channelType) &&
                Objects.equals(this.amazonOrderDetails, channelDetails.amazonOrderDetails) &&
                Objects.equals(this.amazonShipmentDetails, channelDetails.amazonShipmentDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(channelType, amazonOrderDetails, amazonShipmentDetails);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChannelDetails {\n");

        sb.append("    channelType: ").append(toIndentedString(channelType)).append("\n");
        sb.append("    amazonOrderDetails: ").append(toIndentedString(amazonOrderDetails)).append("\n");
        sb.append("    amazonShipmentDetails: ").append(toIndentedString(amazonShipmentDetails)).append("\n");
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

