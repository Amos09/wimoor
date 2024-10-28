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
import java.util.Objects;
import org.threeten.bp.OffsetDateTime;

/**
 * An appointment slot time with start and end.
 */
@ApiModel(description = "An appointment slot time with start and end.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-06-18T14:09:15.791+08:00")
public class AppointmentSlotTime {

    @SerializedName("endTime")
    private OffsetDateTime endTime = null;

    @SerializedName("startTime")
    private OffsetDateTime startTime = null;

    public AppointmentSlotTime endTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * The end timestamp of the appointment in UTC.
     *
     * @return endTime
     **/
    @ApiModelProperty(required = true, value = "The end timestamp of the appointment in UTC.")
    public OffsetDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
    }

    public AppointmentSlotTime startTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * The start timestamp of the appointment in UTC.
     *
     * @return startTime
     **/
    @ApiModelProperty(required = true, value = "The start timestamp of the appointment in UTC.")
    public OffsetDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AppointmentSlotTime appointmentSlotTime = (AppointmentSlotTime) o;
        return Objects.equals(this.endTime, appointmentSlotTime.endTime) &&
                Objects.equals(this.startTime, appointmentSlotTime.startTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endTime, startTime);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppointmentSlotTime {\n");

        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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

