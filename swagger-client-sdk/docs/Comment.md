

# Comment

Comment of a tracker item
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Id of the entity |  [optional]
**name** | **String** | Name of the entity |  [optional]
**createdAt** | [**DateTime**](DateTime.md) | The date when the entity was created |  [optional]
**createdBy** | [**UserReference**](UserReference.md) |  |  [optional]
**modifiedAt** | [**DateTime**](DateTime.md) | The date when the entity was modified |  [optional]
**modifiedBy** | [**UserReference**](UserReference.md) |  |  [optional]
**version** | **Integer** | Version of a comment |  [optional]
**attachments** | [**List&lt;Attachment&gt;**](Attachment.md) | Attachments of a comment |  [optional]
**comment** | **String** | Text of a comment |  [optional]
**commentFormat** | [**CommentFormatEnum**](#CommentFormatEnum) | Format of a comment |  [optional]
**parent** | [**CommentReference**](CommentReference.md) |  |  [optional]



## Enum: CommentFormatEnum

Name | Value
---- | -----
PLAINTEXT | &quot;PlainText&quot;
HTML | &quot;Html&quot;
WIKI | &quot;Wiki&quot;



