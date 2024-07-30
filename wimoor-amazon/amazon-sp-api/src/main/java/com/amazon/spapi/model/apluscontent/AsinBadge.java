/*
 * Selling Partner API for A+ Content Management
 * With the A+ Content API, you can build applications that help selling partners add rich marketing content to their Amazon product detail pages. A+ content helps selling partners share their brand and product story, which helps buyers make informed purchasing decisions. Selling partners assemble content by choosing from content modules and adding images and text.
 *
 * OpenAPI spec version: 2020-11-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.apluscontent;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * A flag that provides additional information about an ASIN. This is contextual and may change depending on the request that generated it.
 */
@JsonAdapter(AsinBadge.Adapter.class)
public enum AsinBadge {
  
  BRAND_NOT_ELIGIBLE("BRAND_NOT_ELIGIBLE"),
  
  CATALOG_NOT_FOUND("CATALOG_NOT_FOUND"),
  
  CONTENT_NOT_PUBLISHED("CONTENT_NOT_PUBLISHED"),
  
  CONTENT_PUBLISHED("CONTENT_PUBLISHED");

  private String value;

  AsinBadge(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AsinBadge fromValue(String text) {
    for (AsinBadge b : AsinBadge.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AsinBadge> {
    @Override
    public void write(final JsonWriter jsonWriter, final AsinBadge enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AsinBadge read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AsinBadge.fromValue(String.valueOf(value));
    }
  }
}

