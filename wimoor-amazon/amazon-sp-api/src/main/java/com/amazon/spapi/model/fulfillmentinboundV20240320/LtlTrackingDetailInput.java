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
 * Contains input information to update Less-Than-Truckload (LTL) tracking information.
 */
@ApiModel(description = "Contains input information to update Less-Than-Truckload (LTL) tracking information.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-06-18T14:09:15.791+08:00")
public class LtlTrackingDetailInput {

    @SerializedName("billOfLadingNumber")
    private String billOfLadingNumber = null;

    @SerializedName("freightBillNumber")
    private List<String> freightBillNumber = new ArrayList<String>();

    public LtlTrackingDetailInput billOfLadingNumber(String billOfLadingNumber) {
        this.billOfLadingNumber = billOfLadingNumber;
        return this;
    }

    /**
     * The number of the carrier shipment acknowledgement document.
     *
     * @return billOfLadingNumber
     **/
    @ApiModelProperty(value = "The number of the carrier shipment acknowledgement document.")
    public String getBillOfLadingNumber() {
        return billOfLadingNumber;
    }

    public void setBillOfLadingNumber(String billOfLadingNumber) {
        this.billOfLadingNumber = billOfLadingNumber;
    }

    public LtlTrackingDetailInput freightBillNumber(List<String> freightBillNumber) {
        this.freightBillNumber = freightBillNumber;
        return this;
    }

    public LtlTrackingDetailInput addFreightBillNumberItem(String freightBillNumberItem) {
        this.freightBillNumber.add(freightBillNumberItem);
        return this;
    }

    /**
     * Number associated with the freight bill.
     *
     * @return freightBillNumber
     **/
    @ApiModelProperty(required = true, value = "Number associated with the freight bill.")
    public List<String> getFreightBillNumber() {
        return freightBillNumber;
    }

    public void setFreightBillNumber(List<String> freightBillNumber) {
        this.freightBillNumber = freightBillNumber;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LtlTrackingDetailInput ltlTrackingDetailInput = (LtlTrackingDetailInput) o;
        return Objects.equals(this.billOfLadingNumber, ltlTrackingDetailInput.billOfLadingNumber) &&
                Objects.equals(this.freightBillNumber, ltlTrackingDetailInput.freightBillNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(billOfLadingNumber, freightBillNumber);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LtlTrackingDetailInput {\n");

        sb.append("    billOfLadingNumber: ").append(toIndentedString(billOfLadingNumber)).append("\n");
        sb.append("    freightBillNumber: ").append(toIndentedString(freightBillNumber)).append("\n");
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

