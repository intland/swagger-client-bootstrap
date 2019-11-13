# TrackerReportApi

All URIs are relative to *http://localhost:8080/cb/api/docs*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTrackerReport**](TrackerReportApi.md#createTrackerReport) | **POST** /v2/tracker/{trackerId}/report | Creates a report of a specific tracker
[**deleteTrackerReport**](TrackerReportApi.md#deleteTrackerReport) | **DELETE** /v2/tracker/{trackerId}/report/{reportId} | Deletes a report of a specific tracker
[**getTrackerReport**](TrackerReportApi.md#getTrackerReport) | **GET** /v2/tracker/{trackerId}/report/{reportId}/results | Get a report of a specific tracker
[**updateTrackerReport**](TrackerReportApi.md#updateTrackerReport) | **PUT** /v2/tracker/{trackerId}/report/{reportId} | Updates a report of a specific tracker


<a name="createTrackerReport"></a>
# **createTrackerReport**
> TrackerReportSettings createTrackerReport(trackerId, trackerReportSettings)

Creates a report of a specific tracker

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.api.TrackerReportApi;


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

No authorization required

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
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.api.TrackerReportApi;


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

No authorization required

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
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.api.TrackerReportApi;


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

No authorization required

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
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.api.TrackerReportApi;


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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

