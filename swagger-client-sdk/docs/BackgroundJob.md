

# BackgroundJob

Information about a background job
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | ID of job |  [optional]
**description** | **String** | Description of job |  [optional]
**backgroundJobType** | [**BackgroundJobTypeEnum**](#BackgroundJobTypeEnum) | Type of a background job |  [optional]
**backgroundJobStatus** | [**BackgroundJobStatusEnum**](#BackgroundJobStatusEnum) | Status of a background job |  [optional]
**submittedBy** | [**UserReference**](UserReference.md) |  |  [optional]
**createdAt** | [**DateTime**](DateTime.md) | Creation time of job |  [optional]
**finishedAt** | [**DateTime**](DateTime.md) | Completion time of job |  [optional]
**statusInfo** | [**AbstractBackgroundJobStatusInfo**](AbstractBackgroundJobStatusInfo.md) |  |  [optional]



## Enum: BackgroundJobTypeEnum

Name | Value
---- | -----
RUN_IN_EXCEL | &quot;RUN_IN_EXCEL&quot;
MASS_TEST_SET_RUN_CREATION | &quot;MASS_TEST_SET_RUN_CREATION&quot;
DEPENDENCY_FINDER | &quot;DEPENDENCY_FINDER&quot;
ITEM_EXCEL_IMPORT | &quot;ITEM_EXCEL_IMPORT&quot;



## Enum: BackgroundJobStatusEnum

Name | Value
---- | -----
DRAFT | &quot;DRAFT&quot;
NEW | &quot;NEW&quot;
IN_PROGRESS | &quot;IN_PROGRESS&quot;
FINISHED | &quot;FINISHED&quot;



