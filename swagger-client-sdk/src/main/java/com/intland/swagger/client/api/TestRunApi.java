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
import com.intland.swagger.client.model.AutomatedTestRunRequest;
import com.intland.swagger.client.model.CreateTestRunFromTestSetsRequest;
import com.intland.swagger.client.model.CreateTestRunRequest;
import com.intland.swagger.client.model.TestRunResult;
import com.intland.swagger.client.model.TrackerItem;
import com.intland.swagger.client.model.UpdateTestRunRequest;

public class TestRunApi {
    private ApiClient localVarApiClient;

    public TestRunApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TestRunApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for createTestRunForTestCase
     * @param testRunTrackerId  (required)
     * @param createTestRunRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The newly created test run </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authorization is required </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Tracker is not found </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
     * Uploading large amount of test result data
     * @see <a href="https://codebeamer.com/cb/wiki/12077512">Create a new test run for test cases or test sets Documentation</a>
     */
    public okhttp3.Call createTestRunForTestCaseCall(Integer testRunTrackerId, CreateTestRunRequest createTestRunRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = createTestRunRequest;

        // create path and map variables
        String localVarPath = "/v3/trackers/{testRunTrackerId}/testruns"
            .replaceAll("\\{" + "testRunTrackerId" + "\\}", localVarApiClient.escapeString(testRunTrackerId.toString()));

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
    private okhttp3.Call createTestRunForTestCaseValidateBeforeCall(Integer testRunTrackerId, CreateTestRunRequest createTestRunRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'testRunTrackerId' is set
        if (testRunTrackerId == null) {
            throw new ApiException("Missing the required parameter 'testRunTrackerId' when calling createTestRunForTestCase(Async)");
        }
        
        // verify the required parameter 'createTestRunRequest' is set
        if (createTestRunRequest == null) {
            throw new ApiException("Missing the required parameter 'createTestRunRequest' when calling createTestRunForTestCase(Async)");
        }
        

        okhttp3.Call localVarCall = createTestRunForTestCaseCall(testRunTrackerId, createTestRunRequest, _callback);
        return localVarCall;

    }

    /**
     * Create a new test run for test cases or test sets
     * For multiple test sets please use trackers/{testRunTrackerId}/testruns/generatefromtestset endpoint.
     * @param testRunTrackerId  (required)
     * @param createTestRunRequest  (required)
     * @return TrackerItem
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The newly created test run </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authorization is required </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Tracker is not found </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
     * Uploading large amount of test result data
     * @see <a href="https://codebeamer.com/cb/wiki/12077512">Create a new test run for test cases or test sets Documentation</a>
     */
    public TrackerItem createTestRunForTestCase(Integer testRunTrackerId, CreateTestRunRequest createTestRunRequest) throws ApiException {
        ApiResponse<TrackerItem> localVarResp = createTestRunForTestCaseWithHttpInfo(testRunTrackerId, createTestRunRequest);
        return localVarResp.getData();
    }

    /**
     * Create a new test run for test cases or test sets
     * For multiple test sets please use trackers/{testRunTrackerId}/testruns/generatefromtestset endpoint.
     * @param testRunTrackerId  (required)
     * @param createTestRunRequest  (required)
     * @return ApiResponse&lt;TrackerItem&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The newly created test run </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authorization is required </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Tracker is not found </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
     * Uploading large amount of test result data
     * @see <a href="https://codebeamer.com/cb/wiki/12077512">Create a new test run for test cases or test sets Documentation</a>
     */
    public ApiResponse<TrackerItem> createTestRunForTestCaseWithHttpInfo(Integer testRunTrackerId, CreateTestRunRequest createTestRunRequest) throws ApiException {
        okhttp3.Call localVarCall = createTestRunForTestCaseValidateBeforeCall(testRunTrackerId, createTestRunRequest, null);
        Type localVarReturnType = new TypeToken<TrackerItem>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a new test run for test cases or test sets (asynchronously)
     * For multiple test sets please use trackers/{testRunTrackerId}/testruns/generatefromtestset endpoint.
     * @param testRunTrackerId  (required)
     * @param createTestRunRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The newly created test run </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authorization is required </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Tracker is not found </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
     * Uploading large amount of test result data
     * @see <a href="https://codebeamer.com/cb/wiki/12077512">Create a new test run for test cases or test sets Documentation</a>
     */
    public okhttp3.Call createTestRunForTestCaseAsync(Integer testRunTrackerId, CreateTestRunRequest createTestRunRequest, final ApiCallback<TrackerItem> _callback) throws ApiException {

        okhttp3.Call localVarCall = createTestRunForTestCaseValidateBeforeCall(testRunTrackerId, createTestRunRequest, _callback);
        Type localVarReturnType = new TypeToken<TrackerItem>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for createTestRunForTestSets
     * @param testRunTrackerId  (required)
     * @param createTestRunFromTestSetsRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The newly created test run </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authorization is required </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Tracker is not found </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
     * Uploading large amount of test result data
     * @see <a href="https://codebeamer.com/cb/wiki/12077512">Create a new test run for test cases or test sets Documentation</a>
     */
    public okhttp3.Call createTestRunForTestSetsCall(Integer testRunTrackerId, CreateTestRunFromTestSetsRequest createTestRunFromTestSetsRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = createTestRunFromTestSetsRequest;

        // create path and map variables
        String localVarPath = "/v3/trackers/{testRunTrackerId}/testruns/generatefromtestset"
            .replaceAll("\\{" + "testRunTrackerId" + "\\}", localVarApiClient.escapeString(testRunTrackerId.toString()));

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
    private okhttp3.Call createTestRunForTestSetsValidateBeforeCall(Integer testRunTrackerId, CreateTestRunFromTestSetsRequest createTestRunFromTestSetsRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'testRunTrackerId' is set
        if (testRunTrackerId == null) {
            throw new ApiException("Missing the required parameter 'testRunTrackerId' when calling createTestRunForTestSets(Async)");
        }
        
        // verify the required parameter 'createTestRunFromTestSetsRequest' is set
        if (createTestRunFromTestSetsRequest == null) {
            throw new ApiException("Missing the required parameter 'createTestRunFromTestSetsRequest' when calling createTestRunForTestSets(Async)");
        }
        

        okhttp3.Call localVarCall = createTestRunForTestSetsCall(testRunTrackerId, createTestRunFromTestSetsRequest, _callback);
        return localVarCall;

    }

    /**
     * Create a new test run for test cases or test sets
     * 
     * @param testRunTrackerId  (required)
     * @param createTestRunFromTestSetsRequest  (required)
     * @return TestRunResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The newly created test run </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authorization is required </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Tracker is not found </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
     * Uploading large amount of test result data
     * @see <a href="https://codebeamer.com/cb/wiki/12077512">Create a new test run for test cases or test sets Documentation</a>
     */
    public TestRunResult createTestRunForTestSets(Integer testRunTrackerId, CreateTestRunFromTestSetsRequest createTestRunFromTestSetsRequest) throws ApiException {
        ApiResponse<TestRunResult> localVarResp = createTestRunForTestSetsWithHttpInfo(testRunTrackerId, createTestRunFromTestSetsRequest);
        return localVarResp.getData();
    }

    /**
     * Create a new test run for test cases or test sets
     * 
     * @param testRunTrackerId  (required)
     * @param createTestRunFromTestSetsRequest  (required)
     * @return ApiResponse&lt;TestRunResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The newly created test run </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authorization is required </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Tracker is not found </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
     * Uploading large amount of test result data
     * @see <a href="https://codebeamer.com/cb/wiki/12077512">Create a new test run for test cases or test sets Documentation</a>
     */
    public ApiResponse<TestRunResult> createTestRunForTestSetsWithHttpInfo(Integer testRunTrackerId, CreateTestRunFromTestSetsRequest createTestRunFromTestSetsRequest) throws ApiException {
        okhttp3.Call localVarCall = createTestRunForTestSetsValidateBeforeCall(testRunTrackerId, createTestRunFromTestSetsRequest, null);
        Type localVarReturnType = new TypeToken<TestRunResult>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a new test run for test cases or test sets (asynchronously)
     * 
     * @param testRunTrackerId  (required)
     * @param createTestRunFromTestSetsRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The newly created test run </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authorization is required </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Tracker is not found </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
     * Uploading large amount of test result data
     * @see <a href="https://codebeamer.com/cb/wiki/12077512">Create a new test run for test cases or test sets Documentation</a>
     */
    public okhttp3.Call createTestRunForTestSetsAsync(Integer testRunTrackerId, CreateTestRunFromTestSetsRequest createTestRunFromTestSetsRequest, final ApiCallback<TestRunResult> _callback) throws ApiException {

        okhttp3.Call localVarCall = createTestRunForTestSetsValidateBeforeCall(testRunTrackerId, createTestRunFromTestSetsRequest, _callback);
        Type localVarReturnType = new TypeToken<TestRunResult>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateTestRunResult
     * @param testRunId  (required)
     * @param updateTestRunRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Updated Test Run item </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Request cannot be processed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Access denied </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Test run not found </td><td>  -  </td></tr>
        <tr><td> 423 </td><td> Tracker item is locked </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
     </table>
     * Uploading large amount of test result data
     * @see <a href="https://codebeamer.com/cb/wiki/12077512">Update result of a Test Run.  Documentation</a>
     */
    public okhttp3.Call updateTestRunResultCall(Integer testRunId, UpdateTestRunRequest updateTestRunRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = updateTestRunRequest;

        // create path and map variables
        String localVarPath = "/v3/testruns/{testRunId}"
            .replaceAll("\\{" + "testRunId" + "\\}", localVarApiClient.escapeString(testRunId.toString()));

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
        return localVarApiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateTestRunResultValidateBeforeCall(Integer testRunId, UpdateTestRunRequest updateTestRunRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'testRunId' is set
        if (testRunId == null) {
            throw new ApiException("Missing the required parameter 'testRunId' when calling updateTestRunResult(Async)");
        }
        
        // verify the required parameter 'updateTestRunRequest' is set
        if (updateTestRunRequest == null) {
            throw new ApiException("Missing the required parameter 'updateTestRunRequest' when calling updateTestRunResult(Async)");
        }
        

        okhttp3.Call localVarCall = updateTestRunResultCall(testRunId, updateTestRunRequest, _callback);
        return localVarCall;

    }

    /**
     * Update result of a Test Run. 
     * 
     * @param testRunId  (required)
     * @param updateTestRunRequest  (required)
     * @return TrackerItem
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Updated Test Run item </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Request cannot be processed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Access denied </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Test run not found </td><td>  -  </td></tr>
        <tr><td> 423 </td><td> Tracker item is locked </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
     </table>
     * Uploading large amount of test result data
     * @see <a href="https://codebeamer.com/cb/wiki/12077512">Update result of a Test Run.  Documentation</a>
     */
    public TrackerItem updateTestRunResult(Integer testRunId, UpdateTestRunRequest updateTestRunRequest) throws ApiException {
        ApiResponse<TrackerItem> localVarResp = updateTestRunResultWithHttpInfo(testRunId, updateTestRunRequest);
        return localVarResp.getData();
    }

    /**
     * Update result of a Test Run. 
     * 
     * @param testRunId  (required)
     * @param updateTestRunRequest  (required)
     * @return ApiResponse&lt;TrackerItem&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Updated Test Run item </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Request cannot be processed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Access denied </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Test run not found </td><td>  -  </td></tr>
        <tr><td> 423 </td><td> Tracker item is locked </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
     </table>
     * Uploading large amount of test result data
     * @see <a href="https://codebeamer.com/cb/wiki/12077512">Update result of a Test Run.  Documentation</a>
     */
    public ApiResponse<TrackerItem> updateTestRunResultWithHttpInfo(Integer testRunId, UpdateTestRunRequest updateTestRunRequest) throws ApiException {
        okhttp3.Call localVarCall = updateTestRunResultValidateBeforeCall(testRunId, updateTestRunRequest, null);
        Type localVarReturnType = new TypeToken<TrackerItem>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update result of a Test Run.  (asynchronously)
     * 
     * @param testRunId  (required)
     * @param updateTestRunRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Updated Test Run item </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Request cannot be processed </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Access denied </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Test run not found </td><td>  -  </td></tr>
        <tr><td> 423 </td><td> Tracker item is locked </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
     </table>
     * Uploading large amount of test result data
     * @see <a href="https://codebeamer.com/cb/wiki/12077512">Update result of a Test Run.  Documentation</a>
     */
    public okhttp3.Call updateTestRunResultAsync(Integer testRunId, UpdateTestRunRequest updateTestRunRequest, final ApiCallback<TrackerItem> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateTestRunResultValidateBeforeCall(testRunId, updateTestRunRequest, _callback);
        Type localVarReturnType = new TypeToken<TrackerItem>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for uploadAutomatedTestResults
     * @param testRunTrackerId  (required)
     * @param automatedTestRunRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The newly created test run </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authorization is required </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call uploadAutomatedTestResultsCall(Integer testRunTrackerId, AutomatedTestRunRequest automatedTestRunRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = automatedTestRunRequest;

        // create path and map variables
        String localVarPath = "/v3/trackers/{testRunTrackerId}/automatedtestruns"
            .replaceAll("\\{" + "testRunTrackerId" + "\\}", localVarApiClient.escapeString(testRunTrackerId.toString()));

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
    private okhttp3.Call uploadAutomatedTestResultsValidateBeforeCall(Integer testRunTrackerId, AutomatedTestRunRequest automatedTestRunRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'testRunTrackerId' is set
        if (testRunTrackerId == null) {
            throw new ApiException("Missing the required parameter 'testRunTrackerId' when calling uploadAutomatedTestResults(Async)");
        }
        
        // verify the required parameter 'automatedTestRunRequest' is set
        if (automatedTestRunRequest == null) {
            throw new ApiException("Missing the required parameter 'automatedTestRunRequest' when calling uploadAutomatedTestResults(Async)");
        }
        

        okhttp3.Call localVarCall = uploadAutomatedTestResultsCall(testRunTrackerId, automatedTestRunRequest, _callback);
        return localVarCall;

    }

    /**
     * Create a new test run for large number of automated test cases
     * Upload large amount of automated test case run results into a single test run. This process may take a while, please check your proxy settings to prevent timeout.
     * @param testRunTrackerId  (required)
     * @param automatedTestRunRequest  (required)
     * @return TrackerItem
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The newly created test run </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authorization is required </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
     */
    public TrackerItem uploadAutomatedTestResults(Integer testRunTrackerId, AutomatedTestRunRequest automatedTestRunRequest) throws ApiException {
        ApiResponse<TrackerItem> localVarResp = uploadAutomatedTestResultsWithHttpInfo(testRunTrackerId, automatedTestRunRequest);
        return localVarResp.getData();
    }

    /**
     * Create a new test run for large number of automated test cases
     * Upload large amount of automated test case run results into a single test run. This process may take a while, please check your proxy settings to prevent timeout.
     * @param testRunTrackerId  (required)
     * @param automatedTestRunRequest  (required)
     * @return ApiResponse&lt;TrackerItem&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The newly created test run </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authorization is required </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TrackerItem> uploadAutomatedTestResultsWithHttpInfo(Integer testRunTrackerId, AutomatedTestRunRequest automatedTestRunRequest) throws ApiException {
        okhttp3.Call localVarCall = uploadAutomatedTestResultsValidateBeforeCall(testRunTrackerId, automatedTestRunRequest, null);
        Type localVarReturnType = new TypeToken<TrackerItem>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a new test run for large number of automated test cases (asynchronously)
     * Upload large amount of automated test case run results into a single test run. This process may take a while, please check your proxy settings to prevent timeout.
     * @param testRunTrackerId  (required)
     * @param automatedTestRunRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The newly created test run </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authorization is required </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call uploadAutomatedTestResultsAsync(Integer testRunTrackerId, AutomatedTestRunRequest automatedTestRunRequest, final ApiCallback<TrackerItem> _callback) throws ApiException {

        okhttp3.Call localVarCall = uploadAutomatedTestResultsValidateBeforeCall(testRunTrackerId, automatedTestRunRequest, _callback);
        Type localVarReturnType = new TypeToken<TrackerItem>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
