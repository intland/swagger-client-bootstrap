# GroupApi

All URIs are relative to *http://localhost:8080/cb/api/docs*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getGroup**](GroupApi.md#getGroup) | **GET** /v2/user/group/{groupId} | Get user group
[**getGroups**](GroupApi.md#getGroups) | **GET** /v2/user/group | Get user groups


<a name="getGroup"></a>
# **getGroup**
> UserGroup getGroup(groupId)

Get user group

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.api.GroupApi;


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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getGroups"></a>
# **getGroups**
> List&lt;UserGroup&gt; getGroups()

Get user groups

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.api.GroupApi;


GroupApi apiInstance = new GroupApi();
try {
    List<UserGroup> result = apiInstance.getGroups();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#getGroups");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;UserGroup&gt;**](UserGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

