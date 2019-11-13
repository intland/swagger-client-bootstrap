# ReportApi

All URIs are relative to *http://localhost:8080/cb/api/docs*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createReport**](ReportApi.md#createReport) | **POST** /v2/report | Create a report
[**getReportById**](ReportApi.md#getReportById) | **GET** /v2/report/{reportId}/results | Get a report results by id of the report
[**getReportItemsById**](ReportApi.md#getReportItemsById) | **GET** /v2/report/{reportId}/items | Get a report items by id of the report
[**updateReport**](ReportApi.md#updateReport) | **PUT** /v2/report/{reportId} | Update report settings


<a name="createReport"></a>
# **createReport**
> SimpleReportSettings createReport(simpleReportSettings)

Create a report

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.api.ReportApi;


ReportApi apiInstance = new ReportApi();
SimpleReportSettings simpleReportSettings = new SimpleReportSettings(); // SimpleReportSettings | 
try {
    SimpleReportSettings result = apiInstance.createReport(simpleReportSettings);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportApi#createReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **simpleReportSettings** | [**SimpleReportSettings**](SimpleReportSettings.md)|  | [optional]

### Return type

[**SimpleReportSettings**](SimpleReportSettings.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getReportById"></a>
# **getReportById**
> ReportResult getReportById(reportId, page, pageSize)

Get a report results by id of the report

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.api.ReportApi;


ReportApi apiInstance = new ReportApi();
Integer reportId = 56; // Integer | Id of a report
Integer page = 1; // Integer | Index of a report page starting from 1.
Integer pageSize = 25; // Integer | Number of items a report page. Max value: 500
try {
    ReportResult result = apiInstance.getReportById(reportId, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportApi#getReportById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportId** | **Integer**| Id of a report |
 **page** | **Integer**| Index of a report page starting from 1. | [optional] [default to 1]
 **pageSize** | **Integer**| Number of items a report page. Max value: 500 | [optional] [default to 25]

### Return type

[**ReportResult**](ReportResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReportItemsById"></a>
# **getReportItemsById**
> ReportItemResult getReportItemsById(reportId, page, pageSize)

Get a report items by id of the report

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.api.ReportApi;


ReportApi apiInstance = new ReportApi();
Integer reportId = 56; // Integer | Id of a report
Integer page = 1; // Integer | Index of a report page starting from 1.
Integer pageSize = 25; // Integer | Number of items a report page. Max value: 500
try {
    ReportItemResult result = apiInstance.getReportItemsById(reportId, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportApi#getReportItemsById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportId** | **Integer**| Id of a report |
 **page** | **Integer**| Index of a report page starting from 1. | [optional] [default to 1]
 **pageSize** | **Integer**| Number of items a report page. Max value: 500 | [optional] [default to 25]

### Return type

[**ReportItemResult**](ReportItemResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateReport"></a>
# **updateReport**
> SimpleReportSettings updateReport(reportId, simpleReportSettings)

Update report settings

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.api.ReportApi;


ReportApi apiInstance = new ReportApi();
Integer reportId = 56; // Integer | Id of a report
SimpleReportSettings simpleReportSettings = new SimpleReportSettings(); // SimpleReportSettings | 
try {
    SimpleReportSettings result = apiInstance.updateReport(reportId, simpleReportSettings);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportApi#updateReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportId** | **Integer**| Id of a report |
 **simpleReportSettings** | [**SimpleReportSettings**](SimpleReportSettings.md)|  | [optional]

### Return type

[**SimpleReportSettings**](SimpleReportSettings.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

