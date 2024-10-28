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
 * Unique ID for the rateItem.
 */
@JsonAdapter(RateItemID.Adapter.class)
public enum RateItemID {

    BASE_RATE("BASE_RATE"),

    TRANSACTION_FEE("TRANSACTION_FEE"),

    ADULT_SIGNATURE_CONFIRMATION("ADULT_SIGNATURE_CONFIRMATION"),

    SIGNATURE_CONFIRMATION("SIGNATURE_CONFIRMATION"),

    NO_CONFIRMATION("NO_CONFIRMATION"),

    WAIVE_SIGNATURE("WAIVE_SIGNATURE"),

    IMPLIED_LIABILITY("IMPLIED_LIABILITY"),

    HIDDEN_POSTAGE("HIDDEN_POSTAGE"),

    DECLARED_VALUE("DECLARED_VALUE"),

    SUNDAY_HOLIDAY_DELIVERY("SUNDAY_HOLIDAY_DELIVERY"),

    DELIVERY_CONFIRMATION("DELIVERY_CONFIRMATION"),

    IMPORT_DUTY_CHARGE("IMPORT_DUTY_CHARGE"),

    VAT("VAT"),

    NO_SATURDAY_DELIVERY("NO_SATURDAY_DELIVERY"),

    INSURANCE("INSURANCE"),

    COD("COD"),

    FUEL_SURCHARGE("FUEL_SURCHARGE"),

    INSPECTION_CHARGE("INSPECTION_CHARGE"),

    DELIVERY_AREA_SURCHARGE("DELIVERY_AREA_SURCHARGE"),

    WAYBILL_CHARGE("WAYBILL_CHARGE"),

    AMAZON_SPONSORED_DISCOUNT("AMAZON_SPONSORED_DISCOUNT"),

    INTEGRATOR_SPONSORED_DISCOUNT("INTEGRATOR_SPONSORED_DISCOUNT"),

    OVERSIZE_SURCHARGE("OVERSIZE_SURCHARGE"),

    CONGESTION_CHARGE("CONGESTION_CHARGE"),

    RESIDENTIAL_SURCHARGE("RESIDENTIAL_SURCHARGE"),

    ADDITIONAL_SURCHARGE("ADDITIONAL_SURCHARGE"),

    SURCHARGE("SURCHARGE"),

    REBATE("REBATE");

    private String value;

    RateItemID(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static RateItemID fromValue(String text) {
        for (RateItemID b : RateItemID.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    public static class Adapter extends TypeAdapter<RateItemID> {

        @Override
        public void write(final JsonWriter jsonWriter, final RateItemID enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public RateItemID read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return RateItemID.fromValue(String.valueOf(value));
        }
    }
}

