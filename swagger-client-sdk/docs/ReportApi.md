# ReportApi

All URIs are relative to *https://manual-test-server.intland.de:8111/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createReport**](ReportApi.md#createReport) | **POST** /v3/reports | Create a report |
| [**getReportById**](ReportApi.md#getReportById) | **GET** /v3/reports/{reportId}/results | Get a report results by id of the report |
| [**getReportItemsById**](ReportApi.md#getReportItemsById) | **GET** /v3/reports/{reportId}/items | Get a report items by id of the report |
| [**updateReport**](ReportApi.md#updateReport) | **PUT** /v3/reports/{reportId} | Update report settings |


<a name="createReport"></a>
# **createReport**
> SimpleReportSettings createReport(simpleReportSettings)

Create a report

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.ReportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://manual-test-server.intland.de:8111/api");
    
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

    ReportApi apiInstance = new ReportApi(defaultClient);
    SimpleReportSettings simpleReportSettings = new SimpleReportSettings(); // SimpleReportSettings | 
    try {
      SimpleReportSettings result = apiInstance.createReport(simpleReportSettings);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportApi#createReport");
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
| **simpleReportSettings** | [**SimpleReportSettings**](SimpleReportSettings.md)|  | |

### Return type

[**SimpleReportSettings**](SimpleReportSettings.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Report settings |  -  |
| **400** | Bad request |  -  |
| **403** | Authentication is required |  -  |
| **429** | Too many requests |  -  |

<a name="getReportById"></a>
# **getReportById**
> ReportResult getReportById(reportId, page, pageSize)

Get a report results by id of the report

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.ReportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://manual-test-server.intland.de:8111/api");
    
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

    ReportApi apiInstance = new ReportApi(defaultClient);
    Integer reportId = 56; // Integer | Id of a report
    Integer page = 1; // Integer | Index of a report page starting from 1.
    Integer pageSize = 25; // Integer | Number of items a report page. Max value: 500
    try {
      ReportResult result = apiInstance.getReportById(reportId, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportApi#getReportById");
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
| **reportId** | **Integer**| Id of a report | |
| **page** | **Integer**| Index of a report page starting from 1. | [optional] [default to 1] |
| **pageSize** | **Integer**| Number of items a report page. Max value: 500 | [optional] [default to 25] |

### Return type

[**ReportResult**](ReportResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Report content by id |  -  |
| **400** | Bad Request |  -  |
| **403** | Authentication is required |  -  |
| **404** | Report not found |  -  |
| **429** | Too many requests |  -  |

<a name="getReportItemsById"></a>
# **getReportItemsById**
> ReportItemResult getReportItemsById(reportId, page, pageSize)

Get a report items by id of the report

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.ReportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://manual-test-server.intland.de:8111/api");
    
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

    ReportApi apiInstance = new ReportApi(defaultClient);
    Integer reportId = 56; // Integer | Id of a report
    Integer page = 1; // Integer | Index of a report page starting from 1.
    Integer pageSize = 25; // Integer | Number of items a report page. Max value: 500
    try {
      ReportItemResult result = apiInstance.getReportItemsById(reportId, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportApi#getReportItemsById");
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
| **reportId** | **Integer**| Id of a report | |
| **page** | **Integer**| Index of a report page starting from 1. | [optional] [default to 1] |
| **pageSize** | **Integer**| Number of items a report page. Max value: 500 | [optional] [default to 25] |

### Return type

[**ReportItemResult**](ReportItemResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Report items by id |  -  |
| **400** | Bad Request |  -  |
| **403** | Authentication is required |  -  |
| **404** | Report not found |  -  |
| **429** | Too many requests |  -  |

<a name="updateReport"></a>
# **updateReport**
> SimpleReportSettings updateReport(reportId, simpleReportSettings)

Update report settings

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.ReportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://manual-test-server.intland.de:8111/api");
    
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

    ReportApi apiInstance = new ReportApi(defaultClient);
    Integer reportId = 56; // Integer | Id of a report
    SimpleReportSettings simpleReportSettings = new SimpleReportSettings(); // SimpleReportSettings | 
    try {
      SimpleReportSettings result = apiInstance.updateReport(reportId, simpleReportSettings);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportApi#updateReport");
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
| **reportId** | **Integer**| Id of a report | |
| **simpleReportSettings** | [**SimpleReportSettings**](SimpleReportSettings.md)|  | |

### Return type

[**SimpleReportSettings**](SimpleReportSettings.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Updated report settings |  -  |
| **400** | Bad request |  -  |
| **403** | Authentication is required |  -  |
| **429** | Too many requests |  -  |

