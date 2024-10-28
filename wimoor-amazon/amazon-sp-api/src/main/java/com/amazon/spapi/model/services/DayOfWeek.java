/*
 * Selling Partner API for Services
 * With the Services API, you can build applications that help service providers get and modify their service orders and manage their resources.
 *
 * OpenAPI spec version: v1
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.services;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/**
 * The day of the week.
 */
@JsonAdapter(DayOfWeek.Adapter.class)
public enum DayOfWeek {

    MONDAY("MONDAY"),

    TUESDAY("TUESDAY"),

    WEDNESDAY("WEDNESDAY"),

    THURSDAY("THURSDAY"),

    FRIDAY("FRIDAY"),

    SATURDAY("SATURDAY"),

    SUNDAY("SUNDAY");

    private String value;

    DayOfWeek(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static DayOfWeek fromValue(String text) {
        for (DayOfWeek b : DayOfWeek.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    public static class Adapter extends TypeAdapter<DayOfWeek> {

        @Override
        public void write(final JsonWriter jsonWriter, final DayOfWeek enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public DayOfWeek read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return DayOfWeek.fromValue(String.valueOf(value));
        }
    }
}

