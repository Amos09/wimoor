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
 * Contains information about a box that is used in the inbound plan. The box may contain an item and metadata about the
 * box itself.
 */
@ApiModel(description = "Contains information about a box that is used in the inbound plan. The box may contain an item and metadata about the box itself.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-04-03T09:34:42.612+08:00")
public class Box {

    @SerializedName("boxId")
    private String boxId = null;

    @SerializedName("destinationRegion")
    private Region destinationRegion = null;

    @SerializedName("dimensions")
    private Dimensions dimensions = null;

    @SerializedName("items")
    private List<Item> items = null;

    @SerializedName("packageId")
    private String packageId = null;

    @SerializedName("quantity")
    private Integer quantity = null;

    @SerializedName("templateName")
    private String templateName = null;

    @SerializedName("weight")
    private Weight weight = null;

    public Box boxId(String boxId) {
        this.boxId = boxId;
        return this;
    }

    /**
     * The ID provided by Amazon that identifies a given box. This ID is comprised of the external shipment ID (which
     * is generated after transportation has been confirmed) and the index of the box.
     *
     * @return boxId
     **/
    @ApiModelProperty(value = "The ID provided by Amazon that identifies a given box. This ID is comprised of the external shipment ID (which         is generated after transportation has been confirmed) and the index of the box.")
    public String getBoxId() {
        return boxId;
    }

    public void setBoxId(String boxId) {
        this.boxId = boxId;
    }

    public Box destinationRegion(Region destinationRegion) {
        this.destinationRegion = destinationRegion;
        return this;
    }

    /**
     * Get destinationRegion
     *
     * @return destinationRegion
     **/
    @ApiModelProperty(value = "")
    public Region getDestinationRegion() {
        return destinationRegion;
    }

    public void setDestinationRegion(Region destinationRegion) {
        this.destinationRegion = destinationRegion;
    }

    public Box dimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * Get dimensions
     *
     * @return dimensions
     **/
    @ApiModelProperty(value = "")
    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    public Box items(List<Item> items) {
        this.items = items;
        return this;
    }

    public Box addItemsItem(Item itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<Item>();
        }
        this.items.add(itemsItem);
        return this;
    }

    /**
     * Items contained within the box.
     *
     * @return items
     **/
    @ApiModelProperty(value = "Items contained within the box.")
    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Box packageId(String packageId) {
        this.packageId = packageId;
        return this;
    }

    /**
     * Primary key to uniquely identify a Package (Box or Pallet).
     *
     * @return packageId
     **/
    @ApiModelProperty(required = true, value = "Primary key to uniquely identify a Package (Box or Pallet).")
    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public Box quantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * The number of containers where all other properties like weight or dimensions are identical. minimum: 1 maximum:
     * 10000
     *
     * @return quantity
     **/
    @ApiModelProperty(value = "The number of containers where all other properties like weight or dimensions are identical.")
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Box templateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * Template name of the box.
     *
     * @return templateName
     **/
    @ApiModelProperty(value = "Template name of the box.")
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public Box weight(Weight weight) {
        this.weight = weight;
        return this;
    }

    /**
     * Get weight
     *
     * @return weight
     **/
    @ApiModelProperty(value = "")
    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Box box = (Box) o;
        return Objects.equals(this.boxId, box.boxId) &&
                Objects.equals(this.destinationRegion, box.destinationRegion) &&
                Objects.equals(this.dimensions, box.dimensions) &&
                Objects.equals(this.items, box.items) &&
                Objects.equals(this.packageId, box.packageId) &&
                Objects.equals(this.quantity, box.quantity) &&
                Objects.equals(this.templateName, box.templateName) &&
                Objects.equals(this.weight, box.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(boxId, destinationRegion, dimensions, items, packageId, quantity, templateName, weight);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Box {\n");

        sb.append("    boxId: ").append(toIndentedString(boxId)).append("\n");
        sb.append("    destinationRegion: ").append(toIndentedString(destinationRegion)).append("\n");
        sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
        sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
        sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

