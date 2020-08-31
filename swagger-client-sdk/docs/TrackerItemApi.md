# TrackerItemApi

All URIs are relative to *http://localhost:8080/cb/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addChildToTrackerItem**](TrackerItemApi.md#addChildToTrackerItem) | **POST** /v3/items/{itemId}/children | Add a child item to a tracker item
[**checkTrackerItemLock**](TrackerItemApi.md#checkTrackerItemLock) | **GET** /v3/items/{itemId}/lock | Check whether a tracker item is locked, and if it is, retrieve the details of the lock
[**createTrackerItem**](TrackerItemApi.md#createTrackerItem) | **POST** /v3/trackers/{trackerId}/items | Create a tracker item
[**deleteTrackerItem**](TrackerItemApi.md#deleteTrackerItem) | **DELETE** /v3/items/{itemId} | Delete tracker item
[**findTrackerItemChildren**](TrackerItemApi.md#findTrackerItemChildren) | **GET** /v3/items/{itemId}/children | Get child items of a tracker item
[**findTrackerItems**](TrackerItemApi.md#findTrackerItems) | **GET** /v3/items/query | Get tracker items by cbQL query string
[**findTrackerItemsByCbQL**](TrackerItemApi.md#findTrackerItemsByCbQL) | **POST** /v3/items/query | Get tracker items by cbQL query string
[**getBaselineTrackerItemRelations**](TrackerItemApi.md#getBaselineTrackerItemRelations) | **GET** /v3/items/{itemId}/relations | Get tracker items for a baseline version
[**getBaselineTrackerItemsRelations**](TrackerItemApi.md#getBaselineTrackerItemsRelations) | **POST** /v3/items/relations | Get tracker items for a baseline version
[**getChoiceOptions**](TrackerItemApi.md#getChoiceOptions) | **GET** /v3/items/{itemId}/fields/{fieldId}/options | Get the options of a choice field of tracker
[**getTrackerItem**](TrackerItemApi.md#getTrackerItem) | **GET** /v3/items/{itemId} | Get basic tracker item
[**getTrackerItemHistory**](TrackerItemApi.md#getTrackerItemHistory) | **GET** /v3/items/{itemId}/history | Get tracker item history
[**getTrackerItemReviews**](TrackerItemApi.md#getTrackerItemReviews) | **GET** /v3/items/{itemId}/reviews | Get all Tracker Item Reviews for a particular Tracker Item
[**getTrackerItemTransitions**](TrackerItemApi.md#getTrackerItemTransitions) | **GET** /v3/items/{itemId}/transitions | Get available transitions for a tracker item
[**lockTrackerItem**](TrackerItemApi.md#lockTrackerItem) | **PUT** /v3/items/{itemId}/lock | Put a soft lock on a tracker item
[**patchChildrenOfTrackerItem**](TrackerItemApi.md#patchChildrenOfTrackerItem) | **PATCH** /v3/items/{itemId}/children | Patch the child item list of a tracker item
[**replaceChildrenOfTrackerItem**](TrackerItemApi.md#replaceChildrenOfTrackerItem) | **PUT** /v3/items/{itemId}/children | Replace the child item list of a tracker item
[**unlockTrackerItem**](TrackerItemApi.md#unlockTrackerItem) | **DELETE** /v3/items/{itemId}/lock | Unlock a tracker item
[**updateCustomFieldTrackerItem**](TrackerItemApi.md#updateCustomFieldTrackerItem) | **PUT** /v3/items/{itemId}/fields | Update field of tracker item
[**updateTableFieldTrackerItem**](TrackerItemApi.md#updateTableFieldTrackerItem) | **PUT** /v3/items/{itemId}/fields/tables/{tableFieldId} | Update table field of tracker item
[**updateTrackerItem**](TrackerItemApi.md#updateTrackerItem) | **PUT** /v3/items/{itemId} | Update tracker item


<a name="addChildToTrackerItem"></a>
# **addChildToTrackerItem**
> TrackerItemChildReference addChildToTrackerItem(itemId, trackerItemRevision)

Add a child item to a tracker item

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.TrackerItemApi;

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

TrackerItemApi apiInstance = new TrackerItemApi();
Integer itemId = 56; // Integer | 
TrackerItemRevision trackerItemRevision = new TrackerItemRevision(); // TrackerItemRevision | 
try {
    TrackerItemChildReference result = apiInstance.addChildToTrackerItem(itemId, trackerItemRevision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemApi#addChildToTrackerItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **Integer**|  |
 **trackerItemRevision** | [**TrackerItemRevision**](TrackerItemRevision.md)|  | [optional]

### Return type

[**TrackerItemChildReference**](TrackerItemChildReference.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="checkTrackerItemLock"></a>
# **checkTrackerItemLock**
> LockInfo checkTrackerItemLock(itemId)

Check whether a tracker item is locked, and if it is, retrieve the details of the lock

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.TrackerItemApi;

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

TrackerItemApi apiInstance = new TrackerItemApi();
Integer itemId = 56; // Integer | Tracker item id
try {
    LockInfo result = apiInstance.checkTrackerItemLock(itemId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemApi#checkTrackerItemLock");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **Integer**| Tracker item id |

### Return type

[**LockInfo**](LockInfo.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createTrackerItem"></a>
# **createTrackerItem**
> TrackerItem createTrackerItem(trackerId, parentItemId, referenceItemId, position, trackerItem)

Create a tracker item

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.TrackerItemApi;

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

TrackerItemApi apiInstance = new TrackerItemApi();
Integer trackerId = 56; // Integer | 
Integer parentItemId = 56; // Integer | 
Integer referenceItemId = 56; // Integer | 
String position = "position_example"; // String | 
TrackerItem trackerItem = new TrackerItem(); // TrackerItem | 
try {
    TrackerItem result = apiInstance.createTrackerItem(trackerId, parentItemId, referenceItemId, position, trackerItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemApi#createTrackerItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trackerId** | **Integer**|  |
 **parentItemId** | **Integer**|  | [optional]
 **referenceItemId** | **Integer**|  | [optional]
 **position** | **String**|  | [optional] [enum: BEFORE, AFTER, BELOW]
 **trackerItem** | [**TrackerItem**](TrackerItem.md)|  | [optional]

### Return type

[**TrackerItem**](TrackerItem.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTrackerItem"></a>
# **deleteTrackerItem**
> TrackerItem deleteTrackerItem(itemId)

Delete tracker item

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.TrackerItemApi;

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

TrackerItemApi apiInstance = new TrackerItemApi();
Integer itemId = 56; // Integer | 
try {
    TrackerItem result = apiInstance.deleteTrackerItem(itemId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemApi#deleteTrackerItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **Integer**|  |

### Return type

[**TrackerItem**](TrackerItem.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findTrackerItemChildren"></a>
# **findTrackerItemChildren**
> TrackerItemReferenceSearchResult findTrackerItemChildren(itemId, page, pageSize)

Get child items of a tracker item

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.TrackerItemApi;

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

TrackerItemApi apiInstance = new TrackerItemApi();
Integer itemId = 56; // Integer | 
Integer page = 1; // Integer | Index of the result page starting from 1.
Integer pageSize = 25; // Integer | Number of items in a result page. Max value: 500
try {
    TrackerItemReferenceSearchResult result = apiInstance.findTrackerItemChildren(itemId, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemApi#findTrackerItemChildren");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **Integer**|  |
 **page** | **Integer**| Index of the result page starting from 1. | [optional] [default to 1]
 **pageSize** | **Integer**| Number of items in a result page. Max value: 500 | [optional] [default to 25]

### Return type

[**TrackerItemReferenceSearchResult**](TrackerItemReferenceSearchResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findTrackerItems"></a>
# **findTrackerItems**
> TrackerItemSearchResult findTrackerItems(queryString, page, pageSize)

Get tracker items by cbQL query string

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.TrackerItemApi;

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

TrackerItemApi apiInstance = new TrackerItemApi();
String queryString = priority='Normal'; // String | 
Integer page = 1; // Integer | Index of the result page starting from 1.
Integer pageSize = 25; // Integer | Number of items in a result page. Max value: 500
try {
    TrackerItemSearchResult result = apiInstance.findTrackerItems(queryString, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemApi#findTrackerItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queryString** | **String**|  |
 **page** | **Integer**| Index of the result page starting from 1. | [optional] [default to 1]
 **pageSize** | **Integer**| Number of items in a result page. Max value: 500 | [optional] [default to 25]

### Return type

[**TrackerItemSearchResult**](TrackerItemSearchResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findTrackerItemsByCbQL"></a>
# **findTrackerItemsByCbQL**
> TrackerItemSearchResult findTrackerItemsByCbQL(trackerItemSearchRequest)

Get tracker items by cbQL query string

API can be called with a complex cbQL string to find tracker items

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.TrackerItemApi;

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

TrackerItemApi apiInstance = new TrackerItemApi();
TrackerItemSearchRequest trackerItemSearchRequest = new TrackerItemSearchRequest(); // TrackerItemSearchRequest | 
try {
    TrackerItemSearchResult result = apiInstance.findTrackerItemsByCbQL(trackerItemSearchRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemApi#findTrackerItemsByCbQL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trackerItemSearchRequest** | [**TrackerItemSearchRequest**](TrackerItemSearchRequest.md)|  | [optional]

### Return type

[**TrackerItemSearchResult**](TrackerItemSearchResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBaselineTrackerItemRelations"></a>
# **getBaselineTrackerItemRelations**
> TrackerItemRelationsResult getBaselineTrackerItemRelations(itemId, baselineId)

Get tracker items for a baseline version

API can be used for fetching basic information of tracker items at a specific baseline version

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.TrackerItemApi;

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

TrackerItemApi apiInstance = new TrackerItemApi();
Integer itemId = 56; // Integer | 
Integer baselineId = 56; // Integer | 
try {
    TrackerItemRelationsResult result = apiInstance.getBaselineTrackerItemRelations(itemId, baselineId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemApi#getBaselineTrackerItemRelations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **Integer**|  |
 **baselineId** | **Integer**|  | [optional]

### Return type

[**TrackerItemRelationsResult**](TrackerItemRelationsResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBaselineTrackerItemsRelations"></a>
# **getBaselineTrackerItemsRelations**
> List&lt;TrackerItemRelationsResult&gt; getBaselineTrackerItemsRelations(baselineId, trackerItemsRequest)

Get tracker items for a baseline version

API can be used for fetching basic information of tracker items at a specific baseline version

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.TrackerItemApi;

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

TrackerItemApi apiInstance = new TrackerItemApi();
Integer baselineId = 56; // Integer | 
TrackerItemsRequest trackerItemsRequest = new TrackerItemsRequest(); // TrackerItemsRequest | 
try {
    List<TrackerItemRelationsResult> result = apiInstance.getBaselineTrackerItemsRelations(baselineId, trackerItemsRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemApi#getBaselineTrackerItemsRelations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **baselineId** | **Integer**|  | [optional]
 **trackerItemsRequest** | [**TrackerItemsRequest**](TrackerItemsRequest.md)|  | [optional]

### Return type

[**List&lt;TrackerItemRelationsResult&gt;**](TrackerItemRelationsResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChoiceOptions"></a>
# **getChoiceOptions**
> ReferenceSearchResult getChoiceOptions(itemId, fieldId, page, pageSize)

Get the options of a choice field of tracker

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.TrackerItemApi;

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

TrackerItemApi apiInstance = new TrackerItemApi();
Integer itemId = 56; // Integer | 
Integer fieldId = 56; // Integer | 
Integer page = 1; // Integer | Index of the result page starting from 1.
Integer pageSize = 25; // Integer | Number of items in a result page. Max value: 500
try {
    ReferenceSearchResult result = apiInstance.getChoiceOptions(itemId, fieldId, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemApi#getChoiceOptions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **Integer**|  |
 **fieldId** | **Integer**|  |
 **page** | **Integer**| Index of the result page starting from 1. | [optional] [default to 1]
 **pageSize** | **Integer**| Number of items in a result page. Max value: 500 | [optional] [default to 25]

### Return type

[**ReferenceSearchResult**](ReferenceSearchResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTrackerItem"></a>
# **getTrackerItem**
> TrackerItem getTrackerItem(itemId, version, baselineId)

Get basic tracker item

API can be used for fetching basic information of a tracker item

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.TrackerItemApi;

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

TrackerItemApi apiInstance = new TrackerItemApi();
Integer itemId = 56; // Integer | 
Integer version = 56; // Integer | 
Integer baselineId = 56; // Integer | 
try {
    TrackerItem result = apiInstance.getTrackerItem(itemId, version, baselineId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemApi#getTrackerItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **Integer**|  |
 **version** | **Integer**|  | [optional]
 **baselineId** | **Integer**|  | [optional]

### Return type

[**TrackerItem**](TrackerItem.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTrackerItemHistory"></a>
# **getTrackerItemHistory**
> TrackerItemHistory getTrackerItemHistory(itemId)

Get tracker item history

API can be used for fetching basic information of a tracker item

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.TrackerItemApi;

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

TrackerItemApi apiInstance = new TrackerItemApi();
Integer itemId = 56; // Integer | 
try {
    TrackerItemHistory result = apiInstance.getTrackerItemHistory(itemId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemApi#getTrackerItemHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **Integer**|  |

### Return type

[**TrackerItemHistory**](TrackerItemHistory.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTrackerItemReviews"></a>
# **getTrackerItemReviews**
> List&lt;TrackerItemReview&gt; getTrackerItemReviews(itemId)

Get all Tracker Item Reviews for a particular Tracker Item

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.TrackerItemApi;

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

TrackerItemApi apiInstance = new TrackerItemApi();
Integer itemId = 56; // Integer | 
try {
    List<TrackerItemReview> result = apiInstance.getTrackerItemReviews(itemId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemApi#getTrackerItemReviews");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **Integer**|  |

### Return type

[**List&lt;TrackerItemReview&gt;**](TrackerItemReview.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTrackerItemTransitions"></a>
# **getTrackerItemTransitions**
> List&lt;WorkflowTransition&gt; getTrackerItemTransitions(itemId)

Get available transitions for a tracker item

API can be used for getting available transitions for a tracker item

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.TrackerItemApi;

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

TrackerItemApi apiInstance = new TrackerItemApi();
Integer itemId = 56; // Integer | 
try {
    List<WorkflowTransition> result = apiInstance.getTrackerItemTransitions(itemId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemApi#getTrackerItemTransitions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **Integer**|  |

### Return type

[**List&lt;WorkflowTransition&gt;**](WorkflowTransition.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="lockTrackerItem"></a>
# **lockTrackerItem**
> lockTrackerItem(itemId, lockRequest)

Put a soft lock on a tracker item

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.TrackerItemApi;

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

TrackerItemApi apiInstance = new TrackerItemApi();
Integer itemId = 56; // Integer | Tracker item id
LockRequest lockRequest = new LockRequest(); // LockRequest | Requested lock configuration
try {
    apiInstance.lockTrackerItem(itemId, lockRequest);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemApi#lockTrackerItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **Integer**| Tracker item id |
 **lockRequest** | [**LockRequest**](LockRequest.md)| Requested lock configuration | [optional]

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="patchChildrenOfTrackerItem"></a>
# **patchChildrenOfTrackerItem**
> TrackerItemChildReference patchChildrenOfTrackerItem(itemId, mode, trackerItemChildReference)

Patch the child item list of a tracker item

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.TrackerItemApi;

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

TrackerItemApi apiInstance = new TrackerItemApi();
Integer itemId = 56; // Integer | 
String mode = "mode_example"; // String | 
TrackerItemChildReference trackerItemChildReference = new TrackerItemChildReference(); // TrackerItemChildReference | 
try {
    TrackerItemChildReference result = apiInstance.patchChildrenOfTrackerItem(itemId, mode, trackerItemChildReference);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemApi#patchChildrenOfTrackerItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **Integer**|  |
 **mode** | **String**|  | [enum: INSERT, REPLACE, REMOVE]
 **trackerItemChildReference** | [**TrackerItemChildReference**](TrackerItemChildReference.md)|  | [optional]

### Return type

[**TrackerItemChildReference**](TrackerItemChildReference.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="replaceChildrenOfTrackerItem"></a>
# **replaceChildrenOfTrackerItem**
> TrackerItemReferenceSearchResult replaceChildrenOfTrackerItem(itemId, resultPageSize, updateTrackerItemChildrenRequest)

Replace the child item list of a tracker item

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.TrackerItemApi;

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

TrackerItemApi apiInstance = new TrackerItemApi();
Integer itemId = 56; // Integer | 
Integer resultPageSize = 25; // Integer | Number of items in the result page. Max value: 500
UpdateTrackerItemChildrenRequest updateTrackerItemChildrenRequest = new UpdateTrackerItemChildrenRequest(); // UpdateTrackerItemChildrenRequest | 
try {
    TrackerItemReferenceSearchResult result = apiInstance.replaceChildrenOfTrackerItem(itemId, resultPageSize, updateTrackerItemChildrenRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemApi#replaceChildrenOfTrackerItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **Integer**|  |
 **resultPageSize** | **Integer**| Number of items in the result page. Max value: 500 | [optional] [default to 25]
 **updateTrackerItemChildrenRequest** | [**UpdateTrackerItemChildrenRequest**](UpdateTrackerItemChildrenRequest.md)|  | [optional]

### Return type

[**TrackerItemReferenceSearchResult**](TrackerItemReferenceSearchResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="unlockTrackerItem"></a>
# **unlockTrackerItem**
> unlockTrackerItem(itemId)

Unlock a tracker item

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.TrackerItemApi;

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

TrackerItemApi apiInstance = new TrackerItemApi();
Integer itemId = 56; // Integer | Tracker item id
try {
    apiInstance.unlockTrackerItem(itemId);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemApi#unlockTrackerItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **Integer**| Tracker item id |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateCustomFieldTrackerItem"></a>
# **updateCustomFieldTrackerItem**
> TrackerItem updateCustomFieldTrackerItem(itemId, quietMode, updateTrackerItemField)

Update field of tracker item

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.TrackerItemApi;

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

TrackerItemApi apiInstance = new TrackerItemApi();
Integer itemId = 56; // Integer | 
Boolean quietMode = false; // Boolean | If it's turned on HTTP 200 with empty response indicates that the update was successful.
UpdateTrackerItemField updateTrackerItemField = new UpdateTrackerItemField(); // UpdateTrackerItemField | 
try {
    TrackerItem result = apiInstance.updateCustomFieldTrackerItem(itemId, quietMode, updateTrackerItemField);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemApi#updateCustomFieldTrackerItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **Integer**|  |
 **quietMode** | **Boolean**| If it&#39;s turned on HTTP 200 with empty response indicates that the update was successful. | [optional] [default to false]
 **updateTrackerItemField** | [**UpdateTrackerItemField**](UpdateTrackerItemField.md)|  | [optional]

### Return type

[**TrackerItem**](TrackerItem.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateTableFieldTrackerItem"></a>
# **updateTableFieldTrackerItem**
> TrackerItem updateTableFieldTrackerItem(itemId, tableFieldId, updateTrackerItemTableField)

Update table field of tracker item

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.TrackerItemApi;

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

TrackerItemApi apiInstance = new TrackerItemApi();
Integer itemId = 56; // Integer | 
Integer tableFieldId = 56; // Integer | 
UpdateTrackerItemTableField updateTrackerItemTableField = new UpdateTrackerItemTableField(); // UpdateTrackerItemTableField | 
try {
    TrackerItem result = apiInstance.updateTableFieldTrackerItem(itemId, tableFieldId, updateTrackerItemTableField);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemApi#updateTableFieldTrackerItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **Integer**|  |
 **tableFieldId** | **Integer**|  |
 **updateTrackerItemTableField** | [**UpdateTrackerItemTableField**](UpdateTrackerItemTableField.md)|  | [optional]

### Return type

[**TrackerItem**](TrackerItem.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateTrackerItem"></a>
# **updateTrackerItem**
> TrackerItem updateTrackerItem(itemId, referenceItemId, position, trackerItem)

Update tracker item

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.TrackerItemApi;

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

TrackerItemApi apiInstance = new TrackerItemApi();
Integer itemId = 56; // Integer | 
Integer referenceItemId = 56; // Integer | 
String position = "position_example"; // String | 
TrackerItem trackerItem = new TrackerItem(); // TrackerItem | 
try {
    TrackerItem result = apiInstance.updateTrackerItem(itemId, referenceItemId, position, trackerItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemApi#updateTrackerItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **Integer**|  |
 **referenceItemId** | **Integer**|  | [optional]
 **position** | **String**|  | [optional] [enum: BEFORE, AFTER, BELOW]
 **trackerItem** | [**TrackerItem**](TrackerItem.md)|  | [optional]

### Return type

[**TrackerItem**](TrackerItem.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

