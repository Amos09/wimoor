/*
 * Selling Partner API for Solicitations
 * With the Solicitations API you can build applications that send non-critical solicitations to buyers. You can get a list of solicitation types that are available for an order that you specify, then call an operation that sends a solicitation to the buyer for that order. Buyers cannot respond to solicitations sent by this API, and these solicitations do not appear in the Messaging section of Seller Central or in the recipient's Message Center. The Solicitations API returns responses that are formed according to the <a href=https://tools.ietf.org/html/draft-kelly-json-hal-08>JSON Hypertext Application Language</a> (HAL) standard.
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
import com.amazon.spapi.model.solicitations.CreateProductReviewAndSellerFeedbackSolicitationResponse;
import com.amazon.spapi.model.solicitations.GetSolicitationActionsForOrderResponse;

/**
* API tests for SolicitationsApi
*/
@Ignore
public class SolicitationsApiTest {

private final SolicitationsApi api = new SolicitationsApi();


/**
* 
*
* Sends a solicitation to a buyer asking for seller feedback and a product review for the specified order. Send only one productReviewAndSellerFeedback or free form proactive message per order.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).
*
* @throws ApiException if the Api call fails
* @throws LWAException If calls to fetch LWA access token fails
*/
@Test
public void createProductReviewAndSellerFeedbackSolicitationTest() throws ApiException, LWAException {
    String amazonOrderId = null;
    List<String> marketplaceIds = null;
CreateProductReviewAndSellerFeedbackSolicitationResponse response = api.createProductReviewAndSellerFeedbackSolicitation(amazonOrderId, marketplaceIds);

// TODO: test validations
}

/**
* 
*
* Returns a list of solicitation types that are available for an order that you specify. A solicitation type is represented by an actions object, which contains a path and query parameter(s). You can use the path and parameter(s) to call an operation that sends a solicitation. Currently only the productReviewAndSellerFeedbackSolicitation solicitation type is available.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).
*
* @throws ApiException if the Api call fails
* @throws LWAException If calls to fetch LWA access token fails
*/
@Test
public void getSolicitationActionsForOrderTest() throws ApiException, LWAException {
    String amazonOrderId = null;
    List<String> marketplaceIds = null;
GetSolicitationActionsForOrderResponse response = api.getSolicitationActionsForOrder(amazonOrderId, marketplaceIds);

// TODO: test validations
}

}