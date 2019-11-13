# RoleApi

All URIs are relative to *http://localhost:8080/cb/api/docs*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRole**](RoleApi.md#getRole) | **GET** /v2/role/{roleId} | Get role
[**getRoles**](RoleApi.md#getRoles) | **GET** /v2/role | Get roles


<a name="getRole"></a>
# **getRole**
> Role getRole(roleId)

Get role

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.api.RoleApi;


RoleApi apiInstance = new RoleApi();
Integer roleId = 56; // Integer | 
try {
    Role result = apiInstance.getRole(roleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#getRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roleId** | **Integer**|  |

### Return type

[**Role**](Role.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRoles"></a>
# **getRoles**
> List&lt;Role&gt; getRoles()

Get roles

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.api.RoleApi;


RoleApi apiInstance = new RoleApi();
try {
    List<Role> result = apiInstance.getRoles();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#getRoles");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Role&gt;**](Role.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

