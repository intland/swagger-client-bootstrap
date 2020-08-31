# ExportApi

All URIs are relative to *http://localhost:8080/cb/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**batchGetTrackerItemReviews**](ExportApi.md#batchGetTrackerItemReviews) | **POST** /v3/export/tracker-item-reviews | Get tracker item reviews by a list of tracker item IDs
[**export**](ExportApi.md#export) | **POST** /v3/projects/{projectId}/content | Exports the specified project to a zip file
[**getTrackerItems**](ExportApi.md#getTrackerItems) | **POST** /v3/export/items | Get tracker items


<a name="batchGetTrackerItemReviews"></a>
# **batchGetTrackerItemReviews**
> List&lt;TrackerItemWithTrackerItemReviewsExport&gt; batchGetTrackerItemReviews(batchGetTrackerItemReviewsRequest)

Get tracker item reviews by a list of tracker item IDs

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.ExportApi;

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

ExportApi apiInstance = new ExportApi();
BatchGetTrackerItemReviewsRequest batchGetTrackerItemReviewsRequest = new BatchGetTrackerItemReviewsRequest(); // BatchGetTrackerItemReviewsRequest | 
try {
    List<TrackerItemWithTrackerItemReviewsExport> result = apiInstance.batchGetTrackerItemReviews(batchGetTrackerItemReviewsRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExportApi#batchGetTrackerItemReviews");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchGetTrackerItemReviewsRequest** | [**BatchGetTrackerItemReviewsRequest**](BatchGetTrackerItemReviewsRequest.md)|  | [optional]

### Return type

[**List&lt;TrackerItemWithTrackerItemReviewsExport&gt;**](TrackerItemWithTrackerItemReviewsExport.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="export"></a>
# **export**
> File export(projectId, exportProject)

Exports the specified project to a zip file

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.ExportApi;

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

ExportApi apiInstance = new ExportApi();
Integer projectId = 56; // Integer | 
ExportProject exportProject = new ExportProject(); // ExportProject | 
try {
    File result = apiInstance.export(projectId, exportProject);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExportApi#export");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Integer**|  |
 **exportProject** | [**ExportProject**](ExportProject.md)|  | [optional]

### Return type

[**File**](File.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/zip

<a name="getTrackerItems"></a>
# **getTrackerItems**
> List&lt;TrackerItem&gt; getTrackerItems(baselineId, trackerItemsRequest)

Get tracker items

API can be used for fetching basic information of tracker items

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.ExportApi;

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

ExportApi apiInstance = new ExportApi();
Integer baselineId = 56; // Integer | 
TrackerItemsRequest trackerItemsRequest = new TrackerItemsRequest(); // TrackerItemsRequest | 
try {
    List<TrackerItem> result = apiInstance.getTrackerItems(baselineId, trackerItemsRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExportApi#getTrackerItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **baselineId** | **Integer**|  | [optional]
 **trackerItemsRequest** | [**TrackerItemsRequest**](TrackerItemsRequest.md)|  | [optional]

### Return type

[**List&lt;TrackerItem&gt;**](TrackerItem.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

