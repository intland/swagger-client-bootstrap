# ProjectApi

All URIs are relative to *http://localhost:8080/cb/api/docs*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deployConfiguration**](ProjectApi.md#deployConfiguration) | **POST** /v2/project/deploy | Deploy a project configuration to a Project
[**export**](ProjectApi.md#export) | **POST** /v2/project/{projectId}/content | Exports the specified project to a zip file
[**getAllTrackersInProject**](ProjectApi.md#getAllTrackersInProject) | **POST** /v2/project/{projectId}/trackers | Get the list of all trackers in a project
[**getProjectById**](ProjectApi.md#getProjectById) | **GET** /v2/project/{projectId} | Get project
[**getProjects**](ProjectApi.md#getProjects) | **GET** /v2/project | Get projects
[**getTrackers**](ProjectApi.md#getTrackers) | **GET** /v2/project/{projectId}/trackers | Get trackers


<a name="deployConfiguration"></a>
# **deployConfiguration**
> Project deployConfiguration(deployProject)

Deploy a project configuration to a Project

The configuration file needs to be uploaded to codeBeamer Documents

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.api.ProjectApi;


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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="export"></a>
# **export**
> File export(projectId, exportProject)

Exports the specified project to a zip file

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
Integer projectId = 56; // Integer | 
ExportProject exportProject = new ExportProject(); // ExportProject | 
try {
    File result = apiInstance.export(projectId, exportProject);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#export");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Integer**|  |
 **exportProject** | [**ExportProject**](ExportProject.md)|  | [optional]

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/zip

<a name="getAllTrackersInProject"></a>
# **getAllTrackersInProject**
> List&lt;Tracker&gt; getAllTrackersInProject(projectId, trackerFilteringRequest)

Get the list of all trackers in a project

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
Integer projectId = 56; // Integer | 
TrackerFilteringRequest trackerFilteringRequest = new TrackerFilteringRequest(); // TrackerFilteringRequest | 
try {
    List<Tracker> result = apiInstance.getAllTrackersInProject(projectId, trackerFilteringRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#getAllTrackersInProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Integer**|  |
 **trackerFilteringRequest** | [**TrackerFilteringRequest**](TrackerFilteringRequest.md)|  | [optional]

### Return type

[**List&lt;Tracker&gt;**](Tracker.md)

### Authorization

No authorization required

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
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.api.ProjectApi;


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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProjects"></a>
# **getProjects**
> List&lt;Project&gt; getProjects()

Get projects

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
try {
    List<Project> result = apiInstance.getProjects();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#getProjects");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Project&gt;**](Project.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTrackers"></a>
# **getTrackers**
> List&lt;Tracker&gt; getTrackers(projectId)

Get trackers

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
Integer projectId = 56; // Integer | 
try {
    List<Tracker> result = apiInstance.getTrackers(projectId);
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

[**List&lt;Tracker&gt;**](Tracker.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

