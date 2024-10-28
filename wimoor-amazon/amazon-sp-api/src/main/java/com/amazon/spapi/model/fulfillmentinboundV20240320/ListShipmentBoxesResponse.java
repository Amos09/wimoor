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


package com.amazon.spapi.model.fulfillmentinboundV20240320;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The &#x60;listShipmentBoxes&#x60; response.
 */
@ApiModel(description = "The `listShipmentBoxes` response.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-06-18T14:09:15.791+08:00")
public class ListShipmentBoxesResponse {

    @SerializedName("boxes")
    private List<Box> boxes = new ArrayList<Box>();

    @SerializedName("pagination")
    private Pagination pagination = null;

    public ListShipmentBoxesResponse boxes(List<Box> boxes) {
        this.boxes = boxes;
        return this;
    }

    public ListShipmentBoxesResponse addBoxesItem(Box boxesItem) {
        this.boxes.add(boxesItem);
        return this;
    }

    /**
     * A list of boxes in a shipment.
     *
     * @return boxes
     **/
    @ApiModelProperty(required = true, value = "A list of boxes in a shipment.")
    public List<Box> getBoxes() {
        return boxes;
    }

    public void setBoxes(List<Box> boxes) {
        this.boxes = boxes;
    }

    public ListShipmentBoxesResponse pagination(Pagination pagination) {
        this.pagination = pagination;
        return this;
    }

    /**
     * Get pagination
     *
     * @return pagination
     **/
    @ApiModelProperty(value = "")
    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListShipmentBoxesResponse listShipmentBoxesResponse = (ListShipmentBoxesResponse) o;
        return Objects.equals(this.boxes, listShipmentBoxesResponse.boxes) &&
                Objects.equals(this.pagination, listShipmentBoxesResponse.pagination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(boxes, pagination);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListShipmentBoxesResponse {\n");

        sb.append("    boxes: ").append(toIndentedString(boxes)).append("\n");
        sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
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

