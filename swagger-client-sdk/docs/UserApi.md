# UserApi

All URIs are relative to *http://localhost:8080/cb/api/docs*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUser**](UserApi.md#getUser) | **GET** /v2/user/{userId} | Get user
[**getUserByEmail**](UserApi.md#getUserByEmail) | **GET** /v2/user/findByEmail | Get user by email address
[**getUserByName**](UserApi.md#getUserByName) | **GET** /v2/user/findByName | Get user by name
[**getUsers**](UserApi.md#getUsers) | **GET** /v2/user | Get users


<a name="getUser"></a>
# **getUser**
> User getUser(userId)

Get user

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
Integer userId = 56; // Integer | 
try {
    User result = apiInstance.getUser(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**|  |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserByEmail"></a>
# **getUserByEmail**
> User getUserByEmail(email)

Get user by email address

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
String email = "email_example"; // String | 
try {
    User result = apiInstance.getUserByEmail(email);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getUserByEmail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**|  |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserByName"></a>
# **getUserByName**
> User getUserByName(name)

Get user by name

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
String name = "name_example"; // String | 
try {
    User result = apiInstance.getUserByName(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getUserByName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUsers"></a>
# **getUsers**
> UserSearchResult getUsers(page, pageSize, groupId, queryString)

Get users

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
Integer page = 1; // Integer | Index of the result page starting from 1.
Integer pageSize = 25; // Integer | Number of items in a result page. Max value: 500
Integer groupId = 56; // Integer | 
String queryString = Intland; // String | 
try {
    UserSearchResult result = apiInstance.getUsers(page, pageSize, groupId, queryString);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Index of the result page starting from 1. | [optional] [default to 1]
 **pageSize** | **Integer**| Number of items in a result page. Max value: 500 | [optional] [default to 25]
 **groupId** | **Integer**|  | [optional]
 **queryString** | **String**|  | [optional]

### Return type

[**UserSearchResult**](UserSearchResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

