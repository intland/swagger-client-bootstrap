

# WikiPage

Wiki page details

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**changeComment** | **String** | Summary of the changes in this wiki page version |  [optional]
**childPages** | [**List&lt;WikiPageReference&gt;**](WikiPageReference.md) | Child pages of the current Wiki page |  [optional] [readonly]
**comments** | [**List&lt;AttachmentReference&gt;**](AttachmentReference.md) | Comments/attachments associated with the wiki page |  [optional]
**createdAt** | **Date** | The date when the entity was created |  [optional]
**createdBy** | [**UserReference**](UserReference.md) |  |  [optional]
**description** | **String** | Description of the entity |  [optional]
**descriptionFormat** | [**DescriptionFormatEnum**](#DescriptionFormatEnum) | Description format of the entity |  [optional]
**id** | **Integer** | Id of the entity |  [optional]
**markup** | **String** | Content markup of the wiki page |  [optional]
**modifiedAt** | **Date** | The date when the entity was modified |  [optional]
**modifiedBy** | [**UserReference**](UserReference.md) |  |  [optional]
**name** | **String** | Name of the entity |  [optional]
**parent** | [**AbstractReference**](AbstractReference.md) |  |  [optional]
**project** | [**ProjectReference**](ProjectReference.md) |  |  [optional]
**version** | **Integer** | Version of the wiki page |  [optional]



## Enum: DescriptionFormatEnum

Name | Value
---- | -----
PLAINTEXT | &quot;PlainText&quot;
HTML | &quot;Html&quot;
WIKI | &quot;Wiki&quot;



