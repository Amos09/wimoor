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

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * Information about an upload destination.
 */
@ApiModel(description = "Information about an upload destination.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-30T15:25:55.891+08:00")
public class ServiceDocumentUploadDestination {

    @SerializedName("uploadDestinationId")
    private String uploadDestinationId = null;

    @SerializedName("url")
    private String url = null;

    @SerializedName("encryptionDetails")
    private EncryptionDetails encryptionDetails = null;

    @SerializedName("headers")
    private Object headers = null;

    public ServiceDocumentUploadDestination uploadDestinationId(String uploadDestinationId) {
        this.uploadDestinationId = uploadDestinationId;
        return this;
    }

    /**
     * The unique identifier to be used by APIs that reference the upload destination.
     *
     * @return uploadDestinationId
     **/
    @ApiModelProperty(required = true, value = "The unique identifier to be used by APIs that reference the upload destination.")
    public String getUploadDestinationId() {
        return uploadDestinationId;
    }

    public void setUploadDestinationId(String uploadDestinationId) {
        this.uploadDestinationId = uploadDestinationId;
    }

    public ServiceDocumentUploadDestination url(String url) {
        this.url = url;
        return this;
    }

    /**
     * The URL to which to upload the file.
     *
     * @return url
     **/
    @ApiModelProperty(required = true, value = "The URL to which to upload the file.")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ServiceDocumentUploadDestination encryptionDetails(EncryptionDetails encryptionDetails) {
        this.encryptionDetails = encryptionDetails;
        return this;
    }

    /**
     * Get encryptionDetails
     *
     * @return encryptionDetails
     **/
    @ApiModelProperty(required = true, value = "")
    public EncryptionDetails getEncryptionDetails() {
        return encryptionDetails;
    }

    public void setEncryptionDetails(EncryptionDetails encryptionDetails) {
        this.encryptionDetails = encryptionDetails;
    }

    public ServiceDocumentUploadDestination headers(Object headers) {
        this.headers = headers;
        return this;
    }

    /**
     * The headers to include in the upload request.
     *
     * @return headers
     **/
    @ApiModelProperty(value = "The headers to include in the upload request.")
    public Object getHeaders() {
        return headers;
    }

    public void setHeaders(Object headers) {
        this.headers = headers;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ServiceDocumentUploadDestination serviceDocumentUploadDestination = (ServiceDocumentUploadDestination) o;
        return Objects.equals(this.uploadDestinationId, serviceDocumentUploadDestination.uploadDestinationId) &&
                Objects.equals(this.url, serviceDocumentUploadDestination.url) &&
                Objects.equals(this.encryptionDetails, serviceDocumentUploadDestination.encryptionDetails) &&
                Objects.equals(this.headers, serviceDocumentUploadDestination.headers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uploadDestinationId, url, encryptionDetails, headers);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServiceDocumentUploadDestination {\n");

        sb.append("    uploadDestinationId: ").append(toIndentedString(uploadDestinationId)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    encryptionDetails: ").append(toIndentedString(encryptionDetails)).append("\n");
        sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
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

