

# TrackerItem

Basic properties of a codeBeamer tracker item
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
**parent** | [**TrackerItemReference**](TrackerItemReference.md) |  |  [optional]
**owners** | [**List&lt;AbstractReference&gt;**](AbstractReference.md) | Owners of a tracker item |  [optional]
**version** | **Integer** | Version of a tracker item |  [optional] [readonly]
**assignedAt** | [**DateTime**](DateTime.md) | Assigne date of a tracker item |  [optional] [readonly]
**assignedTo** | [**List&lt;AbstractReference&gt;**](AbstractReference.md) | Assignees of a tracker item |  [optional]
**startDate** | [**DateTime**](DateTime.md) | Start date of a tracker item |  [optional]
**endDate** | [**DateTime**](DateTime.md) | End date of a tracker item |  [optional]
**closedAt** | [**DateTime**](DateTime.md) | Close date of a tracker item |  [optional]
**storyPoints** | **Integer** | Story points of a tracker item |  [optional]
**tracker** | [**TrackerReference**](TrackerReference.md) |  |  [optional]
**children** | [**List&lt;TrackerItemReference&gt;**](TrackerItemReference.md) | Children of a tracker item |  [optional] [readonly]
**customFields** | [**List&lt;AbstractFieldValue&gt;**](AbstractFieldValue.md) | Custom field of a tracker item |  [optional]
**priority** | [**AbstractReference**](AbstractReference.md) |  |  [optional]
**accruedMillis** | **Long** | Accrued work time of a tracker item in milliseconds |  [optional] [readonly]
**estimatedMillis** | **Long** | Estimated work time of a tracker item in milliseconds |  [optional]
**spentMillis** | **Long** | Spent work time of a tracker item in milliseconds |  [optional] [readonly]
**status** | [**AbstractReference**](AbstractReference.md) |  |  [optional]
**platforms** | [**List&lt;AbstractReference&gt;**](AbstractReference.md) | Platforms of a tracker item |  [optional]
**categories** | [**List&lt;AbstractReference&gt;**](AbstractReference.md) | Categories of a tracker item |  [optional]
**subjects** | [**List&lt;AbstractReference&gt;**](AbstractReference.md) | Subjects of a tracker item |  [optional]
**resolutions** | [**List&lt;AbstractReference&gt;**](AbstractReference.md) | Resolutions of a tracker item |  [optional]
**severities** | [**List&lt;AbstractReference&gt;**](AbstractReference.md) | Severities of a tracker item |  [optional]
**releaseMethod** | [**AbstractReference**](AbstractReference.md) |  |  [optional]
**formality** | [**AbstractReference**](AbstractReference.md) |  |  [optional]
**teams** | [**List&lt;AbstractReference&gt;**](AbstractReference.md) | Teams of a tracker item |  [optional]
**areas** | [**List&lt;AbstractReference&gt;**](AbstractReference.md) | Areas of a tracker item |  [optional]
**versions** | [**List&lt;AbstractReference&gt;**](AbstractReference.md) | Versions of a tracker item |  [optional]
**ordinal** | **Integer** | Ordinal of a tracker item |  [optional]
**typeName** | **String** | Type name of a tracker item |  [optional]
**comments** | [**List&lt;CommentReference&gt;**](CommentReference.md) | Comment in the tracker item |  [optional] [readonly]



## Enum: DescriptionFormatEnum

Name | Value
---- | -----
PLAINTEXT | &quot;PlainText&quot;
HTML | &quot;Html&quot;
WIKI | &quot;Wiki&quot;



