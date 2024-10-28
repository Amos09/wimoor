/*
 * Amazon Shipping API
 * The Amazon Shipping API is designed to support outbound shipping use cases both for orders originating on Amazon-owned marketplaces as well as external channels/marketplaces. With these APIs, you can request shipping rates, create shipments, cancel shipments, and track shipments.
 *
 * OpenAPI spec version: v2
 * Contact: swa-api-core@amazon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.shipping;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/**
 * The file format of the document.
 */
@JsonAdapter(DocumentFormat.Adapter.class)
public enum DocumentFormat {

    PDF("PDF"),

    PNG("PNG"),

    ZPL("ZPL");

    private String value;

    DocumentFormat(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static DocumentFormat fromValue(String text) {
        for (DocumentFormat b : DocumentFormat.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    public static class Adapter extends TypeAdapter<DocumentFormat> {

        @Override
        public void write(final JsonWriter jsonWriter, final DocumentFormat enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public DocumentFormat read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return DocumentFormat.fromValue(String.valueOf(value));
        }
    }
}

