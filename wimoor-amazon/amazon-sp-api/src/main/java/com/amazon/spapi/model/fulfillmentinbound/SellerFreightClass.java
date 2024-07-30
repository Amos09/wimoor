/*
 * Selling Partner API for Fulfillment Inbound
 * The Selling Partner API for Fulfillment Inbound lets you create applications that create and update inbound shipments of inventory to Amazon's fulfillment network.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.fulfillmentinbound;

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
 * The freight class of the shipment. For information about determining the freight class, contact the carrier.
 */
@JsonAdapter(SellerFreightClass.Adapter.class)
public enum SellerFreightClass {
  
  _50("50"),
  
  _55("55"),
  
  _60("60"),
  
  _65("65"),
  
  _70("70"),
  
  _77_5("77.5"),
  
  _85("85"),
  
  _92_5("92.5"),
  
  _100("100"),
  
  _110("110"),
  
  _125("125"),
  
  _150("150"),
  
  _175("175"),
  
  _200("200"),
  
  _250("250"),
  
  _300("300"),
  
  _400("400"),
  
  _500("500");

  private String value;

  SellerFreightClass(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SellerFreightClass fromValue(String text) {
    for (SellerFreightClass b : SellerFreightClass.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<SellerFreightClass> {
    @Override
    public void write(final JsonWriter jsonWriter, final SellerFreightClass enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SellerFreightClass read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SellerFreightClass.fromValue(String.valueOf(value));
    }
  }
}

