/*
 * Selling Partner API for Reports
 * The Selling Partner API for Reports lets you retrieve and manage a variety of reports that can help selling partners manage their businesses.
 *
 * OpenAPI spec version: 2021-06-30
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.reports;

import java.io.IOException;
import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Information required for the report document.
 */
@ApiModel(description = "Information required for the report document.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-07T11:00:27.668+08:00")
public class ReportDocument {
  @SerializedName("reportDocumentId")
  private String reportDocumentId = null;

  @SerializedName("url")
  private String url = null;

  /**
   * If present, the report document contents have been compressed with the provided algorithm.
   */
  @JsonAdapter(CompressionAlgorithmEnum.Adapter.class)
  public enum CompressionAlgorithmEnum {
    GZIP("GZIP");

    private String value;

    CompressionAlgorithmEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CompressionAlgorithmEnum fromValue(String text) {
      for (CompressionAlgorithmEnum b : CompressionAlgorithmEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CompressionAlgorithmEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CompressionAlgorithmEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CompressionAlgorithmEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CompressionAlgorithmEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("compressionAlgorithm")
  private CompressionAlgorithmEnum compressionAlgorithm = null;

  public ReportDocument reportDocumentId(String reportDocumentId) {
    this.reportDocumentId = reportDocumentId;
    return this;
  }

   /**
   * The identifier for the report document. This identifier is unique only in combination with a seller ID.
   * @return reportDocumentId
  **/
  @ApiModelProperty(required = true, value = "The identifier for the report document. This identifier is unique only in combination with a seller ID.")
  public String getReportDocumentId() {
    return reportDocumentId;
  }

  public void setReportDocumentId(String reportDocumentId) {
    this.reportDocumentId = reportDocumentId;
  }

  public ReportDocument url(String url) {
    this.url = url;
    return this;
  }

   /**
   * A presigned URL for the report document. This URL expires after 5 minutes.
   * @return url
  **/
  @ApiModelProperty(required = true, value = "A presigned URL for the report document. This URL expires after 5 minutes.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public ReportDocument compressionAlgorithm(CompressionAlgorithmEnum compressionAlgorithm) {
    this.compressionAlgorithm = compressionAlgorithm;
    return this;
  }

   /**
   * If present, the report document contents have been compressed with the provided algorithm.
   * @return compressionAlgorithm
  **/
  @ApiModelProperty(value = "If present, the report document contents have been compressed with the provided algorithm.")
  public CompressionAlgorithmEnum getCompressionAlgorithm() {
    return compressionAlgorithm;
  }

  public void setCompressionAlgorithm(CompressionAlgorithmEnum compressionAlgorithm) {
    this.compressionAlgorithm = compressionAlgorithm;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportDocument reportDocument = (ReportDocument) o;
    return Objects.equals(this.reportDocumentId, reportDocument.reportDocumentId) &&
        Objects.equals(this.url, reportDocument.url) &&
        Objects.equals(this.compressionAlgorithm, reportDocument.compressionAlgorithm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportDocumentId, url, compressionAlgorithm);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportDocument {\n");
    
    sb.append("    reportDocumentId: ").append(toIndentedString(reportDocumentId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    compressionAlgorithm: ").append(toIndentedString(compressionAlgorithm)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

