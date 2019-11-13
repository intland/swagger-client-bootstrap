

# Tracker

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Id of the entity |  [optional]
**name** | **String** | Name of the entity |  [optional]
**description** | **String** | Description of the entity |  [optional]
**format** | [**FormatEnum**](#FormatEnum) |  |  [optional]
**descriptionFormat** | [**DescriptionFormatEnum**](#DescriptionFormatEnum) | Description format of the entity |  [optional]
**uri** | **String** | Uri of a tracker |  [optional]
**keyName** | **String** | Keyname of a tracker |  [optional]
**version** | **Integer** | Version of a tracker |  [optional]
**createdAt** | [**DateTime**](DateTime.md) | Creation date of a tracker |  [optional]
**creator** | [**UserReference**](UserReference.md) |  |  [optional]
**modifiedAt** | [**DateTime**](DateTime.md) | Modification date of a tracker |  [optional]
**modifier** | [**UserReference**](UserReference.md) |  |  [optional]
**type** | [**TrackerTypeReference**](TrackerTypeReference.md) |  |  [optional]
**deleted** | **Boolean** | Indicator if the tracker is deleted |  [optional]
**hidden** | **Boolean** | Indicator if the tracker is hidden |  [optional]



## Enum: FormatEnum

Name | Value
---- | -----
PLAINTEXT | &quot;PlainText&quot;
HTML | &quot;Html&quot;
WIKI | &quot;Wiki&quot;



## Enum: DescriptionFormatEnum

Name | Value
---- | -----
PLAINTEXT | &quot;PlainText&quot;
HTML | &quot;Html&quot;
WIKI | &quot;Wiki&quot;



