# BackgroundJobApi

All URIs are relative to *https://manual-test-server.intland.de:8111/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getBackgroundJob**](BackgroundJobApi.md#getBackgroundJob) | **GET** /v3/job/{jobId} | Retrieve background job information |
| [**updateWorkingSet**](BackgroundJobApi.md#updateWorkingSet) | **POST** /v3/jobs/working-set-update | Create background job to update working-set |


<a name="getBackgroundJob"></a>
# **getBackgroundJob**
> BackgroundJob getBackgroundJob(jobId)

Retrieve background job information

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.BackgroundJobApi;

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

    BackgroundJobApi apiInstance = new BackgroundJobApi(defaultClient);
    Integer jobId = 56; // Integer | 
    try {
      BackgroundJob result = apiInstance.getBackgroundJob(jobId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BackgroundJobApi#getBackgroundJob");
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
| **jobId** | **Integer**|  | |

### Return type

[**BackgroundJob**](BackgroundJob.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Background Job Info |  -  |
| **400** | Bad Request |  -  |
| **403** | Authentication is required |  -  |
| **404** | Job not found |  -  |
| **429** | Too many requests |  -  |

<a name="updateWorkingSet"></a>
# **updateWorkingSet**
> JobReference updateWorkingSet(workingSetUpdateRequest)

Create background job to update working-set

This API can be used start a Job that merges changes from the source into the target Working-Set replacing the content of the specified target trackers completely.

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.BackgroundJobApi;

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

    BackgroundJobApi apiInstance = new BackgroundJobApi(defaultClient);
    WorkingSetUpdateRequest workingSetUpdateRequest = new WorkingSetUpdateRequest(); // WorkingSetUpdateRequest | 
    try {
      JobReference result = apiInstance.updateWorkingSet(workingSetUpdateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BackgroundJobApi#updateWorkingSet");
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
| **workingSetUpdateRequest** | [**WorkingSetUpdateRequest**](WorkingSetUpdateRequest.md)|  | |

### Return type

[**JobReference**](JobReference.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Job has been scheduled successfully |  -  |
| **400** | Bad request |  -  |
| **401** | Authentication is required |  -  |
| **403** | Authorization is required |  -  |
| **404** | Resource not found |  -  |
| **429** | Too many requests |  -  |
| **500** | Unexpected error |  -  |

