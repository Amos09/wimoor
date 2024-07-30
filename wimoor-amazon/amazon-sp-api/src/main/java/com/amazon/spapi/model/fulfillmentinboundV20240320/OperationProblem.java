/*
 * The Selling Partner API for FBA inbound operations.
 * The Selling Partner API for Fulfillment By Amazon (FBA) Inbound. The FBA Inbound API enables building inbound workflows to create, manage, and send shipments into Amazon's fulfillment network. The API has interoperability with the Send-to-Amazon user interface.
 *
 * OpenAPI spec version: 2024-03-20
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.fulfillmentinboundV20240320;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A problem with additional properties persisted to an operation.
 */
@ApiModel(description = "A problem with additional properties persisted to an operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-06-18T14:09:15.791+08:00")
public class OperationProblem {
  @SerializedName("code")
  private String code = null;

  @SerializedName("details")
  private String details = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("severity")
  private String severity = null;

  public OperationProblem code(String code) {
    this.code = code;
    return this;
  }

   /**
   * An error code that identifies the type of error that occurred.
   * @return code
  **/
  @ApiModelProperty(required = true, value = "An error code that identifies the type of error that occurred.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public OperationProblem details(String details) {
    this.details = details;
    return this;
  }

   /**
   * Additional details that can help the caller understand or fix the issue.
   * @return details
  **/
  @ApiModelProperty(value = "Additional details that can help the caller understand or fix the issue.")
  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public OperationProblem message(String message) {
    this.message = message;
    return this;
  }

   /**
   * A message that describes the error condition.
   * @return message
  **/
  @ApiModelProperty(required = true, value = "A message that describes the error condition.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public OperationProblem severity(String severity) {
    this.severity = severity;
    return this;
  }

   /**
   * The severity of the problem. Can be: &#x60;WARNING&#x60;, &#x60;ERROR&#x60;.
   * @return severity
  **/
  @ApiModelProperty(required = true, value = "The severity of the problem. Can be: `WARNING`, `ERROR`.")
  public String getSeverity() {
    return severity;
  }

  public void setSeverity(String severity) {
    this.severity = severity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationProblem operationProblem = (OperationProblem) o;
    return Objects.equals(this.code, operationProblem.code) &&
        Objects.equals(this.details, operationProblem.details) &&
        Objects.equals(this.message, operationProblem.message) &&
        Objects.equals(this.severity, operationProblem.severity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, details, message, severity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationProblem {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
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

