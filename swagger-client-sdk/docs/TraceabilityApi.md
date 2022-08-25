# TraceabilityApi

All URIs are relative to *http://localhost:8080/cb/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTraceabilityInitialItemIds**](TraceabilityApi.md#getTraceabilityInitialItemIds) | **POST** /v3/traceability/items | Get initial ids
[**getTraceabilityLevelItemIds**](TraceabilityApi.md#getTraceabilityLevelItemIds) | **POST** /v3/traceability/relations | Get traceability level item ids


<a name="getTraceabilityInitialItemIds"></a>
# **getTraceabilityInitialItemIds**
> List&lt;TraceabilityItem&gt; getTraceabilityInitialItemIds(traceabilityInitialLevelFilter, pageSize, pageNo)

Get initial ids

Get traceability initial ids!

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.TraceabilityApi;

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

    TraceabilityApi apiInstance = new TraceabilityApi(defaultClient);
    TraceabilityInitialLevelFilter traceabilityInitialLevelFilter = new TraceabilityInitialLevelFilter(); // TraceabilityInitialLevelFilter | 
    Integer pageSize = 56; // Integer | Number of items in a result page.
    Integer pageNo = 56; // Integer | Index of the result page.
    try {
      List<TraceabilityItem> result = apiInstance.getTraceabilityInitialItemIds(traceabilityInitialLevelFilter, pageSize, pageNo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TraceabilityApi#getTraceabilityInitialItemIds");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **traceabilityInitialLevelFilter** | [**TraceabilityInitialLevelFilter**](TraceabilityInitialLevelFilter.md)|  |
 **pageSize** | **Integer**| Number of items in a result page. | [optional]
 **pageNo** | **Integer**| Index of the result page. | [optional]

### Return type

[**List&lt;TraceabilityItem&gt;**](TraceabilityItem.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Tracker item list |  -  |
**400** | Bad Request |  -  |
**403** | Authentication is required |  -  |
**404** | Tracker not found |  -  |
**429** | Too many requests |  -  |

<a name="getTraceabilityLevelItemIds"></a>
# **getTraceabilityLevelItemIds**
> TraceabilityResult getTraceabilityLevelItemIds(traceabilityLevelFilter, itemsOnLevel, itemsFromPreviousItem)

Get traceability level item ids

Get traceability item ids!

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.TraceabilityApi;

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

    TraceabilityApi apiInstance = new TraceabilityApi(defaultClient);
    TraceabilityLevelFilter traceabilityLevelFilter = new TraceabilityLevelFilter(); // TraceabilityLevelFilter | 
    Integer itemsOnLevel = 56; // Integer | Number of items per level.
    Integer itemsFromPreviousItem = 56; // Integer | Number of items per item.
    try {
      TraceabilityResult result = apiInstance.getTraceabilityLevelItemIds(traceabilityLevelFilter, itemsOnLevel, itemsFromPreviousItem);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TraceabilityApi#getTraceabilityLevelItemIds");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **traceabilityLevelFilter** | [**TraceabilityLevelFilter**](TraceabilityLevelFilter.md)|  |
 **itemsOnLevel** | **Integer**| Number of items per level. | [optional]
 **itemsFromPreviousItem** | **Integer**| Number of items per item. | [optional]

### Return type

[**TraceabilityResult**](TraceabilityResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Traceability items list |  -  |
**400** | Bad Request |  -  |
**403** | Authentication is required |  -  |
**429** | Too many requests |  -  |

