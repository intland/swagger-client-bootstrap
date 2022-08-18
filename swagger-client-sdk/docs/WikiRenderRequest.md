

# WikiRenderRequest

Request model to render a wiki page in a specific context

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**contextId** | **Integer** | Id of the entity used as rendering context |  [optional] |
|**contextVersion** | **Integer** | Version of the entity used as rendering context |  [optional] |
|**markup** | **String** | Wiki markup to render as HTML |  |
|**renderingContextType** | [**RenderingContextTypeEnum**](#RenderingContextTypeEnum) | Type of the entity used as rendering context |  [optional] |



## Enum: RenderingContextTypeEnum

| Name | Value |
|---- | -----|
| TRACKER_ITEM | &quot;TRACKER_ITEM&quot; |
| WIKI | &quot;WIKI&quot; |



