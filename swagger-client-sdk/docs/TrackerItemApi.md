# TrackerItemApi

All URIs are relative to *http://localhost:8080/cb/api/docs*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addChildToTrackerItem**](TrackerItemApi.md#addChildToTrackerItem) | **POST** /v2/items/{itemId}/children | Add a child item to a tracker item
[**createTrackerItem**](TrackerItemApi.md#createTrackerItem) | **POST** /v2/tracker/{trackerId}/item | Create a tracker item
[**createTrackerItemWithParentId**](TrackerItemApi.md#createTrackerItemWithParentId) | **POST** /v2/tracker/{trackerId}/item/{parentItemId} | Create a tracker item with parent
[**deleteTrackerItem**](TrackerItemApi.md#deleteTrackerItem) | **DELETE** /v2/item/{itemId} | Delete tracker item
[**findTrackerItemChildren**](TrackerItemApi.md#findTrackerItemChildren) | **GET** /v2/items/{itemId}/children | Get child items of a tracker item
[**findTrackerItems**](TrackerItemApi.md#findTrackerItems) | **GET** /v2/item | Get tracker items by cbQL query string
[**findTrackerItemsByCbQL**](TrackerItemApi.md#findTrackerItemsByCbQL) | **POST** /v2/item | Get tracker items by cbQL query string
[**getTrackerItem**](TrackerItemApi.md#getTrackerItem) | **GET** /v2/item/{itemId} | Get basic tracker item
[**getTrackerItemHistory**](TrackerItemApi.md#getTrackerItemHistory) | **GET** /v2/item/{itemId}/history | Get tracker item history
[**getTrackerItems**](TrackerItemApi.md#getTrackerItems) | **POST** /v2/items | Get tracker items
[**patchChildrenOfTrackerItem**](TrackerItemApi.md#patchChildrenOfTrackerItem) | **PATCH** /v2/items/{itemId}/children | Patch the child item list of a tracker item
[**replaceChildrenOfTrackerItem**](TrackerItemApi.md#replaceChildrenOfTrackerItem) | **PUT** /v2/items/{itemId}/children | Replace the child item list of a tracker item
[**updateCustomFieldTrackerItem**](TrackerItemApi.md#updateCustomFieldTrackerItem) | **PUT** /v2/item/{itemId}/field | Update field of tracker item
[**updateTableFieldTrackerItem**](TrackerItemApi.md#updateTableFieldTrackerItem) | **PUT** /v2/item/{itemId}/field/table/{tableFieldId} | Update table field of tracker item
[**updateTrackerItem**](TrackerItemApi.md#updateTrackerItem) | **PUT** /v2/item/{itemId} | Update tracker item


<a name="addChildToTrackerItem"></a>
# **addChildToTrackerItem**
> TrackerItemChildReference addChildToTrackerItem(itemId, trackerItemRevision)

Add a child item to a tracker item

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.api.TrackerItemApi;


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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createTrackerItem"></a>
# **createTrackerItem**
> TrackerItem createTrackerItem(trackerId, referenceItemId, position, trackerItem)

Create a tracker item

ext:createTrackerItem.wiki

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.api.TrackerItemApi;


TrackerItemApi apiInstance = new TrackerItemApi();
Integer trackerId = 56; // Integer | 
Integer referenceItemId = 56; // Integer | 
String position = "position_example"; // String | 
TrackerItem trackerItem = new TrackerItem(); // TrackerItem | 
try {
    TrackerItem result = apiInstance.createTrackerItem(trackerId, referenceItemId, position, trackerItem);
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
 **referenceItemId** | **Integer**|  | [optional]
 **position** | **String**|  | [optional] [enum: BEFORE, AFTER, BELOW]
 **trackerItem** | [**TrackerItem**](TrackerItem.md)|  | [optional]

### Return type

[**TrackerItem**](TrackerItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createTrackerItemWithParentId"></a>
# **createTrackerItemWithParentId**
> TrackerItem createTrackerItemWithParentId(trackerId, parentItemId, referenceItemId, position, trackerItem)

Create a tracker item with parent

ext:createTrackerItemWithParent.wiki

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.api.TrackerItemApi;


TrackerItemApi apiInstance = new TrackerItemApi();
Integer trackerId = 56; // Integer | 
Integer parentItemId = 56; // Integer | 
Integer referenceItemId = 56; // Integer | 
String position = "position_example"; // String | 
TrackerItem trackerItem = new TrackerItem(); // TrackerItem | 
try {
    TrackerItem result = apiInstance.createTrackerItemWithParentId(trackerId, parentItemId, referenceItemId, position, trackerItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemApi#createTrackerItemWithParentId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trackerId** | **Integer**|  |
 **parentItemId** | **Integer**|  |
 **referenceItemId** | **Integer**|  | [optional]
 **position** | **String**|  | [optional] [enum: BEFORE, AFTER, BELOW]
 **trackerItem** | [**TrackerItem**](TrackerItem.md)|  | [optional]

### Return type

[**TrackerItem**](TrackerItem.md)

### Authorization

No authorization required

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
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.api.TrackerItemApi;


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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findTrackerItemChildren"></a>
# **findTrackerItemChildren**
> TrackerItemRevisionSearchResult findTrackerItemChildren(itemId, page, pageSize)

Get child items of a tracker item

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.api.TrackerItemApi;


TrackerItemApi apiInstance = new TrackerItemApi();
Integer itemId = 56; // Integer | 
Integer page = 1; // Integer | Index of the result page starting from 1.
Integer pageSize = 25; // Integer | Number of items in a result page. Max value: 500
try {
    TrackerItemRevisionSearchResult result = apiInstance.findTrackerItemChildren(itemId, page, pageSize);
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

[**TrackerItemRevisionSearchResult**](TrackerItemRevisionSearchResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findTrackerItems"></a>
# **findTrackerItems**
> TrackerItemSearchResult findTrackerItems(queryString, page, pageSize)

Get tracker items by cbQL query string

ext:queryTrackerItem.wiki

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.api.TrackerItemApi;


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

No authorization required

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
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.api.TrackerItemApi;


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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTrackerItem"></a>
# **getTrackerItem**
> TrackerItem getTrackerItem(itemId, version, baselineId)

Get basic tracker item

API can be used for fetching basic information of a tracker item

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.api.TrackerItemApi;


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

No authorization required

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
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.api.TrackerItemApi;


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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTrackerItems"></a>
# **getTrackerItems**
> List&lt;TrackerItem&gt; getTrackerItems(baselineId, trackerItemsRequest)

Get tracker items

API can be used for fetching basic information of tracker items

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.api.TrackerItemApi;


TrackerItemApi apiInstance = new TrackerItemApi();
Integer baselineId = 56; // Integer | 
TrackerItemsRequest trackerItemsRequest = new TrackerItemsRequest(); // TrackerItemsRequest | 
try {
    List<TrackerItem> result = apiInstance.getTrackerItems(baselineId, trackerItemsRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemApi#getTrackerItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **baselineId** | **Integer**|  | [optional]
 **trackerItemsRequest** | [**TrackerItemsRequest**](TrackerItemsRequest.md)|  | [optional]

### Return type

[**List&lt;TrackerItem&gt;**](TrackerItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="patchChildrenOfTrackerItem"></a>
# **patchChildrenOfTrackerItem**
> TrackerItemChildReference patchChildrenOfTrackerItem(itemId, mode, trackerItemChildReference)

Patch the child item list of a tracker item

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.api.TrackerItemApi;


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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="replaceChildrenOfTrackerItem"></a>
# **replaceChildrenOfTrackerItem**
> TrackerItemRevisionSearchResult replaceChildrenOfTrackerItem(itemId, resultPageSize, updateTrackerItemChildrenRequest)

Replace the child item list of a tracker item

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.api.TrackerItemApi;


TrackerItemApi apiInstance = new TrackerItemApi();
Integer itemId = 56; // Integer | 
Integer resultPageSize = 25; // Integer | Number of items in the result page. Max value: 500
UpdateTrackerItemChildrenRequest updateTrackerItemChildrenRequest = new UpdateTrackerItemChildrenRequest(); // UpdateTrackerItemChildrenRequest | 
try {
    TrackerItemRevisionSearchResult result = apiInstance.replaceChildrenOfTrackerItem(itemId, resultPageSize, updateTrackerItemChildrenRequest);
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

[**TrackerItemRevisionSearchResult**](TrackerItemRevisionSearchResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateCustomFieldTrackerItem"></a>
# **updateCustomFieldTrackerItem**
> TrackerItem updateCustomFieldTrackerItem(itemId, quietMode, updateTrackerItemField)

Update field of tracker item

ext:updateTrackerItemField.wiki

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.api.TrackerItemApi;


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

No authorization required

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
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.api.TrackerItemApi;


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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateTrackerItem"></a>
# **updateTrackerItem**
> TrackerItem updateTrackerItem(itemId, referenceItemId, position, trackerItem)

Update tracker item

ext:updateTrackerItem.wiki

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.api.TrackerItemApi;


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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

