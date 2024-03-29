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
import com.intland.swagger.client.model.TrackerItem;

public class BranchesApi {
    private ApiClient localVarApiClient;

    public BranchesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BranchesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getTrackerItemOnBranch
     * @param sourceItemId  (required)
     * @param branchId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Basic tracker item by id and branch id </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Tracker item not found </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getTrackerItemOnBranchCall(Integer sourceItemId, Integer branchId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3/branches/{branchId}/item"
            .replaceAll("\\{" + "branchId" + "\\}", localVarApiClient.escapeString(branchId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (sourceItemId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sourceItemId", sourceItemId));
        }

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
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth", "BearerAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getTrackerItemOnBranchValidateBeforeCall(Integer sourceItemId, Integer branchId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'sourceItemId' is set
        if (sourceItemId == null) {
            throw new ApiException("Missing the required parameter 'sourceItemId' when calling getTrackerItemOnBranch(Async)");
        }
        
        // verify the required parameter 'branchId' is set
        if (branchId == null) {
            throw new ApiException("Missing the required parameter 'branchId' when calling getTrackerItemOnBranch(Async)");
        }
        

        okhttp3.Call localVarCall = getTrackerItemOnBranchCall(sourceItemId, branchId, _callback);
        return localVarCall;

    }

    /**
     * Get tracker item on branch
     * API can be used for finding a tracker item by a branch id
     * @param sourceItemId  (required)
     * @param branchId  (required)
     * @return TrackerItem
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Basic tracker item by id and branch id </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Tracker item not found </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
     </table>
     */
    public TrackerItem getTrackerItemOnBranch(Integer sourceItemId, Integer branchId) throws ApiException {
        ApiResponse<TrackerItem> localVarResp = getTrackerItemOnBranchWithHttpInfo(sourceItemId, branchId);
        return localVarResp.getData();
    }

    /**
     * Get tracker item on branch
     * API can be used for finding a tracker item by a branch id
     * @param sourceItemId  (required)
     * @param branchId  (required)
     * @return ApiResponse&lt;TrackerItem&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Basic tracker item by id and branch id </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Tracker item not found </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TrackerItem> getTrackerItemOnBranchWithHttpInfo(Integer sourceItemId, Integer branchId) throws ApiException {
        okhttp3.Call localVarCall = getTrackerItemOnBranchValidateBeforeCall(sourceItemId, branchId, null);
        Type localVarReturnType = new TypeToken<TrackerItem>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get tracker item on branch (asynchronously)
     * API can be used for finding a tracker item by a branch id
     * @param sourceItemId  (required)
     * @param branchId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Basic tracker item by id and branch id </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Tracker item not found </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getTrackerItemOnBranchAsync(Integer sourceItemId, Integer branchId, final ApiCallback<TrackerItem> _callback) throws ApiException {

        okhttp3.Call localVarCall = getTrackerItemOnBranchValidateBeforeCall(sourceItemId, branchId, _callback);
        Type localVarReturnType = new TypeToken<TrackerItem>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
