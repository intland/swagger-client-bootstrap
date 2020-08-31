# TrackerReportApi

All URIs are relative to *http://localhost:8080/cb/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTrackerReport**](TrackerReportApi.md#createTrackerReport) | **POST** /v3/trackers/{trackerId}/reports | Creates a report of a specific tracker
[**deleteTrackerReport**](TrackerReportApi.md#deleteTrackerReport) | **DELETE** /v3/trackers/{trackerId}/reports/{reportId} | Deletes a report of a specific tracker
[**getTrackerReport**](TrackerReportApi.md#getTrackerReport) | **GET** /v3/trackers/{trackerId}/reports/{reportId}/results | Get a report of a specific tracker
[**getTrackerReportItems**](TrackerReportApi.md#getTrackerReportItems) | **GET** /v3/trackers/{trackerId}/reports/{reportId}/items | Get report items of a specific tracker view
[**getTrackerReports**](TrackerReportApi.md#getTrackerReports) | **GET** /v3/trackers/{trackerId}/reports | Get all reports of a specific tracker
[**updateTrackerReport**](TrackerReportApi.md#updateTrackerReport) | **PUT** /v3/trackers/{trackerId}/reports/{reportId} | Updates a report of a specific tracker


<a name="createTrackerReport"></a>
# **createTrackerReport**
> TrackerReportSettings createTrackerReport(trackerId, trackerReportSettings)

Creates a report of a specific tracker

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.TrackerReportApi;

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

TrackerReportApi apiInstance = new TrackerReportApi();
Integer trackerId = 56; // Integer | 
TrackerReportSettings trackerReportSettings = new TrackerReportSettings(); // TrackerReportSettings | 
try {
    TrackerReportSettings result = apiInstance.createTrackerReport(trackerId, trackerReportSettings);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerReportApi#createTrackerReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trackerId** | **Integer**|  |
 **trackerReportSettings** | [**TrackerReportSettings**](TrackerReportSettings.md)|  | [optional]

### Return type

[**TrackerReportSettings**](TrackerReportSettings.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTrackerReport"></a>
# **deleteTrackerReport**
> deleteTrackerReport(trackerId, reportId)

Deletes a report of a specific tracker

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.TrackerReportApi;

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

TrackerReportApi apiInstance = new TrackerReportApi();
Integer trackerId = 56; // Integer | 
Integer reportId = 56; // Integer | 
try {
    apiInstance.deleteTrackerReport(trackerId, reportId);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerReportApi#deleteTrackerReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trackerId** | **Integer**|  |
 **reportId** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getTrackerReport"></a>
# **getTrackerReport**
> ReportResult getTrackerReport(trackerId, reportId, page, pageSize)

Get a report of a specific tracker

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.TrackerReportApi;

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

TrackerReportApi apiInstance = new TrackerReportApi();
Integer trackerId = 56; // Integer | 
Integer reportId = 56; // Integer | 
Integer page = 1; // Integer | Index of a report page starting from 1.
Integer pageSize = 25; // Integer | Number of items a report page. Max value: 500
try {
    ReportResult result = apiInstance.getTrackerReport(trackerId, reportId, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerReportApi#getTrackerReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trackerId** | **Integer**|  |
 **reportId** | **Integer**|  |
 **page** | **Integer**| Index of a report page starting from 1. | [optional] [default to 1]
 **pageSize** | **Integer**| Number of items a report page. Max value: 500 | [optional] [default to 25]

### Return type

[**ReportResult**](ReportResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTrackerReportItems"></a>
# **getTrackerReportItems**
> ReportItemResult getTrackerReportItems(trackerId, reportId, page, pageSize)

Get report items of a specific tracker view

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.TrackerReportApi;

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

TrackerReportApi apiInstance = new TrackerReportApi();
Integer trackerId = 56; // Integer | 
Integer reportId = 56; // Integer | 
Integer page = 1; // Integer | Index of a report page starting from 1.
Integer pageSize = 20; // Integer | Number of items a report page. Max value: 500
try {
    ReportItemResult result = apiInstance.getTrackerReportItems(trackerId, reportId, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerReportApi#getTrackerReportItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trackerId** | **Integer**|  |
 **reportId** | **Integer**|  |
 **page** | **Integer**| Index of a report page starting from 1. | [optional] [default to 1]
 **pageSize** | **Integer**| Number of items a report page. Max value: 500 | [optional] [default to 20]

### Return type

[**ReportItemResult**](ReportItemResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTrackerReports"></a>
# **getTrackerReports**
> List&lt;ReportReference&gt; getTrackerReports(trackerId)

Get all reports of a specific tracker

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.TrackerReportApi;

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

TrackerReportApi apiInstance = new TrackerReportApi();
Integer trackerId = 56; // Integer | 
try {
    List<ReportReference> result = apiInstance.getTrackerReports(trackerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerReportApi#getTrackerReports");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trackerId** | **Integer**|  |

### Return type

[**List&lt;ReportReference&gt;**](ReportReference.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateTrackerReport"></a>
# **updateTrackerReport**
> TrackerReportSettings updateTrackerReport(trackerId, reportId, trackerReportSettings)

Updates a report of a specific tracker

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.TrackerReportApi;

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

TrackerReportApi apiInstance = new TrackerReportApi();
Integer trackerId = 56; // Integer | 
Integer reportId = 56; // Integer | 
TrackerReportSettings trackerReportSettings = new TrackerReportSettings(); // TrackerReportSettings | 
try {
    TrackerReportSettings result = apiInstance.updateTrackerReport(trackerId, reportId, trackerReportSettings);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerReportApi#updateTrackerReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trackerId** | **Integer**|  |
 **reportId** | **Integer**|  |
 **trackerReportSettings** | [**TrackerReportSettings**](TrackerReportSettings.md)|  | [optional]

### Return type

[**TrackerReportSettings**](TrackerReportSettings.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

