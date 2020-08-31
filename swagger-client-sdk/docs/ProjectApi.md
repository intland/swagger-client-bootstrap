# ProjectApi

All URIs are relative to *http://localhost:8080/cb/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTracker**](ProjectApi.md#createTracker) | **POST** /v3/projects/{projectId}/trackers | Create a tracker
[**deployConfiguration**](ProjectApi.md#deployConfiguration) | **POST** /v3/projects/deploy | Deploy a project configuration to a Project
[**getProjectById**](ProjectApi.md#getProjectById) | **GET** /v3/projects/{projectId} | Get project
[**getProjects**](ProjectApi.md#getProjects) | **GET** /v3/projects | Get projects
[**getTopLevelWikiPages**](ProjectApi.md#getTopLevelWikiPages) | **GET** /v3/projects/{projectId}/wikipages | Get wiki pages of a project
[**getTrackers**](ProjectApi.md#getTrackers) | **GET** /v3/projects/{projectId}/trackers | Get trackers
[**searchAllTrackersInProject**](ProjectApi.md#searchAllTrackersInProject) | **POST** /v3/projects/{projectId}/trackers/search | Get the list of all trackers in a project
[**searchProjects**](ProjectApi.md#searchProjects) | **POST** /v3/projects/search | Search projects by given criteria


<a name="createTracker"></a>
# **createTracker**
> Tracker createTracker(projectId, templateId, tracker)

Create a tracker

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.ProjectApi;

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

ProjectApi apiInstance = new ProjectApi();
Integer projectId = 56; // Integer | 
Integer templateId = 56; // Integer | Identifier of the template tracker.
Tracker tracker = new Tracker(); // Tracker | 
try {
    Tracker result = apiInstance.createTracker(projectId, templateId, tracker);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#createTracker");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Integer**|  |
 **templateId** | **Integer**| Identifier of the template tracker. | [optional]
 **tracker** | [**Tracker**](Tracker.md)|  | [optional]

### Return type

[**Tracker**](Tracker.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deployConfiguration"></a>
# **deployConfiguration**
> Project deployConfiguration(deployProject)

Deploy a project configuration to a Project

The configuration file needs to be uploaded to codeBeamer Documents

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.ProjectApi;

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

ProjectApi apiInstance = new ProjectApi();
DeployProject deployProject = new DeployProject(); // DeployProject | 
try {
    Project result = apiInstance.deployConfiguration(deployProject);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#deployConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deployProject** | [**DeployProject**](DeployProject.md)|  | [optional]

### Return type

[**Project**](Project.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProjectById"></a>
# **getProjectById**
> Project getProjectById(projectId)

Get project

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.ProjectApi;

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

ProjectApi apiInstance = new ProjectApi();
Integer projectId = 56; // Integer | 
try {
    Project result = apiInstance.getProjectById(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#getProjectById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Integer**|  |

### Return type

[**Project**](Project.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProjects"></a>
# **getProjects**
> List&lt;ProjectReference&gt; getProjects()

Get projects

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.ProjectApi;

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

ProjectApi apiInstance = new ProjectApi();
try {
    List<ProjectReference> result = apiInstance.getProjects();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#getProjects");
    e.printStackTrace();
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
 - **Accept**: application/json

<a name="getTopLevelWikiPages"></a>
# **getTopLevelWikiPages**
> WikiOutlineSearchResult getTopLevelWikiPages(projectId)

Get wiki pages of a project

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.ProjectApi;

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

ProjectApi apiInstance = new ProjectApi();
Integer projectId = 56; // Integer | ID of the project
try {
    WikiOutlineSearchResult result = apiInstance.getTopLevelWikiPages(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#getTopLevelWikiPages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Integer**| ID of the project |

### Return type

[**WikiOutlineSearchResult**](WikiOutlineSearchResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTrackers"></a>
# **getTrackers**
> List&lt;TrackerReference&gt; getTrackers(projectId)

Get trackers

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.ProjectApi;

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

ProjectApi apiInstance = new ProjectApi();
Integer projectId = 56; // Integer | 
try {
    List<TrackerReference> result = apiInstance.getTrackers(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#getTrackers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Integer**|  |

### Return type

[**List&lt;TrackerReference&gt;**](TrackerReference.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="searchAllTrackersInProject"></a>
# **searchAllTrackersInProject**
> TrackerSearchResult searchAllTrackersInProject(projectId, trackerFilteringRequest)

Get the list of all trackers in a project

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.ProjectApi;

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

ProjectApi apiInstance = new ProjectApi();
Integer projectId = 56; // Integer | 
TrackerFilteringRequest trackerFilteringRequest = new TrackerFilteringRequest(); // TrackerFilteringRequest | 
try {
    TrackerSearchResult result = apiInstance.searchAllTrackersInProject(projectId, trackerFilteringRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#searchAllTrackersInProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Integer**|  |
 **trackerFilteringRequest** | [**TrackerFilteringRequest**](TrackerFilteringRequest.md)|  | [optional]

### Return type

[**TrackerSearchResult**](TrackerSearchResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="searchProjects"></a>
# **searchProjects**
> ProjectSearchResult searchProjects(projectFilteringRequest)

Search projects by given criteria

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.ProjectApi;

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

ProjectApi apiInstance = new ProjectApi();
ProjectFilteringRequest projectFilteringRequest = new ProjectFilteringRequest(); // ProjectFilteringRequest | 
try {
    ProjectSearchResult result = apiInstance.searchProjects(projectFilteringRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#searchProjects");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectFilteringRequest** | [**ProjectFilteringRequest**](ProjectFilteringRequest.md)|  | [optional]

### Return type

[**ProjectSearchResult**](ProjectSearchResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

