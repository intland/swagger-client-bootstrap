

# WikiPage

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Id of the entity |  [optional]
**name** | **String** | Name of the entity |  [optional]
**description** | **String** | Description of the entity |  [optional]
**descriptionFormat** | [**DescriptionFormatEnum**](#DescriptionFormatEnum) | Description format of the entity |  [optional]
**project** | [**ProjectReference**](ProjectReference.md) |  |  [optional]
**markup** | **String** | Content markup of the wiki page |  [optional]
**comments** | [**List&lt;AttachmentReference&gt;**](AttachmentReference.md) | Comments/attachments associated with the wiki page |  [optional]
**version** | **Integer** | Version of the wiki page |  [optional]
**changeComment** | **String** | Summary of the changes in this wiki page version |  [optional]
**childPages** | [**List&lt;WikiPageReference&gt;**](WikiPageReference.md) | Child pages of the current Wiki page |  [optional]
**createdAt** | [**DateTime**](DateTime.md) | The date when the entity was created |  [optional]
**createdBy** | [**UserReference**](UserReference.md) |  |  [optional]
**modifiedAt** | [**DateTime**](DateTime.md) | The date when the entity was modified |  [optional]
**modifiedBy** | [**UserReference**](UserReference.md) |  |  [optional]
**parent** | [**AbstractReference**](AbstractReference.md) |  |  [optional]



## Enum: DescriptionFormatEnum

Name | Value
---- | -----
PLAINTEXT | &quot;PlainText&quot;
HTML | &quot;Html&quot;
WIKI | &quot;Wiki&quot;



