# AssociationApi

All URIs are relative to *http://localhost:8080/cb/api/docs*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAssociation**](AssociationApi.md#deleteAssociation) | **DELETE** /v2/associations/{associationId} | Delete association
[**getAssociationType**](AssociationApi.md#getAssociationType) | **GET** /v2/associations/types/{associationTypeId} | Get association by id


<a name="deleteAssociation"></a>
# **deleteAssociation**
> deleteAssociation(associationId)

Delete association

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.api.AssociationApi;


AssociationApi apiInstance = new AssociationApi();
Integer associationId = 56; // Integer | 
try {
    apiInstance.deleteAssociation(associationId);
} catch (ApiException e) {
    System.err.println("Exception when calling AssociationApi#deleteAssociation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **associationId** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAssociationType"></a>
# **getAssociationType**
> AssociationType getAssociationType(associationTypeId)

Get association by id

### Example
```java
// Import classes:
//import com.intland.swagger.client.ApiException;
//import com.intland.swagger.client.api.AssociationApi;


AssociationApi apiInstance = new AssociationApi();
Integer associationTypeId = 56; // Integer | 
try {
    AssociationType result = apiInstance.getAssociationType(associationTypeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssociationApi#getAssociationType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **associationTypeId** | **Integer**|  |

### Return type

[**AssociationType**](AssociationType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

