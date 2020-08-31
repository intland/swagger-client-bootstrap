# TestRunApi

All URIs are relative to *http://localhost:8080/cb/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTestRunForTestCase**](TestRunApi.md#createTestRunForTestCase) | **POST** /v3/trackers/{testRunTrackerId}/testruns | Create a new test run for test cases or test sets
[**updateTestRunResult**](TestRunApi.md#updateTestRunResult) | **PUT** /v3/testruns/{testRunId} | Update result of a Test Run


<a name="createTestRunForTestCase"></a>
# **createTestRunForTestCase**
> TrackerItem createTestRunForTestCase(testRunTrackerId, createTestRunRequest)

Create a new test run for test cases or test sets

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.TestRunApi;

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

TestRunApi apiInstance = new TestRunApi();
Integer testRunTrackerId = 56; // Integer | 
CreateTestRunRequest createTestRunRequest = new CreateTestRunRequest(); // CreateTestRunRequest | 
try {
    TrackerItem result = apiInstance.createTestRunForTestCase(testRunTrackerId, createTestRunRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestRunApi#createTestRunForTestCase");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **testRunTrackerId** | **Integer**|  |
 **createTestRunRequest** | [**CreateTestRunRequest**](CreateTestRunRequest.md)|  | [optional]

### Return type

[**TrackerItem**](TrackerItem.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateTestRunResult"></a>
# **updateTestRunResult**
> TrackerItem updateTestRunResult(testRunId, updateTestRunRequest)

Update result of a Test Run

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.TestRunApi;

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

TestRunApi apiInstance = new TestRunApi();
Integer testRunId = 56; // Integer | 
UpdateTestRunRequest updateTestRunRequest = new UpdateTestRunRequest(); // UpdateTestRunRequest | 
try {
    TrackerItem result = apiInstance.updateTestRunResult(testRunId, updateTestRunRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestRunApi#updateTestRunResult");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **testRunId** | **Integer**|  |
 **updateTestRunRequest** | [**UpdateTestRunRequest**](UpdateTestRunRequest.md)|  | [optional]

### Return type

[**TrackerItem**](TrackerItem.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

