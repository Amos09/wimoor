/*
 * Selling Partner API for Orders
 * The Selling Partner API for Orders helps you programmatically retrieve order information. These APIs let you develop fast, flexible, custom applications in areas like order synchronization, order research, and demand-based decision support tools. The Orders API supports orders that are two years old or less. Orders more than two years old will not show in the API response.  _Note:_ The Orders API supports orders from 2016 and after for the JP, AU, and SG marketplaces.
 *
 * OpenAPI spec version: v0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.api;

import com.amazon.spapi.SellingPartnerAPIAA.LWAException;
import com.amazon.spapi.client.ApiException;
import com.amazon.spapi.model.orders.ConfirmShipmentRequest;
import com.amazon.spapi.model.orders.GetOrderAddressResponse;
import com.amazon.spapi.model.orders.GetOrderBuyerInfoResponse;
import com.amazon.spapi.model.orders.GetOrderItemsBuyerInfoResponse;
import com.amazon.spapi.model.orders.GetOrderItemsResponse;
import com.amazon.spapi.model.orders.GetOrderRegulatedInfoResponse;
import com.amazon.spapi.model.orders.GetOrderResponse;
import com.amazon.spapi.model.orders.GetOrdersResponse;
import com.amazon.spapi.model.orders.UpdateVerificationStatusRequest;
import java.util.List;
import org.junit.Ignore;
import org.junit.Test;

/**
 * API tests for OrdersV0Api
 */
@Ignore
public class OrdersV0ApiTest {

    private final OrdersV0Api api = new OrdersV0Api();


    /**
     * Updates the shipment confirmation status for a specified order.  **Usage Plan:**  | Rate (requests per second) |
     * Burst | | ---- | ---- | | 2 | 10 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan
     * rate limits that were applied to the requested operation, when available. The table above indicates the default
     * rate and burst values for this operation. Selling partners whose business demands require higher throughput may
     * see higher rate and burst values then those shown here. For more information, see [Usage Plans and Rate Limits in
     * the Selling Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).
     *
     * @throws ApiException if the Api call fails
     * @throws LWAException If calls to fetch LWA access token fails
     */
    @Test
    public void confirmShipmentTest() throws ApiException, LWAException {
        String orderId = null;
        ConfirmShipmentRequest payload = null;
        api.confirmShipment(orderId, payload);

// TODO: test validations
    }

    /**
     * Returns the order that you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | |
     * 0.0167 | 20 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that
     * were applied to the requested operation, when available. The table above indicates the default rate and burst
     * values for this operation. Selling partners whose business demands require higher throughput may see higher rate
     * and burst values then those shown here. For more information, see [Usage Plans and Rate Limits in the Selling
     * Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).
     *
     * @throws ApiException if the Api call fails
     * @throws LWAException If calls to fetch LWA access token fails
     */
    @Test
    public void getOrderTest() throws ApiException, LWAException {
        String orderId = null;
        GetOrderResponse response = api.getOrder(orderId);

// TODO: test validations
    }

    /**
     * Returns the shipping address for the order that you specify.  **Usage Plan:**  | Rate (requests per second) |
     * Burst | | ---- | ---- | | 0.0167 | 20 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage
     * plan rate limits that were applied to the requested operation, when available. The table above indicates the
     * default rate and burst values for this operation. Selling partners whose business demands require higher
     * throughput may see higher rate and burst values then those shown here. For more information, see [Usage Plans and
     * Rate Limits in the Selling Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).
     *
     * @throws ApiException if the Api call fails
     * @throws LWAException If calls to fetch LWA access token fails
     */
    @Test
    public void getOrderAddressTest() throws ApiException, LWAException {
        String orderId = null;
        GetOrderAddressResponse response = api.getOrderAddress(orderId);

// TODO: test validations
    }

    /**
     * Returns buyer information for the order that you specify.  **Usage Plan:**  | Rate (requests per second) | Burst
     * | | ---- | ---- | | 0.0167 | 20 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan
     * rate limits that were applied to the requested operation, when available. The table above indicates the default
     * rate and burst values for this operation. Selling partners whose business demands require higher throughput may
     * see higher rate and burst values then those shown here. For more information, see [Usage Plans and Rate Limits in
     * the Selling Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).
     *
     * @throws ApiException if the Api call fails
     * @throws LWAException If calls to fetch LWA access token fails
     */
    @Test
    public void getOrderBuyerInfoTest() throws ApiException, LWAException {
        String orderId = null;
        GetOrderBuyerInfoResponse response = api.getOrderBuyerInfo(orderId);

// TODO: test validations
    }

    /**
     * Returns detailed order item information for the order that you specify. If NextToken is provided, it&#39;s used
     * to retrieve the next page of order items.  __Note__: When an order is in the Pending state (the order has been
     * placed but payment has not been authorized), the getOrderItems operation does not return information about
     * pricing, taxes, shipping charges, gift status or promotions for the order items in the order. After an order
     * leaves the Pending state (this occurs when payment has been authorized) and enters the Unshipped, Partially
     * Shipped, or Shipped state, the getOrderItems operation returns information about pricing, taxes, shipping
     * charges, gift status and promotions for the order items in the order.  **Usage Plan:**  | Rate (requests per
     * second) | Burst | | ---- | ---- | | 0.5 | 30 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns
     * the usage plan rate limits that were applied to the requested operation, when available. The table above
     * indicates the default rate and burst values for this operation. Selling partners whose business demands require
     * higher throughput may see higher rate and burst values then those shown here. For more information, see [Usage
     * Plans and Rate Limits in the Selling Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).
     *
     * @throws ApiException if the Api call fails
     * @throws LWAException If calls to fetch LWA access token fails
     */
    @Test
    public void getOrderItemsTest() throws ApiException, LWAException {
        String orderId = null;
        String nextToken = null;
        GetOrderItemsResponse response = api.getOrderItems(orderId, nextToken);

// TODO: test validations
    }

