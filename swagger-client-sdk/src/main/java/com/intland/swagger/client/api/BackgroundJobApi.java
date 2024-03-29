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
import com.intland.swagger.client.model.BackgroundJob;
import com.intland.swagger.client.model.JobReference;
import com.intland.swagger.client.model.WorkingSetUpdateRequest;

public class BackgroundJobApi {
    private ApiClient localVarApiClient;

    public BackgroundJobApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BackgroundJobApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getBackgroundJob
     * @param jobId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Background Job Info </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Job not found </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
     </table>
     * Warning: This is an experimental endpoint that might be changed or removed in future.
     * @see <a href="https://codebeamer.com/cb/wiki/12077512">Retrieve background job information Documentation</a>
     */
    public okhttp3.Call getBackgroundJobCall(Integer jobId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3/job/{jobId}"
            .replaceAll("\\{" + "jobId" + "\\}", localVarApiClient.escapeString(jobId.toString()));

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
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth", "BearerAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getBackgroundJobValidateBeforeCall(Integer jobId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'jobId' is set
        if (jobId == null) {
            throw new ApiException("Missing the required parameter 'jobId' when calling getBackgroundJob(Async)");
        }
        

        okhttp3.Call localVarCall = getBackgroundJobCall(jobId, _callback);
        return localVarCall;

    }

    /**
     * Retrieve background job information
     * 
     * @param jobId  (required)
     * @return BackgroundJob
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Background Job Info </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Job not found </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
     </table>
     * Warning: This is an experimental endpoint that might be changed or removed in future.
     * @see <a href="https://codebeamer.com/cb/wiki/12077512">Retrieve background job information Documentation</a>
     */
    public BackgroundJob getBackgroundJob(Integer jobId) throws ApiException {
        ApiResponse<BackgroundJob> localVarResp = getBackgroundJobWithHttpInfo(jobId);
        return localVarResp.getData();
    }

    /**
     * Retrieve background job information
     * 
     * @param jobId  (required)
     * @return ApiResponse&lt;BackgroundJob&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Background Job Info </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Job not found </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
     </table>
     * Warning: This is an experimental endpoint that might be changed or removed in future.
     * @see <a href="https://codebeamer.com/cb/wiki/12077512">Retrieve background job information Documentation</a>
     */
    public ApiResponse<BackgroundJob> getBackgroundJobWithHttpInfo(Integer jobId) throws ApiException {
        okhttp3.Call localVarCall = getBackgroundJobValidateBeforeCall(jobId, null);
        Type localVarReturnType = new TypeToken<BackgroundJob>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve background job information (asynchronously)
     * 
     * @param jobId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Background Job Info </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Job not found </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
     </table>
     * Warning: This is an experimental endpoint that might be changed or removed in future.
     * @see <a href="https://codebeamer.com/cb/wiki/12077512">Retrieve background job information Documentation</a>
     */
    public okhttp3.Call getBackgroundJobAsync(Integer jobId, final ApiCallback<BackgroundJob> _callback) throws ApiException {

        okhttp3.Call localVarCall = getBackgroundJobValidateBeforeCall(jobId, _callback);
        Type localVarReturnType = new TypeToken<BackgroundJob>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateWorkingSet
     * @param workingSetUpdateRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Job has been scheduled successfully </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authorization is required </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateWorkingSetCall(WorkingSetUpdateRequest workingSetUpdateRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = workingSetUpdateRequest;

        // create path and map variables
        String localVarPath = "/v3/jobs/working-set-update";

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
    private okhttp3.Call updateWorkingSetValidateBeforeCall(WorkingSetUpdateRequest workingSetUpdateRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'workingSetUpdateRequest' is set
        if (workingSetUpdateRequest == null) {
            throw new ApiException("Missing the required parameter 'workingSetUpdateRequest' when calling updateWorkingSet(Async)");
        }
        

        okhttp3.Call localVarCall = updateWorkingSetCall(workingSetUpdateRequest, _callback);
        return localVarCall;

    }

    /**
     * Create background job to update working-set
     * This API can be used start a Job that merges changes from the source into the target Working-Set replacing the content of the specified target trackers completely.
     * @param workingSetUpdateRequest  (required)
     * @return JobReference
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Job has been scheduled successfully </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authorization is required </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public JobReference updateWorkingSet(WorkingSetUpdateRequest workingSetUpdateRequest) throws ApiException {
        ApiResponse<JobReference> localVarResp = updateWorkingSetWithHttpInfo(workingSetUpdateRequest);
        return localVarResp.getData();
    }

    /**
     * Create background job to update working-set
     * This API can be used start a Job that merges changes from the source into the target Working-Set replacing the content of the specified target trackers completely.
     * @param workingSetUpdateRequest  (required)
     * @return ApiResponse&lt;JobReference&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Job has been scheduled successfully </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authorization is required </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<JobReference> updateWorkingSetWithHttpInfo(WorkingSetUpdateRequest workingSetUpdateRequest) throws ApiException {
        okhttp3.Call localVarCall = updateWorkingSetValidateBeforeCall(workingSetUpdateRequest, null);
        Type localVarReturnType = new TypeToken<JobReference>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create background job to update working-set (asynchronously)
     * This API can be used start a Job that merges changes from the source into the target Working-Set replacing the content of the specified target trackers completely.
     * @param workingSetUpdateRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Job has been scheduled successfully </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authorization is required </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateWorkingSetAsync(WorkingSetUpdateRequest workingSetUpdateRequest, final ApiCallback<JobReference> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateWorkingSetValidateBeforeCall(workingSetUpdateRequest, _callback);
        Type localVarReturnType = new TypeToken<JobReference>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
