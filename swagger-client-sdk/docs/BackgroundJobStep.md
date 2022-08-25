

# BackgroundJobStep

Information about a background job step

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Id of the background job step |  [optional]
**name** | **String** | Name of the background job step |  [optional]
**result** | [**ResultEnum**](#ResultEnum) | Result of a background job step |  [optional]
**resultMessage** | **String** | Result message of the background job step |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Status of a background job step |  [optional]



## Enum: ResultEnum

Name | Value
---- | -----
SUCCESSFUL | &quot;SUCCESSFUL&quot;
FAILED | &quot;FAILED&quot;



## Enum: StatusEnum

Name | Value
---- | -----
NEW | &quot;NEW&quot;
IN_PROGRESS | &quot;IN_PROGRESS&quot;
FINISHED | &quot;FINISHED&quot;



