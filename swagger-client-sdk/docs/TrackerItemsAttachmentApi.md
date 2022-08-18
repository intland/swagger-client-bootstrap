# TrackerItemsAttachmentApi

All URIs are relative to *https://manual-test-server.intland.de:8111/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteTrackerItemAttachment**](TrackerItemsAttachmentApi.md#deleteTrackerItemAttachment) | **DELETE** /v3/items/{itemId}/attachments/{attachmentId} | Delete attachment of tracker item by id |
| [**deleteTrackerItemAttachments**](TrackerItemsAttachmentApi.md#deleteTrackerItemAttachments) | **DELETE** /v3/items/{itemId}/attachments | Delete attachments of tracker item |
| [**getTrackerItemAttachment**](TrackerItemsAttachmentApi.md#getTrackerItemAttachment) | **GET** /v3/items/{itemId}/attachments/{attachmentId} | Get attachment of tracker item by id |
| [**getTrackerItemAttachmentContent**](TrackerItemsAttachmentApi.md#getTrackerItemAttachmentContent) | **GET** /v3/items/{itemId}/attachments/{attachmentId}/content | Get content of an attachment of tracker item by id |
| [**getTrackerItemAttachmentContents**](TrackerItemsAttachmentApi.md#getTrackerItemAttachmentContents) | **GET** /v3/items/{itemId}/attachments/content | Get attachments of a tracker item |
| [**getTrackerItemAttachments**](TrackerItemsAttachmentApi.md#getTrackerItemAttachments) | **GET** /v3/items/{itemId}/attachments | Get attachments of tracker item |
| [**getTrackerItemsAttachmentContents**](TrackerItemsAttachmentApi.md#getTrackerItemsAttachmentContents) | **POST** /v3/items/attachments/content | Get attachments of tracker items matching the extension or mime type filters |
| [**updateAttachmentOfTrackerItem**](TrackerItemsAttachmentApi.md#updateAttachmentOfTrackerItem) | **PUT** /v3/items/{itemId}/attachments/{attachmentId}/content | Update content of attachment of tracker item |
| [**uploadTrackerItemAttachment**](TrackerItemsAttachmentApi.md#uploadTrackerItemAttachment) | **POST** /v3/items/{itemId}/attachments | Upload an attachment to a tracker item |


<a name="deleteTrackerItemAttachment"></a>
# **deleteTrackerItemAttachment**
> Attachment deleteTrackerItemAttachment(itemId, attachmentId, deleteAttachmentGroup)

Delete attachment of tracker item by id

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.TrackerItemsAttachmentApi;

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

    TrackerItemsAttachmentApi apiInstance = new TrackerItemsAttachmentApi(defaultClient);
    Integer itemId = 56; // Integer | 
    Integer attachmentId = 56; // Integer | 
    Boolean deleteAttachmentGroup = false; // Boolean | Delete attachment group or delete just the attachment and let the comment there
    try {
      Attachment result = apiInstance.deleteTrackerItemAttachment(itemId, attachmentId, deleteAttachmentGroup);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackerItemsAttachmentApi#deleteTrackerItemAttachment");
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
| **itemId** | **Integer**|  | |
| **attachmentId** | **Integer**|  | |
| **deleteAttachmentGroup** | **Boolean**| Delete attachment group or delete just the attachment and let the comment there | [optional] [default to false] |

### Return type

[**Attachment**](Attachment.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Attachment of tracker item by id |  -  |
| **400** | Bad Request |  -  |
| **403** | Authentication is required |  -  |
| **404** | Tracker not found |  -  |
| **423** | Tracker item is locked |  -  |
| **429** | Too many requests |  -  |

<a name="deleteTrackerItemAttachments"></a>
# **deleteTrackerItemAttachments**
> deleteTrackerItemAttachments(itemId, deleteAttachmentGroup)

Delete attachments of tracker item

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.TrackerItemsAttachmentApi;

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

    TrackerItemsAttachmentApi apiInstance = new TrackerItemsAttachmentApi(defaultClient);
    Integer itemId = 56; // Integer | 
    Boolean deleteAttachmentGroup = false; // Boolean | Delete attachment group or delete just the attachment and let the comment there
    try {
      apiInstance.deleteTrackerItemAttachments(itemId, deleteAttachmentGroup);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackerItemsAttachmentApi#deleteTrackerItemAttachments");
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
| **itemId** | **Integer**|  | |
| **deleteAttachmentGroup** | **Boolean**| Delete attachment group or delete just the attachment and let the comment there | [optional] [default to false] |

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
| **200** | Attachments of tracker item removed |  -  |
| **400** | Bad Request |  -  |
| **403** | Authentication is required |  -  |
| **404** | Tracker not found |  -  |
| **423** | Tracker item is locked |  -  |
| **429** | Too many requests |  -  |

<a name="getTrackerItemAttachment"></a>
# **getTrackerItemAttachment**
> Attachment getTrackerItemAttachment(itemId, attachmentId)

Get attachment of tracker item by id

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.TrackerItemsAttachmentApi;

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

    TrackerItemsAttachmentApi apiInstance = new TrackerItemsAttachmentApi(defaultClient);
    Integer itemId = 56; // Integer | 
    Integer attachmentId = 56; // Integer | 
    try {
      Attachment result = apiInstance.getTrackerItemAttachment(itemId, attachmentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackerItemsAttachmentApi#getTrackerItemAttachment");
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
| **itemId** | **Integer**|  | |
| **attachmentId** | **Integer**|  | |

### Return type

[**Attachment**](Attachment.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Attachment of tracker item by id |  -  |
| **400** | Bad Request |  -  |
| **403** | Authentication is required |  -  |
| **404** | Tracker / Attachment not found |  -  |
| **429** | Too many requests |  -  |

<a name="getTrackerItemAttachmentContent"></a>
# **getTrackerItemAttachmentContent**
> File getTrackerItemAttachmentContent(itemId, attachmentId)

Get content of an attachment of tracker item by id

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.TrackerItemsAttachmentApi;

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

    TrackerItemsAttachmentApi apiInstance = new TrackerItemsAttachmentApi(defaultClient);
    Integer itemId = 56; // Integer | 
    Integer attachmentId = 56; // Integer | 
    try {
      File result = apiInstance.getTrackerItemAttachmentContent(itemId, attachmentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackerItemsAttachmentApi#getTrackerItemAttachmentContent");
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
| **itemId** | **Integer**|  | |
| **attachmentId** | **Integer**|  | |

### Return type

[**File**](File.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Attachment of tracker item by id |  -  |
| **400** | Bad Request |  -  |
| **403** | Authentication is required |  -  |
| **404** | Tracker / Attachment not found |  -  |
| **429** | Too many requests |  -  |

<a name="getTrackerItemAttachmentContents"></a>
# **getTrackerItemAttachmentContents**
> File getTrackerItemAttachmentContents(itemId)

Get attachments of a tracker item

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.TrackerItemsAttachmentApi;

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

    TrackerItemsAttachmentApi apiInstance = new TrackerItemsAttachmentApi(defaultClient);
    Integer itemId = 56; // Integer | 
    try {
      File result = apiInstance.getTrackerItemAttachmentContents(itemId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackerItemsAttachmentApi#getTrackerItemAttachmentContents");
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
| **itemId** | **Integer**|  | |

### Return type

[**File**](File.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/zip, */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Attachments of a tracker item: contains the attachment files prefixed with the attachment id like [attachment-id]_[filename]. |  -  |
| **400** | Bad request |  -  |
| **403** | Authentication is required |  -  |
| **404** | Tracker item not found |  -  |
| **429** | Too many requests |  -  |

<a name="getTrackerItemAttachments"></a>
# **getTrackerItemAttachments**
> AttachmentSearchResult getTrackerItemAttachments(itemId, fileName)

Get attachments of tracker item

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.TrackerItemsAttachmentApi;

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

    TrackerItemsAttachmentApi apiInstance = new TrackerItemsAttachmentApi(defaultClient);
    Integer itemId = 56; // Integer | Id of the tracker item
    String fileName = "fileName_example"; // String | Filter by part of the filename of the attachments
    try {
      AttachmentSearchResult result = apiInstance.getTrackerItemAttachments(itemId, fileName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackerItemsAttachmentApi#getTrackerItemAttachments");
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
| **itemId** | **Integer**| Id of the tracker item | |
| **fileName** | **String**| Filter by part of the filename of the attachments | [optional] |

### Return type

[**AttachmentSearchResult**](AttachmentSearchResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Attachments of tracker item |  -  |
| **400** | Bad Request |  -  |
| **401** | Access denied |  -  |
| **403** | Authentication is required |  -  |
| **404** | Tracker item not found |  -  |
| **429** | Too many requests |  -  |

<a name="getTrackerItemsAttachmentContents"></a>
# **getTrackerItemsAttachmentContents**
> File getTrackerItemsAttachmentContents(trackerItemAttachmentRequest)

Get attachments of tracker items matching the extension or mime type filters

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.TrackerItemsAttachmentApi;

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

    TrackerItemsAttachmentApi apiInstance = new TrackerItemsAttachmentApi(defaultClient);
    TrackerItemAttachmentRequest trackerItemAttachmentRequest = new TrackerItemAttachmentRequest(); // TrackerItemAttachmentRequest | 
    try {
      File result = apiInstance.getTrackerItemsAttachmentContents(trackerItemAttachmentRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackerItemsAttachmentApi#getTrackerItemsAttachmentContents");
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
| **trackerItemAttachmentRequest** | [**TrackerItemAttachmentRequest**](TrackerItemAttachmentRequest.md)|  | |

### Return type

[**File**](File.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/zip, */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Attachments of tracker items: each tracker item goes to a subdirectory named as item-id and this directory contains the attachment files prefixed with the attachment id like [attachment-id]_[filename]. |  -  |
| **400** | Bad request |  -  |
| **403** | Authentication is required |  -  |
| **404** | Tracker items not found |  -  |
| **429** | Too many requests |  -  |

<a name="updateAttachmentOfTrackerItem"></a>
# **updateAttachmentOfTrackerItem**
> Attachment updateAttachmentOfTrackerItem(itemId, attachmentId, content, description, descriptionFormat)

Update content of attachment of tracker item

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.TrackerItemsAttachmentApi;

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

    TrackerItemsAttachmentApi apiInstance = new TrackerItemsAttachmentApi(defaultClient);
    Integer itemId = 56; // Integer | 
    Integer attachmentId = 56; // Integer | 
    File content = new File("/path/to/file"); // File | 
    String description = "description_example"; // String | Description
    String descriptionFormat = "PlainText"; // String | Format of description
    try {
      Attachment result = apiInstance.updateAttachmentOfTrackerItem(itemId, attachmentId, content, description, descriptionFormat);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackerItemsAttachmentApi#updateAttachmentOfTrackerItem");
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
| **itemId** | **Integer**|  | |
| **attachmentId** | **Integer**|  | |
| **content** | **File**|  | [optional] |
| **description** | **String**| Description | [optional] |
| **descriptionFormat** | **String**| Format of description | [optional] [default to PlainText] [enum: PlainText, Html, Wiki] |

### Return type

[**Attachment**](Attachment.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Updated attachment |  -  |
| **400** | Bad Request |  -  |
| **401** | Authentication is required |  -  |
| **403** | Authorization is required |  -  |
| **404** | Tracker item or attachment not found |  -  |
| **423** | Tracker item is locked |  -  |
| **429** | Too many requests |  -  |
| **500** | Unexpected error |  -  |

<a name="uploadTrackerItemAttachment"></a>
# **uploadTrackerItemAttachment**
> List&lt;Attachment&gt; uploadTrackerItemAttachment(itemId, attachments)

Upload an attachment to a tracker item

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.TrackerItemsAttachmentApi;

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

    TrackerItemsAttachmentApi apiInstance = new TrackerItemsAttachmentApi(defaultClient);
    Integer itemId = 56; // Integer | 
    File attachments = new File("/path/to/file"); // File | Attachments of a comment
    try {
      List<Attachment> result = apiInstance.uploadTrackerItemAttachment(itemId, attachments);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackerItemsAttachmentApi#uploadTrackerItemAttachment");
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
| **itemId** | **Integer**|  | |
| **attachments** | **File**| Attachments of a comment | [optional] |

### Return type

[**List&lt;Attachment&gt;**](Attachment.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Attachment of tracker item by id |  -  |
| **400** | Bad Request |  -  |
| **403** | Authentication is required |  -  |
| **404** | Tracker not found |  -  |
| **423** | Tracker item is locked |  -  |
| **429** | Too many requests |  -  |

