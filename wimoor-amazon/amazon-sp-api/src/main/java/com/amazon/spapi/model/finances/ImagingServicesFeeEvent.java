/*
 * Selling Partner API for Finances
 * The Selling Partner API for Finances helps you obtain financial information relevant to a seller's business. You can obtain financial events for a given order, financial event group, or date range without having to wait until a statement period closes. You can also obtain financial event groups for a given date range.
 *
 * OpenAPI spec version: v0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.finances;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * A fee event related to Amazon Imaging services.
 */
@ApiModel(description = "A fee event related to Amazon Imaging services.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-30T16:09:34.728+08:00")
public class ImagingServicesFeeEvent {

    @SerializedName("ImagingRequestBillingItemID")
    private String imagingRequestBillingItemID = null;

    @SerializedName("ASIN")
    private String ASIN = null;

    @SerializedName("PostedDate")
    private String postedDate = null;

    @SerializedName("FeeList")
    private FeeComponentList feeList = null;

    public ImagingServicesFeeEvent imagingRequestBillingItemID(String imagingRequestBillingItemID) {
        this.imagingRequestBillingItemID = imagingRequestBillingItemID;
        return this;
    }

    /**
     * The identifier for the imaging services request.
     *
     * @return imagingRequestBillingItemID
     **/
    @ApiModelProperty(value = "The identifier for the imaging services request.")
    public String getImagingRequestBillingItemID() {
        return imagingRequestBillingItemID;
    }

    public void setImagingRequestBillingItemID(String imagingRequestBillingItemID) {
        this.imagingRequestBillingItemID = imagingRequestBillingItemID;
    }

    public ImagingServicesFeeEvent ASIN(String ASIN) {
        this.ASIN = ASIN;
        return this;
    }

    /**
     * The Amazon Standard Identification Number (ASIN) of the item for which the imaging service was requested.
     *
     * @return ASIN
     **/
    @ApiModelProperty(value = "The Amazon Standard Identification Number (ASIN) of the item for which the imaging service was requested.")
    public String getASIN() {
        return ASIN;
    }

    public void setASIN(String ASIN) {
        this.ASIN = ASIN;
    }

    public ImagingServicesFeeEvent postedDate(String postedDate) {
        this.postedDate = postedDate;
        return this;
    }

    /**
     * The date and time when the financial event was posted.
     *
     * @return postedDate
     **/
    @ApiModelProperty(value = "The date and time when the financial event was posted.")
    public String getPostedDate() {
        return postedDate;
    }

    public void setPostedDate(String postedDate) {
        this.postedDate = postedDate;
    }

    public ImagingServicesFeeEvent feeList(FeeComponentList feeList) {
        this.feeList = feeList;
        return this;
    }

    /**
     * A list of fees associated with the event.
     *
     * @return feeList
     **/
    @ApiModelProperty(value = "A list of fees associated with the event.")
    public FeeComponentList getFeeList() {
        return feeList;
    }

    public void setFeeList(FeeComponentList feeList) {
        this.feeList = feeList;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImagingServicesFeeEvent imagingServicesFeeEvent = (ImagingServicesFeeEvent) o;
        return Objects.equals(this.imagingRequestBillingItemID, imagingServicesFeeEvent.imagingRequestBillingItemID) &&
                Objects.equals(this.ASIN, imagingServicesFeeEvent.ASIN) &&
                Objects.equals(this.postedDate, imagingServicesFeeEvent.postedDate) &&
                Objects.equals(this.feeList, imagingServicesFeeEvent.feeList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imagingRequestBillingItemID, ASIN, postedDate, feeList);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImagingServicesFeeEvent {\n");

        sb.append("    imagingRequestBillingItemID: ").append(toIndentedString(imagingRequestBillingItemID))
                .append("\n");
        sb.append("    ASIN: ").append(toIndentedString(ASIN)).append("\n");
        sb.append("    postedDate: ").append(toIndentedString(postedDate)).append("\n");
        sb.append("    feeList: ").append(toIndentedString(feeList)).append("\n");
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

