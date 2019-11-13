# TrackerItemsAttachmentApi

All URIs are relative to *http://localhost:8080/cb/api/docs*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteTrackerItemAttachment**](TrackerItemsAttachmentApi.md#deleteTrackerItemAttachment) | **DELETE** /v2/item/{itemId}/attachment/{attachmentId} | Delete attachment of tracker item by id
[**deleteTrackerItemAttachments**](TrackerItemsAttachmentApi.md#deleteTrackerItemAttachments) | **DELETE** /v2/item/{itemId}/attachment | Delete attachments of tracker item
[**getTrackerItemAttachment**](TrackerItemsAttachmentApi.md#getTrackerItemAttachment) | **GET** /v2/item/{itemId}/attachment/{attachmentId} | Get attachment of tracker item by id
[**getTrackerItemAttachmentContent**](TrackerItemsAttachmentApi.md#getTrackerItemAttachmentContent) | **GET** /v2/item/{itemId}/attachment/{attachmentId}/content | Get content of an attachment of tracker item by id
[**getTrackerItemAttachmentContents**](TrackerItemsAttachmentApi.md#getTrackerItemAttachmentContents) | **GET** /v2/item/{itemId}/attachments/content | Get attachments of a tracker item
[**getTrackerItemAttachments**](TrackerItemsAttachmentApi.md#getTrackerItemAttachments) | **GET** /v2/item/{itemId}/attachment | Get attachments of tracker item
[**getTrackerItemsAttachmentContents**](TrackerItemsAttachmentApi.md#getTrackerItemsAttachmentContents) | **POST** /v2/item/attachments/content | Get attachments of tracker items matching the extension or mime type filters
[**updloadTrackerItemAttachment**](TrackerItemsAttachmentApi.md#updloadTrackerItemAttachment) | **POST** /v2/item/{itemId}/attachment | Upload an attachment to a tracker item


<a name="deleteTrackerItemAttachment"></a>
# **deleteTrackerItemAttachment**
> Attachment deleteTrackerItemAttachment(itemId, attachmentId, userDto)

Delete attachment of tracker item by id

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.api.TrackerItemsAttachmentApi;


TrackerItemsAttachmentApi apiInstance = new TrackerItemsAttachmentApi();
Integer itemId = 56; // Integer | 
Integer attachmentId = 56; // Integer | 
UserDto userDto = new UserDto(); // UserDto | 
try {
    Attachment result = apiInstance.deleteTrackerItemAttachment(itemId, attachmentId, userDto);
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
 **userDto** | [**UserDto**](UserDto.md)|  | [optional]

### Return type

[**Attachment**](Attachment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteTrackerItemAttachments"></a>
# **deleteTrackerItemAttachments**
> deleteTrackerItemAttachments(itemId, userDto)

Delete attachments of tracker item

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.api.TrackerItemsAttachmentApi;


TrackerItemsAttachmentApi apiInstance = new TrackerItemsAttachmentApi();
Integer itemId = 56; // Integer | 
UserDto userDto = new UserDto(); // UserDto | 
try {
    apiInstance.deleteTrackerItemAttachments(itemId, userDto);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemsAttachmentApi#deleteTrackerItemAttachments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **Integer**|  |
 **userDto** | [**UserDto**](UserDto.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getTrackerItemAttachment"></a>
# **getTrackerItemAttachment**
> Attachment getTrackerItemAttachment(user, itemId, attachmentId)

Get attachment of tracker item by id

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.api.TrackerItemsAttachmentApi;


TrackerItemsAttachmentApi apiInstance = new TrackerItemsAttachmentApi();
UserDto user = new UserDto(); // UserDto | 
Integer itemId = 56; // Integer | 
Integer attachmentId = 56; // Integer | 
try {
    Attachment result = apiInstance.getTrackerItemAttachment(user, itemId, attachmentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemsAttachmentApi#getTrackerItemAttachment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | [**UserDto**](.md)|  | [default to null]
 **itemId** | **Integer**|  |
 **attachmentId** | **Integer**|  |

### Return type

[**Attachment**](Attachment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTrackerItemAttachmentContent"></a>
# **getTrackerItemAttachmentContent**
> ModelAndView getTrackerItemAttachmentContent(user, itemId, attachmentId)

Get content of an attachment of tracker item by id

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.api.TrackerItemsAttachmentApi;


TrackerItemsAttachmentApi apiInstance = new TrackerItemsAttachmentApi();
UserDto user = new UserDto(); // UserDto | 
Integer itemId = 56; // Integer | 
Integer attachmentId = 56; // Integer | 
try {
    ModelAndView result = apiInstance.getTrackerItemAttachmentContent(user, itemId, attachmentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemsAttachmentApi#getTrackerItemAttachmentContent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | [**UserDto**](.md)|  | [default to null]
 **itemId** | **Integer**|  |
 **attachmentId** | **Integer**|  |

### Return type

[**ModelAndView**](ModelAndView.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

<a name="getTrackerItemAttachmentContents"></a>
# **getTrackerItemAttachmentContents**
> File getTrackerItemAttachmentContents(user, itemId)

Get attachments of a tracker item

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.api.TrackerItemsAttachmentApi;


TrackerItemsAttachmentApi apiInstance = new TrackerItemsAttachmentApi();
UserDto user = new UserDto(); // UserDto | 
Integer itemId = 56; // Integer | 
try {
    File result = apiInstance.getTrackerItemAttachmentContents(user, itemId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemsAttachmentApi#getTrackerItemAttachmentContents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | [**UserDto**](.md)|  | [default to null]
 **itemId** | **Integer**|  |

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/zip

<a name="getTrackerItemAttachments"></a>
# **getTrackerItemAttachments**
> List&lt;Attachment&gt; getTrackerItemAttachments(user, itemId)

Get attachments of tracker item

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.api.TrackerItemsAttachmentApi;


TrackerItemsAttachmentApi apiInstance = new TrackerItemsAttachmentApi();
UserDto user = new UserDto(); // UserDto | 
Integer itemId = 56; // Integer | 
try {
    List<Attachment> result = apiInstance.getTrackerItemAttachments(user, itemId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerItemsAttachmentApi#getTrackerItemAttachments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | [**UserDto**](.md)|  | [default to null]
 **itemId** | **Integer**|  |

### Return type

[**List&lt;Attachment&gt;**](Attachment.md)

### Authorization

No authorization required

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
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.api.TrackerItemsAttachmentApi;


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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/zip

<a name="updloadTrackerItemAttachment"></a>
# **updloadTrackerItemAttachment**
> List&lt;Attachment&gt; updloadTrackerItemAttachment(itemId, uploadAttachmentModel)

Upload an attachment to a tracker item

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.api.TrackerItemsAttachmentApi;


TrackerItemsAttachmentApi apiInstance = new TrackerItemsAttachmentApi();
Integer itemId = 56; // Integer | 
UploadAttachment uploadAttachmentModel = new UploadAttachment(); // UploadAttachment | 
try {
    List<Attachment> result = apiInstance.updloadTrackerItemAttachment(itemId, uploadAttachmentModel);
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
 **uploadAttachmentModel** | [**UploadAttachment**](UploadAttachment.md)|  | [optional] [default to null]

### Return type

[**List&lt;Attachment&gt;**](Attachment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

