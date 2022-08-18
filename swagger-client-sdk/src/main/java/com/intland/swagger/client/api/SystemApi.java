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
import com.intland.swagger.client.model.MaintenanceMode;
import com.intland.swagger.client.model.SystemStatus;

public class SystemApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public SystemApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SystemApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for getSystemStatus
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> System maintenance status </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Access denied </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSystemStatusCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3/system/maintenance";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "*/*"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth", "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getSystemStatusValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getSystemStatusCall(_callback);
        return localVarCall;

    }

    /**
     * Get system maintenance status
     * 
     * @return SystemStatus
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> System maintenance status </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Access denied </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
     </table>
     */
    public SystemStatus getSystemStatus() throws ApiException {
        ApiResponse<SystemStatus> localVarResp = getSystemStatusWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Get system maintenance status
     * 
     * @return ApiResponse&lt;SystemStatus&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> System maintenance status </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Access denied </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SystemStatus> getSystemStatusWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getSystemStatusValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<SystemStatus>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get system maintenance status (asynchronously)
     * 
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> System maintenance status </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Access denied </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSystemStatusAsync(final ApiCallback<SystemStatus> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSystemStatusValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<SystemStatus>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for setSystemStatus
     * @param maintenanceMode  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> System maintenance status </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Request cannot be processed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Access denied </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call setSystemStatusCall(MaintenanceMode maintenanceMode, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = maintenanceMode;

        // create path and map variables
        String localVarPath = "/v3/system/maintenance";

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
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth", "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call setSystemStatusValidateBeforeCall(MaintenanceMode maintenanceMode, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'maintenanceMode' is set
        if (maintenanceMode == null) {
            throw new ApiException("Missing the required parameter 'maintenanceMode' when calling setSystemStatus(Async)");
        }
        

        okhttp3.Call localVarCall = setSystemStatusCall(maintenanceMode, _callback);
        return localVarCall;

    }

    /**
     * Set system maintenance status
     * 
     * @param maintenanceMode  (required)
     * @return SystemStatus
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> System maintenance status </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Request cannot be processed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Access denied </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
     </table>
     */
    public SystemStatus setSystemStatus(MaintenanceMode maintenanceMode) throws ApiException {
        ApiResponse<SystemStatus> localVarResp = setSystemStatusWithHttpInfo(maintenanceMode);
        return localVarResp.getData();
    }

    /**
     * Set system maintenance status
     * 
     * @param maintenanceMode  (required)
     * @return ApiResponse&lt;SystemStatus&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> System maintenance status </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Request cannot be processed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Access denied </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SystemStatus> setSystemStatusWithHttpInfo(MaintenanceMode maintenanceMode) throws ApiException {
        okhttp3.Call localVarCall = setSystemStatusValidateBeforeCall(maintenanceMode, null);
        Type localVarReturnType = new TypeToken<SystemStatus>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Set system maintenance status (asynchronously)
     * 
     * @param maintenanceMode  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> System maintenance status </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Request cannot be processed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Access denied </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call setSystemStatusAsync(MaintenanceMode maintenanceMode, final ApiCallback<SystemStatus> _callback) throws ApiException {

        okhttp3.Call localVarCall = setSystemStatusValidateBeforeCall(maintenanceMode, _callback);
        Type localVarReturnType = new TypeToken<SystemStatus>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
