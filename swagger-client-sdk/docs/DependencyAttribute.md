

# DependencyAttribute

Information on how and where references were found in source project.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lookupDirection** | [**LookupDirectionEnum**](#LookupDirectionEnum) | Direction in which dependency finder discovered the reference. |  [optional]
**path** | [**List&lt;DependencyEntityReference&gt;**](DependencyEntityReference.md) | Trace in source project model where the reference was found. |  [optional]



## Enum: LookupDirectionEnum

Name | Value
---- | -----
FORWARD | &quot;Forward&quot;
BIDIRECTIONAL | &quot;Bidirectional&quot;



