

# Association

Basic properties of a codeBeamer association
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Id of the entity |  [optional]
**name** | **String** | Name of the entity |  [optional]
**description** | **String** | Description of the entity |  [optional]
**descriptionFormat** | [**DescriptionFormatEnum**](#DescriptionFormatEnum) | Description format of the entity |  [optional]
**from** | [**AbstractReference**](AbstractReference.md) |  | 
**to** | [**AbstractReference**](AbstractReference.md) |  |  [optional]
**url** | **String** | Association to url |  [optional]
**type** | [**AssociationTypeReference**](AssociationTypeReference.md) |  |  [optional]
**propagatingSuspects** | **Boolean** | Propagating suspects |  [optional]
**reversePropagation** | **Boolean** | Reverse propagation |  [optional]
**biDirectionalPropagation** | **Boolean** | Bi-directional reference |  [optional]
**propagatingDependencies** | **Boolean** | Propagating dependencies |  [optional]
**baselineId** | **Integer** | Baseline ID |  [optional]
**createdBy** | [**UserReference**](UserReference.md) |  |  [optional]
**createdAt** | [**DateTime**](DateTime.md) | The date when the entity was created |  [optional]



## Enum: DescriptionFormatEnum

Name | Value
---- | -----
PLAINTEXT | &quot;PlainText&quot;
HTML | &quot;Html&quot;
WIKI | &quot;Wiki&quot;



