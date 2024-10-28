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

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * GetContentDocumentResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-30T16:09:20.221+08:00")
public class GetContentDocumentResponse {

    @SerializedName("warnings")
    private MessageSet warnings = null;

    @SerializedName("contentRecord")
    private ContentRecord contentRecord = null;

    public GetContentDocumentResponse warnings(MessageSet warnings) {
        this.warnings = warnings;
        return this;
    }

    /**
     * Get warnings
     *
     * @return warnings
     **/
    @ApiModelProperty(value = "")
    public MessageSet getWarnings() {
        return warnings;
    }

    public void setWarnings(MessageSet warnings) {
        this.warnings = warnings;
    }

    public GetContentDocumentResponse contentRecord(ContentRecord contentRecord) {
        this.contentRecord = contentRecord;
        return this;
    }

    /**
     * Get contentRecord
     *
     * @return contentRecord
     **/
    @ApiModelProperty(required = true, value = "")
    public ContentRecord getContentRecord() {
        return contentRecord;
    }

    public void setContentRecord(ContentRecord contentRecord) {
        this.contentRecord = contentRecord;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetContentDocumentResponse getContentDocumentResponse = (GetContentDocumentResponse) o;
        return Objects.equals(this.warnings, getContentDocumentResponse.warnings) &&
                Objects.equals(this.contentRecord, getContentDocumentResponse.contentRecord);
    }

    @Override
    public int hashCode() {
        return Objects.hash(warnings, contentRecord);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetContentDocumentResponse {\n");

        sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
        sb.append("    contentRecord: ").append(toIndentedString(contentRecord)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

