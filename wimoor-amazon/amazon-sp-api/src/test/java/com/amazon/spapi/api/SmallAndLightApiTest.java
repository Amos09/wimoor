/*
 * Selling Partner API for FBA Small And Light
 * The Selling Partner API for FBA Small and Light lets you help sellers manage their listings in the Small and Light program. The program reduces the cost of fulfilling orders for small and lightweight FBA inventory. You can enroll or remove items from the program and check item eligibility and enrollment status. You can also preview the estimated program fees charged to a seller for items sold while enrolled in the program.
 *
 * OpenAPI spec version: v1
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.api;

import com.amazon.spapi.SellingPartnerAPIAA.LWAException;
import com.amazon.spapi.client.ApiException;
import com.amazon.spapi.model.fbasmallandlight.SmallAndLightEligibility;
import com.amazon.spapi.model.fbasmallandlight.SmallAndLightEnrollment;
import com.amazon.spapi.model.fbasmallandlight.SmallAndLightFeePreviewRequest;
import com.amazon.spapi.model.fbasmallandlight.SmallAndLightFeePreviews;
import java.util.List;
import org.junit.Ignore;
import org.junit.Test;

/**
 * API tests for SmallAndLightApi
 */
@Ignore
public class SmallAndLightApiTest {

    private final SmallAndLightApi api = new SmallAndLightApi();


    /**
     * Removes the item indicated by the specified seller SKU from the Small and Light program in the specified
     * marketplace. If the item is not eligible for disenrollment, the ineligibility reasons are returned.  **Usage
     * Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 5 |  The &#x60;x-amzn-RateLimit-Limit&#x60;
     * response header returns the usage plan rate limits that were applied to the requested operation, when available.
     * The table above indicates the default rate and burst values for this operation. Selling partners whose business
     * demands require higher throughput may see higher rate and burst values than those shown here. For more
     * information, see [Usage Plans and Rate Limits in the Selling Partner
     * API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).
     *
     * @throws ApiException if the Api call fails
     * @throws LWAException If calls to fetch LWA access token fails
     */
    @Test
    public void deleteSmallAndLightEnrollmentBySellerSKUTest() throws ApiException, LWAException {
        String sellerSKU = null;
        List<String> marketplaceIds = null;
        api.deleteSmallAndLightEnrollmentBySellerSKU(sellerSKU, marketplaceIds);

// TODO: test validations
    }

    /**
     * Returns the Small and Light program eligibility status of the item indicated by the specified seller SKU in the
     * specified marketplace. If the item is not eligible, the ineligibility reasons are returned. **Note:** The
     * parameters associated with this operation may contain special characters that must be encoded to successfully
     * call the API. To avoid errors with SKUs when encoding URLs, refer to [URL
     * Encoding](https://developer-docs.amazon.com/sp-api/docs/url-encoding).  **Usage Plan:**  | Rate (requests per
     * second) | Burst | | ---- | ---- | | 2 | 10 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the
     * usage plan rate limits that were applied to the requested operation, when available. The table above indicates
     * the default rate and burst values for this operation. Selling partners whose business demands require higher
     * throughput may see higher rate and burst values than those shown here. For more information, see [Usage Plans and
     * Rate Limits in the Selling Partner
     * API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).
     *
     * @throws ApiException if the Api call fails
     * @throws LWAException If calls to fetch LWA access token fails
     */
    @Test
    public void getSmallAndLightEligibilityBySellerSKUTest() throws ApiException, LWAException {
        String sellerSKU = null;
        List<String> marketplaceIds = null;
        SmallAndLightEligibility response = api.getSmallAndLightEligibilityBySellerSKU(sellerSKU, marketplaceIds);

// TODO: test validations
    }

    /**
     * Returns the Small and Light enrollment status for the item indicated by the specified seller SKU in the specified
     * marketplace.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 10 |  The
     * &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the
     * requested operation, when available. The table above indicates the default rate and burst values for this
     * operation. Selling partners whose business demands require higher throughput may see higher rate and burst values
     * than those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner
     * API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).
     *
     * @throws ApiException if the Api call fails
     * @throws LWAException If calls to fetch LWA access token fails
     */
    @Test
    public void getSmallAndLightEnrollmentBySellerSKUTest() throws ApiException, LWAException {
        String sellerSKU = null;
        List<String> marketplaceIds = null;
        SmallAndLightEnrollment response = api.getSmallAndLightEnrollmentBySellerSKU(sellerSKU, marketplaceIds);

// TODO: test validations
    }

    /**
     * Returns the Small and Light fee estimates for the specified items. You must include a marketplaceId parameter to
     * retrieve the proper fee estimates for items to be sold in that marketplace. The ordering of items in the response
     * will mirror the order of the items in the request. Duplicate ASIN/price combinations are removed.  **Usage
     * Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 3 |  The &#x60;x-amzn-RateLimit-Limit&#x60;
     * response header returns the usage plan rate limits that were applied to the requested operation, when available.
     * The table above indicates the default rate and burst values for this operation. Selling partners whose business
     * demands require higher throughput may see higher rate and burst values than those shown here. For more
     * information, see [Usage Plans and Rate Limits in the Selling Partner
     * API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).
     *
     * @throws ApiException if the Api call fails
     * @throws LWAException If calls to fetch LWA access token fails
     */
    @Test
    public void getSmallAndLightFeePreviewTest() throws ApiException, LWAException {
        SmallAndLightFeePreviewRequest body = null;
        SmallAndLightFeePreviews response = api.getSmallAndLightFeePreview(body);

// TODO: test validations
    }

    /**
     * Enrolls the item indicated by the specified seller SKU in the Small and Light program in the specified
     * marketplace. If the item is not eligible, the ineligibility reasons are returned.  **Usage Plan:**  | Rate
     * (requests per second) | Burst | | ---- | ---- | | 2 | 5 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header
     * returns the usage plan rate limits that were applied to the requested operation, when available. The table above
     * indicates the default rate and burst values for this operation. Selling partners whose business demands require
     * higher throughput may see higher rate and burst values than those shown here. For more information, see [Usage
     * Plans and Rate Limits in the Selling Partner
     * API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).
     *
     * @throws ApiException if the Api call fails
     * @throws LWAException If calls to fetch LWA access token fails
     */
    @Test
    public void putSmallAndLightEnrollmentBySellerSKUTest() throws ApiException, LWAException {
        String sellerSKU = null;
        List<String> marketplaceIds = null;
        SmallAndLightEnrollment response = api.putSmallAndLightEnrollmentBySellerSKU(sellerSKU, marketplaceIds);

// TODO: test validations
    }

}