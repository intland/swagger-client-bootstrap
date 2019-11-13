

# Project

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Id of the entity |  [optional]
**name** | **String** | Name of the entity |  [optional]
**description** | **String** | Description of the entity |  [optional]
**descriptionFormat** | [**DescriptionFormatEnum**](#DescriptionFormatEnum) | Description format of the entity |  [optional]
**uri** | **String** | Uri of a project |  [optional]
**version** | **Integer** | Version of a project |  [optional]
**keyName** | **String** | Key name of a project |  [optional]
**category** | **String** | Category of a project |  [optional]
**closed** | **Boolean** | Closed status of a project |  [optional]
**deleted** | **Boolean** | Delete status of a project |  [optional]
**template** | **Boolean** | Template status of a project |  [optional]
**createdAt** | [**DateTime**](DateTime.md) | Creation date of a project |  [optional]
**createdBy** | [**UserReference**](UserReference.md) |  |  [optional]
**lastModifiedAt** | [**DateTime**](DateTime.md) | Modification date of a project |  [optional]
**lastModifiedBy** | [**UserReference**](UserReference.md) |  |  [optional]



## Enum: DescriptionFormatEnum

Name | Value
---- | -----
PLAINTEXT | &quot;PlainText&quot;
HTML | &quot;Html&quot;
WIKI | &quot;Wiki&quot;



