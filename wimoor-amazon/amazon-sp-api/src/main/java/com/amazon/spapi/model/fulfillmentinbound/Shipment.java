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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Contains information pertaining to a shipment in an inbound plan.
 */
@ApiModel(description = "Contains information pertaining to a shipment in an inbound plan.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-04-03T09:34:42.612+08:00")
public class Shipment {

    @SerializedName("amazonReferenceId")
    private String amazonReferenceId = null;

    @SerializedName("contactInformation")
    private ContactInformation contactInformation = null;

    @SerializedName("dates")
    private Dates dates = null;

    @SerializedName("destination")
    private ShipmentDestination destination = null;

    @SerializedName("inboundPlanId")
    private String inboundPlanId = null;

    @SerializedName("name")
    private String name = null;

    @SerializedName("palletInformation")
    private PalletInformation palletInformation = null;

    @SerializedName("placementOptionId")
    private String placementOptionId = null;

    @SerializedName("selectedTransportationOptionId")
    private String selectedTransportationOptionId = null;

    @SerializedName("selfShipAppointmentDetails")
    private List<SelfShipAppointmentDetails> selfShipAppointmentDetails = null;

    @SerializedName("shipmentConfirmationId")
    private String shipmentConfirmationId = null;

    @SerializedName("shipmentId")
    private String shipmentId = null;

    @SerializedName("source")
    private ShipmentSource source = null;

    @SerializedName("status")
    private String status = null;

    @SerializedName("trackingDetails")
    private TrackingDetails trackingDetails = null;

    public Shipment amazonReferenceId(String amazonReferenceId) {
        this.amazonReferenceId = amazonReferenceId;
        return this;
    }

    /**
     * A unique identifier created by Amazon that identifies this Amazon-partnered, Less Than Truckload/Full Truckload
     * (LTL/FTL) shipment.
     *
     * @return amazonReferenceId
     **/
    @ApiModelProperty(value = "A unique identifier created by Amazon that identifies this Amazon-partnered, Less Than Truckload/Full Truckload (LTL/FTL) shipment.")
    public String getAmazonReferenceId() {
        return amazonReferenceId;
    }

    public void setAmazonReferenceId(String amazonReferenceId) {
        this.amazonReferenceId = amazonReferenceId;
    }

    public Shipment contactInformation(ContactInformation contactInformation) {
        this.contactInformation = contactInformation;
        return this;
    }

    /**
     * Get contactInformation
     *
     * @return contactInformation
     **/
    @ApiModelProperty(value = "")
    public ContactInformation getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(ContactInformation contactInformation) {
        this.contactInformation = contactInformation;
    }

    public Shipment dates(Dates dates) {
        this.dates = dates;
        return this;
    }

    /**
     * Get dates
     *
     * @return dates
     **/
    @ApiModelProperty(value = "")
    public Dates getDates() {
        return dates;
    }

    public void setDates(Dates dates) {
        this.dates = dates;
    }

    public Shipment destination(ShipmentDestination destination) {
        this.destination = destination;
        return this;
    }

    /**
     * Get destination
     *
     * @return destination
     **/
    @ApiModelProperty(required = true, value = "")
    public ShipmentDestination getDestination() {
        return destination;
    }

    public void setDestination(ShipmentDestination destination) {
        this.destination = destination;
    }

    public Shipment inboundPlanId(String inboundPlanId) {
        this.inboundPlanId = inboundPlanId;
        return this;
    }

    /**
     * Identifier to an inbound plan.
     *
     * @return inboundPlanId
     **/
    @ApiModelProperty(required = true, value = "Identifier to an inbound plan.")
    public String getInboundPlanId() {
        return inboundPlanId;
    }

    public void setInboundPlanId(String inboundPlanId) {
        this.inboundPlanId = inboundPlanId;
    }

    public Shipment name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the shipment.
     *
     * @return name
     **/
    @ApiModelProperty(value = "The name of the shipment.")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Shipment palletInformation(PalletInformation palletInformation) {
        this.palletInformation = palletInformation;
        return this;
    }

