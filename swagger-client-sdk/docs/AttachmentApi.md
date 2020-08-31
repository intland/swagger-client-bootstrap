# AttachmentApi

All URIs are relative to *http://localhost:8080/cb/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAttachment**](AttachmentApi.md#deleteAttachment) | **DELETE** /v3/attachments/{attachmentId} | Deletes an attachment
[**getAttachment**](AttachmentApi.md#getAttachment) | **GET** /v3/attachments/{attachmentId} | Get attachment by id
[**getAttachmentContent**](AttachmentApi.md#getAttachmentContent) | **GET** /v3/attachments/{attachmentId}/content | Get content of an attachment by id
[**getAttachmentHistory**](AttachmentApi.md#getAttachmentHistory) | **GET** /v3/attachments/{attachmentId}/history | Returns the change history of the specified attachment
[**restoreAttachment**](AttachmentApi.md#restoreAttachment) | **PUT** /v3/attachments/{attachmentId}/restore | Restore attachment to previous version
[**updateAttachment**](AttachmentApi.md#updateAttachment) | **PUT** /v3/attachments/{attachmentId}/content | Update attachment


<a name="deleteAttachment"></a>
# **deleteAttachment**
> deleteAttachment(attachmentId)

Deletes an attachment

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.AttachmentApi;

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

AttachmentApi apiInstance = new AttachmentApi();
Integer attachmentId = 56; // Integer | 
try {
    apiInstance.deleteAttachment(attachmentId);
} catch (ApiException e) {
    System.err.println("Exception when calling AttachmentApi#deleteAttachment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attachmentId** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAttachment"></a>
# **getAttachment**
> Attachment getAttachment(attachmentId, version)

Get attachment by id

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.AttachmentApi;

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

AttachmentApi apiInstance = new AttachmentApi();
Integer attachmentId = 56; // Integer | 
Integer version = 56; // Integer | 
try {
    Attachment result = apiInstance.getAttachment(attachmentId, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttachmentApi#getAttachment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attachmentId** | **Integer**|  |
 **version** | **Integer**|  | [optional]

### Return type

[**Attachment**](Attachment.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAttachmentContent"></a>
# **getAttachmentContent**
> File getAttachmentContent(attachmentId, version)

Get content of an attachment by id

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.AttachmentApi;

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

AttachmentApi apiInstance = new AttachmentApi();
Integer attachmentId = 56; // Integer | 
Integer version = 56; // Integer | 
try {
    File result = apiInstance.getAttachmentContent(attachmentId, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttachmentApi#getAttachmentContent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attachmentId** | **Integer**|  |
 **version** | **Integer**|  | [optional]

### Return type

[**File**](File.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream, application/json

<a name="getAttachmentHistory"></a>
# **getAttachmentHistory**
> ArtifactRevisionSearchResult getAttachmentHistory(attachmentId, page, pageSize)

Returns the change history of the specified attachment

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.AttachmentApi;

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

AttachmentApi apiInstance = new AttachmentApi();
Integer attachmentId = 56; // Integer | 
Integer page = 1; // Integer | Index of the result page starting from 1.
Integer pageSize = 25; // Integer | Number of items in a result page. Max value: 500
try {
    ArtifactRevisionSearchResult result = apiInstance.getAttachmentHistory(attachmentId, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttachmentApi#getAttachmentHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attachmentId** | **Integer**|  |
 **page** | **Integer**| Index of the result page starting from 1. | [optional] [default to 1]
 **pageSize** | **Integer**| Number of items in a result page. Max value: 500 | [optional] [default to 25]

### Return type

[**ArtifactRevisionSearchResult**](ArtifactRevisionSearchResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="restoreAttachment"></a>
# **restoreAttachment**
> Attachment restoreAttachment(attachmentId, version)

Restore attachment to previous version

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.AttachmentApi;

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

AttachmentApi apiInstance = new AttachmentApi();
Integer attachmentId = 56; // Integer | 
Integer version = 56; // Integer | 
try {
    Attachment result = apiInstance.restoreAttachment(attachmentId, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttachmentApi#restoreAttachment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attachmentId** | **Integer**|  |
 **version** | **Integer**|  |

### Return type

[**Attachment**](Attachment.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateAttachment"></a>
# **updateAttachment**
> Attachment updateAttachment(attachmentId, description, descriptionFormat, content)

Update attachment

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.AttachmentApi;

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

AttachmentApi apiInstance = new AttachmentApi();
Integer attachmentId = 56; // Integer | 
String description = "description_example"; // String | Description
String descriptionFormat = "PlainText"; // String | Format of description
File content = new File("/path/to/file"); // File | Content of attachment
try {
    Attachment result = apiInstance.updateAttachment(attachmentId, description, descriptionFormat, content);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttachmentApi#updateAttachment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

