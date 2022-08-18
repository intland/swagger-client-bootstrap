

# Association

Basic properties of a codebeamer association

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**baselineId** | **Integer** | Baseline ID |  [optional] |
|**biDirectionalPropagation** | **Boolean** | Bi-directional reference |  [optional] |
|**createdAt** | **OffsetDateTime** | The date when the entity was created |  [optional] |
|**createdBy** | [**UserReference**](UserReference.md) |  |  [optional] |
|**description** | **String** | Description of the entity |  [optional] |
|**descriptionFormat** | [**DescriptionFormatEnum**](#DescriptionFormatEnum) | Description format of the entity |  [optional] |
|**from** | [**AbstractReference**](AbstractReference.md) |  |  |
|**id** | **Integer** | Id of the entity |  [optional] |
|**name** | **String** | Name of the entity |  [optional] |
|**propagatingDependencies** | **Boolean** | Propagating dependencies |  [optional] |
|**propagatingSuspects** | **Boolean** | Propagating suspects |  [optional] |
|**reversePropagation** | **Boolean** | Reverse propagation |  [optional] |
|**to** | [**AbstractReference**](AbstractReference.md) |  |  [optional] |
|**type** | [**AssociationTypeReference**](AssociationTypeReference.md) |  |  [optional] |
|**url** | **String** | Association to url |  [optional] |



## Enum: DescriptionFormatEnum

| Name | Value |
|---- | -----|
| PLAINTEXT | &quot;PlainText&quot; |
| HTML | &quot;Html&quot; |
| WIKI | &quot;Wiki&quot; |