    /**
     * Get palletInformation
     *
     * @return palletInformation
     **/
    @ApiModelProperty(value = "")
    public PalletInformation getPalletInformation() {
        return palletInformation;
    }

    public void setPalletInformation(PalletInformation palletInformation) {
        this.palletInformation = palletInformation;
    }

    public Shipment placementOptionId(String placementOptionId) {
        this.placementOptionId = placementOptionId;
        return this;
    }

    /**
     * Identifier to a placement option. A placement option represents the shipment splits and destinations of SKUs.
     *
     * @return placementOptionId
     **/
    @ApiModelProperty(required = true, value = "Identifier to a placement option. A placement option represents the shipment splits and destinations of SKUs.")
    public String getPlacementOptionId() {
        return placementOptionId;
    }

    public void setPlacementOptionId(String placementOptionId) {
        this.placementOptionId = placementOptionId;
    }

    public Shipment selectedTransportationOptionId(String selectedTransportationOptionId) {
        this.selectedTransportationOptionId = selectedTransportationOptionId;
        return this;
    }

    /**
     * Identifier to a transportation option. A transportation option represent one option for how to send a shipment.
     *
     * @return selectedTransportationOptionId
     **/
    @ApiModelProperty(value = "Identifier to a transportation option. A transportation option represent one option for how to send a shipment.")
    public String getSelectedTransportationOptionId() {
        return selectedTransportationOptionId;
    }

    public void setSelectedTransportationOptionId(String selectedTransportationOptionId) {
        this.selectedTransportationOptionId = selectedTransportationOptionId;
    }

    public Shipment selfShipAppointmentDetails(List<SelfShipAppointmentDetails> selfShipAppointmentDetails) {
        this.selfShipAppointmentDetails = selfShipAppointmentDetails;
        return this;
    }

    public Shipment addSelfShipAppointmentDetailsItem(SelfShipAppointmentDetails selfShipAppointmentDetailsItem) {
        if (this.selfShipAppointmentDetails == null) {
            this.selfShipAppointmentDetails = new ArrayList<SelfShipAppointmentDetails>();
        }
        this.selfShipAppointmentDetails.add(selfShipAppointmentDetailsItem);
        return this;
    }

    /**
     * List of self ship appointment details.
     *
     * @return selfShipAppointmentDetails
     **/
    @ApiModelProperty(value = "List of self ship appointment details.")
    public List<SelfShipAppointmentDetails> getSelfShipAppointmentDetails() {
        return selfShipAppointmentDetails;
    }

    public void setSelfShipAppointmentDetails(List<SelfShipAppointmentDetails> selfShipAppointmentDetails) {
        this.selfShipAppointmentDetails = selfShipAppointmentDetails;
    }

    public Shipment shipmentConfirmationId(String shipmentConfirmationId) {
        this.shipmentConfirmationId = shipmentConfirmationId;
        return this;
    }

    /**
     * The confirmed shipment ID which shows up on labels (for example, FBA1234ABCD).
     *
     * @return shipmentConfirmationId
     **/
    @ApiModelProperty(value = "The confirmed shipment ID which shows up on labels (for example, FBA1234ABCD).")
    public String getShipmentConfirmationId() {
        return shipmentConfirmationId;
    }

    public void setShipmentConfirmationId(String shipmentConfirmationId) {
        this.shipmentConfirmationId = shipmentConfirmationId;
    }

