# ExportApi

All URIs are relative to *http://localhost:8080/cb/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchGetTrackerItemReviews**](ExportApi.md#batchGetTrackerItemReviews) | **POST** /v3/export/tracker-item-reviews | Get tracker item reviews by a list of tracker item IDs |
| [**export**](ExportApi.md#export) | **POST** /v3/projects/{projectId}/content | Exports the specified project to a zip file |
| [**getTrackerItems**](ExportApi.md#getTrackerItems) | **POST** /v3/export/items | Get tracker items |


<a name="batchGetTrackerItemReviews"></a>
# **batchGetTrackerItemReviews**
> List&lt;TrackerItemWithTrackerItemReviewsExport&gt; batchGetTrackerItemReviews(batchGetTrackerItemReviewsRequest)

Get tracker item reviews by a list of tracker item IDs

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.ExportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/cb/api");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ExportApi apiInstance = new ExportApi(defaultClient);
    BatchGetTrackerItemReviewsRequest batchGetTrackerItemReviewsRequest = new BatchGetTrackerItemReviewsRequest(); // BatchGetTrackerItemReviewsRequest | 
    try {
      List<TrackerItemWithTrackerItemReviewsExport> result = apiInstance.batchGetTrackerItemReviews(batchGetTrackerItemReviewsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportApi#batchGetTrackerItemReviews");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **batchGetTrackerItemReviewsRequest** | [**BatchGetTrackerItemReviewsRequest**](BatchGetTrackerItemReviewsRequest.md)|  | |

### Return type

[**List&lt;TrackerItemWithTrackerItemReviewsExport&gt;**](TrackerItemWithTrackerItemReviewsExport.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of tracker item reviews for each tracker item |  -  |
| **400** | Request cannot be processed |  -  |
| **401** | Authentication is required |  -  |
| **403** | Tracker item reviews are disabled, or access to them is denied |  -  |
| **404** | There is no baseline accessible with the supplied ID |  -  |
| **429** | Too many requests |  -  |

<a name="export"></a>
# **export**
> File export(projectId, exportProject)

Exports the specified project to a zip file

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.ExportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/cb/api");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ExportApi apiInstance = new ExportApi(defaultClient);
    Integer projectId = 56; // Integer | 
    ExportProject exportProject = new ExportProject(); // ExportProject | 
    try {
      File result = apiInstance.export(projectId, exportProject);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportApi#export");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | **Integer**|  | |
| **exportProject** | [**ExportProject**](ExportProject.md)|  | |

### Return type

[**File**](File.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/zip, */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The exported project contents in a zip file. |  -  |
| **400** | Bad request |  -  |
| **403** | Authentication is required |  -  |
| **404** | Project not found |  -  |
| **429** | Too many requests |  -  |
| **500** | Error during the project export |  -  |

<a name="getTrackerItems"></a>
# **getTrackerItems**
> List&lt;TrackerItem&gt; getTrackerItems(trackerItemsRequest, baselineId)

Get tracker items

API can be used for fetching basic information of tracker items

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.ExportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/cb/api");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ExportApi apiInstance = new ExportApi(defaultClient);
    TrackerItemsRequest trackerItemsRequest = new TrackerItemsRequest(); // TrackerItemsRequest | 
    Integer baselineId = 56; // Integer | 
    try {
      List<TrackerItem> result = apiInstance.getTrackerItems(trackerItemsRequest, baselineId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportApi#getTrackerItems");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **trackerItemsRequest** | [**TrackerItemsRequest**](TrackerItemsRequest.md)|  | |
| **baselineId** | **Integer**|  | [optional] |

### Return type

[**List&lt;TrackerItem&gt;**](TrackerItem.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Tracker item list |  -  |
| **400** | Bad Request |  -  |
| **403** | Authentication is required |  -  |
| **404** | Tracker not found |  -  |
| **429** | Too many requests |  -  |

