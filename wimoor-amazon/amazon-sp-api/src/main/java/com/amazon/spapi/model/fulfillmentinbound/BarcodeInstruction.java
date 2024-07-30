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
 * Labeling requirements for the item. For more information about FBA labeling requirements, see the Seller Central Help for your marketplace.
 */
@JsonAdapter(BarcodeInstruction.Adapter.class)
public enum BarcodeInstruction {
  
  REQUIRESFNSKULABEL("RequiresFNSKULabel"),
  
  CANUSEORIGINALBARCODE("CanUseOriginalBarcode"),
  
  MUSTPROVIDESELLERSKU("MustProvideSellerSKU");

  private String value;

  BarcodeInstruction(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BarcodeInstruction fromValue(String text) {
    for (BarcodeInstruction b : BarcodeInstruction.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<BarcodeInstruction> {
    @Override
    public void write(final JsonWriter jsonWriter, final BarcodeInstruction enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BarcodeInstruction read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BarcodeInstruction.fromValue(String.valueOf(value));
    }
  }
}