    /**
     * Returns buyer information for the order items in the order that you specify.  **Usage Plan:**  | Rate (requests
     * per second) | Burst | | ---- | ---- | | 0.5 | 30 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header
     * returns the usage plan rate limits that were applied to the requested operation, when available. The table above
     * indicates the default rate and burst values for this operation. Selling partners whose business demands require
     * higher throughput may see higher rate and burst values then those shown here. For more information, see [Usage
     * Plans and Rate Limits in the Selling Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).
     *
     * @throws ApiException if the Api call fails
     * @throws LWAException If calls to fetch LWA access token fails
     */
    @Test
    public void getOrderItemsBuyerInfoTest() throws ApiException, LWAException {
        String orderId = null;
        String nextToken = null;
        GetOrderItemsBuyerInfoResponse response = api.getOrderItemsBuyerInfo(orderId, nextToken);

// TODO: test validations
    }

    /**
     * Returns regulated information for the order that you specify.  **Usage Plan:**  | Rate (requests per second) |
     * Burst | | ---- | ---- | | 0.5 | 30 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage
     * plan rate limits that were applied to the requested operation, when available. The table above indicates the
     * default rate and burst values for this operation. Selling partners whose business demands require higher
     * throughput may see higher rate and burst values then those shown here. For more information, see [Usage Plans and
     * Rate Limits in the Selling Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).
     *
     * @throws ApiException if the Api call fails
     * @throws LWAException If calls to fetch LWA access token fails
     */
    @Test
    public void getOrderRegulatedInfoTest() throws ApiException, LWAException {
        String orderId = null;
        GetOrderRegulatedInfoResponse response = api.getOrderRegulatedInfo(orderId);

// TODO: test validations
    }

    /**
     * Returns orders created or updated during the time frame indicated by the specified parameters. You can also apply
     * a range of filtering criteria to narrow the list of orders returned. If NextToken is present, that will be used
     * to retrieve the orders instead of other criteria.  **Usage Plan:**  | Rate (requests per second) | Burst | | ----
     * | ---- | | 0.0167 | 20 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate
     * limits that were applied to the requested operation, when available. The table above indicates the default rate
     * and burst values for this operation. Selling partners whose business demands require higher throughput may see
     * higher rate and burst values then those shown here. For more information, see [Usage Plans and Rate Limits in the
     * Selling Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).
     *
     * @throws ApiException if the Api call fails
     * @throws LWAException If calls to fetch LWA access token fails
     */
    @Test
    public void getOrdersTest() throws ApiException, LWAException {
        List<String> marketplaceIds = null;
        String createdAfter = null;
        String createdBefore = null;
        String lastUpdatedAfter = null;
        String lastUpdatedBefore = null;
        List<String> orderStatuses = null;
        List<String> fulfillmentChannels = null;
        List<String> paymentMethods = null;
        String buyerEmail = null;
        String sellerOrderId = null;
        Integer maxResultsPerPage = null;
        List<String> easyShipShipmentStatuses = null;
        List<String> electronicInvoiceStatuses = null;
        String nextToken = null;
        List<String> amazonOrderIds = null;
        String actualFulfillmentSupplySourceId = null;
        Boolean isISPU = null;
        String storeChainStoreId = null;
        String earliestDeliveryDateBefore = null;
        String earliestDeliveryDateAfter = null;
        String latestDeliveryDateBefore = null;
        String latestDeliveryDateAfter = null;
        GetOrdersResponse response = api.getOrders(marketplaceIds, createdAfter, createdBefore, lastUpdatedAfter,
                lastUpdatedBefore, orderStatuses, fulfillmentChannels, paymentMethods, buyerEmail, sellerOrderId,
                maxResultsPerPage, easyShipShipmentStatuses, electronicInvoiceStatuses, nextToken, amazonOrderIds,
                actualFulfillmentSupplySourceId, isISPU, storeChainStoreId, earliestDeliveryDateBefore,
                earliestDeliveryDateAfter, latestDeliveryDateBefore, latestDeliveryDateAfter);

// TODO: test validations
    }

    /**
     * Updates (approves or rejects) the verification status of an order containing regulated products.  **Usage Plan:**
     *  | Rate (requests per second) | Burst | | ---- | ---- | | 0.5 | 30 |  The &#x60;x-amzn-RateLimit-Limit&#x60;
     * response header returns the usage plan rate limits that were applied to the requested operation, when available.
     * The table above indicates the default rate and burst values for this operation. Selling partners whose business
     * demands require higher throughput may see higher rate and burst values then those shown here. For more
     * information, see [Usage Plans and Rate Limits in the Selling Partner
     * API](doc:usage-plans-and-rate-limits-in-the-sp-api).
     *
     * @throws ApiException if the Api call fails
     * @throws LWAException If calls to fetch LWA access token fails
     */
    @Test
    public void updateVerificationStatusTest() throws ApiException, LWAException {
        String orderId = null;
        UpdateVerificationStatusRequest payload = null;
        api.updateVerificationStatus(orderId, payload);

// TODO: test validations
    }

}