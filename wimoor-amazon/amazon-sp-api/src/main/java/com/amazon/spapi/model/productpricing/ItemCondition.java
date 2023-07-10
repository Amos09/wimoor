/*
 * Selling Partner API for Pricing
 * The Selling Partner API for Pricing helps you programmatically retrieve product pricing and offer information for Amazon Marketplace products.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.productpricing;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Filters the offer listings to be considered based on item condition. Possible values: New, Used, Collectible, Refurbished, Club.
 */
@JsonAdapter(ItemCondition.Adapter.class)
public enum ItemCondition {
  
  NEW("New"),
  
  USED("Used"),
  
  COLLECTIBLE("Collectible"),
  
  REFURBISHED("Refurbished"),
  
  CLUB("Club");

  private String value;

  ItemCondition(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ItemCondition fromValue(String text) {
    for (ItemCondition b : ItemCondition.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ItemCondition> {
    @Override
    public void write(final JsonWriter jsonWriter, final ItemCondition enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ItemCondition read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ItemCondition.fromValue(String.valueOf(value));
    }
  }
}

