# BaselineApi

All URIs are relative to *http://adam-Precision-5570:8080/cb/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBaseline**](BaselineApi.md#createBaseline) | **POST** /v3/baselines | Create a project or tracker baseline


<a name="createBaseline"></a>
# **createBaseline**
> Baseline createBaseline(createBaselineRequest)

Create a project or tracker baseline

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.BaselineApi;

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

    BaselineApi apiInstance = new BaselineApi(defaultClient);
    CreateBaselineRequest createBaselineRequest = new CreateBaselineRequest(); // CreateBaselineRequest | 
    try {
      Baseline result = apiInstance.createBaseline(createBaselineRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BaselineApi#createBaseline");
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
 **createBaselineRequest** | [**CreateBaselineRequest**](CreateBaselineRequest.md)|  | [optional]

### Return type

[**Baseline**](Baseline.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**400** | Bad request |  -  |
**404** | Project or tracker not found |  -  |
**200** | Baseline created successfully |  -  |
**403** | Authentication is required or user has no permission |  -  |
**429** | Too many requests |  -  |
**401** | Authentication is required |  -  |

