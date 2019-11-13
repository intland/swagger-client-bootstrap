

# TrackerItemAllOf

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Id of the entity |  [optional]
**uri** | **String** | Reference to an object |  [optional]
**name** | **String** | Name of the entity |  [optional]
**type** | **String** | Type of a referenced object |  [optional]
**parent** | [**TrackerItemReference**](TrackerItemReference.md) |  |  [optional]
**owners** | [**ChoiceFieldValue**](ChoiceFieldValue.md) |  |  [optional]
**version** | **Integer** | Version of a tracker item |  [optional]
**description** | **String** | Description of a tracker item |  [optional]
**descriptionFormat** | [**DescriptionFormatEnum**](#DescriptionFormatEnum) | Form of a tracker item description |  [optional]
**submittedAt** | [**DateTime**](DateTime.md) | Submission date of a tracker item |  [optional]
**submitter** | [**UserReference**](UserReference.md) |  |  [optional]
**modifiedAt** | [**DateTime**](DateTime.md) | Modification date of a tracker item |  [optional]
**modifier** | [**UserReference**](UserReference.md) |  |  [optional]
**assignedAt** | [**DateTime**](DateTime.md) | Assigne date of a tracker item |  [optional]
**assignedTo** | [**ChoiceFieldValue**](ChoiceFieldValue.md) |  |  [optional]
**startDate** | [**DateTime**](DateTime.md) | Start date of a tracker item |  [optional]
**endDate** | [**DateTime**](DateTime.md) | End date of a tracker item |  [optional]
**closedAt** | [**DateTime**](DateTime.md) | Close date of a tracker item |  [optional]
**storyPoints** | **Integer** | Story points of a tracker item |  [optional]
**tracker** | [**TrackerReference**](TrackerReference.md) |  |  [optional]
**children** | [**List&lt;TrackerItemReference&gt;**](TrackerItemReference.md) | Children of a tracker item |  [optional]
**customFields** | [**List&lt;AbstractFieldValue&gt;**](AbstractFieldValue.md) | Custom field of a tracker item |  [optional]
**priority** | [**ChoiceFieldValue**](ChoiceFieldValue.md) |  |  [optional]
**accruedMillis** | **Long** | Accrued work time of a tracker item in milliseconds |  [optional]
**estimatedMillis** | **Long** | Estimated work time of a tracker item in milliseconds |  [optional]
**spentMillis** | **Long** | Spent work time of a tracker item in milliseconds |  [optional]
**status** | [**ChoiceFieldValue**](ChoiceFieldValue.md) |  |  [optional]
**platforms** | [**ChoiceFieldValue**](ChoiceFieldValue.md) |  |  [optional]
**categories** | [**ChoiceFieldValue**](ChoiceFieldValue.md) |  |  [optional]
**subjects** | [**ChoiceFieldValue**](ChoiceFieldValue.md) |  |  [optional]
**resolutions** | [**ChoiceFieldValue**](ChoiceFieldValue.md) |  |  [optional]
**severities** | [**ChoiceFieldValue**](ChoiceFieldValue.md) |  |  [optional]
**releaseMethod** | [**ChoiceFieldValue**](ChoiceFieldValue.md) |  |  [optional]
**teams** | [**ChoiceFieldValue**](ChoiceFieldValue.md) |  |  [optional]
**areas** | [**ChoiceFieldValue**](ChoiceFieldValue.md) |  |  [optional]
**versions** | [**ChoiceFieldValue**](ChoiceFieldValue.md) |  |  [optional]
**ordinal** | **Integer** | Ordinal of a tracker item |  [optional]
**typeName** | **String** | Type name of a tracker item |  [optional]



## Enum: DescriptionFormatEnum

Name | Value
---- | -----
PLAINTEXT | &quot;PlainText&quot;
HTML | &quot;Html&quot;
WIKI | &quot;Wiki&quot;



