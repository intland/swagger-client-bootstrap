# BranchesApi

All URIs are relative to *http://localhost:8080/cb/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTrackerItemOnBranch**](BranchesApi.md#getTrackerItemOnBranch) | **GET** /v3/branches/{branchId}/item | Get tracker item on branch


<a name="getTrackerItemOnBranch"></a>
# **getTrackerItemOnBranch**
> TrackerItem getTrackerItemOnBranch(sourceItemId, branchId)

Get tracker item on branch

API can be used for finding a tracker item by a branch id

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.BranchesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

// Configure HTTP basic authorization: BearerAuth
HttpBasicAuth BearerAuth = (HttpBasicAuth) defaultClient.getAuthentication("BearerAuth");
BearerAuth.setUsername("YOUR USERNAME");
BearerAuth.setPassword("YOUR PASSWORD");

BranchesApi apiInstance = new BranchesApi();
Integer sourceItemId = 56; // Integer | 
Integer branchId = 56; // Integer | 
try {
    TrackerItem result = apiInstance.getTrackerItemOnBranch(sourceItemId, branchId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BranchesApi#getTrackerItemOnBranch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sourceItemId** | **Integer**|  |
 **branchId** | **Integer**|  |

### Return type

[**TrackerItem**](TrackerItem.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

