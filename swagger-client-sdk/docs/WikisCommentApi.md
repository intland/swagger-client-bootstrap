# WikisCommentApi

All URIs are relative to *http://localhost:8080/cb/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**commentOnWiki**](WikisCommentApi.md#commentOnWiki) | **POST** /v3/wikipages/{wikiId}/comments | Comment on a wiki page
[**getAttachmentByName**](WikisCommentApi.md#getAttachmentByName) | **GET** /v3/wikipages/{wikiId}/attachments | Get attachment of wiki page by file name


<a name="commentOnWiki"></a>
# **commentOnWiki**
> List&lt;AttachmentReference&gt; commentOnWiki(wikiId, comment, commentFormat, attachments)

Comment on a wiki page

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.WikisCommentApi;

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

WikisCommentApi apiInstance = new WikisCommentApi();
Integer wikiId = 56; // Integer | 
String comment = "comment_example"; // String | Text of a comment
String commentFormat = "PlainText"; // String | Format of a comment
File attachments = new File("/path/to/file"); // File | Attachments of a comment
try {
    List<AttachmentReference> result = apiInstance.commentOnWiki(wikiId, comment, commentFormat, attachments);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WikisCommentApi#commentOnWiki");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wikiId** | **Integer**|  |
 **comment** | **String**| Text of a comment |
 **commentFormat** | **String**| Format of a comment | [optional] [default to PlainText] [enum: PlainText, Html, Wiki]
 **attachments** | **File**| Attachments of a comment | [optional]

### Return type

[**List&lt;AttachmentReference&gt;**](AttachmentReference.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="getAttachmentByName"></a>
# **getAttachmentByName**
> Attachment getAttachmentByName(wikiId, fileName)

Get attachment of wiki page by file name

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiClient;
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.Configuration;
//import com.intland.swagger.client.auth.*;
//import com.intland.swagger.client.api.WikisCommentApi;

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

WikisCommentApi apiInstance = new WikisCommentApi();
Integer wikiId = 56; // Integer | 
String fileName = "fileName_example"; // String | 
try {
    Attachment result = apiInstance.getAttachmentByName(wikiId, fileName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WikisCommentApi#getAttachmentByName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wikiId** | **Integer**|  |
 **fileName** | **String**|  |

### Return type

[**Attachment**](Attachment.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

