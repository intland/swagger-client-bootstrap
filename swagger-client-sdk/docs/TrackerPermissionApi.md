# TrackerPermissionApi

All URIs are relative to *http://localhost:8080/cb/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTrackerPermission**](TrackerPermissionApi.md#getTrackerPermission) | **GET** /v3/trackers/permissions/{trackerPermissionId} | Get the immutable definition of a tracker permission
[**getTrackerPermissions**](TrackerPermissionApi.md#getTrackerPermissions) | **GET** /v3/trackers/permissions | Get available tracker permissions
[**getTrackerPermissionsWithRoles**](TrackerPermissionApi.md#getTrackerPermissionsWithRoles) | **GET** /v3/trackers/{trackerId}/permissions | List tracker permissions per role
[**removePermissions**](TrackerPermissionApi.md#removePermissions) | **DELETE** /v3/trackers/{trackerId}/roles/{roleId}/permissions | Removes all tracker permissions from a specific role
[**updatePermission**](TrackerPermissionApi.md#updatePermission) | **PUT** /v3/trackers/{trackerId}/roles/{roleId}/permissions | Set the tracker permissions for a specific role


<a name="getTrackerPermission"></a>
# **getTrackerPermission**
> TrackerPermission getTrackerPermission(trackerPermissionId)

Get the immutable definition of a tracker permission

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.TrackerPermissionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/cb/api");
    
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

    TrackerPermissionApi apiInstance = new TrackerPermissionApi(defaultClient);
    Integer trackerPermissionId = 56; // Integer | 
    try {
      TrackerPermission result = apiInstance.getTrackerPermission(trackerPermissionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackerPermissionApi#getTrackerPermission");
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
 **trackerPermissionId** | **Integer**|  |

### Return type

[**TrackerPermission**](TrackerPermission.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**403** | Authentication is required. |  -  |
**429** | Too many requests |  -  |
**200** | Tracker permission. |  -  |
**404** | Resource is not found |  -  |

<a name="getTrackerPermissions"></a>
# **getTrackerPermissions**
> List&lt;TrackerPermissionReference&gt; getTrackerPermissions()

Get available tracker permissions

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.TrackerPermissionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/cb/api");
    
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

    TrackerPermissionApi apiInstance = new TrackerPermissionApi(defaultClient);
    try {
      List<TrackerPermissionReference> result = apiInstance.getTrackerPermissions();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackerPermissionApi#getTrackerPermissions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;TrackerPermissionReference&gt;**](TrackerPermissionReference.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**403** | Authentication is required. |  -  |
**404** | Tracker permission is not found. |  -  |
**429** | Too many requests |  -  |
**200** | Tracker permissions. |  -  |

<a name="getTrackerPermissionsWithRoles"></a>
# **getTrackerPermissionsWithRoles**
> List&lt;RoleWithPermissions&gt; getTrackerPermissionsWithRoles(trackerId, userId, roleId)

List tracker permissions per role

API can be used to list tracker permissions per roles, filtering is possible by user, user and on of the user&#39;s role, or just by role

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.TrackerPermissionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/cb/api");
    
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

    TrackerPermissionApi apiInstance = new TrackerPermissionApi(defaultClient);
    Integer trackerId = 56; // Integer | 
    Integer userId = 56; // Integer | 
    Integer roleId = 56; // Integer | 
    try {
      List<RoleWithPermissions> result = apiInstance.getTrackerPermissionsWithRoles(trackerId, userId, roleId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackerPermissionApi#getTrackerPermissionsWithRoles");
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
 **trackerId** | **Integer**|  |
 **userId** | **Integer**|  | [optional]
 **roleId** | **Integer**|  | [optional]

### Return type

[**List&lt;RoleWithPermissions&gt;**](RoleWithPermissions.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**403** | Authentication is required. |  -  |
**429** | Too many requests |  -  |
**404** | Tracker is not found. |  -  |
**200** | Tracker permissions by role. |  -  |
**400** | No access permission for this resource |  -  |

<a name="removePermissions"></a>
# **removePermissions**
> removePermissions(trackerId, roleId)

Removes all tracker permissions from a specific role

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.TrackerPermissionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/cb/api");
    
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

    TrackerPermissionApi apiInstance = new TrackerPermissionApi(defaultClient);
    Integer trackerId = 56; // Integer | 
    Integer roleId = 56; // Integer | 
    try {
      apiInstance.removePermissions(trackerId, roleId);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackerPermissionApi#removePermissions");
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
 **trackerId** | **Integer**|  |
 **roleId** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**403** | Authentication is required |  -  |
**429** | Too many requests |  -  |
**200** | Tracker permissions were removed. |  -  |
**404** | Tracker/role is not found |  -  |

<a name="updatePermission"></a>
# **updatePermission**
> List&lt;RoleWithPermissions&gt; updatePermission(trackerId, roleId, permissionIdsRequest)

Set the tracker permissions for a specific role

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.TrackerPermissionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/cb/api");
    
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

    TrackerPermissionApi apiInstance = new TrackerPermissionApi(defaultClient);
    Integer trackerId = 56; // Integer | 
    Integer roleId = 56; // Integer | 
    PermissionIdsRequest permissionIdsRequest = new PermissionIdsRequest(); // PermissionIdsRequest | 
    try {
      List<RoleWithPermissions> result = apiInstance.updatePermission(trackerId, roleId, permissionIdsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackerPermissionApi#updatePermission");
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
 **trackerId** | **Integer**|  |
 **roleId** | **Integer**|  |
 **permissionIdsRequest** | [**PermissionIdsRequest**](PermissionIdsRequest.md)|  | [optional]

### Return type

[**List&lt;RoleWithPermissions&gt;**](RoleWithPermissions.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**403** | Authentication is required |  -  |
**200** | Tracker permissions are set |  -  |
**404** | Tracker / permission / roles not found |  -  |
**429** | Too many requests |  -  |

