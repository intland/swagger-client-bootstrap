# TrackerPermissionApi

All URIs are relative to *http://localhost:8080/cb/api/docs*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTrackerPermission**](TrackerPermissionApi.md#getTrackerPermission) | **GET** /v2/trackers/permissions/{trackerPermissionId} | Get the immutable definition of a tracker permission
[**getTrackerPermissions**](TrackerPermissionApi.md#getTrackerPermissions) | **GET** /v2/trackers/permissions | Get available tracker permissions
[**getTrackerPermissionsWithRoles**](TrackerPermissionApi.md#getTrackerPermissionsWithRoles) | **GET** /v2/trackers/{trackerId}/permissions | List tracker permissions per role
[**updatePermission**](TrackerPermissionApi.md#updatePermission) | **PUT** /v2/trackers/{trackerId}/roles/{roleId}/permissions | Set the tracker permissions for a specific role


<a name="getTrackerPermission"></a>
# **getTrackerPermission**
> TrackerPermission getTrackerPermission(trackerPermissionId)

Get the immutable definition of a tracker permission

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.api.TrackerPermissionApi;


TrackerPermissionApi apiInstance = new TrackerPermissionApi();
Integer trackerPermissionId = 56; // Integer | 
try {
    TrackerPermission result = apiInstance.getTrackerPermission(trackerPermissionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerPermissionApi#getTrackerPermission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trackerPermissionId** | **Integer**|  |

### Return type

[**TrackerPermission**](TrackerPermission.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTrackerPermissions"></a>
# **getTrackerPermissions**
> List&lt;TrackerPermissionReference&gt; getTrackerPermissions()

Get available tracker permissions

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.api.TrackerPermissionApi;


TrackerPermissionApi apiInstance = new TrackerPermissionApi();
try {
    List<TrackerPermissionReference> result = apiInstance.getTrackerPermissions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerPermissionApi#getTrackerPermissions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;TrackerPermissionReference&gt;**](TrackerPermissionReference.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTrackerPermissionsWithRoles"></a>
# **getTrackerPermissionsWithRoles**
> List&lt;RoleWithPermissions&gt; getTrackerPermissionsWithRoles(trackerId, userId, roleId)

List tracker permissions per role

API can be used to list tracker permissions per roles, filtering is possible by user, user and on of the user&#39;s role, or just by role

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.api.TrackerPermissionApi;


TrackerPermissionApi apiInstance = new TrackerPermissionApi();
Integer trackerId = 56; // Integer | 
Integer userId = 56; // Integer | 
Integer roleId = 56; // Integer | 
try {
    List<RoleWithPermissions> result = apiInstance.getTrackerPermissionsWithRoles(trackerId, userId, roleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerPermissionApi#getTrackerPermissionsWithRoles");
    e.printStackTrace();
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updatePermission"></a>
# **updatePermission**
> List&lt;RoleWithPermissions&gt; updatePermission(trackerId, roleId, permissionIdsRequest)

Set the tracker permissions for a specific role

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.api.TrackerPermissionApi;


TrackerPermissionApi apiInstance = new TrackerPermissionApi();
Integer trackerId = 56; // Integer | 
Integer roleId = 56; // Integer | 
PermissionIdsRequest permissionIdsRequest = new PermissionIdsRequest(); // PermissionIdsRequest | 
try {
    List<RoleWithPermissions> result = apiInstance.updatePermission(trackerId, roleId, permissionIdsRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerPermissionApi#updatePermission");
    e.printStackTrace();
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

