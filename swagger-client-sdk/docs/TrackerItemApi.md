# TrackerItemApi

All URIs are relative to *http://localhost:8080/cb/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addChildToTracker**](TrackerItemApi.md#addChildToTracker) | **POST** /v3/trackers/{trackerId}/children | Add a child item to a tracker item
[**addChildToTrackerItem**](TrackerItemApi.md#addChildToTrackerItem) | **POST** /v3/items/{itemId}/children | Add a child item to a tracker item
[**bulkUpdateTrackerItemFields**](TrackerItemApi.md#bulkUpdateTrackerItemFields) | **PUT** /v3/items/fields | Bulk update fields of a tracker item
[**checkTrackerItemLock**](TrackerItemApi.md#checkTrackerItemLock) | **GET** /v3/items/{itemId}/lock | Check whether a tracker item is locked, and if it is, retrieve the details of the lock
[**createTrackerItem**](TrackerItemApi.md#createTrackerItem) | **POST** /v3/trackers/{trackerId}/items | Create a tracker item
[**deleteTrackerItem**](TrackerItemApi.md#deleteTrackerItem) | **DELETE** /v3/items/{itemId} | Move tracker item to trash
[**findTrackerChildren**](TrackerItemApi.md#findTrackerChildren) | **GET** /v3/trackers/{trackerId}/children | Get child items of a tracker item
[**findTrackerItemChildren**](TrackerItemApi.md#findTrackerItemChildren) | **GET** /v3/items/{itemId}/children | Get child items of a tracker item
[**findTrackerItems**](TrackerItemApi.md#findTrackerItems) | **GET** /v3/items/query | Get tracker items by cbQL query string
[**findTrackerItemsByCbQL**](TrackerItemApi.md#findTrackerItemsByCbQL) | **POST** /v3/items/query | Get tracker items by cbQL query string
[**getBaselineTrackerItemRelations**](TrackerItemApi.md#getBaselineTrackerItemRelations) | **GET** /v3/items/{itemId}/relations | Get tracker items related to a tracker item
[**getBaselineTrackerItemsRelations**](TrackerItemApi.md#getBaselineTrackerItemsRelations) | **POST** /v3/items/relations | Get tracker items related to some tracker items
[**getChoiceOptions**](TrackerItemApi.md#getChoiceOptions) | **GET** /v3/items/{itemId}/fields/{fieldId}/options | Get the options of a choice field of tracker
[**getItemAccessibility**](TrackerItemApi.md#getItemAccessibility) | **GET** /v3/items/{itemId}/fields/accessibility | Get a tracker item fields accessibility
[**getTrackerItem**](TrackerItemApi.md#getTrackerItem) | **GET** /v3/items/{itemId} | Get basic tracker item
[**getTrackerItemFields**](TrackerItemApi.md#getTrackerItemFields) | **GET** /v3/items/{itemId}/fields | Get fields of a tracker item
[**getTrackerItemHistory**](TrackerItemApi.md#getTrackerItemHistory) | **GET** /v3/items/{itemId}/history | Get tracker item history
[**getTrackerItemReviews**](TrackerItemApi.md#getTrackerItemReviews) | **GET** /v3/items/{itemId}/reviews | Get all Tracker Item Reviews for a particular Tracker Item
[**getTrackerItemTransitions**](TrackerItemApi.md#getTrackerItemTransitions) | **GET** /v3/items/{itemId}/transitions | Get available transitions for a tracker item
[**lockTrackerItem**](TrackerItemApi.md#lockTrackerItem) | **PUT** /v3/items/{itemId}/lock | Put a soft lock on a tracker item
[**patchChildrenOfTracker**](TrackerItemApi.md#patchChildrenOfTracker) | **PATCH** /v3/trackers/{trackerId}/children | Patch the child item list of a tracker item
[**patchChildrenOfTrackerItem**](TrackerItemApi.md#patchChildrenOfTrackerItem) | **PATCH** /v3/items/{itemId}/children | Patch the child item list of a tracker item
[**replaceChildrenOfTracker**](TrackerItemApi.md#replaceChildrenOfTracker) | **PUT** /v3/trackers/{trackerId}/children | Reorder the child item list of a tracker
[**replaceChildrenOfTrackerItem**](TrackerItemApi.md#replaceChildrenOfTrackerItem) | **PUT** /v3/items/{itemId}/children | Replace the child item list of a tracker item
[**unlockTrackerItem**](TrackerItemApi.md#unlockTrackerItem) | **DELETE** /v3/items/{itemId}/lock | Unlock a tracker item
[**updateCustomFieldTrackerItem**](TrackerItemApi.md#updateCustomFieldTrackerItem) | **PUT** /v3/items/{itemId}/fields | Update fields of a tracker item
[**updateTableFieldTrackerItem**](TrackerItemApi.md#updateTableFieldTrackerItem) | **PUT** /v3/items/{itemId}/fields/tables/{tableFieldId} | Update table field of tracker item
[**updateTrackerItem**](TrackerItemApi.md#updateTrackerItem) | **PUT** /v3/items/{itemId} | Update tracker item


<a name="addChildToTracker"></a>
# **addChildToTracker**
> TrackerItemChildReference addChildToTracker(trackerId, trackerItemRevision)

Add a child item to a tracker item

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.TrackerItemApi;

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

    TrackerItemApi apiInstance = new TrackerItemApi(defaultClient);
    Integer trackerId = 56; // Integer | 
    TrackerItemRevision trackerItemRevision = new TrackerItemRevision(); // TrackerItemRevision | 
    try {
      TrackerItemChildReference result = apiInstance.addChildToTracker(trackerId, trackerItemRevision);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackerItemApi#addChildToTracker");
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
 **trackerItemRevision** | [**TrackerItemRevision**](TrackerItemRevision.md)|  |

### Return type

[**TrackerItemChildReference**](TrackerItemChildReference.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Child item reference with index |  -  |
**400** | Invalid request |  -  |
**401** | Permission is required |  -  |
**403** | Authentication is required |  -  |
**404** | Tracker is not found |  -  |
**423** | Tracker item is locked |  -  |
**429** | Too many requests |  -  |

<a name="addChildToTrackerItem"></a>
# **addChildToTrackerItem**
> TrackerItemChildReference addChildToTrackerItem(itemId, trackerItemRevision)

Add a child item to a tracker item

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.TrackerItemApi;

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

    TrackerItemApi apiInstance = new TrackerItemApi(defaultClient);
    Integer itemId = 56; // Integer | 
    TrackerItemRevision trackerItemRevision = new TrackerItemRevision(); // TrackerItemRevision | 
    try {
      TrackerItemChildReference result = apiInstance.addChildToTrackerItem(itemId, trackerItemRevision);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackerItemApi#addChildToTrackerItem");
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
 **itemId** | **Integer**|  |
 **trackerItemRevision** | [**TrackerItemRevision**](TrackerItemRevision.md)|  |

### Return type

[**TrackerItemChildReference**](TrackerItemChildReference.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Child item reference with index |  -  |
**400** | Invalid request |  -  |
**401** | Permission is required |  -  |
**403** | Authentication is required |  -  |
**404** | Tracker item is not found |  -  |
**423** | Tracker item is locked |  -  |
**429** | Too many requests |  -  |

<a name="bulkUpdateTrackerItemFields"></a>
# **bulkUpdateTrackerItemFields**
> BulkOperationResponse bulkUpdateTrackerItemFields(updateTrackerItemFieldWithItemId, atomic)

Bulk update fields of a tracker item

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.TrackerItemApi;

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

    TrackerItemApi apiInstance = new TrackerItemApi(defaultClient);
    List<UpdateTrackerItemFieldWithItemId> updateTrackerItemFieldWithItemId = Arrays.asList(); // List<UpdateTrackerItemFieldWithItemId> | 
    Boolean atomic = false; // Boolean | If it's turned on the whole update will run in a single transaction.
    try {
      BulkOperationResponse result = apiInstance.bulkUpdateTrackerItemFields(updateTrackerItemFieldWithItemId, atomic);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackerItemApi#bulkUpdateTrackerItemFields");
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
 **updateTrackerItemFieldWithItemId** | [**List&lt;UpdateTrackerItemFieldWithItemId&gt;**](UpdateTrackerItemFieldWithItemId.md)|  |
 **atomic** | **Boolean**| If it&#39;s turned on the whole update will run in a single transaction. | [optional] [default to false]

### Return type

[**BulkOperationResponse**](BulkOperationResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Bulk update response |  -  |
**400** | Request cannot be processed |  -  |
**401** | Authentication is required |  -  |
**403** | Authentication is required |  -  |
**404** | Tracker / Field not found |  -  |
**429** | Too many requests |  -  |
**500** | Unexpected error |  -  |

<a name="checkTrackerItemLock"></a>
# **checkTrackerItemLock**
> LockInfo checkTrackerItemLock(itemId)

Check whether a tracker item is locked, and if it is, retrieve the details of the lock

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.TrackerItemApi;

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

    TrackerItemApi apiInstance = new TrackerItemApi(defaultClient);
    Integer itemId = 56; // Integer | Tracker item id
    try {
      LockInfo result = apiInstance.checkTrackerItemLock(itemId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackerItemApi#checkTrackerItemLock");
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
 **itemId** | **Integer**| Tracker item id |

### Return type

[**LockInfo**](LockInfo.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Details of the lock, or an empty response |  -  |
**400** | Bad Request |  -  |
**401** | Authentication is required |  -  |
**404** | Wiki page not found |  -  |
**429** | Too many requests |  -  |

<a name="createTrackerItem"></a>
# **createTrackerItem**
> TrackerItem createTrackerItem(trackerId, trackerItem, parentItemId, referenceItemId, position)

Create a tracker item

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.TrackerItemApi;

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

    TrackerItemApi apiInstance = new TrackerItemApi(defaultClient);
    Integer trackerId = 56; // Integer | 
    TrackerItem trackerItem = new TrackerItem(); // TrackerItem | 
    Integer parentItemId = 56; // Integer | 
    Integer referenceItemId = 56; // Integer | 
    String position = "position_example"; // String | 
    try {
      TrackerItem result = apiInstance.createTrackerItem(trackerId, trackerItem, parentItemId, referenceItemId, position);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackerItemApi#createTrackerItem");
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
 **trackerItem** | [**TrackerItem**](TrackerItem.md)|  |
 **parentItemId** | **Integer**|  | [optional]
 **referenceItemId** | **Integer**|  | [optional]
 **position** | **String**|  | [optional] [enum: BEFORE, AFTER, BELOW]

### Return type

[**TrackerItem**](TrackerItem.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Basic tracker item by id |  -  |
**400** | Request cannot be processed |  -  |
**403** | Authentication is required |  -  |
**404** | Tracker / Field not found |  -  |
**429** | Too many requests |  -  |
**500** | Unexpected error |  -  |

<a name="deleteTrackerItem"></a>
# **deleteTrackerItem**
> TrackerItem deleteTrackerItem(itemId)

Move tracker item to trash

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.TrackerItemApi;

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

    TrackerItemApi apiInstance = new TrackerItemApi(defaultClient);
    Integer itemId = 56; // Integer | 
    try {
      TrackerItem result = apiInstance.deleteTrackerItem(itemId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackerItemApi#deleteTrackerItem");
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
 **itemId** | **Integer**|  |

### Return type

[**TrackerItem**](TrackerItem.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Basic tracker item by id |  -  |
**400** | Bad Request |  -  |
**403** | Authentication is required |  -  |
**404** | Tracker not found |  -  |
**423** | Tracker item is locked |  -  |
**429** | Too many requests |  -  |
**500** | Unexpected error |  -  |

<a name="findTrackerChildren"></a>
# **findTrackerChildren**
> TrackerItemReferenceSearchResult findTrackerChildren(trackerId, page, pageSize)

Get child items of a tracker item

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.TrackerItemApi;

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

    TrackerItemApi apiInstance = new TrackerItemApi(defaultClient);
    Integer trackerId = 56; // Integer | 
    Integer page = 1; // Integer | Index of the result page starting from 1.
    Integer pageSize = 25; // Integer | Number of items in a result page. Max value: 500
    try {
      TrackerItemReferenceSearchResult result = apiInstance.findTrackerChildren(trackerId, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackerItemApi#findTrackerChildren");
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
 **page** | **Integer**| Index of the result page starting from 1. | [optional] [default to 1]
 **pageSize** | **Integer**| Number of items in a result page. Max value: 500 | [optional] [default to 25]

### Return type

[**TrackerItemReferenceSearchResult**](TrackerItemReferenceSearchResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List child items of a tracker item ordered by ordinal |  -  |
**400** | Invalid request |  -  |
**401** | Permission is required |  -  |
**403** | Authentication is required |  -  |
**404** | Tracker is not found |  -  |
**429** | Too many requests |  -  |

<a name="findTrackerItemChildren"></a>
# **findTrackerItemChildren**
> TrackerItemReferenceSearchResult findTrackerItemChildren(itemId, page, pageSize)

Get child items of a tracker item

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.TrackerItemApi;

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

    TrackerItemApi apiInstance = new TrackerItemApi(defaultClient);
    Integer itemId = 56; // Integer | 
    Integer page = 1; // Integer | Index of the result page starting from 1.
    Integer pageSize = 25; // Integer | Number of items in a result page. Max value: 500
    try {
      TrackerItemReferenceSearchResult result = apiInstance.findTrackerItemChildren(itemId, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackerItemApi#findTrackerItemChildren");
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List child items of a tracker item ordered by ordinal |  -  |
**400** | Invalid request |  -  |
**401** | Permission is required |  -  |
**403** | Authentication is required |  -  |
**404** | Tracker item is not found |  -  |
**429** | Too many requests |  -  |

<a name="findTrackerItems"></a>
# **findTrackerItems**
> TrackerItemSearchResult findTrackerItems(queryString, baselineId, page, pageSize)

Get tracker items by cbQL query string

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.TrackerItemApi;

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

    TrackerItemApi apiInstance = new TrackerItemApi(defaultClient);
    String queryString = "priority='Normal'"; // String | 
    Integer baselineId = 56; // Integer | Baseline on which the queery is applied.
    Integer page = 1; // Integer | Index of the result page starting from 1.
    Integer pageSize = 25; // Integer | Number of items in a result page. Max value: 500
    try {
      TrackerItemSearchResult result = apiInstance.findTrackerItems(queryString, baselineId, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackerItemApi#findTrackerItems");
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
 **queryString** | **String**|  |
 **baselineId** | **Integer**| Baseline on which the queery is applied. | [optional]
 **page** | **Integer**| Index of the result page starting from 1. | [optional] [default to 1]
 **pageSize** | **Integer**| Number of items in a result page. Max value: 500 | [optional] [default to 25]

### Return type

[**TrackerItemSearchResult**](TrackerItemSearchResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List tracker items by cbQL |  -  |
**400** | Request cannot be processed |  -  |
**403** | Authentication is required |  -  |
**429** | Too many requests |  -  |

<a name="findTrackerItemsByCbQL"></a>
# **findTrackerItemsByCbQL**
> TrackerItemSearchResult findTrackerItemsByCbQL(trackerItemSearchRequest)

Get tracker items by cbQL query string

API can be called with a complex cbQL string to find tracker items

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.TrackerItemApi;

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

    TrackerItemApi apiInstance = new TrackerItemApi(defaultClient);
    TrackerItemSearchRequest trackerItemSearchRequest = new TrackerItemSearchRequest(); // TrackerItemSearchRequest | 
    try {
      TrackerItemSearchResult result = apiInstance.findTrackerItemsByCbQL(trackerItemSearchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackerItemApi#findTrackerItemsByCbQL");
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
 **trackerItemSearchRequest** | [**TrackerItemSearchRequest**](TrackerItemSearchRequest.md)|  |

### Return type

[**TrackerItemSearchResult**](TrackerItemSearchResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List tracker items by cbQL |  -  |
**400** | Request cannot be processed |  -  |
**403** | Authentication is required |  -  |
**429** | Too many requests |  -  |

<a name="getBaselineTrackerItemRelations"></a>
# **getBaselineTrackerItemRelations**
> TrackerItemRelationsResult getBaselineTrackerItemRelations(itemId, baselineId, page, pageSize)

Get tracker items related to a tracker item

Use this endpoint to fetch tracker items related to a specified tracker item. The relations include downstream references, upstream references, incoming associations and outgoing associations of the given item. Relations with entities that are not tracker items (e.g., trackers, projects, URLs, etc.) will not be included in the result.

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.TrackerItemApi;

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

    TrackerItemApi apiInstance = new TrackerItemApi(defaultClient);
    Integer itemId = 56; // Integer | 
    Integer baselineId = 56; // Integer | 
    Integer page = 1; // Integer | Index of page, starting from 1.
    Integer pageSize = 500; // Integer | Number of items per page. Max value: 500
    try {
      TrackerItemRelationsResult result = apiInstance.getBaselineTrackerItemRelations(itemId, baselineId, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackerItemApi#getBaselineTrackerItemRelations");
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
 **itemId** | **Integer**|  |
 **baselineId** | **Integer**|  | [optional]
 **page** | **Integer**| Index of page, starting from 1. | [optional] [default to 1]
 **pageSize** | **Integer**| Number of items per page. Max value: 500 | [optional] [default to 500]

### Return type

[**TrackerItemRelationsResult**](TrackerItemRelationsResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Tracker item list |  -  |
**400** | Bad Request |  -  |
**403** | Authentication is required |  -  |
**404** | Tracker not found |  -  |
**429** | Too many requests |  -  |

<a name="getBaselineTrackerItemsRelations"></a>
# **getBaselineTrackerItemsRelations**
> List&lt;TrackerItemRelationsResult&gt; getBaselineTrackerItemsRelations(trackerItemsRequest, baselineId)

Get tracker items related to some tracker items

Use this endpoint to fetch tracker items related to some specified tracker items. The relations include downstream references, upstream references, incoming associations and outgoing associations of the given items. Relations with entities that are not tracker items (e.g., trackers, projects, URLs, etc.) will not be included in the result.

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.TrackerItemApi;

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

    TrackerItemApi apiInstance = new TrackerItemApi(defaultClient);
    TrackerItemsRequest trackerItemsRequest = new TrackerItemsRequest(); // TrackerItemsRequest | 
    Integer baselineId = 56; // Integer | 
    try {
      List<TrackerItemRelationsResult> result = apiInstance.getBaselineTrackerItemsRelations(trackerItemsRequest, baselineId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackerItemApi#getBaselineTrackerItemsRelations");
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
 **trackerItemsRequest** | [**TrackerItemsRequest**](TrackerItemsRequest.md)|  |
 **baselineId** | **Integer**|  | [optional]

### Return type

[**List&lt;TrackerItemRelationsResult&gt;**](TrackerItemRelationsResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Tracker item list |  -  |
**400** | Bad Request |  -  |
**403** | Authentication is required |  -  |
**404** | Tracker not found |  -  |
**429** | Too many requests |  -  |

<a name="getChoiceOptions"></a>
# **getChoiceOptions**
> ReferenceSearchResult getChoiceOptions(itemId, fieldId, page, pageSize)

Get the options of a choice field of tracker

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.TrackerItemApi;

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

    TrackerItemApi apiInstance = new TrackerItemApi(defaultClient);
    Integer itemId = 56; // Integer | 
    Integer fieldId = 56; // Integer | 
    Integer page = 1; // Integer | Index of the result page starting from 1.
    Integer pageSize = 25; // Integer | Number of items in a result page. Max value: 500
    try {
      ReferenceSearchResult result = apiInstance.getChoiceOptions(itemId, fieldId, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackerItemApi#getChoiceOptions");
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
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Options |  -  |
**400** | Bad Request |  -  |
**401** | Authentication is required |  -  |
**403** | Authentication is required |  -  |
**404** | No option found |  -  |
**429** | Too many requests |  -  |

<a name="getItemAccessibility"></a>
# **getItemAccessibility**
> TrackerItemFieldAccessibilityList getItemAccessibility(itemId, targetStatusId)

Get a tracker item fields accessibility

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.TrackerItemApi;

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

    TrackerItemApi apiInstance = new TrackerItemApi(defaultClient);
    Integer itemId = 56; // Integer | Tracker item id
    Integer targetStatusId = 56; // Integer | 
    try {
      TrackerItemFieldAccessibilityList result = apiInstance.getItemAccessibility(itemId, targetStatusId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackerItemApi#getItemAccessibility");
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
 **itemId** | **Integer**| Tracker item id |
 **targetStatusId** | **Integer**|  | [optional]

### Return type

[**TrackerItemFieldAccessibilityList**](TrackerItemFieldAccessibilityList.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Accessibility returned |  -  |
**400** | Bad Request |  -  |
**401** | Authentication is required |  -  |
**404** | Tracker item not found |  -  |
**429** | Too many requests |  -  |

<a name="getTrackerItem"></a>
# **getTrackerItem**
> TrackerItem getTrackerItem(itemId, version, baselineId)

Get basic tracker item

API can be used for fetching basic information of a tracker item

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.TrackerItemApi;

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

    TrackerItemApi apiInstance = new TrackerItemApi(defaultClient);
    Integer itemId = 56; // Integer | 
    Integer version = 56; // Integer | 
    Integer baselineId = 56; // Integer | 
    try {
      TrackerItem result = apiInstance.getTrackerItem(itemId, version, baselineId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackerItemApi#getTrackerItem");
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
 **itemId** | **Integer**|  |
 **version** | **Integer**|  | [optional]
 **baselineId** | **Integer**|  | [optional]

### Return type

[**TrackerItem**](TrackerItem.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Basic tracker item by id |  -  |
**400** | Bad Request |  -  |
**403** | Authentication is required |  -  |
**404** | Tracker item not found |  -  |
**429** | Too many requests |  -  |

<a name="getTrackerItemFields"></a>
# **getTrackerItemFields**
> TrackerItemField getTrackerItemFields(itemId)

Get fields of a tracker item

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.TrackerItemApi;

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

    TrackerItemApi apiInstance = new TrackerItemApi(defaultClient);
    Integer itemId = 56; // Integer | 
    try {
      TrackerItemField result = apiInstance.getTrackerItemFields(itemId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackerItemApi#getTrackerItemFields");
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
 **itemId** | **Integer**|  |

### Return type

[**TrackerItemField**](TrackerItemField.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Fields of tracker item by id |  -  |
**400** | Request cannot be processed |  -  |
**403** | Authentication is required |  -  |
**404** | Tracker / Item not found |  -  |
**429** | Too many requests |  -  |
**500** | Unexpected error |  -  |

<a name="getTrackerItemHistory"></a>
# **getTrackerItemHistory**
> TrackerItemHistory getTrackerItemHistory(itemId)

Get tracker item history

API can be used for fetching basic information of a tracker item

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.TrackerItemApi;

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

    TrackerItemApi apiInstance = new TrackerItemApi(defaultClient);
    Integer itemId = 56; // Integer | 
    try {
      TrackerItemHistory result = apiInstance.getTrackerItemHistory(itemId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackerItemApi#getTrackerItemHistory");
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
 **itemId** | **Integer**|  |

### Return type

[**TrackerItemHistory**](TrackerItemHistory.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Basic tracker item by id |  -  |
**400** | Bad Request |  -  |
**403** | Authentication is required |  -  |
**404** | Tracker not found |  -  |
**429** | Too many requests |  -  |

<a name="getTrackerItemReviews"></a>
# **getTrackerItemReviews**
> List&lt;TrackerItemReview&gt; getTrackerItemReviews(itemId)

Get all Tracker Item Reviews for a particular Tracker Item

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.TrackerItemApi;

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

    TrackerItemApi apiInstance = new TrackerItemApi(defaultClient);
    Integer itemId = 56; // Integer | 
    try {
      List<TrackerItemReview> result = apiInstance.getTrackerItemReviews(itemId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackerItemApi#getTrackerItemReviews");
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
 **itemId** | **Integer**|  |

### Return type

[**List&lt;TrackerItemReview&gt;**](TrackerItemReview.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of tracker item reviews for the particular item |  -  |
**400** | Request cannot be processed |  -  |
**401** | Authentication is required |  -  |
**403** | Tracker item reviews are disabled, or access to them is denied |  -  |
**404** | Tracker item not found |  -  |
**429** | Too many requests |  -  |

<a name="getTrackerItemTransitions"></a>
# **getTrackerItemTransitions**
> List&lt;WorkflowTransition&gt; getTrackerItemTransitions(itemId)

Get available transitions for a tracker item

API can be used for getting available transitions for a tracker item

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.TrackerItemApi;

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

    TrackerItemApi apiInstance = new TrackerItemApi(defaultClient);
    Integer itemId = 56; // Integer | 
    try {
      List<WorkflowTransition> result = apiInstance.getTrackerItemTransitions(itemId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackerItemApi#getTrackerItemTransitions");
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
 **itemId** | **Integer**|  |

### Return type

[**List&lt;WorkflowTransition&gt;**](WorkflowTransition.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Available transitions |  -  |
**400** | Bad Request |  -  |
**401** | Authentication is required |  -  |
**403** | Missing user permissions |  -  |
**404** | Tracker item not found |  -  |
**429** | Too many requests |  -  |
**500** | Internal server error |  -  |

<a name="lockTrackerItem"></a>
# **lockTrackerItem**
> lockTrackerItem(itemId, lockRequest)

Put a soft lock on a tracker item

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.TrackerItemApi;

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

    TrackerItemApi apiInstance = new TrackerItemApi(defaultClient);
    Integer itemId = 56; // Integer | Tracker item id
    LockRequest lockRequest = new LockRequest(); // LockRequest | 
    try {
      apiInstance.lockTrackerItem(itemId, lockRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackerItemApi#lockTrackerItem");
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
 **itemId** | **Integer**| Tracker item id |
 **lockRequest** | [**LockRequest**](LockRequest.md)|  |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Lock acquired successfully |  -  |
**400** | Bad request, request validation error |  -  |
**401** | Authentication is required |  -  |
**403** | Could not acquire lock |  -  |
**404** | Wiki page not found |  -  |
**429** | Too many requests |  -  |

<a name="patchChildrenOfTracker"></a>
# **patchChildrenOfTracker**
> TrackerItemChildReference patchChildrenOfTracker(trackerId, trackerItemChildReference, mode)

Patch the child item list of a tracker item

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.TrackerItemApi;

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

    TrackerItemApi apiInstance = new TrackerItemApi(defaultClient);
    Integer trackerId = 56; // Integer | 
    TrackerItemChildReference trackerItemChildReference = new TrackerItemChildReference(); // TrackerItemChildReference | 
    String mode = "INSERT"; // String | 
    try {
      TrackerItemChildReference result = apiInstance.patchChildrenOfTracker(trackerId, trackerItemChildReference, mode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackerItemApi#patchChildrenOfTracker");
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
 **trackerItemChildReference** | [**TrackerItemChildReference**](TrackerItemChildReference.md)|  |
 **mode** | **String**|  | [optional] [default to INSERT] [enum: INSERT]

### Return type

[**TrackerItemChildReference**](TrackerItemChildReference.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | New child item reference on the requested index |  -  |
**400** | Invalid request |  -  |
**401** | Permission is required |  -  |
**403** | Authentication is required |  -  |
**404** | Tracker is not found |  -  |
**423** | Tracker item is locked |  -  |
**429** | Too many requests |  -  |

<a name="patchChildrenOfTrackerItem"></a>
# **patchChildrenOfTrackerItem**
> TrackerItemChildReference patchChildrenOfTrackerItem(itemId, mode, trackerItemChildReference)

Patch the child item list of a tracker item

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.TrackerItemApi;

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

    TrackerItemApi apiInstance = new TrackerItemApi(defaultClient);
    Integer itemId = 56; // Integer | 
    String mode = "mode_example"; // String | 
    TrackerItemChildReference trackerItemChildReference = new TrackerItemChildReference(); // TrackerItemChildReference | 
    try {
      TrackerItemChildReference result = apiInstance.patchChildrenOfTrackerItem(itemId, mode, trackerItemChildReference);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackerItemApi#patchChildrenOfTrackerItem");
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
 **itemId** | **Integer**|  |
 **mode** | **String**|  | [enum: INSERT, REPLACE, REMOVE]
 **trackerItemChildReference** | [**TrackerItemChildReference**](TrackerItemChildReference.md)|  |

### Return type

[**TrackerItemChildReference**](TrackerItemChildReference.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | New child item reference on the requested index |  -  |
**400** | Invalid request |  -  |
**401** | Permission is required |  -  |
**403** | Authentication is required |  -  |
**404** | Tracker item is not found |  -  |
**423** | Tracker item is locked |  -  |
**429** | Too many requests |  -  |

<a name="replaceChildrenOfTracker"></a>
# **replaceChildrenOfTracker**
> TrackerItemReferenceSearchResult replaceChildrenOfTracker(trackerId, updateTrackerItemChildrenRequest, resultPageSize)

Reorder the child item list of a tracker

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.TrackerItemApi;

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

    TrackerItemApi apiInstance = new TrackerItemApi(defaultClient);
    Integer trackerId = 56; // Integer | 
    UpdateTrackerItemChildrenRequest updateTrackerItemChildrenRequest = new UpdateTrackerItemChildrenRequest(); // UpdateTrackerItemChildrenRequest | 
    Integer resultPageSize = 25; // Integer | Number of items in the result page. Max value: 500
    try {
      TrackerItemReferenceSearchResult result = apiInstance.replaceChildrenOfTracker(trackerId, updateTrackerItemChildrenRequest, resultPageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackerItemApi#replaceChildrenOfTracker");
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
 **updateTrackerItemChildrenRequest** | [**UpdateTrackerItemChildrenRequest**](UpdateTrackerItemChildrenRequest.md)|  |
 **resultPageSize** | **Integer**| Number of items in the result page. Max value: 500 | [optional] [default to 25]

### Return type

[**TrackerItemReferenceSearchResult**](TrackerItemReferenceSearchResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | First page of the new child list |  -  |
**400** | Invalid request |  -  |
**401** | Permission is required |  -  |
**403** | Authentication is required |  -  |
**404** | Tracker is not found |  -  |
**423** | Tracker item is locked |  -  |
**429** | Too many requests |  -  |

<a name="replaceChildrenOfTrackerItem"></a>
# **replaceChildrenOfTrackerItem**
> TrackerItemReferenceSearchResult replaceChildrenOfTrackerItem(itemId, updateTrackerItemChildrenRequest, resultPageSize)

Replace the child item list of a tracker item

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.TrackerItemApi;

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

    TrackerItemApi apiInstance = new TrackerItemApi(defaultClient);
    Integer itemId = 56; // Integer | 
    UpdateTrackerItemChildrenRequest updateTrackerItemChildrenRequest = new UpdateTrackerItemChildrenRequest(); // UpdateTrackerItemChildrenRequest | 
    Integer resultPageSize = 25; // Integer | Number of items in the result page. Max value: 500
    try {
      TrackerItemReferenceSearchResult result = apiInstance.replaceChildrenOfTrackerItem(itemId, updateTrackerItemChildrenRequest, resultPageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackerItemApi#replaceChildrenOfTrackerItem");
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
 **itemId** | **Integer**|  |
 **updateTrackerItemChildrenRequest** | [**UpdateTrackerItemChildrenRequest**](UpdateTrackerItemChildrenRequest.md)|  |
 **resultPageSize** | **Integer**| Number of items in the result page. Max value: 500 | [optional] [default to 25]

### Return type

[**TrackerItemReferenceSearchResult**](TrackerItemReferenceSearchResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | First page of the new child list |  -  |
**400** | Invalid request |  -  |
**401** | Permission is required |  -  |
**403** | Authentication is required |  -  |
**404** | Tracker item is not found |  -  |
**423** | Tracker item is locked |  -  |
**429** | Too many requests |  -  |

<a name="unlockTrackerItem"></a>
# **unlockTrackerItem**
> unlockTrackerItem(itemId)

Unlock a tracker item

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.TrackerItemApi;

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

    TrackerItemApi apiInstance = new TrackerItemApi(defaultClient);
    Integer itemId = 56; // Integer | Tracker item id
    try {
      apiInstance.unlockTrackerItem(itemId);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackerItemApi#unlockTrackerItem");
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
 **itemId** | **Integer**| Tracker item id |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Unlock successful |  -  |
**400** | Bad Request |  -  |
**401** | Authentication is required |  -  |
**403** | Could not unlock |  -  |
**404** | Wiki page not found |  -  |
**429** | Too many requests |  -  |

<a name="updateCustomFieldTrackerItem"></a>
# **updateCustomFieldTrackerItem**
> TrackerItem updateCustomFieldTrackerItem(itemId, updateTrackerItemField, quietMode)

Update fields of a tracker item

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.TrackerItemApi;

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

    TrackerItemApi apiInstance = new TrackerItemApi(defaultClient);
    Integer itemId = 56; // Integer | 
    UpdateTrackerItemField updateTrackerItemField = new UpdateTrackerItemField(); // UpdateTrackerItemField | 
    Boolean quietMode = false; // Boolean | If it's turned on HTTP 200 with empty response indicates that the update was successful.
    try {
      TrackerItem result = apiInstance.updateCustomFieldTrackerItem(itemId, updateTrackerItemField, quietMode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackerItemApi#updateCustomFieldTrackerItem");
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
 **itemId** | **Integer**|  |
 **updateTrackerItemField** | [**UpdateTrackerItemField**](UpdateTrackerItemField.md)|  |
 **quietMode** | **Boolean**| If it&#39;s turned on HTTP 200 with empty response indicates that the update was successful. | [optional] [default to false]

### Return type

[**TrackerItem**](TrackerItem.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Basic tracker item by id |  -  |
**400** | Request cannot be processed |  -  |
**401** | Authentication is required |  -  |
**403** | Authentication is required |  -  |
**404** | Tracker / Field not found |  -  |
**423** | Tracker item is locked |  -  |
**429** | Too many requests |  -  |
**500** | Unexpected error |  -  |

<a name="updateTableFieldTrackerItem"></a>
# **updateTableFieldTrackerItem**
> TrackerItem updateTableFieldTrackerItem(itemId, tableFieldId, updateTrackerItemTableField)

Update table field of tracker item

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.TrackerItemApi;

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

    TrackerItemApi apiInstance = new TrackerItemApi(defaultClient);
    Integer itemId = 56; // Integer | 
    Integer tableFieldId = 56; // Integer | 
    UpdateTrackerItemTableField updateTrackerItemTableField = new UpdateTrackerItemTableField(); // UpdateTrackerItemTableField | 
    try {
      TrackerItem result = apiInstance.updateTableFieldTrackerItem(itemId, tableFieldId, updateTrackerItemTableField);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackerItemApi#updateTableFieldTrackerItem");
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
 **itemId** | **Integer**|  |
 **tableFieldId** | **Integer**|  |
 **updateTrackerItemTableField** | [**UpdateTrackerItemTableField**](UpdateTrackerItemTableField.md)|  |

### Return type

[**TrackerItem**](TrackerItem.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Basic tracker item by id |  -  |
**400** | Request cannot be processed |  -  |
**403** | Authentication is required |  -  |
**404** | Tracker / Field not found |  -  |
**423** | Tracker item is locked |  -  |
**429** | Too many requests |  -  |
**500** | Unexpected error |  -  |

<a name="updateTrackerItem"></a>
# **updateTrackerItem**
> TrackerItem updateTrackerItem(itemId, trackerItem, referenceItemId, position)

Update tracker item

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.TrackerItemApi;

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

    TrackerItemApi apiInstance = new TrackerItemApi(defaultClient);
    Integer itemId = 56; // Integer | 
    TrackerItem trackerItem = new TrackerItem(); // TrackerItem | 
    Integer referenceItemId = 56; // Integer | 
    String position = "position_example"; // String | 
    try {
      TrackerItem result = apiInstance.updateTrackerItem(itemId, trackerItem, referenceItemId, position);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackerItemApi#updateTrackerItem");
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
 **itemId** | **Integer**|  |
 **trackerItem** | [**TrackerItem**](TrackerItem.md)|  |
 **referenceItemId** | **Integer**|  | [optional]
 **position** | **String**|  | [optional] [enum: BEFORE, AFTER, BELOW]

### Return type

[**TrackerItem**](TrackerItem.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Basic tracker item by id |  -  |
**400** | Request cannot be processed |  -  |
**403** | Authentication is required |  -  |
**404** | Tracker / Field not found |  -  |
**423** | Tracker item is locked |  -  |
**429** | Too many requests |  -  |
**500** | Unexpected error |  -  |

