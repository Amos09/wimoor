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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/**
 * The condition of the item.
 */
@JsonAdapter(Condition.Adapter.class)
public enum Condition {

    NEWITEM("NewItem"),

    NEWWITHWARRANTY("NewWithWarranty"),

    NEWOEM("NewOEM"),

    NEWOPENBOX("NewOpenBox"),

    USEDLIKENEW("UsedLikeNew"),

    USEDVERYGOOD("UsedVeryGood"),

    USEDGOOD("UsedGood"),

    USEDACCEPTABLE("UsedAcceptable"),

    USEDPOOR("UsedPoor"),

    USEDREFURBISHED("UsedRefurbished"),

    COLLECTIBLELIKENEW("CollectibleLikeNew"),

    COLLECTIBLEVERYGOOD("CollectibleVeryGood"),

    COLLECTIBLEGOOD("CollectibleGood"),

    COLLECTIBLEACCEPTABLE("CollectibleAcceptable"),

    COLLECTIBLEPOOR("CollectiblePoor"),

    REFURBISHEDWITHWARRANTY("RefurbishedWithWarranty"),

    REFURBISHED("Refurbished"),

    CLUB("Club");

    private String value;

    Condition(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static Condition fromValue(String text) {
        for (Condition b : Condition.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    public static class Adapter extends TypeAdapter<Condition> {

        @Override
        public void write(final JsonWriter jsonWriter, final Condition enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public Condition read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return Condition.fromValue(String.valueOf(value));
        }
    }
}

