/*
 * Selling Partner API for Messaging
 * With the Messaging API you can build applications that send messages to buyers. You can get a list of message types that are available for an order that you specify, then call an operation that sends a message to the buyer for that order. The Messaging API returns responses that are formed according to the <a href=https://tools.ietf.org/html/draft-kelly-json-hal-08>JSON Hypertext Application Language</a> (HAL) standard.
 *
 * OpenAPI spec version: v1
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.messaging;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * GetMessagingActionResponseEmbedded
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-30T16:09:44.640+08:00")
public class GetMessagingActionResponseEmbedded {

    @SerializedName("schema")
    private GetSchemaResponse schema = null;

    public GetMessagingActionResponseEmbedded schema(GetSchemaResponse schema) {
        this.schema = schema;
        return this;
    }

    /**
     * Get schema
     *
     * @return schema
     **/
    @ApiModelProperty(value = "")
    public GetSchemaResponse getSchema() {
        return schema;
    }

    public void setSchema(GetSchemaResponse schema) {
        this.schema = schema;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetMessagingActionResponseEmbedded getMessagingActionResponseEmbedded = (GetMessagingActionResponseEmbedded) o;
        return Objects.equals(this.schema, getMessagingActionResponseEmbedded.schema);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schema);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetMessagingActionResponseEmbedded {\n");

        sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
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

