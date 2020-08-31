# TraceabilityApi

All URIs are relative to *http://localhost:8080/cb/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTraceabilityInitialItemIds**](TraceabilityApi.md#getTraceabilityInitialItemIds) | **POST** /v3/traceability/items | Get initial ids
[**getTraceabilityLevelItemIds**](TraceabilityApi.md#getTraceabilityLevelItemIds) | **POST** /v3/traceability/relations | Get traceability level item ids


<a name="getTraceabilityInitialItemIds"></a>
# **getTraceabilityInitialItemIds**
> List&lt;TraceabilityItem&gt; getTraceabilityInitialItemIds(pageSize, pageNo, traceabilityInitialLevelFilter)

Get initial ids

Get traceability initial ids!

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.TraceabilityApi;

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

TraceabilityApi apiInstance = new TraceabilityApi();
Integer pageSize = 56; // Integer | Number of items in a result page.
Integer pageNo = 56; // Integer | Index of the result page.
TraceabilityInitialLevelFilter traceabilityInitialLevelFilter = new TraceabilityInitialLevelFilter(); // TraceabilityInitialLevelFilter | 
try {
    List<TraceabilityItem> result = apiInstance.getTraceabilityInitialItemIds(pageSize, pageNo, traceabilityInitialLevelFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TraceabilityApi#getTraceabilityInitialItemIds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Integer**| Number of items in a result page. | [optional]
 **pageNo** | **Integer**| Index of the result page. | [optional]
 **traceabilityInitialLevelFilter** | [**TraceabilityInitialLevelFilter**](TraceabilityInitialLevelFilter.md)|  | [optional]

### Return type

[**List&lt;TraceabilityItem&gt;**](TraceabilityItem.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTraceabilityLevelItemIds"></a>
# **getTraceabilityLevelItemIds**
> TraceabilityResult getTraceabilityLevelItemIds(itemsOnLevel, itemsFromPreviousItem, traceabilityLevelFilter)

Get traceability level item ids

Get traceability item ids!

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.TraceabilityApi;

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

TraceabilityApi apiInstance = new TraceabilityApi();
Integer itemsOnLevel = 56; // Integer | Number of items per level.
Integer itemsFromPreviousItem = 56; // Integer | Number of items per item.
TraceabilityLevelFilter traceabilityLevelFilter = new TraceabilityLevelFilter(); // TraceabilityLevelFilter | 
try {
    TraceabilityResult result = apiInstance.getTraceabilityLevelItemIds(itemsOnLevel, itemsFromPreviousItem, traceabilityLevelFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TraceabilityApi#getTraceabilityLevelItemIds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemsOnLevel** | **Integer**| Number of items per level. | [optional]
 **itemsFromPreviousItem** | **Integer**| Number of items per item. | [optional]
 **traceabilityLevelFilter** | [**TraceabilityLevelFilter**](TraceabilityLevelFilter.md)|  | [optional]

### Return type

[**TraceabilityResult**](TraceabilityResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

