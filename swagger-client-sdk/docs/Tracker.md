

# Tracker

Basic properties of a codeBeamer tracker
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Id of the entity |  [optional]
**name** | **String** | Name of the entity |  [optional]
**description** | **String** | Description of the entity |  [optional]
**descriptionFormat** | [**DescriptionFormatEnum**](#DescriptionFormatEnum) | Description format of the entity |  [optional]
**keyName** | **String** | Keyname of a tracker |  [optional]
**version** | **Integer** | Version of a tracker |  [optional]
**createdAt** | [**DateTime**](DateTime.md) | The date when the entity was created |  [optional]
**createdBy** | [**UserReference**](UserReference.md) |  |  [optional]
**modifiedAt** | [**DateTime**](DateTime.md) | The date when the entity was modified |  [optional]
**modifiedBy** | [**UserReference**](UserReference.md) |  |  [optional]
**type** | [**TrackerTypeReference**](TrackerTypeReference.md) |  |  [optional]
**deleted** | **Boolean** | Indicator if the tracker is deleted | 
**hidden** | **Boolean** | Indicator if the tracker is hidden | 
**color** | **String** | Color of the tracker |  [optional]
**usingWorkflow** | **Boolean** | Should transitions and workflow actions be available in the tracker or not | 
**onlyWorkflowCanCreateNewReferringItem** | **Boolean** | If true, then the only way to create new referring items is through workflow actions | 
**usingQuickTransitions** | **Boolean** | If true, then every transition will be executed immediately (if possible) without opening an editor for the item | 
**defaultShowAncestorItems** | **Boolean** | Default Outline should show Ancestor Items or not | 
**defaultShowDescendantItems** | **Boolean** | Default Outline should show Descendant Items or not | 
**project** | [**ProjectReference**](ProjectReference.md) |  |  [optional]
**templateTracker** | [**TrackerReference**](TrackerReference.md) |  |  [optional]
**availableAsTemplate** | **Boolean** | Indicator if the tracker can be used as a template |  [optional]



## Enum: DescriptionFormatEnum

Name | Value
---- | -----
PLAINTEXT | &quot;PlainText&quot;
HTML | &quot;Html&quot;
WIKI | &quot;Wiki&quot;



