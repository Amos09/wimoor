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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.threeten.bp.OffsetDateTime;

/**
 * The payload for the getTracking operation.
 */
@ApiModel(description = "The payload for the getTracking operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-30T16:10:03.349+08:00")
public class GetTrackingResult {

    @SerializedName("trackingId")
    private String trackingId = null;

    @SerializedName("alternateLegTrackingId")
    private String alternateLegTrackingId = null;

    @SerializedName("eventHistory")
    private List<Event> eventHistory = new ArrayList<Event>();

    @SerializedName("promisedDeliveryDate")
    private OffsetDateTime promisedDeliveryDate = null;

    @SerializedName("summary")
    private TrackingSummary summary = null;

    public GetTrackingResult trackingId(String trackingId) {
        this.trackingId = trackingId;
        return this;
    }

    /**
     * Get trackingId
     *
     * @return trackingId
     **/
    @ApiModelProperty(required = true, value = "")
    public String getTrackingId() {
        return trackingId;
    }

    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

    public GetTrackingResult alternateLegTrackingId(String alternateLegTrackingId) {
        this.alternateLegTrackingId = alternateLegTrackingId;
        return this;
    }

    /**
     * Get alternateLegTrackingId
     *
     * @return alternateLegTrackingId
     **/
    @ApiModelProperty(required = true, value = "")
    public String getAlternateLegTrackingId() {
        return alternateLegTrackingId;
    }

    public void setAlternateLegTrackingId(String alternateLegTrackingId) {
        this.alternateLegTrackingId = alternateLegTrackingId;
    }

    public GetTrackingResult eventHistory(List<Event> eventHistory) {
        this.eventHistory = eventHistory;
        return this;
    }

    public GetTrackingResult addEventHistoryItem(Event eventHistoryItem) {
        this.eventHistory.add(eventHistoryItem);
        return this;
    }

    /**
     * A list of tracking events.
     *
     * @return eventHistory
     **/
    @ApiModelProperty(required = true, value = "A list of tracking events.")
    public List<Event> getEventHistory() {
        return eventHistory;
    }

    public void setEventHistory(List<Event> eventHistory) {
        this.eventHistory = eventHistory;
    }

    public GetTrackingResult promisedDeliveryDate(OffsetDateTime promisedDeliveryDate) {
        this.promisedDeliveryDate = promisedDeliveryDate;
        return this;
    }

    /**
     * The date and time by which the shipment is promised to be delivered.
     *
     * @return promisedDeliveryDate
     **/
    @ApiModelProperty(required = true, value = "The date and time by which the shipment is promised to be delivered.")
    public OffsetDateTime getPromisedDeliveryDate() {
        return promisedDeliveryDate;
    }

    public void setPromisedDeliveryDate(OffsetDateTime promisedDeliveryDate) {
        this.promisedDeliveryDate = promisedDeliveryDate;
    }

    public GetTrackingResult summary(TrackingSummary summary) {
        this.summary = summary;
        return this;
    }

    /**
     * Get summary
     *
     * @return summary
     **/
    @ApiModelProperty(required = true, value = "")
    public TrackingSummary getSummary() {
        return summary;
    }

    public void setSummary(TrackingSummary summary) {
        this.summary = summary;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetTrackingResult getTrackingResult = (GetTrackingResult) o;
        return Objects.equals(this.trackingId, getTrackingResult.trackingId) &&
                Objects.equals(this.alternateLegTrackingId, getTrackingResult.alternateLegTrackingId) &&
                Objects.equals(this.eventHistory, getTrackingResult.eventHistory) &&
                Objects.equals(this.promisedDeliveryDate, getTrackingResult.promisedDeliveryDate) &&
                Objects.equals(this.summary, getTrackingResult.summary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trackingId, alternateLegTrackingId, eventHistory, promisedDeliveryDate, summary);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetTrackingResult {\n");

        sb.append("    trackingId: ").append(toIndentedString(trackingId)).append("\n");
        sb.append("    alternateLegTrackingId: ").append(toIndentedString(alternateLegTrackingId)).append("\n");
        sb.append("    eventHistory: ").append(toIndentedString(eventHistory)).append("\n");
        sb.append("    promisedDeliveryDate: ").append(toIndentedString(promisedDeliveryDate)).append("\n");
        sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
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

