# WikiApi

All URIs are relative to *http://localhost:8080/cb/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkWikiPageLock**](WikiApi.md#checkWikiPageLock) | **GET** /v3/wikipages/{wikiId}/lock | Check whether a wiki page is locked, and if it is, retrieve the details of the lock
[**createWikiPage**](WikiApi.md#createWikiPage) | **POST** /v3/wikipages | Create a new wiki page
[**deleteWikiPage**](WikiApi.md#deleteWikiPage) | **DELETE** /v3/wikipages/{wikiId} | Delete a wiki page by its ID
[**getWikiPage**](WikiApi.md#getWikiPage) | **GET** /v3/wikipages/{wikiId} | Get wiki page
[**getWikiPageHistory**](WikiApi.md#getWikiPageHistory) | **GET** /v3/wikipages/{wikiId}/history | Returns the change history of the specified wiki page
[**getWikiPermissions**](WikiApi.md#getWikiPermissions) | **GET** /v3/wikipages/{wikiId}/permissions | Get permissions of a wiki page
[**lockWikiPage**](WikiApi.md#lockWikiPage) | **PUT** /v3/wikipages/{wikiId}/lock | Lock a wiki page
[**renderWikiMarkup**](WikiApi.md#renderWikiMarkup) | **POST** /v3/projects/{projectId}/wiki2html | Render a wiki page as HTML in a specific context
[**renderWikiPage**](WikiApi.md#renderWikiPage) | **GET** /v3/wikipages/{wikiId}/html | Render a wiki page as HTML
[**restoreWikiPageContent**](WikiApi.md#restoreWikiPageContent) | **PUT** /v3/wikipages/{wikiId}/restorecontent | Restores the content from a previous version of a wiki page
[**setWikiPermissions**](WikiApi.md#setWikiPermissions) | **PUT** /v3/wikipages/{wikiId}/permissions | Set permissions of a wiki page
[**unlockWikiPage**](WikiApi.md#unlockWikiPage) | **DELETE** /v3/wikipages/{wikiId}/lock | Unlock a wiki page
[**updateWikiPage**](WikiApi.md#updateWikiPage) | **PUT** /v3/wikipages/{itemId} | Update and/or move a wiki page


<a name="checkWikiPageLock"></a>
# **checkWikiPageLock**
> LockInfo checkWikiPageLock(wikiId)

Check whether a wiki page is locked, and if it is, retrieve the details of the lock

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.WikiApi;

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

    WikiApi apiInstance = new WikiApi(defaultClient);
    Integer wikiId = 56; // Integer | Wiki page id
    try {
      LockInfo result = apiInstance.checkWikiPageLock(wikiId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WikiApi#checkWikiPageLock");
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
 **wikiId** | **Integer**| Wiki page id |

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

<a name="createWikiPage"></a>
# **createWikiPage**
> WikiPage createWikiPage(wikiPage)

Create a new wiki page

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.WikiApi;

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

    WikiApi apiInstance = new WikiApi(defaultClient);
    WikiPage wikiPage = new WikiPage(); // WikiPage | 
    try {
      WikiPage result = apiInstance.createWikiPage(wikiPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WikiApi#createWikiPage");
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
 **wikiPage** | [**WikiPage**](WikiPage.md)|  |

### Return type

[**WikiPage**](WikiPage.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Properties of the created wikipage |  -  |
**400** | Request cannot be processed |  -  |
**401** | Authentication is required |  -  |
**403** | Access denied |  -  |
**429** | Too many requests |  -  |

<a name="deleteWikiPage"></a>
# **deleteWikiPage**
> deleteWikiPage(wikiId)

Delete a wiki page by its ID

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.WikiApi;

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

    WikiApi apiInstance = new WikiApi(defaultClient);
    Integer wikiId = 56; // Integer | ID of the wiki page
    try {
      apiInstance.deleteWikiPage(wikiId);
    } catch (ApiException e) {
      System.err.println("Exception when calling WikiApi#deleteWikiPage");
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
 **wikiId** | **Integer**| ID of the wiki page |

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
**200** | The wiki page has been deleted successfully |  -  |
**400** | Request cannot be processed |  -  |
**401** | Authentication is required |  -  |
**403** | Access denied |  -  |
**404** | The wiki page does not exist, or the artifact is not a wiki page |  -  |
**429** | Too many requests |  -  |

<a name="getWikiPage"></a>
# **getWikiPage**
> WikiPage getWikiPage(wikiId, version)

Get wiki page

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.WikiApi;

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

    WikiApi apiInstance = new WikiApi(defaultClient);
    Integer wikiId = 56; // Integer | ID of the wiki page
    Integer version = 56; // Integer | Version of the wiki page
    try {
      WikiPage result = apiInstance.getWikiPage(wikiId, version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WikiApi#getWikiPage");
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
 **wikiId** | **Integer**| ID of the wiki page |
 **version** | **Integer**| Version of the wiki page | [optional]

### Return type

[**WikiPage**](WikiPage.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The wiki page |  -  |
**400** | Bad Request |  -  |
**401** | Authentication is required |  -  |
**403** | Access denied |  -  |
**404** | The wiki page does not exist, or the artifact is not a wiki page |  -  |
**429** | Too many requests |  -  |

<a name="getWikiPageHistory"></a>
# **getWikiPageHistory**
> ArtifactRevisionSearchResult getWikiPageHistory(wikiId, page, pageSize)

Returns the change history of the specified wiki page

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.WikiApi;

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

    WikiApi apiInstance = new WikiApi(defaultClient);
    Integer wikiId = 56; // Integer | 
    Integer page = 1; // Integer | Index of the result page starting from 1.
    Integer pageSize = 25; // Integer | Number of items in a result page. Max value: 500
    try {
      ArtifactRevisionSearchResult result = apiInstance.getWikiPageHistory(wikiId, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WikiApi#getWikiPageHistory");
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
 **wikiId** | **Integer**|  |
 **page** | **Integer**| Index of the result page starting from 1. | [optional] [default to 1]
 **pageSize** | **Integer**| Number of items in a result page. Max value: 500 | [optional] [default to 25]

### Return type

[**ArtifactRevisionSearchResult**](ArtifactRevisionSearchResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Wiki page history |  -  |
**400** | Bad Request |  -  |
**401** | Authentication is required |  -  |
**404** | Wiki page not found |  -  |
**429** | Too many requests |  -  |

<a name="getWikiPermissions"></a>
# **getWikiPermissions**
> List&lt;AccessPermission&gt; getWikiPermissions(wikiId)

Get permissions of a wiki page

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.WikiApi;

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

    WikiApi apiInstance = new WikiApi(defaultClient);
    Integer wikiId = 56; // Integer | Wiki page id
    try {
      List<AccessPermission> result = apiInstance.getWikiPermissions(wikiId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WikiApi#getWikiPermissions");
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
 **wikiId** | **Integer**| Wiki page id |

### Return type

[**List&lt;AccessPermission&gt;**](AccessPermission.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Permissions of the wiki page |  -  |
**400** | Bad Request |  -  |
**401** | Authentication is required |  -  |
**403** | Authorization is required |  -  |
**404** | Wiki page not found |  -  |
**429** | Too many requests |  -  |

<a name="lockWikiPage"></a>
# **lockWikiPage**
> lockWikiPage(wikiId, lockRequest)

Lock a wiki page

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.WikiApi;

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

    WikiApi apiInstance = new WikiApi(defaultClient);
    Integer wikiId = 56; // Integer | Wiki page id
    LockRequest lockRequest = new LockRequest(); // LockRequest | 
    try {
      apiInstance.lockWikiPage(wikiId, lockRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling WikiApi#lockWikiPage");
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
 **wikiId** | **Integer**| Wiki page id |
 **lockRequest** | [**LockRequest**](LockRequest.md)|  |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Lock acquired successfully |  -  |
**400** | Bad request, request validation error |  -  |
**401** | Authentication is required |  -  |
**403** | Could not acquire lock |  -  |
**404** | Wiki page not found |  -  |
**429** | Too many requests |  -  |

<a name="renderWikiMarkup"></a>
# **renderWikiMarkup**
> String renderWikiMarkup(projectId, wikiRenderRequest)

Render a wiki page as HTML in a specific context

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.WikiApi;

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

    WikiApi apiInstance = new WikiApi(defaultClient);
    Integer projectId = 56; // Integer | 
    WikiRenderRequest wikiRenderRequest = new WikiRenderRequest(); // WikiRenderRequest | 
    try {
      String result = apiInstance.renderWikiMarkup(projectId, wikiRenderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WikiApi#renderWikiMarkup");
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
 **projectId** | **Integer**|  |
 **wikiRenderRequest** | [**WikiRenderRequest**](WikiRenderRequest.md)|  |

### Return type

**String**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/html, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The wiki content rendered as HTML |  -  |
**400** | Request cannot be processed |  -  |
**401** | Authentication is required |  -  |
**403** | Access denied |  -  |
**404** | The wiki page does not exist, or the artifact is not a wiki page |  -  |
**429** | Too many requests |  -  |

<a name="renderWikiPage"></a>
# **renderWikiPage**
> String renderWikiPage(wikiId, version)

Render a wiki page as HTML

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.WikiApi;

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

    WikiApi apiInstance = new WikiApi(defaultClient);
    Integer wikiId = 56; // Integer | ID of the wiki page
    Integer version = 56; // Integer | version of the wiki page
    try {
      String result = apiInstance.renderWikiPage(wikiId, version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WikiApi#renderWikiPage");
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
 **wikiId** | **Integer**| ID of the wiki page |
 **version** | **Integer**| version of the wiki page | [optional]

### Return type

**String**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/html, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The wiki content rendered as HTML |  -  |
**400** | Request cannot be processed |  -  |
**401** | Authentication is required |  -  |
**403** | Access denied |  -  |
**404** | The wiki page does not exist, or the artifact is not a wiki page |  -  |
**429** | Too many requests |  -  |

<a name="restoreWikiPageContent"></a>
# **restoreWikiPageContent**
> WikiPage restoreWikiPageContent(wikiId, version)

Restores the content from a previous version of a wiki page

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.WikiApi;

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

    WikiApi apiInstance = new WikiApi(defaultClient);
    Integer wikiId = 56; // Integer | Wiki page id
    Integer version = 56; // Integer | The version to be restored
    try {
      WikiPage result = apiInstance.restoreWikiPageContent(wikiId, version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WikiApi#restoreWikiPageContent");
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
 **wikiId** | **Integer**| Wiki page id |
 **version** | **Integer**| The version to be restored |

### Return type

[**WikiPage**](WikiPage.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Wiki page has been restored |  -  |
**400** | Bad Request |  -  |
**401** | Authentication is required |  -  |
**403** | Access denied |  -  |
**404** | Wiki page or version not found |  -  |
**429** | Too many requests |  -  |

<a name="setWikiPermissions"></a>
# **setWikiPermissions**
> List&lt;AccessPermission&gt; setWikiPermissions(wikiId, accessPermissionsRequest, recursive)

Set permissions of a wiki page

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.WikiApi;

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

    WikiApi apiInstance = new WikiApi(defaultClient);
    Integer wikiId = 56; // Integer | Wiki page id
    AccessPermissionsRequest accessPermissionsRequest = new AccessPermissionsRequest(); // AccessPermissionsRequest | 
    Boolean recursive = false; // Boolean | Set permissions of children recursively
    try {
      List<AccessPermission> result = apiInstance.setWikiPermissions(wikiId, accessPermissionsRequest, recursive);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WikiApi#setWikiPermissions");
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
 **wikiId** | **Integer**| Wiki page id |
 **accessPermissionsRequest** | [**AccessPermissionsRequest**](AccessPermissionsRequest.md)|  |
 **recursive** | **Boolean**| Set permissions of children recursively | [optional] [default to false]

### Return type

[**List&lt;AccessPermission&gt;**](AccessPermission.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Permissions of the wiki page |  -  |
**400** | Request cannot be processed |  -  |
**401** | Authentication is required |  -  |
**403** | Authorization is required |  -  |
**404** | Wiki page not found |  -  |
**429** | Too many requests |  -  |

<a name="unlockWikiPage"></a>
# **unlockWikiPage**
> unlockWikiPage(wikiId)

Unlock a wiki page

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.WikiApi;

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

    WikiApi apiInstance = new WikiApi(defaultClient);
    Integer wikiId = 56; // Integer | Wiki page id
    try {
      apiInstance.unlockWikiPage(wikiId);
    } catch (ApiException e) {
      System.err.println("Exception when calling WikiApi#unlockWikiPage");
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
 **wikiId** | **Integer**| Wiki page id |

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

<a name="updateWikiPage"></a>
# **updateWikiPage**
> WikiPage updateWikiPage(itemId, wikiPage)

Update and/or move a wiki page

### Example
```java
// Import classes:
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.models.*;
import com.intland.swagger.client.api.WikiApi;

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

    WikiApi apiInstance = new WikiApi(defaultClient);
    Integer itemId = 56; // Integer | Id of the wiki page to update
    WikiPage wikiPage = new WikiPage(); // WikiPage | 
    try {
      WikiPage result = apiInstance.updateWikiPage(itemId, wikiPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WikiApi#updateWikiPage");
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
 **itemId** | **Integer**| Id of the wiki page to update |
 **wikiPage** | [**WikiPage**](WikiPage.md)|  |

### Return type

[**WikiPage**](WikiPage.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Properties of the updated wikipage |  -  |
**400** | Request cannot be processed |  -  |
**401** | Authentication is required |  -  |
**403** | Access denied |  -  |
**404** | Wikipage not found |  -  |
**429** | Too many requests |  -  |

