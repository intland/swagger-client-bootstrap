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
import com.intland.swagger.client.model.Role;
import com.intland.swagger.client.model.RoleReference;

public class RoleApi {
    private ApiClient localVarApiClient;

    public RoleApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RoleApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getRole
     * @param roleId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Roles </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Role not found </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getRoleCall(Integer roleId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3/roles/{roleId}"
            .replaceAll("\\{" + "roleId" + "\\}", localVarApiClient.escapeString(roleId.toString()));

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
    private okhttp3.Call getRoleValidateBeforeCall(Integer roleId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'roleId' is set
        if (roleId == null) {
            throw new ApiException("Missing the required parameter 'roleId' when calling getRole(Async)");
        }
        

        okhttp3.Call localVarCall = getRoleCall(roleId, _callback);
        return localVarCall;

    }

    /**
     * Get role
     * 
     * @param roleId  (required)
     * @return Role
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Roles </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Role not found </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
     </table>
     */
    public Role getRole(Integer roleId) throws ApiException {
        ApiResponse<Role> localVarResp = getRoleWithHttpInfo(roleId);
        return localVarResp.getData();
    }

    /**
     * Get role
     * 
     * @param roleId  (required)
     * @return ApiResponse&lt;Role&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Roles </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Role not found </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Role> getRoleWithHttpInfo(Integer roleId) throws ApiException {
        okhttp3.Call localVarCall = getRoleValidateBeforeCall(roleId, null);
        Type localVarReturnType = new TypeToken<Role>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get role (asynchronously)
     * 
     * @param roleId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Roles </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Role not found </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getRoleAsync(Integer roleId, final ApiCallback<Role> _callback) throws ApiException {

        okhttp3.Call localVarCall = getRoleValidateBeforeCall(roleId, _callback);
        Type localVarReturnType = new TypeToken<Role>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getRoles
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Roles </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Role not found </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getRolesCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3/roles";

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
    private okhttp3.Call getRolesValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getRolesCall(_callback);
        return localVarCall;

    }

    /**
     * Get roles
     * 
     * @return List&lt;RoleReference&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Roles </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Role not found </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
     </table>
     */
    public List<RoleReference> getRoles() throws ApiException {
        ApiResponse<List<RoleReference>> localVarResp = getRolesWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Get roles
     * 
     * @return ApiResponse&lt;List&lt;RoleReference&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Roles </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Role not found </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<RoleReference>> getRolesWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getRolesValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<List<RoleReference>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get roles (asynchronously)
     * 
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Roles </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Role not found </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getRolesAsync(final ApiCallback<List<RoleReference>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getRolesValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<RoleReference>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
