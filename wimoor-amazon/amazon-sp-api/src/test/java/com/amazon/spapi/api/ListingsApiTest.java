/*
 * Selling Partner API for Listings Items
 * The Selling Partner API for Listings Items (Listings Items API) provides programmatic access to selling partner listings on Amazon. Use this API in collaboration with the Selling Partner API for Product Type Definitions, which you use to retrieve the information about Amazon product types needed to use the Listings Items API.  For more information, see the [Listings Items API Use Case Guide](https://developer-docs.amazon.com/sp-api/docs/listings-items-api-v2021-08-01-use-case-guide).
 *
 * OpenAPI spec version: 2021-08-01
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.api;

import com.amazon.spapi.SellingPartnerAPIAA.LWAException;
import com.amazon.spapi.client.ApiException;
import com.amazon.spapi.model.listings.Item;
import com.amazon.spapi.model.listings.ListingsItemPatchRequest;
import com.amazon.spapi.model.listings.ListingsItemPutRequest;
import com.amazon.spapi.model.listings.ListingsItemSubmissionResponse;
import java.util.List;
import org.junit.Ignore;
import org.junit.Test;

/**
 * API tests for ListingsApi
 */
@Ignore
public class ListingsApiTest {

    private final ListingsApi api = new ListingsApi();


    /**
     * Delete a listings item for a selling partner.  **Note:** The parameters associated with this operation may
     * contain special characters that must be encoded to successfully call the API. To avoid errors with SKUs when
     * encoding URLs, refer to [URL Encoding](https://developer-docs.amazon.com/sp-api/docs/url-encoding).  **Usage
     * Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 10 |  The
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
    public void deleteListingsItemTest() throws ApiException, LWAException {
        String sellerId = null;
        String sku = null;
        List<String> marketplaceIds = null;
        String issueLocale = null;
        ListingsItemSubmissionResponse response = api.deleteListingsItem(sellerId, sku, marketplaceIds, issueLocale);

// TODO: test validations
    }

    /**
     * Returns details about a listings item for a selling partner.  **Note:** The parameters associated with this
     * operation may contain special characters that must be encoded to successfully call the API. To avoid errors with
     * SKUs when encoding URLs, refer to [URL Encoding](https://developer-docs.amazon.com/sp-api/docs/url-encoding).
     * **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 10 |  The
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
    public void getListingsItemTest() throws ApiException, LWAException {
        String sellerId = null;
        String sku = null;
        List<String> marketplaceIds = null;
        String issueLocale = null;
        List<String> includedData = null;
        Item response = api.getListingsItem(sellerId, sku, marketplaceIds, issueLocale, includedData);

// TODO: test validations
    }

    /**
     * Partially update (patch) a listings item for a selling partner. Only top-level listings item attributes can be
     * patched. Patching nested attributes is not supported.  **Note:** The parameters associated with this operation
     * may contain special characters that must be encoded to successfully call the API. To avoid errors with SKUs when
     * encoding URLs, refer to [URL Encoding](https://developer-docs.amazon.com/sp-api/docs/url-encoding).  **Usage
     * Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 10 |  The
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
    public void patchListingsItemTest() throws ApiException, LWAException {
        String sellerId = null;
        String sku = null;
        List<String> marketplaceIds = null;
        ListingsItemPatchRequest body = null;
        String issueLocale = null;
        ListingsItemSubmissionResponse response = api.patchListingsItem(sellerId, sku, marketplaceIds, body,
                issueLocale);

// TODO: test validations
    }

    /**
     * Creates or fully updates an existing listings item for a selling partner.  **Note:** The parameters associated
     * with this operation may contain special characters that must be encoded to successfully call the API. To avoid
     * errors with SKUs when encoding URLs, refer to [URL
     * Encoding](https://developer-docs.amazon.com/sp-api/docs/url-encoding).  **Usage Plan:**  | Rate (requests per
     * second) | Burst | | ---- | ---- | | 5 | 10 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the
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
    public void putListingsItemTest() throws ApiException, LWAException {
        String sellerId = null;
        String sku = null;
        List<String> marketplaceIds = null;
        ListingsItemPutRequest body = null;
        String issueLocale = null;
        ListingsItemSubmissionResponse response = api.putListingsItem(sellerId, sku, marketplaceIds, body, issueLocale);

// TODO: test validations
    }

}