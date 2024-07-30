/*
 * Selling Partner API for FBA Inbound Eligibilty
 * With the FBA Inbound Eligibility API, you can build applications that let sellers get eligibility previews for items before shipping them to Amazon's fulfillment centers. With this API you can find out if an item is eligible for inbound shipment to Amazon's fulfillment centers in a specific marketplace. You can also find out if an item is eligible for using the manufacturer barcode for FBA inventory tracking. Sellers can use this information to inform their decisions about which items to ship Amazon's fulfillment centers.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.api;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import com.amazon.spapi.SellingPartnerAPIAA.LWAException;
import com.amazon.spapi.client.ApiException;
import com.amazon.spapi.model.fbainboundeligibility.GetItemEligibilityPreviewResponse;

/**
* API tests for FbaInboundApi
*/
@Ignore
public class FbaInboundEligibilityApiTest {

private final FbaInboundEligibilityApi api = new FbaInboundEligibilityApi();


/**
* 
*
* This operation gets an eligibility preview for an item that you specify. You can specify the type of eligibility preview that you want (INBOUND or COMMINGLING). For INBOUND previews, you can specify the marketplace in which you want to determine the item&#39;s eligibility.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 1 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).
*
* @throws ApiException if the Api call fails
* @throws LWAException If calls to fetch LWA access token fails
*/
@Test
public void getItemEligibilityPreviewTest() throws ApiException, LWAException {
    String asin = null;
    String program = null;
    List<String> marketplaceIds = null;
GetItemEligibilityPreviewResponse response = api.getItemEligibilityPreview(asin, program, marketplaceIds);

// TODO: test validations
}

}