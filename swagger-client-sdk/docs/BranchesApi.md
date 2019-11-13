# BranchesApi

All URIs are relative to *http://localhost:8080/cb/api/docs*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTrackerItemOnBranch**](BranchesApi.md#getTrackerItemOnBranch) | **GET** /v2/branches/{branchId}/item | Get tracker item on branch


<a name="getTrackerItemOnBranch"></a>
# **getTrackerItemOnBranch**
> TrackerItem getTrackerItemOnBranch(sourceItemId, branchId)

Get tracker item on branch

API can be used for finding a tracker item by a branch id

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.api.BranchesApi;


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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

