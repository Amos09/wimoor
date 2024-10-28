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


package com.amazon.spapi.api;

import com.amazon.spapi.SellingPartnerAPIAA.LWAException;
import com.amazon.spapi.client.ApiException;
import com.amazon.spapi.model.services.AddAppointmentRequest;
import com.amazon.spapi.model.services.AssignAppointmentResourcesRequest;
import com.amazon.spapi.model.services.AssignAppointmentResourcesResponse;
import com.amazon.spapi.model.services.CancelReservationResponse;
import com.amazon.spapi.model.services.CancelServiceJobByServiceJobIdResponse;
import com.amazon.spapi.model.services.CompleteServiceJobByServiceJobIdResponse;
import com.amazon.spapi.model.services.CreateReservationRequest;
import com.amazon.spapi.model.services.CreateReservationResponse;
import com.amazon.spapi.model.services.CreateServiceDocumentUploadDestination;
import com.amazon.spapi.model.services.FixedSlotCapacity;
import com.amazon.spapi.model.services.FixedSlotCapacityQuery;
import com.amazon.spapi.model.services.GetAppointmentSlotsResponse;
import com.amazon.spapi.model.services.GetServiceJobByServiceJobIdResponse;
import com.amazon.spapi.model.services.GetServiceJobsResponse;
import com.amazon.spapi.model.services.RangeSlotCapacity;
import com.amazon.spapi.model.services.RangeSlotCapacityQuery;
import com.amazon.spapi.model.services.RescheduleAppointmentRequest;
import com.amazon.spapi.model.services.ServiceUploadDocument;
import com.amazon.spapi.model.services.SetAppointmentFulfillmentDataRequest;
import com.amazon.spapi.model.services.SetAppointmentResponse;
import com.amazon.spapi.model.services.UpdateReservationRequest;
import com.amazon.spapi.model.services.UpdateReservationResponse;
import com.amazon.spapi.model.services.UpdateScheduleRequest;
import com.amazon.spapi.model.services.UpdateScheduleResponse;
import java.util.List;
import org.junit.Ignore;
import org.junit.Test;

/**
 * API tests for ServiceApi
 */
@Ignore
public class ServiceApiTest {

    private final ServiceApi api = new ServiceApi();


    /**
     * Adds an appointment to the service job indicated by the service job identifier specified.  **Usage Plan:**  |
     * Rate (requests per second) | Burst | | ---- | ---- | | 5 | 20 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response
     * header returns the usage plan rate limits that were applied to the requested operation, when available. The table
     * above indicates the default rate and burst values for this operation. Selling partners whose business demands
     * require higher throughput may see higher rate and burst values than those shown here. For more information, see
     * [Usage Plans and Rate Limits in the Selling Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).
     *
     * @throws ApiException if the Api call fails
     * @throws LWAException If calls to fetch LWA access token fails
     */
    @Test
    public void addAppointmentForServiceJobByServiceJobIdTest() throws ApiException, LWAException {
        String serviceJobId = null;
        AddAppointmentRequest body = null;
        SetAppointmentResponse response = api.addAppointmentForServiceJobByServiceJobId(serviceJobId, body);

// TODO: test validations
    }

    /**
     * Assigns new resource(s) or overwrite/update the existing one(s) to a service job appointment.  **Usage Plan:**  |
     * Rate (requests per second) | Burst | | ---- | ---- | | 1 | 2 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response
     * header returns the usage plan rate limits that were applied to the requested operation, when available. The table
     * above indicates the default rate and burst values for this operation. Selling partners whose business demands
     * require higher throughput may see higher rate and burst values than those shown here. For more information, see
     * [Usage Plans and Rate Limits in the Selling Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).
     *
     * @throws ApiException if the Api call fails
     * @throws LWAException If calls to fetch LWA access token fails
     */
    @Test
    public void assignAppointmentResourcesTest() throws ApiException, LWAException {
        String serviceJobId = null;
        String appointmentId = null;
        AssignAppointmentResourcesRequest body = null;
        AssignAppointmentResourcesResponse response = api.assignAppointmentResources(serviceJobId, appointmentId, body);

// TODO: test validations
    }

