# BaselineApi

All URIs are relative to *http://localhost:8080/cb/api/docs*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBaselineTrackerItemRelations**](BaselineApi.md#getBaselineTrackerItemRelations) | **GET** /v2/item/{itemId}/relations | Get tracker items for a baseline version
[**getBaselineTrackerItemsRelations**](BaselineApi.md#getBaselineTrackerItemsRelations) | **POST** /v2/items/relations | Get tracker items for a baseline version


<a name="getBaselineTrackerItemRelations"></a>
# **getBaselineTrackerItemRelations**
> TrackerItemRelationsResult getBaselineTrackerItemRelations(user, itemId, baselineId)

Get tracker items for a baseline version

API can be used for fetching basic information of tracker items at a specific baseline version

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.api.BaselineApi;


BaselineApi apiInstance = new BaselineApi();
UserDto user = new UserDto(); // UserDto | 
Integer itemId = 56; // Integer | 
Integer baselineId = 56; // Integer | 
try {
    TrackerItemRelationsResult result = apiInstance.getBaselineTrackerItemRelations(user, itemId, baselineId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BaselineApi#getBaselineTrackerItemRelations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | [**UserDto**](.md)|  | [default to null]
 **itemId** | **Integer**|  |
 **baselineId** | **Integer**|  | [optional]

### Return type

[**TrackerItemRelationsResult**](TrackerItemRelationsResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBaselineTrackerItemsRelations"></a>
# **getBaselineTrackerItemsRelations**
> List&lt;TrackerItemRelationsResult&gt; getBaselineTrackerItemsRelations(baselineId, inlineObject1)

Get tracker items for a baseline version

API can be used for fetching basic information of tracker items at a specific baseline version

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.api.BaselineApi;


BaselineApi apiInstance = new BaselineApi();
Integer baselineId = 56; // Integer | 
InlineObject1 inlineObject1 = new InlineObject1(); // InlineObject1 | 
try {
    List<TrackerItemRelationsResult> result = apiInstance.getBaselineTrackerItemsRelations(baselineId, inlineObject1);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BaselineApi#getBaselineTrackerItemsRelations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **baselineId** | **Integer**|  | [optional]
 **inlineObject1** | [**InlineObject1**](InlineObject1.md)|  | [optional]

### Return type

[**List&lt;TrackerItemRelationsResult&gt;**](TrackerItemRelationsResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