    public Shipment shipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
        return this;
    }

    /**
     * Identifier to a shipment. A shipment contains the boxes and units being inbounded.
     *
     * @return shipmentId
     **/
    @ApiModelProperty(required = true, value = "Identifier to a shipment. A shipment contains the boxes and units being inbounded.")
    public String getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }

    public Shipment source(ShipmentSource source) {
        this.source = source;
        return this;
    }

    /**
     * Get source
     *
     * @return source
     **/
    @ApiModelProperty(required = true, value = "")
    public ShipmentSource getSource() {
        return source;
    }

    public void setSource(ShipmentSource source) {
        this.source = source;
    }

    public Shipment status(String status) {
        this.status = status;
        return this;
    }

    /**
     * The status of a shipment. The state of the shipment will typically start in &#x60;WORKING&#x60; and transition to
     * &#x60;READY_TO_SHIP&#x60; once required actions are complete prior to being picked up or shipped out. Can be
     * &#x60;ABANDONED&#x60;, &#x60;CANCELLED&#x60;, &#x60;CHECKED_IN&#x60;, &#x60;CLOSED&#x60;, &#x60;DELETED&#x60;,
     * &#x60;DELIVERED&#x60;, &#x60;IN_TRANSIT&#x60;, &#x60;MIXED&#x60;, &#x60;READY_TO_SHIP&#x60;,
     * &#x60;RECEIVING&#x60;, &#x60;SHIPPED&#x60;, or &#x60;WORKING&#x60;.
     *
     * @return status
     **/
    @ApiModelProperty(value = "The status of a shipment. The state of the shipment will typically start in `WORKING` and transition to `READY_TO_SHIP` once required actions are complete prior to being picked up or shipped out. Can be `ABANDONED`, `CANCELLED`, `CHECKED_IN`, `CLOSED`, `DELETED`, `DELIVERED`, `IN_TRANSIT`, `MIXED`, `READY_TO_SHIP`, `RECEIVING`, `SHIPPED`, or `WORKING`.")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Shipment trackingDetails(TrackingDetails trackingDetails) {
        this.trackingDetails = trackingDetails;
        return this;
    }

    /**
     * Get trackingDetails
     *
     * @return trackingDetails
     **/
    @ApiModelProperty(value = "")
    public TrackingDetails getTrackingDetails() {
        return trackingDetails;
    }

    public void setTrackingDetails(TrackingDetails trackingDetails) {
        this.trackingDetails = trackingDetails;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Shipment shipment = (Shipment) o;
        return Objects.equals(this.amazonReferenceId, shipment.amazonReferenceId) &&
                Objects.equals(this.contactInformation, shipment.contactInformation) &&
                Objects.equals(this.dates, shipment.dates) &&
                Objects.equals(this.destination, shipment.destination) &&
                Objects.equals(this.inboundPlanId, shipment.inboundPlanId) &&
                Objects.equals(this.name, shipment.name) &&
                Objects.equals(this.palletInformation, shipment.palletInformation) &&
                Objects.equals(this.placementOptionId, shipment.placementOptionId) &&
                Objects.equals(this.selectedTransportationOptionId, shipment.selectedTransportationOptionId) &&
                Objects.equals(this.selfShipAppointmentDetails, shipment.selfShipAppointmentDetails) &&
                Objects.equals(this.shipmentConfirmationId, shipment.shipmentConfirmationId) &&
                Objects.equals(this.shipmentId, shipment.shipmentId) &&
                Objects.equals(this.source, shipment.source) &&
                Objects.equals(this.status, shipment.status) &&
                Objects.equals(this.trackingDetails, shipment.trackingDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amazonReferenceId, contactInformation, dates, destination, inboundPlanId, name,
                palletInformation, placementOptionId, selectedTransportationOptionId, selfShipAppointmentDetails,
                shipmentConfirmationId, shipmentId, source, status, trackingDetails);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Shipment {\n");

        sb.append("    amazonReferenceId: ").append(toIndentedString(amazonReferenceId)).append("\n");
        sb.append("    contactInformation: ").append(toIndentedString(contactInformation)).append("\n");
        sb.append("    dates: ").append(toIndentedString(dates)).append("\n");
        sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
        sb.append("    inboundPlanId: ").append(toIndentedString(inboundPlanId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    palletInformation: ").append(toIndentedString(palletInformation)).append("\n");
        sb.append("    placementOptionId: ").append(toIndentedString(placementOptionId)).append("\n");
        sb.append("    selectedTransportationOptionId: ").append(toIndentedString(selectedTransportationOptionId))
                .append("\n");
        sb.append("    selfShipAppointmentDetails: ").append(toIndentedString(selfShipAppointmentDetails)).append("\n");
        sb.append("    shipmentConfirmationId: ").append(toIndentedString(shipmentConfirmationId)).append("\n");
        sb.append("    shipmentId: ").append(toIndentedString(shipmentId)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    trackingDetails: ").append(toIndentedString(trackingDetails)).append("\n");
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

