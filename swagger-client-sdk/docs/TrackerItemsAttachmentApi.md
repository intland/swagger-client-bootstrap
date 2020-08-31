# TrackerItemsAttachmentApi

All URIs are relative to *http://localhost:8080/cb/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteTrackerItemAttachment**](TrackerItemsAttachmentApi.md#deleteTrackerItemAttachment) | **DELETE** /v3/items/{itemId}/attachments/{attachmentId} | Delete attachment of tracker item by id
[**deleteTrackerItemAttachments**](TrackerItemsAttachmentApi.md#deleteTrackerItemAttachments) | **DELETE** /v3/items/{itemId}/attachments | Delete attachments of tracker item
[**getTrackerItemAttachment**](TrackerItemsAttachmentApi.md#getTrackerItemAttachment) | **GET** /v3/items/{itemId}/attachments/{attachmentId} | Get attachment of tracker item by id
[**getTrackerItemAttachmentContent**](TrackerItemsAttachmentApi.md#getTrackerItemAttachmentContent) | **GET** /v3/items/{itemId}/attachments/{attachmentId}/content | Get content of an attachment of tracker item by id
[**getTrackerItemAttachmentContents**](TrackerItemsAttachmentApi.md#getTrackerItemAttachmentContents) | **GET** /v3/items/{itemId}/attachments/content | Get attachments of a tracker item
[**getTrackerItemAttachments**](TrackerItemsAttachmentApi.md#getTrackerItemAttachments) | **GET** /v3/items/{itemId}/attachments | Get attachments of tracker item
[**getTrackerItemsAttachmentContents**](TrackerItemsAttachmentApi.md#getTrackerItemsAttachmentContents) | **POST** /v3/items/attachments/content | Get attachments of tracker items matching the extension or mime type filters
[**updateAttachmentOfTrackerItem**](TrackerItemsAttachmentApi.md#updateAttachmentOfTrackerItem) | **PUT** /v3/items/{itemId}/attachments/{attachmentId}/content | Update content of attachment of tracker item
[**updloadTrackerItemAttachment**](TrackerItemsAttachmentApi.md#updloadTrackerItemAttachment) | **POST** /v3/items/{itemId}/attachments | Upload an attachment to a tracker item


<a name="deleteTrackerItemAttachment"></a>
# **deleteTrackerItemAttachment**
> Attachment deleteTrackerItemAttachment(itemId, attachmentId)

Delete attachment of tracker item by id

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.TrackerItemsAttachmentApi;

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

TrackerItemsAttachmentApi apiInstance = new TrackerItemsAttachmentApi();
Integer itemId = 56; // Integer | 
Integer attachmentId = 56; // Integer | 
try {
    Attachment result = apiInstance.deleteTrackerItemAttachment(itemId, attachmentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemsAttachmentApi#deleteTrackerItemAttachment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **Integer**|  |
 **attachmentId** | **Integer**|  |

### Return type

[**Attachment**](Attachment.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteTrackerItemAttachments"></a>
# **deleteTrackerItemAttachments**
> deleteTrackerItemAttachments(itemId)

Delete attachments of tracker item

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.TrackerItemsAttachmentApi;

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

TrackerItemsAttachmentApi apiInstance = new TrackerItemsAttachmentApi();
Integer itemId = 56; // Integer | 
try {
    apiInstance.deleteTrackerItemAttachments(itemId);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemsAttachmentApi#deleteTrackerItemAttachments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getTrackerItemAttachment"></a>
# **getTrackerItemAttachment**
> Attachment getTrackerItemAttachment(itemId, attachmentId)

Get attachment of tracker item by id

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.TrackerItemsAttachmentApi;

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

TrackerItemsAttachmentApi apiInstance = new TrackerItemsAttachmentApi();
Integer itemId = 56; // Integer | 
Integer attachmentId = 56; // Integer | 
try {
    Attachment result = apiInstance.getTrackerItemAttachment(itemId, attachmentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemsAttachmentApi#getTrackerItemAttachment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **Integer**|  |
 **attachmentId** | **Integer**|  |

### Return type

[**Attachment**](Attachment.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTrackerItemAttachmentContent"></a>
# **getTrackerItemAttachmentContent**
> File getTrackerItemAttachmentContent(itemId, attachmentId)

Get content of an attachment of tracker item by id

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.TrackerItemsAttachmentApi;

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

TrackerItemsAttachmentApi apiInstance = new TrackerItemsAttachmentApi();
Integer itemId = 56; // Integer | 
Integer attachmentId = 56; // Integer | 
try {
    File result = apiInstance.getTrackerItemAttachmentContent(itemId, attachmentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemsAttachmentApi#getTrackerItemAttachmentContent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **Integer**|  |
 **attachmentId** | **Integer**|  |

### Return type

[**File**](File.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

<a name="getTrackerItemAttachmentContents"></a>
# **getTrackerItemAttachmentContents**
> File getTrackerItemAttachmentContents(itemId)

Get attachments of a tracker item

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.TrackerItemsAttachmentApi;

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

TrackerItemsAttachmentApi apiInstance = new TrackerItemsAttachmentApi();
Integer itemId = 56; // Integer | 
try {
    File result = apiInstance.getTrackerItemAttachmentContents(itemId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemsAttachmentApi#getTrackerItemAttachmentContents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **Integer**|  |

### Return type

[**File**](File.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/zip

<a name="getTrackerItemAttachments"></a>
# **getTrackerItemAttachments**
> AttachmentSearchResult getTrackerItemAttachments(itemId, fileName)

Get attachments of tracker item

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.TrackerItemsAttachmentApi;

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

TrackerItemsAttachmentApi apiInstance = new TrackerItemsAttachmentApi();
Integer itemId = 56; // Integer | Id of the tracker item
String fileName = "fileName_example"; // String | Filter by part of the filename of the attachments
try {
    AttachmentSearchResult result = apiInstance.getTrackerItemAttachments(itemId, fileName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemsAttachmentApi#getTrackerItemAttachments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **Integer**| Id of the tracker item |
 **fileName** | **String**| Filter by part of the filename of the attachments | [optional]

### Return type

[**AttachmentSearchResult**](AttachmentSearchResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTrackerItemsAttachmentContents"></a>
# **getTrackerItemsAttachmentContents**
> File getTrackerItemsAttachmentContents(trackerItemAttachmentRequest)

Get attachments of tracker items matching the extension or mime type filters

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.TrackerItemsAttachmentApi;

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

TrackerItemsAttachmentApi apiInstance = new TrackerItemsAttachmentApi();
TrackerItemAttachmentRequest trackerItemAttachmentRequest = new TrackerItemAttachmentRequest(); // TrackerItemAttachmentRequest | 
try {
    File result = apiInstance.getTrackerItemsAttachmentContents(trackerItemAttachmentRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemsAttachmentApi#getTrackerItemsAttachmentContents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trackerItemAttachmentRequest** | [**TrackerItemAttachmentRequest**](TrackerItemAttachmentRequest.md)|  | [optional]

### Return type

[**File**](File.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/zip

<a name="updateAttachmentOfTrackerItem"></a>
# **updateAttachmentOfTrackerItem**
> Attachment updateAttachmentOfTrackerItem(itemId, attachmentId, description, descriptionFormat, content)

Update content of attachment of tracker item

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.TrackerItemsAttachmentApi;

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

TrackerItemsAttachmentApi apiInstance = new TrackerItemsAttachmentApi();
Integer itemId = 56; // Integer | 
Integer attachmentId = 56; // Integer | 
String description = "description_example"; // String | Description
String descriptionFormat = "PlainText"; // String | Format of description
File content = new File("/path/to/file"); // File | Content of attachment
try {
    Attachment result = apiInstance.updateAttachmentOfTrackerItem(itemId, attachmentId, description, descriptionFormat, content);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemsAttachmentApi#updateAttachmentOfTrackerItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **Integer**|  |
 **attachmentId** | **Integer**|  |
 **description** | **String**| Description | [optional]
 **descriptionFormat** | **String**| Format of description | [optional] [default to PlainText] [enum: PlainText, Html, Wiki]
 **content** | **File**| Content of attachment | [optional]

### Return type

[**Attachment**](Attachment.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="updloadTrackerItemAttachment"></a>
# **updloadTrackerItemAttachment**
> List&lt;Attachment&gt; updloadTrackerItemAttachment(itemId, attachments)

Upload an attachment to a tracker item

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.TrackerItemsAttachmentApi;

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

TrackerItemsAttachmentApi apiInstance = new TrackerItemsAttachmentApi();
Integer itemId = 56; // Integer | 
File attachments = new File("/path/to/file"); // File | Attachments of a comment
try {
    List<Attachment> result = apiInstance.updloadTrackerItemAttachment(itemId, attachments);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemsAttachmentApi#updloadTrackerItemAttachment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **Integer**|  |
 **attachments** | **File**| Attachments of a comment | [optional]

### Return type

[**List&lt;Attachment&gt;**](Attachment.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

