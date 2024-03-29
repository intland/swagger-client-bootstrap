/*
 * codebeamer swagger API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 3.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.intland.swagger.client.api;

import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.reflect.TypeToken;
import com.intland.swagger.client.ApiCallback;
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.ApiResponse;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.Pair;
import com.intland.swagger.client.model.BackgroundJobReference;
import com.intland.swagger.client.model.ExportForDeploymentRequest;

public class DeploymentApi {
    private ApiClient localVarApiClient;

    public DeploymentApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DeploymentApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for exportForDeployment
     * @param exportForDeploymentRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Export job has been scheduled successfully </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authorization is required </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call exportForDeploymentCall(ExportForDeploymentRequest exportForDeploymentRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = exportForDeploymentRequest;

        // create path and map variables
        String localVarPath = "/v3/deployment/export";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth", "BearerAuth" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call exportForDeploymentValidateBeforeCall(ExportForDeploymentRequest exportForDeploymentRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'exportForDeploymentRequest' is set
        if (exportForDeploymentRequest == null) {
            throw new ApiException("Missing the required parameter 'exportForDeploymentRequest' when calling exportForDeployment(Async)");
        }
        

        okhttp3.Call localVarCall = exportForDeploymentCall(exportForDeploymentRequest, _callback);
        return localVarCall;

    }

    /**
     * Export projects for deployment
     * 
     * @param exportForDeploymentRequest  (required)
     * @return BackgroundJobReference
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Export job has been scheduled successfully </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authorization is required </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
     </table>
     */
    public BackgroundJobReference exportForDeployment(ExportForDeploymentRequest exportForDeploymentRequest) throws ApiException {
        ApiResponse<BackgroundJobReference> localVarResp = exportForDeploymentWithHttpInfo(exportForDeploymentRequest);
        return localVarResp.getData();
    }

    /**
     * Export projects for deployment
     * 
     * @param exportForDeploymentRequest  (required)
     * @return ApiResponse&lt;BackgroundJobReference&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Export job has been scheduled successfully </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authorization is required </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<BackgroundJobReference> exportForDeploymentWithHttpInfo(ExportForDeploymentRequest exportForDeploymentRequest) throws ApiException {
        okhttp3.Call localVarCall = exportForDeploymentValidateBeforeCall(exportForDeploymentRequest, null);
        Type localVarReturnType = new TypeToken<BackgroundJobReference>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Export projects for deployment (asynchronously)
     * 
     * @param exportForDeploymentRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Export job has been scheduled successfully </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authorization is required </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call exportForDeploymentAsync(ExportForDeploymentRequest exportForDeploymentRequest, final ApiCallback<BackgroundJobReference> _callback) throws ApiException {

        okhttp3.Call localVarCall = exportForDeploymentValidateBeforeCall(exportForDeploymentRequest, _callback);
        Type localVarReturnType = new TypeToken<BackgroundJobReference>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for uploadDeployment
     * @param imports Deployment files (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Deployment is executed </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Project Configuration Deployment is disabled </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call uploadDeploymentCall(File imports, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3/deployment";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (imports != null) {
            localVarFormParams.put("imports", imports);
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth", "BearerAuth" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call uploadDeploymentValidateBeforeCall(File imports, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'imports' is set
        if (imports == null) {
            throw new ApiException("Missing the required parameter 'imports' when calling uploadDeployment(Async)");
        }
        

        okhttp3.Call localVarCall = uploadDeploymentCall(imports, _callback);
        return localVarCall;

    }

    /**
     * Start a deployment process
     * 
     * @param imports Deployment files (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Deployment is executed </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Project Configuration Deployment is disabled </td><td>  -  </td></tr>
     </table>
     */
    public void uploadDeployment(File imports) throws ApiException {
        uploadDeploymentWithHttpInfo(imports);
    }

    /**
     * Start a deployment process
     * 
     * @param imports Deployment files (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Deployment is executed </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Project Configuration Deployment is disabled </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> uploadDeploymentWithHttpInfo(File imports) throws ApiException {
        okhttp3.Call localVarCall = uploadDeploymentValidateBeforeCall(imports, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Start a deployment process (asynchronously)
     * 
     * @param imports Deployment files (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Deployment is executed </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Project Configuration Deployment is disabled </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call uploadDeploymentAsync(File imports, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = uploadDeploymentValidateBeforeCall(imports, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
