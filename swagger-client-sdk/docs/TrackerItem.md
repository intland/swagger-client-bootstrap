

# TrackerItem

Basic properties of a codebeamer tracker item

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accruedMillis** | **Long** | Accrued work time of a tracker item in milliseconds |  [optional] [readonly]
**areas** | [**List&lt;AbstractReference&gt;**](AbstractReference.md) | Areas of a tracker item |  [optional]
**assignedAt** | **Date** | Assignee date of a tracker item |  [optional] [readonly]
**assignedTo** | [**List&lt;AbstractReference&gt;**](AbstractReference.md) | Assignees of a tracker item |  [optional]
**categories** | [**List&lt;AbstractReference&gt;**](AbstractReference.md) | Categories of a tracker item |  [optional]
**children** | [**List&lt;TrackerItemReference&gt;**](TrackerItemReference.md) | Children of a tracker item |  [optional] [readonly]
**closedAt** | **Date** | Close date of a tracker item |  [optional]
**comments** | [**List&lt;CommentReference&gt;**](CommentReference.md) | Comment in the tracker item |  [optional] [readonly]
**createdAt** | **Date** | The date when the entity was created |  [optional]
**createdBy** | [**UserReference**](UserReference.md) |  |  [optional]
**customFields** | [**List&lt;AbstractFieldValue&gt;**](AbstractFieldValue.md) | Custom field of a tracker item |  [optional]
**description** | **String** | Description of the entity |  [optional]
**descriptionFormat** | [**DescriptionFormatEnum**](#DescriptionFormatEnum) | Description format of the entity |  [optional]
**endDate** | **Date** | End date of a tracker item |  [optional]
**estimatedMillis** | **Long** | Estimated work time of a tracker item in milliseconds |  [optional]
**formality** | [**AbstractReference**](AbstractReference.md) |  |  [optional]
**id** | **Integer** | Id of the entity |  [optional]
**modifiedAt** | **Date** | The date when the entity was modified |  [optional]
**modifiedBy** | [**UserReference**](UserReference.md) |  |  [optional]
**name** | **String** | Name of the entity |  [optional]
**ordinal** | **Integer** | Ordinal of a tracker item |  [optional]
**owners** | [**List&lt;AbstractReference&gt;**](AbstractReference.md) | Owners of a tracker item |  [optional]
**parent** | [**TrackerItemReference**](TrackerItemReference.md) |  |  [optional]
**platforms** | [**List&lt;AbstractReference&gt;**](AbstractReference.md) | Platforms of a tracker item |  [optional]
**priority** | [**AbstractReference**](AbstractReference.md) |  |  [optional]
**releaseMethod** | [**AbstractReference**](AbstractReference.md) |  |  [optional]
**resolutions** | [**List&lt;AbstractReference&gt;**](AbstractReference.md) | Resolutions of a tracker item |  [optional]
**severities** | [**List&lt;AbstractReference&gt;**](AbstractReference.md) | Severities of a tracker item |  [optional]
**spentMillis** | **Long** | Spent work time of a tracker item in milliseconds |  [optional]
**startDate** | **Date** | Start date of a tracker item |  [optional]
**status** | [**AbstractReference**](AbstractReference.md) |  |  [optional]
**storyPoints** | **Integer** | Story points of a tracker item |  [optional]
**subjects** | [**List&lt;AbstractReference&gt;**](AbstractReference.md) | Subjects of a tracker item |  [optional]
**tags** | [**List&lt;Label&gt;**](Label.md) | Tags of the tracker item |  [optional] [readonly]
**teams** | [**List&lt;AbstractReference&gt;**](AbstractReference.md) | Teams of a tracker item |  [optional]
**tracker** | [**TrackerReference**](TrackerReference.md) |  |  [optional]
**typeName** | **String** | Type name of a tracker item |  [optional]
**version** | **Integer** | Version of a tracker item |  [optional] [readonly]
**versions** | [**List&lt;AbstractReference&gt;**](AbstractReference.md) | Versions of a tracker item |  [optional]



## Enum: DescriptionFormatEnum

Name | Value
---- | -----
PLAINTEXT | &quot;PlainText&quot;
HTML | &quot;Html&quot;
WIKI | &quot;Wiki&quot;



