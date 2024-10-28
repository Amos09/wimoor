/*
 * Selling Partner APIs for Fulfillment Outbound
 * The Selling Partner API for Fulfillment Outbound lets you create applications that help a seller fulfill Multi-Channel Fulfillment orders using their inventory in Amazon's fulfillment network. You can get information on both potential and existing fulfillment orders.
 *
 * OpenAPI spec version: 2020-07-01
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.fulfillmentoutbound;

import com.amazon.spapi.model.ErrorList;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * The response schema for the createFulfillmentOrder operation.
 */
@ApiModel(description = "The response schema for the createFulfillmentOrder operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-30T16:09:38.272+08:00")
public class CreateFulfillmentOrderResponse {

    @SerializedName("errors")
    private ErrorList errors = null;

    public CreateFulfillmentOrderResponse errors(ErrorList errors) {
        this.errors = errors;
        return this;
    }

    /**
     * One or more unexpected errors occurred during the createFulfillmentOrder operation.
     *
     * @return errors
     **/
    @ApiModelProperty(value = "One or more unexpected errors occurred during the createFulfillmentOrder operation.")
    public ErrorList getErrors() {
        return errors;
    }

    public void setErrors(ErrorList errors) {
        this.errors = errors;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateFulfillmentOrderResponse createFulfillmentOrderResponse = (CreateFulfillmentOrderResponse) o;
        return Objects.equals(this.errors, createFulfillmentOrderResponse.errors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errors);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateFulfillmentOrderResponse {\n");

        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

