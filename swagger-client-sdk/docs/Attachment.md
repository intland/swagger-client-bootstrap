

# Attachment

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Id of the entity |  [optional]
**name** | **String** | Name of the entity |  [optional]
**description** | **String** | Description of the entity |  [optional]
**descriptionFormat** | [**DescriptionFormatEnum**](#DescriptionFormatEnum) | Description format of the entity |  [optional]
**createdAt** | [**DateTime**](DateTime.md) | The date when the entity was created |  [optional]
**createdBy** | [**UserReference**](UserReference.md) |  |  [optional]
**modifiedAt** | [**DateTime**](DateTime.md) | The date when the entity was modified |  [optional]
**modifiedBy** | [**UserReference**](UserReference.md) |  |  [optional]
**version** | **Integer** | Version of a attachment |  [optional]
**size** | **Long** | Size of a attachment |  [optional]
**md5** | **String** | Size of a attachment |  [optional]



## Enum: DescriptionFormatEnum

Name | Value
---- | -----
PLAINTEXT | &quot;PlainText&quot;
HTML | &quot;Html&quot;
WIKI | &quot;Wiki&quot;



