# TrackerApi

All URIs are relative to *http://localhost:8080/cb/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteTracker**](TrackerApi.md#deleteTracker) | **DELETE** /v3/trackers/{trackerId} | Deletes a tracker
[**getChoiceOption**](TrackerApi.md#getChoiceOption) | **GET** /v3/trackers/{trackerId}/fields/{fieldId}/options/{optionId} | Get option of a choice field of tracker
[**getItemsByTracker**](TrackerApi.md#getItemsByTracker) | **GET** /v3/trackers/{trackerId}/items | Get items in a specific tracker
[**getTracker**](TrackerApi.md#getTracker) | **GET** /v3/trackers/{trackerId} | Get tracker
[**getTrackerField**](TrackerApi.md#getTrackerField) | **GET** /v3/trackers/{trackerId}/fields/{fieldId} | Get field of tracker
[**getTrackerFieldPermissions**](TrackerApi.md#getTrackerFieldPermissions) | **GET** /v3/trackers/{trackerId}/fields/{fieldId}/permissions | Get permissions of tracker field
[**getTrackerFields**](TrackerApi.md#getTrackerFields) | **GET** /v3/trackers/{trackerId}/fields | Get fields of tracker
[**getTrackerOutline**](TrackerApi.md#getTrackerOutline) | **GET** /v3/trackers/{trackerId}/outline | Get outline of a specific tracker
[**getTrackerSchema**](TrackerApi.md#getTrackerSchema) | **GET** /v3/trackers/{trackerId}/schema | Get the schema of a tracker
[**getTrackerTransitions**](TrackerApi.md#getTrackerTransitions) | **GET** /v3/trackers/{trackerId}/transitions | Get all transitions of a specific tracker
[**getTrackerType**](TrackerApi.md#getTrackerType) | **GET** /v3/trackers/types/{trackerTypeId} | Get the immutable definition of a tracker type
[**getTrackerTypes**](TrackerApi.md#getTrackerTypes) | **GET** /v3/trackers/types | Get the list of tracker types
[**updateTracker**](TrackerApi.md#updateTracker) | **PUT** /v3/trackers/{trackerId} | Updates a specific tracker
[**updateTrackerIcon**](TrackerApi.md#updateTrackerIcon) | **PUT** /v3/trackers/{trackerId}/icon | Upload a tracker icon


<a name="deleteTracker"></a>
# **deleteTracker**
> deleteTracker(trackerId)

Deletes a tracker

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.TrackerApi;

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

TrackerApi apiInstance = new TrackerApi();
Integer trackerId = 56; // Integer | 
try {
    apiInstance.deleteTracker(trackerId);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerApi#deleteTracker");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trackerId** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getChoiceOption"></a>
# **getChoiceOption**
> ChoiceOptionReference getChoiceOption(trackerId, fieldId, optionId)

Get option of a choice field of tracker

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.TrackerApi;

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

TrackerApi apiInstance = new TrackerApi();
Integer trackerId = 56; // Integer | 
Integer fieldId = 56; // Integer | 
Integer optionId = 56; // Integer | 
try {
    ChoiceOptionReference result = apiInstance.getChoiceOption(trackerId, fieldId, optionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerApi#getChoiceOption");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trackerId** | **Integer**|  |
 **fieldId** | **Integer**|  |
 **optionId** | **Integer**|  |

### Return type

[**ChoiceOptionReference**](ChoiceOptionReference.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getItemsByTracker"></a>
# **getItemsByTracker**
> TrackerItemReferenceSearchResult getItemsByTracker(trackerId, page, pageSize)

Get items in a specific tracker

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.TrackerApi;

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

TrackerApi apiInstance = new TrackerApi();
Integer trackerId = 56; // Integer | 
Integer page = 1; // Integer | Index of the result page starting from 1.
Integer pageSize = 25; // Integer | Number of items in a result page. Max value: 500
try {
    TrackerItemReferenceSearchResult result = apiInstance.getItemsByTracker(trackerId, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerApi#getItemsByTracker");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trackerId** | **Integer**|  |
 **page** | **Integer**| Index of the result page starting from 1. | [optional] [default to 1]
 **pageSize** | **Integer**| Number of items in a result page. Max value: 500 | [optional] [default to 25]

### Return type

[**TrackerItemReferenceSearchResult**](TrackerItemReferenceSearchResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTracker"></a>
# **getTracker**
> Tracker getTracker(trackerId)

Get tracker

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.TrackerApi;

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

TrackerApi apiInstance = new TrackerApi();
Integer trackerId = 56; // Integer | 
try {
    Tracker result = apiInstance.getTracker(trackerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerApi#getTracker");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trackerId** | **Integer**|  |

### Return type

[**Tracker**](Tracker.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTrackerField"></a>
# **getTrackerField**
> AbstractField getTrackerField(trackerId, fieldId)

Get field of tracker

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.TrackerApi;

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

TrackerApi apiInstance = new TrackerApi();
Integer trackerId = 56; // Integer | 
Integer fieldId = 56; // Integer | 
try {
    AbstractField result = apiInstance.getTrackerField(trackerId, fieldId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerApi#getTrackerField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trackerId** | **Integer**|  |
 **fieldId** | **Integer**|  |

### Return type

[**AbstractField**](AbstractField.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTrackerFieldPermissions"></a>
# **getTrackerFieldPermissions**
> List&lt;TrackerFieldStatusPermissions&gt; getTrackerFieldPermissions(trackerId, fieldId, statusId)

Get permissions of tracker field

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.TrackerApi;

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

TrackerApi apiInstance = new TrackerApi();
Integer trackerId = 56; // Integer | 
Integer fieldId = 56; // Integer | 
Integer statusId = 56; // Integer | 
try {
    List<TrackerFieldStatusPermissions> result = apiInstance.getTrackerFieldPermissions(trackerId, fieldId, statusId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerApi#getTrackerFieldPermissions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trackerId** | **Integer**|  |
 **fieldId** | **Integer**|  |
 **statusId** | **Integer**|  | [optional]

### Return type

[**List&lt;TrackerFieldStatusPermissions&gt;**](TrackerFieldStatusPermissions.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTrackerFields"></a>
# **getTrackerFields**
> List&lt;FieldReference&gt; getTrackerFields(trackerId)

Get fields of tracker

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.TrackerApi;

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

TrackerApi apiInstance = new TrackerApi();
Integer trackerId = 56; // Integer | 
try {
    List<FieldReference> result = apiInstance.getTrackerFields(trackerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerApi#getTrackerFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trackerId** | **Integer**|  |

### Return type

[**List&lt;FieldReference&gt;**](FieldReference.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTrackerOutline"></a>
# **getTrackerOutline**
> OutlineItemSearchResult getTrackerOutline(trackerId, parentItemId)

Get outline of a specific tracker

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.TrackerApi;

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

TrackerApi apiInstance = new TrackerApi();
Integer trackerId = 56; // Integer | 
Integer parentItemId = 56; // Integer | Show only the children of this item.
try {
    OutlineItemSearchResult result = apiInstance.getTrackerOutline(trackerId, parentItemId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerApi#getTrackerOutline");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trackerId** | **Integer**|  |
 **parentItemId** | **Integer**| Show only the children of this item. | [optional]

### Return type

[**OutlineItemSearchResult**](OutlineItemSearchResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTrackerSchema"></a>
# **getTrackerSchema**
> List&lt;AbstractField&gt; getTrackerSchema(trackerId)

Get the schema of a tracker

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.TrackerApi;

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

TrackerApi apiInstance = new TrackerApi();
Integer trackerId = 56; // Integer | 
try {
    List<AbstractField> result = apiInstance.getTrackerSchema(trackerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerApi#getTrackerSchema");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trackerId** | **Integer**|  |

### Return type

[**List&lt;AbstractField&gt;**](AbstractField.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTrackerTransitions"></a>
# **getTrackerTransitions**
> List&lt;WorkflowTransition&gt; getTrackerTransitions(trackerId, fromStatusId)

Get all transitions of a specific tracker

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.TrackerApi;

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

TrackerApi apiInstance = new TrackerApi();
Integer trackerId = 56; // Integer | 
Integer fromStatusId = 56; // Integer | The from status id filter for transitions.
try {
    List<WorkflowTransition> result = apiInstance.getTrackerTransitions(trackerId, fromStatusId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerApi#getTrackerTransitions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trackerId** | **Integer**|  |
 **fromStatusId** | **Integer**| The from status id filter for transitions. | [optional]

### Return type

[**List&lt;WorkflowTransition&gt;**](WorkflowTransition.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTrackerType"></a>
# **getTrackerType**
> TrackerType getTrackerType(trackerTypeId)

Get the immutable definition of a tracker type

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.TrackerApi;

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

TrackerApi apiInstance = new TrackerApi();
Integer trackerTypeId = 56; // Integer | 
try {
    TrackerType result = apiInstance.getTrackerType(trackerTypeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerApi#getTrackerType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trackerTypeId** | **Integer**|  |

### Return type

[**TrackerType**](TrackerType.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTrackerTypes"></a>
# **getTrackerTypes**
> List&lt;TrackerTypeReference&gt; getTrackerTypes(outline)

Get the list of tracker types

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.TrackerApi;

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

TrackerApi apiInstance = new TrackerApi();
String outline = "ANY"; // String | Outline is enabled, disabled or any(no filtering will be applied).
try {
    List<TrackerTypeReference> result = apiInstance.getTrackerTypes(outline);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerApi#getTrackerTypes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **outline** | **String**| Outline is enabled, disabled or any(no filtering will be applied). | [optional] [default to ANY] [enum: ENABLED, DISABLED, ANY]

### Return type

[**List&lt;TrackerTypeReference&gt;**](TrackerTypeReference.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateTracker"></a>
# **updateTracker**
> Tracker updateTracker(trackerId, tracker)

Updates a specific tracker

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.TrackerApi;

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

TrackerApi apiInstance = new TrackerApi();
Integer trackerId = 56; // Integer | 
Tracker tracker = new Tracker(); // Tracker | 
try {
    Tracker result = apiInstance.updateTracker(trackerId, tracker);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerApi#updateTracker");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trackerId** | **Integer**|  |
 **tracker** | [**Tracker**](Tracker.md)|  | [optional]

### Return type

[**Tracker**](Tracker.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateTrackerIcon"></a>
# **updateTrackerIcon**
> updateTrackerIcon(trackerId, icon)

Upload a tracker icon

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.TrackerApi;

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

TrackerApi apiInstance = new TrackerApi();
Integer trackerId = 56; // Integer | Id of the tracker
File icon = new File("/path/to/file"); // File | 
try {
    apiInstance.updateTrackerIcon(trackerId, icon);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerApi#updateTrackerIcon");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trackerId** | **Integer**| Id of the tracker |
 **icon** | **File**|  | [optional]

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