    /**
     * Cancel a reservation.   **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 20 |  The
     * &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the
     * requested operation, when available. The table above indicates the default rate and burst values for this
     * operation. Selling partners whose business demands require higher throughput may see higher rate and burst values
     * than those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner
     * API](doc:usage-plans-and-rate-limits-in-the-sp-api).
     *
     * @throws ApiException if the Api call fails
     * @throws LWAException If calls to fetch LWA access token fails
     */
    @Test
    public void cancelReservationTest() throws ApiException, LWAException {
        String reservationId = null;
        List<String> marketplaceIds = null;
        CancelReservationResponse response = api.cancelReservation(reservationId, marketplaceIds);

// TODO: test validations
    }

    /**
     * Cancels the service job indicated by the service job identifier specified.  **Usage Plan:**  | Rate (requests per
     * second) | Burst | | ---- | ---- | | 5 | 20 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the
     * usage plan rate limits that were applied to the requested operation, when available. The table above indicates
     * the default rate and burst values for this operation. Selling partners whose business demands require higher
     * throughput may see higher rate and burst values than those shown here. For more information, see [Usage Plans and
     * Rate Limits in the Selling Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).
     *
     * @throws ApiException if the Api call fails
     * @throws LWAException If calls to fetch LWA access token fails
     */
    @Test
    public void cancelServiceJobByServiceJobIdTest() throws ApiException, LWAException {
        String serviceJobId = null;
        String cancellationReasonCode = null;
        CancelServiceJobByServiceJobIdResponse response = api.cancelServiceJobByServiceJobId(serviceJobId,
                cancellationReasonCode);

// TODO: test validations
    }

    /**
     * Completes the service job indicated by the service job identifier specified.  **Usage Plan:**  | Rate (requests
     * per second) | Burst | | ---- | ---- | | 5 | 20 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns
     * the usage plan rate limits that were applied to the requested operation, when available. The table above
     * indicates the default rate and burst values for this operation. Selling partners whose business demands require
     * higher throughput may see higher rate and burst values than those shown here. For more information, see [Usage
     * Plans and Rate Limits in the Selling Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).
     *
     * @throws ApiException if the Api call fails
     * @throws LWAException If calls to fetch LWA access token fails
     */
    @Test
    public void completeServiceJobByServiceJobIdTest() throws ApiException, LWAException {
        String serviceJobId = null;
        CompleteServiceJobByServiceJobIdResponse response = api.completeServiceJobByServiceJobId(serviceJobId);

// TODO: test validations
    }

    /**
     * Create a reservation.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 20 |  The
     * &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the
     * requested operation, when available. The table above indicates the default rate and burst values for this
     * operation. Selling partners whose business demands require higher throughput may see higher rate and burst values
     * than those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner
     * API](doc:usage-plans-and-rate-limits-in-the-sp-api).
     *
     * @throws ApiException if the Api call fails
     * @throws LWAException If calls to fetch LWA access token fails
     */
    @Test
    public void createReservationTest() throws ApiException, LWAException {
        CreateReservationRequest body = null;
        List<String> marketplaceIds = null;
        CreateReservationResponse response = api.createReservation(body, marketplaceIds);

// TODO: test validations
    }

    /**
     * Creates an upload destination.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 20
     * |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to
     * the requested operation, when available. The table above indicates the default rate and burst values for this
     * operation. Selling partners whose business demands require higher throughput may see higher rate and burst values
     * than those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner
     * API](doc:usage-plans-and-rate-limits-in-the-sp-api).
     *
     * @throws ApiException if the Api call fails
     * @throws LWAException If calls to fetch LWA access token fails
     */
    @Test
    public void createServiceDocumentUploadDestinationTest() throws ApiException, LWAException {
        ServiceUploadDocument body = null;
        CreateServiceDocumentUploadDestination response = api.createServiceDocumentUploadDestination(body);

// TODO: test validations
    }

    /**
     * Gets appointment slots as per the service context specified.  **Usage Plan:**  | Rate (requests per second) |
     * Burst | | ---- | ---- | | 20 | 40 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage
     * plan rate limits that were applied to the requested operation, when available. The table above indicates the
     * default rate and burst values for this operation. Selling partners whose business demands require higher
     * throughput may see higher rate and burst values than those shown here. For more information, see [Usage Plans and
     * Rate Limits in the Selling Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).
     *
     * @throws ApiException if the Api call fails
     * @throws LWAException If calls to fetch LWA access token fails
     */
    @Test
    public void getAppointmentSlotsTest() throws ApiException, LWAException {
        String asin = null;
        String storeId = null;
        List<String> marketplaceIds = null;
        String startTime = null;
        String endTime = null;
        GetAppointmentSlotsResponse response = api.getAppointmentSlots(asin, storeId, marketplaceIds, startTime,
                endTime);

// TODO: test validations
    }

