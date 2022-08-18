

# WorkflowTransition

A transition in the workflow

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Description of the entity |  [optional] |
|**descriptionFormat** | [**DescriptionFormatEnum**](#DescriptionFormatEnum) | Description format of the entity |  [optional] |
|**fromStatus** | [**ChoiceOptionReference**](ChoiceOptionReference.md) |  |  [optional] |
|**hidden** | **Boolean** | Indicator if the transition is hidden |  [optional] |
|**id** | **Integer** | Id of the entity |  [optional] |
|**name** | **String** | Name of the entity |  [optional] |
|**permissions** | [**List&lt;AccessPermission&gt;**](AccessPermission.md) | Access permissions of the transition |  [optional] |
|**toStatus** | [**ChoiceOptionReference**](ChoiceOptionReference.md) |  |  |



## Enum: DescriptionFormatEnum

| Name | Value |
|---- | -----|
| PLAINTEXT | &quot;PlainText&quot; |
| HTML | &quot;Html&quot; |
| WIKI | &quot;Wiki&quot; |



