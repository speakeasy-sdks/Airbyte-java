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

/**
 * SourceDefinition specification related resources.
 */
public class SourceDefinitionSpecification {
	
	private SDKConfiguration sdkConfiguration;

	public SourceDefinitionSpecification(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Get specification for a SourceDefinition.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public WayScript.airbyte_test.models.operations.GetSourceDefinitionSpecificationResponse getSourceDefinitionSpecification(WayScript.airbyte_test.models.shared.SourceDefinitionIdWithWorkspaceId request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = WayScript.airbyte_test.utils.Utils.generateURL(baseUrl, "/v1/source_definition_specifications/get");
        
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

        WayScript.airbyte_test.models.operations.GetSourceDefinitionSpecificationResponse res = new WayScript.airbyte_test.models.operations.GetSourceDefinitionSpecificationResponse(contentType, httpRes.statusCode()) {{
            sourceDefinitionSpecificationRead = null;
            notFoundKnownExceptionInfo = null;
            invalidInputExceptionInfo = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (WayScript.airbyte_test.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                WayScript.airbyte_test.models.shared.SourceDefinitionSpecificationRead out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), WayScript.airbyte_test.models.shared.SourceDefinitionSpecificationRead.class);
                res.sourceDefinitionSpecificationRead = out;
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