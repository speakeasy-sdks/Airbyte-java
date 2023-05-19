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
import java.time.LocalDate;

/**
 * DestinationDefinition related resources.
 */
public class DestinationDefinition {
	
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public DestinationDefinition(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}

    /**
     * Creates a custom destinationDefinition for the given workspace
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public WayScript.airbyte_test.models.operations.CreateCustomDestinationDefinitionResponse createCustomDestinationDefinition(WayScript.airbyte_test.models.shared.CustomDestinationDefinitionCreate request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = WayScript.airbyte_test.utils.Utils.generateURL(baseUrl, "/v1/destination_definitions/create_custom");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = WayScript.airbyte_test.utils.Utils.serializeRequestBody(request, "request", "json");
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        WayScript.airbyte_test.models.operations.CreateCustomDestinationDefinitionResponse res = new WayScript.airbyte_test.models.operations.CreateCustomDestinationDefinitionResponse(contentType, httpRes.statusCode()) {{
            destinationDefinitionRead = null;
            invalidInputExceptionInfo = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (WayScript.airbyte_test.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                WayScript.airbyte_test.models.shared.DestinationDefinitionRead out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), WayScript.airbyte_test.models.shared.DestinationDefinitionRead.class);
                res.destinationDefinitionRead = out;
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
     * Delete a destination definition
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public WayScript.airbyte_test.models.operations.DeleteDestinationDefinitionResponse deleteDestinationDefinition(WayScript.airbyte_test.models.shared.DestinationDefinitionIdRequestBody request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = WayScript.airbyte_test.utils.Utils.generateURL(baseUrl, "/v1/destination_definitions/delete");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = WayScript.airbyte_test.utils.Utils.serializeRequestBody(request, "request", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        WayScript.airbyte_test.models.operations.DeleteDestinationDefinitionResponse res = new WayScript.airbyte_test.models.operations.DeleteDestinationDefinitionResponse(contentType, httpRes.statusCode()) {{
            notFoundKnownExceptionInfo = null;
            invalidInputExceptionInfo = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 204) {
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
     * Get destinationDefinition
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public WayScript.airbyte_test.models.operations.GetDestinationDefinitionResponse getDestinationDefinition(WayScript.airbyte_test.models.shared.DestinationDefinitionIdRequestBody request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = WayScript.airbyte_test.utils.Utils.generateURL(baseUrl, "/v1/destination_definitions/get");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = WayScript.airbyte_test.utils.Utils.serializeRequestBody(request, "request", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0.7, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        WayScript.airbyte_test.models.operations.GetDestinationDefinitionResponse res = new WayScript.airbyte_test.models.operations.GetDestinationDefinitionResponse(contentType, httpRes.statusCode()) {{
            destinationDefinitionRead = null;
            notFoundKnownExceptionInfo = null;
            invalidInputExceptionInfo = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (WayScript.airbyte_test.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                WayScript.airbyte_test.models.shared.DestinationDefinitionRead out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), WayScript.airbyte_test.models.shared.DestinationDefinitionRead.class);
                res.destinationDefinitionRead = out;
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
     * Get a destinationDefinition that is configured for the given workspace
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public WayScript.airbyte_test.models.operations.GetDestinationDefinitionForWorkspaceResponse getDestinationDefinitionForWorkspace(WayScript.airbyte_test.models.shared.DestinationDefinitionIdWithWorkspaceId request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = WayScript.airbyte_test.utils.Utils.generateURL(baseUrl, "/v1/destination_definitions/get_for_workspace");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = WayScript.airbyte_test.utils.Utils.serializeRequestBody(request, "request", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0.7, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        WayScript.airbyte_test.models.operations.GetDestinationDefinitionForWorkspaceResponse res = new WayScript.airbyte_test.models.operations.GetDestinationDefinitionForWorkspaceResponse(contentType, httpRes.statusCode()) {{
            destinationDefinitionRead = null;
            notFoundKnownExceptionInfo = null;
            invalidInputExceptionInfo = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (WayScript.airbyte_test.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                WayScript.airbyte_test.models.shared.DestinationDefinitionRead out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), WayScript.airbyte_test.models.shared.DestinationDefinitionRead.class);
                res.destinationDefinitionRead = out;
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
     * grant a private, non-custom destinationDefinition to a given workspace
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public WayScript.airbyte_test.models.operations.GrantDestinationDefinitionToWorkspaceResponse grantDestinationDefinitionToWorkspace(WayScript.airbyte_test.models.shared.DestinationDefinitionIdWithWorkspaceId request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = WayScript.airbyte_test.utils.Utils.generateURL(baseUrl, "/v1/destination_definitions/grant_definition");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = WayScript.airbyte_test.utils.Utils.serializeRequestBody(request, "request", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0.7, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        WayScript.airbyte_test.models.operations.GrantDestinationDefinitionToWorkspaceResponse res = new WayScript.airbyte_test.models.operations.GrantDestinationDefinitionToWorkspaceResponse(contentType, httpRes.statusCode()) {{
            privateDestinationDefinitionRead = null;
            notFoundKnownExceptionInfo = null;
            invalidInputExceptionInfo = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (WayScript.airbyte_test.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                WayScript.airbyte_test.models.shared.PrivateDestinationDefinitionRead out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), WayScript.airbyte_test.models.shared.PrivateDestinationDefinitionRead.class);
                res.privateDestinationDefinitionRead = out;
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
     * List all the destinationDefinitions the current Airbyte deployment is configured to use
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public WayScript.airbyte_test.models.operations.ListDestinationDefinitionsResponse listDestinationDefinitions() throws Exception {
        String baseUrl = this._serverUrl;
        String url = WayScript.airbyte_test.utils.Utils.generateURL(baseUrl, "/v1/destination_definitions/list");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        WayScript.airbyte_test.models.operations.ListDestinationDefinitionsResponse res = new WayScript.airbyte_test.models.operations.ListDestinationDefinitionsResponse(contentType, httpRes.statusCode()) {{
            destinationDefinitionReadList = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (WayScript.airbyte_test.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                WayScript.airbyte_test.models.shared.DestinationDefinitionReadList out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), WayScript.airbyte_test.models.shared.DestinationDefinitionReadList.class);
                res.destinationDefinitionReadList = out;
            }
        }

        return res;
    }

    /**
     * List all the destinationDefinitions the given workspace is configured to use
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public WayScript.airbyte_test.models.operations.ListDestinationDefinitionsForWorkspaceResponse listDestinationDefinitionsForWorkspace(WayScript.airbyte_test.models.shared.WorkspaceIdRequestBody request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = WayScript.airbyte_test.utils.Utils.generateURL(baseUrl, "/v1/destination_definitions/list_for_workspace");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = WayScript.airbyte_test.utils.Utils.serializeRequestBody(request, "request", "json");
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        WayScript.airbyte_test.models.operations.ListDestinationDefinitionsForWorkspaceResponse res = new WayScript.airbyte_test.models.operations.ListDestinationDefinitionsForWorkspaceResponse(contentType, httpRes.statusCode()) {{
            destinationDefinitionReadList = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (WayScript.airbyte_test.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                WayScript.airbyte_test.models.shared.DestinationDefinitionReadList out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), WayScript.airbyte_test.models.shared.DestinationDefinitionReadList.class);
                res.destinationDefinitionReadList = out;
            }
        }

        return res;
    }

    /**
     * List the latest destinationDefinitions Airbyte supports
     * Guaranteed to retrieve the latest information on supported destinations.
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public WayScript.airbyte_test.models.operations.ListLatestDestinationDefinitionsResponse listLatestDestinationDefinitions() throws Exception {
        String baseUrl = this._serverUrl;
        String url = WayScript.airbyte_test.utils.Utils.generateURL(baseUrl, "/v1/destination_definitions/list_latest");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        WayScript.airbyte_test.models.operations.ListLatestDestinationDefinitionsResponse res = new WayScript.airbyte_test.models.operations.ListLatestDestinationDefinitionsResponse(contentType, httpRes.statusCode()) {{
            destinationDefinitionReadList = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (WayScript.airbyte_test.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                WayScript.airbyte_test.models.shared.DestinationDefinitionReadList out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), WayScript.airbyte_test.models.shared.DestinationDefinitionReadList.class);
                res.destinationDefinitionReadList = out;
            }
        }

        return res;
    }

    /**
     * List all private, non-custom destinationDefinitions, and for each indicate whether the given workspace has a grant for using the definition. Used by admins to view and modify a given workspace's grants.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public WayScript.airbyte_test.models.operations.ListPrivateDestinationDefinitionsResponse listPrivateDestinationDefinitions(WayScript.airbyte_test.models.shared.WorkspaceIdRequestBody request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = WayScript.airbyte_test.utils.Utils.generateURL(baseUrl, "/v1/destination_definitions/list_private");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = WayScript.airbyte_test.utils.Utils.serializeRequestBody(request, "request", "json");
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        WayScript.airbyte_test.models.operations.ListPrivateDestinationDefinitionsResponse res = new WayScript.airbyte_test.models.operations.ListPrivateDestinationDefinitionsResponse(contentType, httpRes.statusCode()) {{
            privateDestinationDefinitionReadList = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (WayScript.airbyte_test.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                WayScript.airbyte_test.models.shared.PrivateDestinationDefinitionReadList out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), WayScript.airbyte_test.models.shared.PrivateDestinationDefinitionReadList.class);
                res.privateDestinationDefinitionReadList = out;
            }
        }

        return res;
    }

    /**
     * revoke a grant to a private, non-custom destinationDefinition from a given workspace
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public WayScript.airbyte_test.models.operations.RevokeDestinationDefinitionFromWorkspaceResponse revokeDestinationDefinitionFromWorkspace(WayScript.airbyte_test.models.shared.DestinationDefinitionIdWithWorkspaceId request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = WayScript.airbyte_test.utils.Utils.generateURL(baseUrl, "/v1/destination_definitions/revoke_definition");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = WayScript.airbyte_test.utils.Utils.serializeRequestBody(request, "request", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        WayScript.airbyte_test.models.operations.RevokeDestinationDefinitionFromWorkspaceResponse res = new WayScript.airbyte_test.models.operations.RevokeDestinationDefinitionFromWorkspaceResponse(contentType, httpRes.statusCode()) {{
            notFoundKnownExceptionInfo = null;
            invalidInputExceptionInfo = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 204) {
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
     * Update destinationDefinition
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public WayScript.airbyte_test.models.operations.UpdateDestinationDefinitionResponse updateDestinationDefinition(WayScript.airbyte_test.models.shared.DestinationDefinitionUpdate request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = WayScript.airbyte_test.utils.Utils.generateURL(baseUrl, "/v1/destination_definitions/update");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = WayScript.airbyte_test.utils.Utils.serializeRequestBody(request, "request", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0.7, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        WayScript.airbyte_test.models.operations.UpdateDestinationDefinitionResponse res = new WayScript.airbyte_test.models.operations.UpdateDestinationDefinitionResponse(contentType, httpRes.statusCode()) {{
            destinationDefinitionRead = null;
            notFoundKnownExceptionInfo = null;
            invalidInputExceptionInfo = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (WayScript.airbyte_test.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                WayScript.airbyte_test.models.shared.DestinationDefinitionRead out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), WayScript.airbyte_test.models.shared.DestinationDefinitionRead.class);
                res.destinationDefinitionRead = out;
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
}