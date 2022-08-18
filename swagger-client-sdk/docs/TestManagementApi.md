# TestManagementApi

All URIs are relative to *https://manual-test-server.intland.de:8111/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**autoApplyStepReuses**](TestManagementApi.md#autoApplyStepReuses) | **POST** /v3/testcases/autoApplyStepReuses | Find duplicate TestSteps in a set of TestCases and converting duplicates to Reuses |


<a name="autoApplyStepReuses"></a>
# **autoApplyStepReuses**
> List&lt;TrackerItemReference&gt; autoApplyStepReuses(autoApplyTestStepReuses)

Find duplicate TestSteps in a set of TestCases and converting duplicates to Reuses

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.TestManagementApi;

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

    TestManagementApi apiInstance = new TestManagementApi(defaultClient);
    AutoApplyTestStepReuses autoApplyTestStepReuses = new AutoApplyTestStepReuses(); // AutoApplyTestStepReuses | 
    try {
      List<TrackerItemReference> result = apiInstance.autoApplyStepReuses(autoApplyTestStepReuses);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TestManagementApi#autoApplyStepReuses");
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
| **autoApplyTestStepReuses** | [**AutoApplyTestStepReuses**](AutoApplyTestStepReuses.md)|  | |

### Return type

[**List&lt;TrackerItemReference&gt;**](TrackerItemReference.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The item-references of the modified tracker-items where duplicate Test Steps was found and converted to Reuses |  -  |
| **400** | Bad Request |  -  |
| **401** | Authentication is required |  -  |
| **403** | Authentication is required |  -  |
| **429** | Too many requests |  -  |

