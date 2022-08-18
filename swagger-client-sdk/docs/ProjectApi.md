# ProjectApi

All URIs are relative to *https://manual-test-server.intland.de:8111/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTracker**](ProjectApi.md#createTracker) | **POST** /v3/projects/{projectId}/trackers | Create a tracker |
| [**deployConfiguration**](ProjectApi.md#deployConfiguration) | **POST** /v3/projects/deploy | Deploy a project configuration to a Project |
| [**getMembersOfProject**](ProjectApi.md#getMembersOfProject) | **GET** /v3/projects/{projectId}/members | Get all members of a project |
| [**getProjectById**](ProjectApi.md#getProjectById) | **GET** /v3/projects/{projectId} | Get project |
| [**getProjectRolesOfMember**](ProjectApi.md#getProjectRolesOfMember) | **GET** /v3/projects/{projectId}/members/{userId}/permissions | Get all roles the user has on a project |
| [**getProjects**](ProjectApi.md#getProjects) | **GET** /v3/projects | Get projects |
| [**getTopLevelWikiPages**](ProjectApi.md#getTopLevelWikiPages) | **GET** /v3/projects/{projectId}/wikipages | Get wiki pages of a project |
| [**getTrackers**](ProjectApi.md#getTrackers) | **GET** /v3/projects/{projectId}/trackers | Get trackers |
| [**searchAllTrackersInProject**](ProjectApi.md#searchAllTrackersInProject) | **POST** /v3/projects/{projectId}/trackers/search | Get the list of all trackers in a project |
| [**searchProjects**](ProjectApi.md#searchProjects) | **POST** /v3/projects/search | Search projects by given criteria |


<a name="createTracker"></a>
# **createTracker**
> Tracker createTracker(projectId, tracker, templateId)

Create a tracker

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.ProjectApi;

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

    ProjectApi apiInstance = new ProjectApi(defaultClient);
    Integer projectId = 56; // Integer | 
    Tracker tracker = new Tracker(); // Tracker | 
    Integer templateId = 56; // Integer | Identifier of the template tracker.
    try {
      Tracker result = apiInstance.createTracker(projectId, tracker, templateId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectApi#createTracker");
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
| **projectId** | **Integer**|  | |
| **tracker** | [**Tracker**](Tracker.md)|  | |
| **templateId** | **Integer**| Identifier of the template tracker. | [optional] |

### Return type

[**Tracker**](Tracker.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Tracker settings |  -  |
| **400** | Bad Request |  -  |
| **403** | Bad request: Tracker settings validation failed. |  -  |
| **404** | Tracker not found |  -  |
| **429** | Too many requests |  -  |

<a name="deployConfiguration"></a>
# **deployConfiguration**
> Project deployConfiguration(deployProject)

Deploy a project configuration to a Project

The configuration file needs to be uploaded to codebeamer Documents

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.ProjectApi;

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

    ProjectApi apiInstance = new ProjectApi(defaultClient);
    DeployProject deployProject = new DeployProject(); // DeployProject | 
    try {
      Project result = apiInstance.deployConfiguration(deployProject);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectApi#deployConfiguration");
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
| **deployProject** | [**DeployProject**](DeployProject.md)|  | |

### Return type

[**Project**](Project.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project configuration deployed |  -  |
| **400** | Request cannot be processed |  -  |
| **403** | Authentication is required |  -  |
| **404** | Project or configuration file not found |  -  |
| **429** | Too many requests |  -  |
| **500** | Error when deploying the project configuration. |  -  |

<a name="getMembersOfProject"></a>
# **getMembersOfProject**
> MemberReferenceSearchResult getMembersOfProject(projectId, page, pageSize)

Get all members of a project

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.ProjectApi;

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

    ProjectApi apiInstance = new ProjectApi(defaultClient);
    Integer projectId = 56; // Integer | 
    Integer page = 1; // Integer | Index of the result page starting from 1.
    Integer pageSize = 25; // Integer | Number of items in a result page. Max value: 500
    try {
      MemberReferenceSearchResult result = apiInstance.getMembersOfProject(projectId, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectApi#getMembersOfProject");
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
| **projectId** | **Integer**|  | |
| **page** | **Integer**| Index of the result page starting from 1. | [optional] [default to 1] |
| **pageSize** | **Integer**| Number of items in a result page. Max value: 500 | [optional] [default to 25] |

### Return type

[**MemberReferenceSearchResult**](MemberReferenceSearchResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Member by id |  -  |
| **400** | Bad Request |  -  |
| **401** | Authentication is required |  -  |
| **403** | Authentication is required |  -  |
| **404** | Project is not found |  -  |
| **429** | Too many requests |  -  |

<a name="getProjectById"></a>
# **getProjectById**
> Project getProjectById(projectId)

Get project

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.ProjectApi;

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

    ProjectApi apiInstance = new ProjectApi(defaultClient);
    Integer projectId = 56; // Integer | 
    try {
      Project result = apiInstance.getProjectById(projectId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectApi#getProjectById");
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
| **projectId** | **Integer**|  | |

### Return type

[**Project**](Project.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project |  -  |
| **400** | Bad Request |  -  |
| **401** | Authentication is required |  -  |
| **403** | Authentication is required |  -  |
| **404** | Project not found |  -  |
| **429** | Too many requests |  -  |

<a name="getProjectRolesOfMember"></a>
# **getProjectRolesOfMember**
> ProjectMemberPermissions getProjectRolesOfMember(projectId, userId)

Get all roles the user has on a project

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.ProjectApi;

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

    ProjectApi apiInstance = new ProjectApi(defaultClient);
    Integer projectId = 56; // Integer | 
    Integer userId = 56; // Integer | 
    try {
      ProjectMemberPermissions result = apiInstance.getProjectRolesOfMember(projectId, userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectApi#getProjectRolesOfMember");
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
| **projectId** | **Integer**|  | |
| **userId** | **Integer**|  | |

### Return type

[**ProjectMemberPermissions**](ProjectMemberPermissions.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Roles |  -  |
| **400** | Bad Request |  -  |
| **401** | Authentication is required |  -  |
| **404** | User is not a member of the project |  -  |
| **429** | Too many requests |  -  |

<a name="getProjects"></a>
# **getProjects**
> List&lt;ProjectReference&gt; getProjects()

Get projects

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.ProjectApi;

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

    ProjectApi apiInstance = new ProjectApi(defaultClient);
    try {
      List<ProjectReference> result = apiInstance.getProjects();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectApi#getProjects");
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

[**List&lt;ProjectReference&gt;**](ProjectReference.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Projects |  -  |
| **400** | Bad Request |  -  |
| **401** | Authentication is required |  -  |
| **403** | Authentication is required |  -  |
| **404** | Project not found |  -  |
| **429** | Too many requests |  -  |

<a name="getTopLevelWikiPages"></a>
# **getTopLevelWikiPages**
> WikiOutlineSearchResult getTopLevelWikiPages(projectId)

Get wiki pages of a project

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.ProjectApi;

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

    ProjectApi apiInstance = new ProjectApi(defaultClient);
    Integer projectId = 56; // Integer | ID of the project
    try {
      WikiOutlineSearchResult result = apiInstance.getTopLevelWikiPages(projectId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectApi#getTopLevelWikiPages");
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
| **projectId** | **Integer**| ID of the project | |

### Return type

[**WikiOutlineSearchResult**](WikiOutlineSearchResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The list of wiki pages |  -  |
| **400** | Bad Request |  -  |
| **401** | Authentication is required |  -  |
| **403** | Access denied |  -  |
| **404** | The project does not exists |  -  |
| **429** | Too many requests |  -  |

<a name="getTrackers"></a>
# **getTrackers**
> List&lt;TrackerReference&gt; getTrackers(projectId)

Get trackers

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.ProjectApi;

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

    ProjectApi apiInstance = new ProjectApi(defaultClient);
    Integer projectId = 56; // Integer | 
    try {
      List<TrackerReference> result = apiInstance.getTrackers(projectId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectApi#getTrackers");
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
| **projectId** | **Integer**|  | |

### Return type

[**List&lt;TrackerReference&gt;**](TrackerReference.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Trackers |  -  |
| **400** | Bad Request |  -  |
| **403** | Authentication is required |  -  |
| **404** | Project / Tracker not found |  -  |
| **429** | Too many requests |  -  |

<a name="searchAllTrackersInProject"></a>
# **searchAllTrackersInProject**
> TrackerSearchResult searchAllTrackersInProject(projectId, trackerFilteringRequest)

Get the list of all trackers in a project

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.ProjectApi;

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

    ProjectApi apiInstance = new ProjectApi(defaultClient);
    Integer projectId = 56; // Integer | 
    TrackerFilteringRequest trackerFilteringRequest = new TrackerFilteringRequest(); // TrackerFilteringRequest | 
    try {
      TrackerSearchResult result = apiInstance.searchAllTrackersInProject(projectId, trackerFilteringRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectApi#searchAllTrackersInProject");
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
| **projectId** | **Integer**|  | |
| **trackerFilteringRequest** | [**TrackerFilteringRequest**](TrackerFilteringRequest.md)|  | |

### Return type

[**TrackerSearchResult**](TrackerSearchResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Trackers |  -  |
| **400** | Bad Request |  -  |
| **403** | Authentication is required |  -  |
| **404** | Project / Tracker not found |  -  |
| **429** | Too many requests |  -  |

<a name="searchProjects"></a>
# **searchProjects**
> ProjectSearchResult searchProjects(projectFilteringRequest)

Search projects by given criteria

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.ProjectApi;

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

    ProjectApi apiInstance = new ProjectApi(defaultClient);
    ProjectFilteringRequest projectFilteringRequest = new ProjectFilteringRequest(); // ProjectFilteringRequest | 
    try {
      ProjectSearchResult result = apiInstance.searchProjects(projectFilteringRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectApi#searchProjects");
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
| **projectFilteringRequest** | [**ProjectFilteringRequest**](ProjectFilteringRequest.md)|  | |

### Return type

[**ProjectSearchResult**](ProjectSearchResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | One page of projects |  -  |
| **400** | Bad request |  -  |
| **401** | Authentication is required |  -  |
| **403** | Access denied |  -  |
| **429** | Too many requests |  -  |

