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
 * The &#x60;createInboundPlan&#x60; request.
 */
@ApiModel(description = "The `createInboundPlan` request.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-04-03T09:34:42.612+08:00")
public class CreateInboundPlanRequest {

    @SerializedName("contactInformation")
    private ContactInformation contactInformation = null;

    @SerializedName("destinationMarketplaces")
    private List<String> destinationMarketplaces = new ArrayList<String>();

    @SerializedName("items")
    private List<ItemInput> items = new ArrayList<ItemInput>();

    @SerializedName("name")
    private String name = null;

    @SerializedName("sourceAddress")
    private Address sourceAddress = null;

    public CreateInboundPlanRequest contactInformation(ContactInformation contactInformation) {
        this.contactInformation = contactInformation;
        return this;
    }

    /**
     * Get contactInformation
     *
     * @return contactInformation
     **/
    @ApiModelProperty(required = true, value = "")
    public ContactInformation getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(ContactInformation contactInformation) {
        this.contactInformation = contactInformation;
    }

    public CreateInboundPlanRequest destinationMarketplaces(List<String> destinationMarketplaces) {
        this.destinationMarketplaces = destinationMarketplaces;
        return this;
    }

    public CreateInboundPlanRequest addDestinationMarketplacesItem(String destinationMarketplacesItem) {
        this.destinationMarketplaces.add(destinationMarketplacesItem);
        return this;
    }

    /**
     * Marketplaces where the items need to be shipped to. Currently only one marketplace can be selected in this
     * request.
     *
     * @return destinationMarketplaces
     **/
    @ApiModelProperty(required = true, value = "Marketplaces where the items need to be shipped to. Currently only one marketplace can be selected in this request.")
    public List<String> getDestinationMarketplaces() {
        return destinationMarketplaces;
    }

    public void setDestinationMarketplaces(List<String> destinationMarketplaces) {
        this.destinationMarketplaces = destinationMarketplaces;
    }

    public CreateInboundPlanRequest items(List<ItemInput> items) {
        this.items = items;
        return this;
    }

    public CreateInboundPlanRequest addItemsItem(ItemInput itemsItem) {
        this.items.add(itemsItem);
        return this;
    }

    /**
     * Items included in this plan.
     *
     * @return items
     **/
    @ApiModelProperty(required = true, value = "Items included in this plan.")
    public List<ItemInput> getItems() {
        return items;
    }

    public void setItems(List<ItemInput> items) {
        this.items = items;
    }

    public CreateInboundPlanRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name for the Inbound Plan. If one isn&#39;t provided, a default name will be provided.
     *
     * @return name
     **/
    @ApiModelProperty(value = "Name for the Inbound Plan. If one isn't provided, a default name will be provided.")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateInboundPlanRequest sourceAddress(Address sourceAddress) {
        this.sourceAddress = sourceAddress;
        return this;
    }

    /**
     * Get sourceAddress
     *
     * @return sourceAddress
     **/
    @ApiModelProperty(required = true, value = "")
    public Address getSourceAddress() {
        return sourceAddress;
    }

    public void setSourceAddress(Address sourceAddress) {
        this.sourceAddress = sourceAddress;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateInboundPlanRequest createInboundPlanRequest = (CreateInboundPlanRequest) o;
        return Objects.equals(this.contactInformation, createInboundPlanRequest.contactInformation) &&
                Objects.equals(this.destinationMarketplaces, createInboundPlanRequest.destinationMarketplaces) &&
                Objects.equals(this.items, createInboundPlanRequest.items) &&
                Objects.equals(this.name, createInboundPlanRequest.name) &&
                Objects.equals(this.sourceAddress, createInboundPlanRequest.sourceAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contactInformation, destinationMarketplaces, items, name, sourceAddress);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInboundPlanRequest {\n");

        sb.append("    contactInformation: ").append(toIndentedString(contactInformation)).append("\n");
        sb.append("    destinationMarketplaces: ").append(toIndentedString(destinationMarketplaces)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    sourceAddress: ").append(toIndentedString(sourceAddress)).append("\n");
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

