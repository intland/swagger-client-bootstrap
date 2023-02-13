

# Project

Basic properties of a codebeamer project

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category** | **String** | Category of a project |  [optional]
**closed** | **Boolean** | Closed status of a project |  [optional]
**createdAt** | **Date** | The date when the entity was created |  [optional]
**createdBy** | [**UserReference**](UserReference.md) |  |  [optional]
**deleted** | **Boolean** | Delete status of a project |  [optional]
**description** | **String** | Description of the entity |  [optional]
**descriptionFormat** | [**DescriptionFormatEnum**](#DescriptionFormatEnum) | Description format of the entity |  [optional]
**id** | **Integer** | Id of the entity |  [optional]
**keyName** | **String** | Key name of a project |  [optional]
**modifiedAt** | **Date** | The date when the entity was modified |  [optional]
**modifiedBy** | [**UserReference**](UserReference.md) |  |  [optional]
**name** | **String** | Name of the entity |  [optional]
**template** | **Boolean** | Template status of a project |  [optional]
**version** | **Integer** | Version of a project |  [optional]



## Enum: DescriptionFormatEnum

Name | Value
---- | -----
PLAINTEXT | &quot;PlainText&quot;
HTML | &quot;Html&quot;
WIKI | &quot;Wiki&quot;