    /**
     * Gets appointment slots for the service associated with the service job id specified.  **Usage Plan:**  | Rate
     * (requests per second) | Burst | | ---- | ---- | | 5 | 20 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response
     * header returns the usage plan rate limits that were applied to the requested operation, when available. The table
     * above indicates the default rate and burst values for this operation. Selling partners whose business demands
     * require higher throughput may see higher rate and burst values than those shown here. For more information, see
     * [Usage Plans and Rate Limits in the Selling Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).
     *
     * @throws ApiException if the Api call fails
     * @throws LWAException If calls to fetch LWA access token fails
     */
    @Test
    public void getAppointmmentSlotsByJobIdTest() throws ApiException, LWAException {
        String serviceJobId = null;
        List<String> marketplaceIds = null;
        String startTime = null;
        String endTime = null;
        GetAppointmentSlotsResponse response = api.getAppointmmentSlotsByJobId(serviceJobId, marketplaceIds, startTime,
                endTime);

// TODO: test validations
    }

    /**
     * Provides capacity in fixed-size slots.   **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- |
     * | 5 | 20 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were
     * applied to the requested operation, when available. The table above indicates the default rate and burst values
     * for this operation. Selling partners whose business demands require higher throughput may see higher rate and
     * burst values than those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner
     * API](doc:usage-plans-and-rate-limits-in-the-sp-api).
     *
     * @throws ApiException if the Api call fails
     * @throws LWAException If calls to fetch LWA access token fails
     */
    @Test
    public void getFixedSlotCapacityTest() throws ApiException, LWAException {
        String resourceId = null;
        FixedSlotCapacityQuery body = null;
        List<String> marketplaceIds = null;
        String nextPageToken = null;
        FixedSlotCapacity response = api.getFixedSlotCapacity(resourceId, body, marketplaceIds, nextPageToken);

// TODO: test validations
    }

    /**
     * Provides capacity slots in a format similar to availability records.  **Usage Plan:**  | Rate (requests per
     * second) | Burst | | ---- | ---- | | 5 | 20 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the
     * usage plan rate limits that were applied to the requested operation, when available. The table above indicates
     * the default rate and burst values for this operation. Selling partners whose business demands require higher
     * throughput may see higher rate and burst values than those shown here. For more information, see [Usage Plans and
     * Rate Limits in the Selling Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).
     *
     * @throws ApiException if the Api call fails
     * @throws LWAException If calls to fetch LWA access token fails
     */
    @Test
    public void getRangeSlotCapacityTest() throws ApiException, LWAException {
        String resourceId = null;
        RangeSlotCapacityQuery body = null;
        List<String> marketplaceIds = null;
        String nextPageToken = null;
        RangeSlotCapacity response = api.getRangeSlotCapacity(resourceId, body, marketplaceIds, nextPageToken);

// TODO: test validations
    }

    /**
     * Gets details of service job indicated by the provided &#x60;serviceJobID&#x60;.  **Usage Plan:**  | Rate
     * (requests per second) | Burst | | ---- | ---- | | 20 | 40 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response
     * header returns the usage plan rate limits that were applied to the requested operation, when available. The table
     * above indicates the default rate and burst values for this operation. Selling partners whose business demands
     * require higher throughput may see higher rate and burst values than those shown here. For more information, see
     * [Usage Plans and Rate Limits in the Selling Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).
     *
     * @throws ApiException if the Api call fails
     * @throws LWAException If calls to fetch LWA access token fails
     */
    @Test
    public void getServiceJobByServiceJobIdTest() throws ApiException, LWAException {
        String serviceJobId = null;
        GetServiceJobByServiceJobIdResponse response = api.getServiceJobByServiceJobId(serviceJobId);

// TODO: test validations
    }

