# TrackerItemsCommentApi

All URIs are relative to *http://localhost:8080/cb/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**commentOnTrackerItem**](TrackerItemsCommentApi.md#commentOnTrackerItem) | **POST** /v3/items/{itemId}/comments | Comment on a tracker item
[**deleteTrackerItemComment**](TrackerItemsCommentApi.md#deleteTrackerItemComment) | **DELETE** /v3/items/{itemId}/comments/{commentId} | Delete comment of tracker item by id
[**deleteTrackerItemComments**](TrackerItemsCommentApi.md#deleteTrackerItemComments) | **DELETE** /v3/items/{itemId}/comments | Delete comments of tracker item by item id
[**editCommentOnTrackerItem**](TrackerItemsCommentApi.md#editCommentOnTrackerItem) | **PUT** /v3/items/{itemId}/comments/{commentId} | Edit comment on a tracker item
[**getTrackerItemComment**](TrackerItemsCommentApi.md#getTrackerItemComment) | **GET** /v3/items/{itemId}/comments/{commentId} | Get comment of tracker item by id
[**getTrackerItemComments**](TrackerItemsCommentApi.md#getTrackerItemComments) | **GET** /v3/items/{itemId}/comments | Get comments of tracker item
[**replyOnCommentOfTrackerItem**](TrackerItemsCommentApi.md#replyOnCommentOfTrackerItem) | **POST** /v3/items/{itemId}/comments/{commentId} | Reply on a comment of a tracker item


<a name="commentOnTrackerItem"></a>
# **commentOnTrackerItem**
> Comment commentOnTrackerItem(itemId, comment, commentFormat, attachments)

Comment on a tracker item

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.TrackerItemsCommentApi;

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

TrackerItemsCommentApi apiInstance = new TrackerItemsCommentApi();
Integer itemId = 56; // Integer | 
String comment = "comment_example"; // String | Text of a comment
String commentFormat = "PlainText"; // String | Format of a comment
File attachments = new File("/path/to/file"); // File | Attachments of a comment
try {
    Comment result = apiInstance.commentOnTrackerItem(itemId, comment, commentFormat, attachments);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemsCommentApi#commentOnTrackerItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **Integer**|  |
 **comment** | **String**| Text of a comment |
 **commentFormat** | **String**| Format of a comment | [optional] [default to PlainText] [enum: PlainText, Html, Wiki]
 **attachments** | **File**| Attachments of a comment | [optional]

### Return type

[**Comment**](Comment.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="deleteTrackerItemComment"></a>
# **deleteTrackerItemComment**
> Comment deleteTrackerItemComment(itemId, commentId)

Delete comment of tracker item by id

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.TrackerItemsCommentApi;

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

TrackerItemsCommentApi apiInstance = new TrackerItemsCommentApi();
Integer itemId = 56; // Integer | 
Integer commentId = 56; // Integer | 
try {
    Comment result = apiInstance.deleteTrackerItemComment(itemId, commentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemsCommentApi#deleteTrackerItemComment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **Integer**|  |
 **commentId** | **Integer**|  |

### Return type

[**Comment**](Comment.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteTrackerItemComments"></a>
# **deleteTrackerItemComments**
> deleteTrackerItemComments(itemId)

Delete comments of tracker item by item id

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.TrackerItemsCommentApi;

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

TrackerItemsCommentApi apiInstance = new TrackerItemsCommentApi();
Integer itemId = 56; // Integer | 
try {
    apiInstance.deleteTrackerItemComments(itemId);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemsCommentApi#deleteTrackerItemComments");
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

<a name="editCommentOnTrackerItem"></a>
# **editCommentOnTrackerItem**
> Comment editCommentOnTrackerItem(itemId, commentId, comment, commentFormat, attachments)

Edit comment on a tracker item

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.TrackerItemsCommentApi;

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

TrackerItemsCommentApi apiInstance = new TrackerItemsCommentApi();
Integer itemId = 56; // Integer | 
Integer commentId = 56; // Integer | 
String comment = "comment_example"; // String | Text of a comment
String commentFormat = "PlainText"; // String | Format of a comment
File attachments = new File("/path/to/file"); // File | Attachments of a comment
try {
    Comment result = apiInstance.editCommentOnTrackerItem(itemId, commentId, comment, commentFormat, attachments);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemsCommentApi#editCommentOnTrackerItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **Integer**|  |
 **commentId** | **Integer**|  |
 **comment** | **String**| Text of a comment |
 **commentFormat** | **String**| Format of a comment | [optional] [default to PlainText] [enum: PlainText, Html, Wiki]
 **attachments** | **File**| Attachments of a comment | [optional]

### Return type

[**Comment**](Comment.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="getTrackerItemComment"></a>
# **getTrackerItemComment**
> Comment getTrackerItemComment(itemId, commentId)

Get comment of tracker item by id

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.TrackerItemsCommentApi;

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

TrackerItemsCommentApi apiInstance = new TrackerItemsCommentApi();
Integer itemId = 56; // Integer | 
Integer commentId = 56; // Integer | 
try {
    Comment result = apiInstance.getTrackerItemComment(itemId, commentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemsCommentApi#getTrackerItemComment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **Integer**|  |
 **commentId** | **Integer**|  |

### Return type

[**Comment**](Comment.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTrackerItemComments"></a>
# **getTrackerItemComments**
> List&lt;Comment&gt; getTrackerItemComments(itemId)

Get comments of tracker item

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.TrackerItemsCommentApi;

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

TrackerItemsCommentApi apiInstance = new TrackerItemsCommentApi();
Integer itemId = 56; // Integer | Id of a tracker item
try {
    List<Comment> result = apiInstance.getTrackerItemComments(itemId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemsCommentApi#getTrackerItemComments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **Integer**| Id of a tracker item |

### Return type

[**List&lt;Comment&gt;**](Comment.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="replyOnCommentOfTrackerItem"></a>
# **replyOnCommentOfTrackerItem**
> Comment replyOnCommentOfTrackerItem(itemId, commentId, comment, commentFormat, attachments)

Reply on a comment of a tracker item

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.TrackerItemsCommentApi;

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

TrackerItemsCommentApi apiInstance = new TrackerItemsCommentApi();
Integer itemId = 56; // Integer | 
Integer commentId = 56; // Integer | 
String comment = "comment_example"; // String | Text of a comment
String commentFormat = "PlainText"; // String | Format of a comment
File attachments = new File("/path/to/file"); // File | Attachments of a comment
try {
    Comment result = apiInstance.replyOnCommentOfTrackerItem(itemId, commentId, comment, commentFormat, attachments);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemsCommentApi#replyOnCommentOfTrackerItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **Integer**|  |
 **commentId** | **Integer**|  |
 **comment** | **String**| Text of a comment |
 **commentFormat** | **String**| Format of a comment | [optional] [default to PlainText] [enum: PlainText, Html, Wiki]
 **attachments** | **File**| Attachments of a comment | [optional]

### Return type

[**Comment**](Comment.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

