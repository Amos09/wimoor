/*
 * Selling Partner API for A+ Content Management
 * With the A+ Content API, you can build applications that help selling partners add rich marketing content to their Amazon product detail pages. A+ content helps selling partners share their brand and product story, which helps buyers make informed purchasing decisions. Selling partners assemble content by choosing from content modules and adding images and text.
 *
 * OpenAPI spec version: 2020-11-01
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.apluscontent;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * Plain positional text, used in collections of brief labels and descriptors.
 */
@ApiModel(description = "Plain positional text, used in collections of brief labels and descriptors.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-30T16:09:20.221+08:00")
public class PlainTextItem {

    @SerializedName("position")
    private Integer position = null;

    @SerializedName("value")
    private String value = null;

    public PlainTextItem position(Integer position) {
        this.position = position;
        return this;
    }

    /**
     * The rank or index of this text item within the collection. Different items cannot occupy the same position within
     * a single collection. minimum: 1 maximum: 100
     *
     * @return position
     **/
    @ApiModelProperty(required = true, value = "The rank or index of this text item within the collection. Different items cannot occupy the same position within a single collection.")
    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public PlainTextItem value(String value) {
        this.value = value;
        return this;
    }

    /**
     * The actual plain text.
     *
     * @return value
     **/
    @ApiModelProperty(required = true, value = "The actual plain text.")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PlainTextItem plainTextItem = (PlainTextItem) o;
        return Objects.equals(this.position, plainTextItem.position) &&
                Objects.equals(this.value, plainTextItem.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, value);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PlainTextItem {\n");

        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