    /**
     * Gets service job details for the specified filter query.  **Usage Plan:**  | Rate (requests per second) | Burst |
     * | ---- | ---- | | 10 | 40 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate
     * limits that were applied to the requested operation, when available. The table above indicates the default rate
     * and burst values for this operation. Selling partners whose business demands require higher throughput may see
     * higher rate and burst values than those shown here. For more information, see [Usage Plans and Rate Limits in the
     * Selling Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).
     *
     * @throws ApiException if the Api call fails
     * @throws LWAException If calls to fetch LWA access token fails
     */
    @Test
    public void getServiceJobsTest() throws ApiException, LWAException {
        List<String> marketplaceIds = null;
        List<String> serviceOrderIds = null;
        List<String> serviceJobStatus = null;
        String pageToken = null;
        Integer pageSize = null;
        String sortField = null;
        String sortOrder = null;
        String createdAfter = null;
        String createdBefore = null;
        String lastUpdatedAfter = null;
        String lastUpdatedBefore = null;
        String scheduleStartDate = null;
        String scheduleEndDate = null;
        List<String> asins = null;
        List<String> requiredSkills = null;
        List<String> storeIds = null;
        GetServiceJobsResponse response = api.getServiceJobs(marketplaceIds, serviceOrderIds, serviceJobStatus,
                pageToken, pageSize, sortField, sortOrder, createdAfter, createdBefore, lastUpdatedAfter,
                lastUpdatedBefore, scheduleStartDate, scheduleEndDate, asins, requiredSkills, storeIds);

// TODO: test validations
    }

    /**
     * Reschedules an appointment for the service job indicated by the service job identifier specified.  **Usage
     * Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 20 |  The
     * &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the
     * requested operation, when available. The table above indicates the default rate and burst values for this
     * operation. Selling partners whose business demands require higher throughput may see higher rate and burst values
     * than those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner
     * API](doc:usage-plans-and-rate-limits-in-the-sp-api).
     *
     * @throws ApiException if the Api call fails
     * @throws LWAException If calls to fetch LWA access token fails
     */
    @Test
    public void rescheduleAppointmentForServiceJobByServiceJobIdTest() throws ApiException, LWAException {
        String serviceJobId = null;
        String appointmentId = null;
        RescheduleAppointmentRequest body = null;
        SetAppointmentResponse response = api.rescheduleAppointmentForServiceJobByServiceJobId(serviceJobId,
                appointmentId, body);

// TODO: test validations
    }

    /**
     * Updates the appointment fulfillment data related to a given &#x60;jobID&#x60; and &#x60;appointmentID&#x60;.
     * **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 20 |  The
     * &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the
     * requested operation, when available. The table above indicates the default rate and burst values for this
     * operation. Selling partners whose business demands require higher throughput may see higher rate and burst values
     * than those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner
     * API](doc:usage-plans-and-rate-limits-in-the-sp-api).
     *
     * @throws ApiException if the Api call fails
     * @throws LWAException If calls to fetch LWA access token fails
     */
    @Test
    public void setAppointmentFulfillmentDataTest() throws ApiException, LWAException {
        String serviceJobId = null;
        String appointmentId = null;
        SetAppointmentFulfillmentDataRequest body = null;
        String response = api.setAppointmentFulfillmentData(serviceJobId, appointmentId, body);

// TODO: test validations
    }

    /**
     * Update a reservation.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 20 |  The
     * &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the
     * requested operation, when available. The table above indicates the default rate and burst values for this
     * operation. Selling partners whose business demands require higher throughput may see higher rate and burst values
     * than those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner
     * API](doc:usage-plans-and-rate-limits-in-the-sp-api).
     *
     * @throws ApiException if the Api call fails
     * @throws LWAException If calls to fetch LWA access token fails
     */
    @Test
    public void updateReservationTest() throws ApiException, LWAException {
        String reservationId = null;
        UpdateReservationRequest body = null;
        List<String> marketplaceIds = null;
        UpdateReservationResponse response = api.updateReservation(reservationId, body, marketplaceIds);

// TODO: test validations
    }

    /**
     * Update the schedule of the given resource.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ----
     * | | 5 | 20 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were
     * applied to the requested operation, when available. The table above indicates the default rate and burst values
     * for this operation. Selling partners whose business demands require higher throughput may see higher rate and
     * burst values than those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner
     * API](doc:usage-plans-and-rate-limits-in-the-sp-api).
     *
     * @throws ApiException if the Api call fails
     * @throws LWAException If calls to fetch LWA access token fails
     */
    @Test
    public void updateScheduleTest() throws ApiException, LWAException {
        String resourceId = null;
        UpdateScheduleRequest body = null;
        List<String> marketplaceIds = null;
        UpdateScheduleResponse response = api.updateSchedule(resourceId, body, marketplaceIds);

// TODO: test validations
    }

}