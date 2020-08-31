# TestManagementApi

All URIs are relative to *http://localhost:8080/cb/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**autoApplyStepReuses**](TestManagementApi.md#autoApplyStepReuses) | **POST** /v3/testcases/autoApplyStepReuses | Find duplicate TestSteps in a set of TestCases and converting duplicates to Reuses


<a name="autoApplyStepReuses"></a>
# **autoApplyStepReuses**
> List&lt;TrackerItemReference&gt; autoApplyStepReuses(autoApplyTestStepReuses)

Find duplicate TestSteps in a set of TestCases and converting duplicates to Reuses

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.TestManagementApi;

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

TestManagementApi apiInstance = new TestManagementApi();
AutoApplyTestStepReuses autoApplyTestStepReuses = new AutoApplyTestStepReuses(); // AutoApplyTestStepReuses | 
try {
    List<TrackerItemReference> result = apiInstance.autoApplyStepReuses(autoApplyTestStepReuses);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestManagementApi#autoApplyStepReuses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **autoApplyTestStepReuses** | [**AutoApplyTestStepReuses**](AutoApplyTestStepReuses.md)|  | [optional]

### Return type

[**List&lt;TrackerItemReference&gt;**](TrackerItemReference.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

