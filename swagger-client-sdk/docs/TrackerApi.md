# TrackerApi

All URIs are relative to *http://localhost:8080/cb/api/docs*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteTracker**](TrackerApi.md#deleteTracker) | **DELETE** /v2/tracker/{trackerId} | Deletes a tracker
[**getChoiceOption**](TrackerApi.md#getChoiceOption) | **GET** /v2/tracker/{trackerId}/field/{fieldId}/option/{optionId} | Get option of a choice field of tracker
[**getTracker**](TrackerApi.md#getTracker) | **GET** /v2/tracker/{trackerId} | Get tracker
[**getTrackerField**](TrackerApi.md#getTrackerField) | **GET** /v2/tracker/{trackerId}/field/{fieldId} | Get field of tracker
[**getTrackerFields**](TrackerApi.md#getTrackerFields) | **GET** /v2/tracker/{trackerId}/field | Get fields of tracker
[**getTrackerType**](TrackerApi.md#getTrackerType) | **GET** /v2/tracker/types/{trackerTypeId} | Get the immutable definition of a tracker type
[**getTrackerTypes**](TrackerApi.md#getTrackerTypes) | **GET** /v2/tracker/types | Get the list of tracker types


<a name="deleteTracker"></a>
# **deleteTracker**
> deleteTracker(trackerId)

Deletes a tracker

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.api.TrackerApi;


TrackerApi apiInstance = new TrackerApi();
Integer trackerId = 56; // Integer | 
try {
    apiInstance.deleteTracker(trackerId);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerApi#deleteTracker");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trackerId** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getChoiceOption"></a>
# **getChoiceOption**
> ChoiceOptionReference getChoiceOption(trackerId, fieldId, optionId)

Get option of a choice field of tracker

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.api.TrackerApi;


TrackerApi apiInstance = new TrackerApi();
Integer trackerId = 56; // Integer | 
Integer fieldId = 56; // Integer | 
Integer optionId = 56; // Integer | 
try {
    ChoiceOptionReference result = apiInstance.getChoiceOption(trackerId, fieldId, optionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerApi#getChoiceOption");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trackerId** | **Integer**|  |
 **fieldId** | **Integer**|  |
 **optionId** | **Integer**|  |

### Return type

[**ChoiceOptionReference**](ChoiceOptionReference.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTracker"></a>
# **getTracker**
> Tracker getTracker(trackerId)

Get tracker

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.api.TrackerApi;


TrackerApi apiInstance = new TrackerApi();
Integer trackerId = 56; // Integer | 
try {
    Tracker result = apiInstance.getTracker(trackerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerApi#getTracker");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trackerId** | **Integer**|  |

### Return type

[**Tracker**](Tracker.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTrackerField"></a>
# **getTrackerField**
> AbstractField getTrackerField(trackerId, fieldId)

Get field of tracker

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.api.TrackerApi;


TrackerApi apiInstance = new TrackerApi();
Integer trackerId = 56; // Integer | 
Integer fieldId = 56; // Integer | 
try {
    AbstractField result = apiInstance.getTrackerField(trackerId, fieldId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerApi#getTrackerField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trackerId** | **Integer**|  |
 **fieldId** | **Integer**|  |

### Return type

[**AbstractField**](AbstractField.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTrackerFields"></a>
# **getTrackerFields**
> List&lt;AbstractField&gt; getTrackerFields(trackerId)

Get fields of tracker

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.api.TrackerApi;


TrackerApi apiInstance = new TrackerApi();
Integer trackerId = 56; // Integer | 
try {
    List<AbstractField> result = apiInstance.getTrackerFields(trackerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerApi#getTrackerFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trackerId** | **Integer**|  |

### Return type

[**List&lt;AbstractField&gt;**](AbstractField.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTrackerType"></a>
# **getTrackerType**
> TrackerType getTrackerType(trackerTypeId)

Get the immutable definition of a tracker type

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.api.TrackerApi;


TrackerApi apiInstance = new TrackerApi();
Integer trackerTypeId = 56; // Integer | 
try {
    TrackerType result = apiInstance.getTrackerType(trackerTypeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerApi#getTrackerType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trackerTypeId** | **Integer**|  |

### Return type

[**TrackerType**](TrackerType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTrackerTypes"></a>
# **getTrackerTypes**
> List&lt;TrackerType&gt; getTrackerTypes(outline)

Get the list of tracker types

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.api.TrackerApi;


TrackerApi apiInstance = new TrackerApi();
String outline = "ANY"; // String | Outline is enabled, disabled or any(no filtering will be applied).
try {
    List<TrackerType> result = apiInstance.getTrackerTypes(outline);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackerApi#getTrackerTypes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **outline** | **String**| Outline is enabled, disabled or any(no filtering will be applied). | [optional] [default to ANY] [enum: ENABLED, DISABLED, ANY]

### Return type

[**List&lt;TrackerType&gt;**](TrackerType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

