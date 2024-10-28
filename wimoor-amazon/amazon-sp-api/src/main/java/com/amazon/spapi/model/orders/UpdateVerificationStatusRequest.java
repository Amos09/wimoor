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
import java.util.Objects;

/**
 * The request body for the updateVerificationStatus operation.
 */
@ApiModel(description = "The request body for the updateVerificationStatus operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-30T16:09:47.159+08:00")
public class UpdateVerificationStatusRequest {

    @SerializedName("regulatedOrderVerificationStatus")
    private UpdateVerificationStatusRequestBody regulatedOrderVerificationStatus = null;

    public UpdateVerificationStatusRequest regulatedOrderVerificationStatus(
            UpdateVerificationStatusRequestBody regulatedOrderVerificationStatus) {
        this.regulatedOrderVerificationStatus = regulatedOrderVerificationStatus;
        return this;
    }

    /**
     * The updated values of the VerificationStatus field.
     *
     * @return regulatedOrderVerificationStatus
     **/
    @ApiModelProperty(required = true, value = "The updated values of the VerificationStatus field.")
    public UpdateVerificationStatusRequestBody getRegulatedOrderVerificationStatus() {
        return regulatedOrderVerificationStatus;
    }

    public void setRegulatedOrderVerificationStatus(
            UpdateVerificationStatusRequestBody regulatedOrderVerificationStatus) {
        this.regulatedOrderVerificationStatus = regulatedOrderVerificationStatus;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateVerificationStatusRequest updateVerificationStatusRequest = (UpdateVerificationStatusRequest) o;
        return Objects.equals(this.regulatedOrderVerificationStatus,
                updateVerificationStatusRequest.regulatedOrderVerificationStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regulatedOrderVerificationStatus);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateVerificationStatusRequest {\n");

        sb.append("    regulatedOrderVerificationStatus: ").append(toIndentedString(regulatedOrderVerificationStatus))
                .append("\n");
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

