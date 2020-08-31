# GroupApi

All URIs are relative to *http://localhost:8080/cb/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getGroup**](GroupApi.md#getGroup) | **GET** /v3/users/groups/{groupId} | Get user group
[**getGroups**](GroupApi.md#getGroups) | **GET** /v3/users/groups | Get user groups


<a name="getGroup"></a>
# **getGroup**
> UserGroup getGroup(groupId)

Get user group

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.GroupApi;

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

GroupApi apiInstance = new GroupApi();
Integer groupId = 56; // Integer | 
try {
    UserGroup result = apiInstance.getGroup(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#getGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Integer**|  |

### Return type

[**UserGroup**](UserGroup.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getGroups"></a>
# **getGroups**
> List&lt;UserGroupReference&gt; getGroups()

Get user groups

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.GroupApi;

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

GroupApi apiInstance = new GroupApi();
try {
    List<UserGroupReference> result = apiInstance.getGroups();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#getGroups");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;UserGroupReference&gt;**](UserGroupReference.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

