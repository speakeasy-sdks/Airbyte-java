/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package WayScript.airbyte_test;

import WayScript.airbyte_test.utils.HTTPClient;
import WayScript.airbyte_test.utils.HTTPRequest;
import WayScript.airbyte_test.utils.JSON;
import WayScript.airbyte_test.utils.SerializedBody;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

public class Internal {
	
	private SDKConfiguration sdkConfiguration;

	public Internal(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Create or update the state for a connection.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public WayScript.airbyte_test.models.operations.CreateOrUpdateStateResponse createOrUpdateState(WayScript.airbyte_test.models.shared.ConnectionStateCreateOrUpdate request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = WayScript.airbyte_test.utils.Utils.generateURL(baseUrl, "/v1/state/create_or_update");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = WayScript.airbyte_test.utils.Utils.serializeRequestBody(request, "request", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0.7, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion));
        
        HTTPClient client = this.sdkConfiguration.defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        WayScript.airbyte_test.models.operations.CreateOrUpdateStateResponse res = new WayScript.airbyte_test.models.operations.CreateOrUpdateStateResponse(contentType, httpRes.statusCode()) {{
            connectionState = null;
            notFoundKnownExceptionInfo = null;
            invalidInputExceptionInfo = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (WayScript.airbyte_test.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                WayScript.airbyte_test.models.shared.ConnectionState out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), WayScript.airbyte_test.models.shared.ConnectionState.class);
                res.connectionState = out;
            }
        }
        else if (httpRes.statusCode() == 404) {
            if (WayScript.airbyte_test.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                WayScript.airbyte_test.models.shared.NotFoundKnownExceptionInfo out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), WayScript.airbyte_test.models.shared.NotFoundKnownExceptionInfo.class);
                res.notFoundKnownExceptionInfo = out;
            }
        }
        else if (httpRes.statusCode() == 422) {
            if (WayScript.airbyte_test.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                WayScript.airbyte_test.models.shared.InvalidInputExceptionInfo out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), WayScript.airbyte_test.models.shared.InvalidInputExceptionInfo.class);
                res.invalidInputExceptionInfo = out;
            }
        }

        return res;
    }

    /**
     * Get normalization status to determine if we can bypass normalization phase
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public WayScript.airbyte_test.models.operations.GetAttemptNormalizationStatusesForJobResponse getAttemptNormalizationStatusesForJob(WayScript.airbyte_test.models.shared.JobIdRequestBody request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = WayScript.airbyte_test.utils.Utils.generateURL(baseUrl, "/v1/jobs/get_normalization_status");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = WayScript.airbyte_test.utils.Utils.serializeRequestBody(request, "request", "json");
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion));
        
        HTTPClient client = this.sdkConfiguration.defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        WayScript.airbyte_test.models.operations.GetAttemptNormalizationStatusesForJobResponse res = new WayScript.airbyte_test.models.operations.GetAttemptNormalizationStatusesForJobResponse(contentType, httpRes.statusCode()) {{
            attemptNormalizationStatusReadList = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (WayScript.airbyte_test.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                WayScript.airbyte_test.models.shared.AttemptNormalizationStatusReadList out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), WayScript.airbyte_test.models.shared.AttemptNormalizationStatusReadList.class);
                res.attemptNormalizationStatusReadList = out;
            }
        }

        return res;
    }

    /**
     * For worker to set sync stats of a running attempt.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public WayScript.airbyte_test.models.operations.SaveStatsResponse saveStats(WayScript.airbyte_test.models.shared.SaveStatsRequestBody request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = WayScript.airbyte_test.utils.Utils.generateURL(baseUrl, "/v1/attempt/save_stats");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = WayScript.airbyte_test.utils.Utils.serializeRequestBody(request, "request", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion));
        
        HTTPClient client = this.sdkConfiguration.defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        WayScript.airbyte_test.models.operations.SaveStatsResponse res = new WayScript.airbyte_test.models.operations.SaveStatsResponse(contentType, httpRes.statusCode()) {{
            internalOperationResult = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (WayScript.airbyte_test.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                WayScript.airbyte_test.models.shared.InternalOperationResult out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), WayScript.airbyte_test.models.shared.InternalOperationResult.class);
                res.internalOperationResult = out;
            }
        }

        return res;
    }

    /**
     * For worker to save the AttemptSyncConfig for an attempt.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public WayScript.airbyte_test.models.operations.SaveSyncConfigResponse saveSyncConfig(WayScript.airbyte_test.models.shared.SaveAttemptSyncConfigRequestBody request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = WayScript.airbyte_test.utils.Utils.generateURL(baseUrl, "/v1/attempt/save_sync_config");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = WayScript.airbyte_test.utils.Utils.serializeRequestBody(request, "request", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion));
        
        HTTPClient client = this.sdkConfiguration.defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        WayScript.airbyte_test.models.operations.SaveSyncConfigResponse res = new WayScript.airbyte_test.models.operations.SaveSyncConfigResponse(contentType, httpRes.statusCode()) {{
            internalOperationResult = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (WayScript.airbyte_test.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                WayScript.airbyte_test.models.shared.InternalOperationResult out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), WayScript.airbyte_test.models.shared.InternalOperationResult.class);
                res.internalOperationResult = out;
            }
        }

        return res;
    }

    /**
     * For worker to register the workflow id in attempt.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public WayScript.airbyte_test.models.operations.SetWorkflowInAttemptResponse setWorkflowInAttempt(WayScript.airbyte_test.models.shared.SetWorkflowInAttemptRequestBody request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = WayScript.airbyte_test.utils.Utils.generateURL(baseUrl, "/v1/attempt/set_workflow_in_attempt");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = WayScript.airbyte_test.utils.Utils.serializeRequestBody(request, "request", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion));
        
        HTTPClient client = this.sdkConfiguration.defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        WayScript.airbyte_test.models.operations.SetWorkflowInAttemptResponse res = new WayScript.airbyte_test.models.operations.SetWorkflowInAttemptResponse(contentType, httpRes.statusCode()) {{
            internalOperationResult = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (WayScript.airbyte_test.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                WayScript.airbyte_test.models.shared.InternalOperationResult out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), WayScript.airbyte_test.models.shared.InternalOperationResult.class);
                res.internalOperationResult = out;
            }
        }

        return res;
    }

    /**
     * Should only called from worker, to write result from discover activity back to DB.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public WayScript.airbyte_test.models.operations.WriteDiscoverCatalogResultResponse writeDiscoverCatalogResult(WayScript.airbyte_test.models.shared.SourceDiscoverSchemaWriteRequestBody request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = WayScript.airbyte_test.utils.Utils.generateURL(baseUrl, "/v1/sources/write_discover_catalog_result");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = WayScript.airbyte_test.utils.Utils.serializeRequestBody(request, "request", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion));
        
        HTTPClient client = this.sdkConfiguration.defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        WayScript.airbyte_test.models.operations.WriteDiscoverCatalogResultResponse res = new WayScript.airbyte_test.models.operations.WriteDiscoverCatalogResultResponse(contentType, httpRes.statusCode()) {{
            discoverCatalogResult = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (WayScript.airbyte_test.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                WayScript.airbyte_test.models.shared.DiscoverCatalogResult out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), WayScript.airbyte_test.models.shared.DiscoverCatalogResult.class);
                res.discoverCatalogResult = out;
            }
        }

        return res;
    }
}