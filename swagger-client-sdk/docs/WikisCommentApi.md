# WikisCommentApi

All URIs are relative to *https://manual-test-server.intland.de:8111/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**commentOnWiki**](WikisCommentApi.md#commentOnWiki) | **POST** /v3/wikipages/{wikiId}/comments | Comment on a wiki page |
| [**getAttachmentByName**](WikisCommentApi.md#getAttachmentByName) | **GET** /v3/wikipages/{wikiId}/attachments | Get attachment of wiki page by file name |


<a name="commentOnWiki"></a>
# **commentOnWiki**
> List&lt;AttachmentReference&gt; commentOnWiki(wikiId, comment, attachments, commentFormat)

Comment on a wiki page

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.WikisCommentApi;

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

    WikisCommentApi apiInstance = new WikisCommentApi(defaultClient);
    Integer wikiId = 56; // Integer | 
    String comment = "comment_example"; // String | Text of a comment
    File attachments = new File("/path/to/file"); // File | Attachments of a comment
    String commentFormat = "PlainText"; // String | Format of a comment
    try {
      List<AttachmentReference> result = apiInstance.commentOnWiki(wikiId, comment, attachments, commentFormat);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WikisCommentApi#commentOnWiki");
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
| **wikiId** | **Integer**|  | |
| **comment** | **String**| Text of a comment | |
| **attachments** | **File**| Attachments of a comment | [optional] |
| **commentFormat** | **String**| Format of a comment | [optional] [default to PlainText] [enum: PlainText, Html, Wiki] |

### Return type

[**List&lt;AttachmentReference&gt;**](AttachmentReference.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Comment created successfully |  -  |
| **400** | Bad Request |  -  |
| **401** | Authentication is required |  -  |
| **403** | Authorization is required |  -  |
| **404** | Wiki page not found |  -  |
| **429** | Too many requests |  -  |
| **500** | Unexpected error |  -  |

<a name="getAttachmentByName"></a>
# **getAttachmentByName**
> Attachment getAttachmentByName(wikiId, fileName)

Get attachment of wiki page by file name

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.WikisCommentApi;

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

    WikisCommentApi apiInstance = new WikisCommentApi(defaultClient);
    Integer wikiId = 56; // Integer | 
    String fileName = "fileName_example"; // String | 
    try {
      Attachment result = apiInstance.getAttachmentByName(wikiId, fileName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WikisCommentApi#getAttachmentByName");
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
| **wikiId** | **Integer**|  | |
| **fileName** | **String**|  | |

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
| **200** | Attachment of wiki page |  -  |
| **400** | Bad Request |  -  |
| **401** | Authentication is required |  -  |
| **403** | Authorization is required |  -  |
| **404** | Wiki page / Attachment not found |  -  |
| **429** | Too many requests |  -  |

