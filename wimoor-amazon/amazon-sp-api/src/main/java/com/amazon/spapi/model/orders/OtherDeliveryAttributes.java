/*
 * Selling Partner API for Orders
 * The Selling Partner API for Orders helps you programmatically retrieve order information. These APIs let you develop fast, flexible, custom applications in areas like order synchronization, order research, and demand-based decision support tools. The Orders API supports orders that are two years old or less. Orders more than two years old will not show in the API response.  _Note:_ The Orders API supports orders from 2016 and after for the JP, AU, and SG marketplaces.
 *
 * OpenAPI spec version: v0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.orders;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/**
 * Miscellaneous delivery attributes associated with the shipping address.
 */
@JsonAdapter(OtherDeliveryAttributes.Adapter.class)
public enum OtherDeliveryAttributes {

    HAS_ACCESS_POINT("HAS_ACCESS_POINT"),

    PALLET_ENABLED("PALLET_ENABLED"),

    PALLET_DISABLED("PALLET_DISABLED");

    private String value;

    OtherDeliveryAttributes(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static OtherDeliveryAttributes fromValue(String text) {
        for (OtherDeliveryAttributes b : OtherDeliveryAttributes.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    public static class Adapter extends TypeAdapter<OtherDeliveryAttributes> {

        @Override
        public void write(final JsonWriter jsonWriter, final OtherDeliveryAttributes enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public OtherDeliveryAttributes read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return OtherDeliveryAttributes.fromValue(String.valueOf(value));
        }
    }
}

