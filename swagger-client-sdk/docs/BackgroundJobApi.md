# BackgroundJobApi

All URIs are relative to *http://adam-Precision-5570:8080/cb/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBackgroundJob**](BackgroundJobApi.md#getBackgroundJob) | **GET** /v3/job/{jobId} | Retrieve background job information


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
    defaultClient.setBasePath("http://adam-Precision-5570:8080/cb/api");
    
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **Integer**|  |

### Return type

[**BackgroundJob**](BackgroundJob.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**403** | Authentication is required |  -  |
**404** | Job not found |  -  |
**200** | Background Job Info |  -  |
**429** | Too many requests |  -  |

