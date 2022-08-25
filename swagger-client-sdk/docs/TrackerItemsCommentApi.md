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
> Comment commentOnTrackerItem(itemId, comment, attachments, commentFormat)

Comment on a tracker item

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.TrackerItemsCommentApi;

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

    TrackerItemsCommentApi apiInstance = new TrackerItemsCommentApi(defaultClient);
    Integer itemId = 56; // Integer | 
    String comment = "comment_example"; // String | Text of a comment
    File attachments = new File("/path/to/file"); // File | Attachments of a comment
    String commentFormat = "PlainText"; // String | Format of a comment
    try {
      Comment result = apiInstance.commentOnTrackerItem(itemId, comment, attachments, commentFormat);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackerItemsCommentApi#commentOnTrackerItem");
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
 **comment** | **String**| Text of a comment |
 **attachments** | **File**| Attachments of a comment | [optional]
 **commentFormat** | **String**| Format of a comment | [optional] [default to PlainText] [enum: PlainText, Html, Wiki]

### Return type

[**Comment**](Comment.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Comment of tracker item by id |  -  |
**400** | Bad Request |  -  |
**403** | Authentication is required |  -  |
**404** | Tracker item not found |  -  |
**423** | Tracker item is locked |  -  |
**429** | Too many requests |  -  |

<a name="deleteTrackerItemComment"></a>
# **deleteTrackerItemComment**
> Comment deleteTrackerItemComment(itemId, commentId)

Delete comment of tracker item by id

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.TrackerItemsCommentApi;

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

    TrackerItemsCommentApi apiInstance = new TrackerItemsCommentApi(defaultClient);
    Integer itemId = 56; // Integer | 
    Integer commentId = 56; // Integer | 
    try {
      Comment result = apiInstance.deleteTrackerItemComment(itemId, commentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackerItemsCommentApi#deleteTrackerItemComment");
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
 **commentId** | **Integer**|  |

### Return type

[**Comment**](Comment.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Comment of tracker item by id |  -  |
**400** | Bad Request |  -  |
**403** | Authentication is required |  -  |
**404** | Tracker item not found |  -  |
**423** | Tracker item is locked |  -  |
**429** | Too many requests |  -  |

<a name="deleteTrackerItemComments"></a>
# **deleteTrackerItemComments**
> deleteTrackerItemComments(itemId)

Delete comments of tracker item by item id

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.TrackerItemsCommentApi;

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

    TrackerItemsCommentApi apiInstance = new TrackerItemsCommentApi(defaultClient);
    Integer itemId = 56; // Integer | 
    try {
      apiInstance.deleteTrackerItemComments(itemId);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackerItemsCommentApi#deleteTrackerItemComments");
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

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Comments deleted |  -  |
**400** | Bad Request |  -  |
**403** | Authentication is required |  -  |
**404** | Tracker item not found |  -  |
**423** | Tracker item is locked |  -  |
**429** | Too many requests |  -  |

<a name="editCommentOnTrackerItem"></a>
# **editCommentOnTrackerItem**
> Comment editCommentOnTrackerItem(itemId, commentId, comment, attachments, commentFormat)

Edit comment on a tracker item

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.TrackerItemsCommentApi;

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

    TrackerItemsCommentApi apiInstance = new TrackerItemsCommentApi(defaultClient);
    Integer itemId = 56; // Integer | 
    Integer commentId = 56; // Integer | 
    String comment = "comment_example"; // String | Text of a comment
    File attachments = new File("/path/to/file"); // File | Attachments of a comment
    String commentFormat = "CommentFormatEnum.PLAINTEXT"; // String | Format of a comment
    try {
      Comment result = apiInstance.editCommentOnTrackerItem(itemId, commentId, comment, attachments, commentFormat);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackerItemsCommentApi#editCommentOnTrackerItem");
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
 **commentId** | **Integer**|  |
 **comment** | **String**| Text of a comment |
 **attachments** | **File**| Attachments of a comment | [optional]
 **commentFormat** | **String**| Format of a comment | [optional] [default to CommentFormatEnum.PLAINTEXT] [enum: PlainText, Html, Wiki]

### Return type

[**Comment**](Comment.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Edited comment |  -  |
**400** | Bad Request |  -  |
**403** | Authentication is required |  -  |
**404** | Tracker not found |  -  |
**423** | Tracker item is locked |  -  |
**429** | Too many requests |  -  |
**500** | Unexpected error |  -  |

<a name="getTrackerItemComment"></a>
# **getTrackerItemComment**
> Comment getTrackerItemComment(itemId, commentId)

Get comment of tracker item by id

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.TrackerItemsCommentApi;

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

    TrackerItemsCommentApi apiInstance = new TrackerItemsCommentApi(defaultClient);
    Integer itemId = 56; // Integer | 
    Integer commentId = 56; // Integer | 
    try {
      Comment result = apiInstance.getTrackerItemComment(itemId, commentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackerItemsCommentApi#getTrackerItemComment");
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
 **commentId** | **Integer**|  |

### Return type

[**Comment**](Comment.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Comment of tracker item by id |  -  |
**400** | Bad Request |  -  |
**403** | Authentication is required |  -  |
**404** | Tracker item not found |  -  |
**429** | Too many requests |  -  |

<a name="getTrackerItemComments"></a>
# **getTrackerItemComments**
> List&lt;Comment&gt; getTrackerItemComments(itemId)

Get comments of tracker item

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.TrackerItemsCommentApi;

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

    TrackerItemsCommentApi apiInstance = new TrackerItemsCommentApi(defaultClient);
    Integer itemId = 56; // Integer | Id of a tracker item
    try {
      List<Comment> result = apiInstance.getTrackerItemComments(itemId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackerItemsCommentApi#getTrackerItemComments");
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
 **itemId** | **Integer**| Id of a tracker item |

### Return type

[**List&lt;Comment&gt;**](Comment.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Comments of tracker item by id |  -  |
**400** | Bad Request |  -  |
**403** | Authentication is required |  -  |
**404** | Tracker item not found |  -  |
**429** | Too many requests |  -  |

<a name="replyOnCommentOfTrackerItem"></a>
# **replyOnCommentOfTrackerItem**
> Comment replyOnCommentOfTrackerItem(itemId, commentId, comment, attachments, commentFormat)

Reply on a comment of a tracker item

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.TrackerItemsCommentApi;

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

    TrackerItemsCommentApi apiInstance = new TrackerItemsCommentApi(defaultClient);
    Integer itemId = 56; // Integer | 
    Integer commentId = 56; // Integer | 
    String comment = "comment_example"; // String | Text of a comment
    File attachments = new File("/path/to/file"); // File | Attachments of a comment
    String commentFormat = "CommentFormatEnum.PLAINTEXT"; // String | Format of a comment
    try {
      Comment result = apiInstance.replyOnCommentOfTrackerItem(itemId, commentId, comment, attachments, commentFormat);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackerItemsCommentApi#replyOnCommentOfTrackerItem");
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
 **commentId** | **Integer**|  |
 **comment** | **String**| Text of a comment |
 **attachments** | **File**| Attachments of a comment | [optional]
 **commentFormat** | **String**| Format of a comment | [optional] [default to CommentFormatEnum.PLAINTEXT] [enum: PlainText, Html, Wiki]

### Return type

[**Comment**](Comment.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Comment of tracker item by id |  -  |
**400** | Bad Request |  -  |
**403** | Authentication is required |  -  |
**404** | Tracker not found |  -  |
**423** | Tracker item is locked |  -  |
**429** | Too many requests |  -  |

