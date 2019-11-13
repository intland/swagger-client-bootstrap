

# CommentAllOf

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Id of the entity |  [optional]
**uri** | **String** | Reference to an object |  [optional]
**name** | **String** | Name of the entity |  [optional]
**type** | **String** | Type of a referenced object |  [optional]
**version** | **Integer** | Version of a comment |  [optional]
**createdAt** | [**DateTime**](DateTime.md) | Creation date of a comment |  [optional]
**createdBy** | [**UserReference**](UserReference.md) |  |  [optional]
**modifiedAt** | [**DateTime**](DateTime.md) | Modification date of a comment |  [optional]
**modifier** | [**UserReference**](UserReference.md) |  |  [optional]
**attachments** | [**List&lt;Attachment&gt;**](Attachment.md) | Attachments of a comment |  [optional]
**comment** | **String** | Text of a comment |  [optional]
**commentFormat** | [**CommentFormatEnum**](#CommentFormatEnum) | Format of a comment |  [optional]
**replyTo** | [**CommentReference**](CommentReference.md) |  |  [optional]



## Enum: CommentFormatEnum

Name | Value
---- | -----
PLAINTEXT | &quot;PlainText&quot;
HTML | &quot;Html&quot;
WIKI | &quot;Wiki&quot;



