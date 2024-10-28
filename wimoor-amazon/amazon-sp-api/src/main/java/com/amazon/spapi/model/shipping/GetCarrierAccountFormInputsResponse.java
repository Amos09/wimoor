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
 * The Response  for the GetCarrierAccountFormInputsResponse operation.
 */
@ApiModel(description = "The Response  for the GetCarrierAccountFormInputsResponse operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-30T16:10:03.349+08:00")
public class GetCarrierAccountFormInputsResponse {

    @SerializedName("linkableCarriersList")
    private LinkableCarriersList linkableCarriersList = null;

    public GetCarrierAccountFormInputsResponse linkableCarriersList(LinkableCarriersList linkableCarriersList) {
        this.linkableCarriersList = linkableCarriersList;
        return this;
    }

    /**
     * Get linkableCarriersList
     *
     * @return linkableCarriersList
     **/
    @ApiModelProperty(value = "")
    public LinkableCarriersList getLinkableCarriersList() {
        return linkableCarriersList;
    }

    public void setLinkableCarriersList(LinkableCarriersList linkableCarriersList) {
        this.linkableCarriersList = linkableCarriersList;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetCarrierAccountFormInputsResponse getCarrierAccountFormInputsResponse = (GetCarrierAccountFormInputsResponse) o;
        return Objects.equals(this.linkableCarriersList, getCarrierAccountFormInputsResponse.linkableCarriersList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(linkableCarriersList);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetCarrierAccountFormInputsResponse {\n");

        sb.append("    linkableCarriersList: ").append(toIndentedString(linkableCarriersList)).append("\n");
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

