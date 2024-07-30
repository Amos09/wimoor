/*
 * Selling Partner API for Catalog Items
 * The Selling Partner API for Catalog Items provides programmatic access to information about items in the Amazon catalog.  For more information, refer to the [Catalog Items API Use Case Guide](doc:catalog-items-api-v2022-04-01-use-case-guide).
 *
 * OpenAPI spec version: 2022-04-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.catalogitems;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Variation theme indicating the combination of Amazon item catalog attributes that define the variation family.
 */
@ApiModel(description = "Variation theme indicating the combination of Amazon item catalog attributes that define the variation family.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-30T16:09:25.977+08:00")
public class ItemVariationTheme {
  @SerializedName("attributes")
  private List<String> attributes = null;

  @SerializedName("theme")
  private String theme = null;

  public ItemVariationTheme attributes(List<String> attributes) {
    this.attributes = attributes;
    return this;
  }

  public ItemVariationTheme addAttributesItem(String attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<String>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

   /**
   * Names of the Amazon catalog item attributes associated with the variation theme.
   * @return attributes
  **/
  @ApiModelProperty(value = "Names of the Amazon catalog item attributes associated with the variation theme.")
  public List<String> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<String> attributes) {
    this.attributes = attributes;
  }

  public ItemVariationTheme theme(String theme) {
    this.theme = theme;
    return this;
  }

   /**
   * Variation theme indicating the combination of Amazon item catalog attributes that define the variation family.
   * @return theme
  **/
  @ApiModelProperty(example = "COLOR_NAME/STYLE_NAME", value = "Variation theme indicating the combination of Amazon item catalog attributes that define the variation family.")
  public String getTheme() {
    return theme;
  }

  public void setTheme(String theme) {
    this.theme = theme;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemVariationTheme itemVariationTheme = (ItemVariationTheme) o;
    return Objects.equals(this.attributes, itemVariationTheme.attributes) &&
        Objects.equals(this.theme, itemVariationTheme.theme);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, theme);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemVariationTheme {\n");
    
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    theme: ").append(toIndentedString(theme)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

