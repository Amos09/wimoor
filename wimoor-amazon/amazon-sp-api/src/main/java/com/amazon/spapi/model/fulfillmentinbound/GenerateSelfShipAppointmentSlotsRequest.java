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
import org.threeten.bp.OffsetDateTime;

/**
 * The &#x60;generateSelfShipAppointmentSlots&#x60; request.
 */
@ApiModel(description = "The `generateSelfShipAppointmentSlots` request.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-04-03T09:34:42.612+08:00")
public class GenerateSelfShipAppointmentSlotsRequest {

    @SerializedName("desiredEndDate")
    private OffsetDateTime desiredEndDate = null;

    @SerializedName("desiredStartDate")
    private OffsetDateTime desiredStartDate = null;

    public GenerateSelfShipAppointmentSlotsRequest desiredEndDate(OffsetDateTime desiredEndDate) {
        this.desiredEndDate = desiredEndDate;
        return this;
    }

    /**
     * The ISO 8601 datetime with pattern &#x60;yyyy-MM-ddTHH:mm:ss.sssZ&#x60;.
     *
     * @return desiredEndDate
     **/
    @ApiModelProperty(value = "The ISO 8601 datetime with pattern `yyyy-MM-ddTHH:mm:ss.sssZ`.")
    public OffsetDateTime getDesiredEndDate() {
        return desiredEndDate;
    }

    public void setDesiredEndDate(OffsetDateTime desiredEndDate) {
        this.desiredEndDate = desiredEndDate;
    }

    public GenerateSelfShipAppointmentSlotsRequest desiredStartDate(OffsetDateTime desiredStartDate) {
        this.desiredStartDate = desiredStartDate;
        return this;
    }

    /**
     * The ISO 8601 datetime with pattern &#x60;yyyy-MM-ddTHH:mm:ss.sssZ&#x60;.
     *
     * @return desiredStartDate
     **/
    @ApiModelProperty(value = "The ISO 8601 datetime with pattern `yyyy-MM-ddTHH:mm:ss.sssZ`.")
    public OffsetDateTime getDesiredStartDate() {
        return desiredStartDate;
    }

    public void setDesiredStartDate(OffsetDateTime desiredStartDate) {
        this.desiredStartDate = desiredStartDate;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GenerateSelfShipAppointmentSlotsRequest generateSelfShipAppointmentSlotsRequest = (GenerateSelfShipAppointmentSlotsRequest) o;
        return Objects.equals(this.desiredEndDate, generateSelfShipAppointmentSlotsRequest.desiredEndDate) &&
                Objects.equals(this.desiredStartDate, generateSelfShipAppointmentSlotsRequest.desiredStartDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desiredEndDate, desiredStartDate);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GenerateSelfShipAppointmentSlotsRequest {\n");

        sb.append("    desiredEndDate: ").append(toIndentedString(desiredEndDate)).append("\n");
        sb.append("    desiredStartDate: ").append(toIndentedString(desiredStartDate)).append("\n");
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

