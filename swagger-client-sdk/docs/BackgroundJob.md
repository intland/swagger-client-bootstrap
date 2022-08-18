

# BackgroundJob

Information about a background job

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**backgroundJobStatus** | [**BackgroundJobStatusEnum**](#BackgroundJobStatusEnum) | Status of a background job |  [optional] |
|**backgroundJobType** | [**BackgroundJobTypeEnum**](#BackgroundJobTypeEnum) | Type of a background job |  [optional] |
|**createdAt** | **OffsetDateTime** | Creation time of job |  [optional] |
|**description** | **String** | Description of job |  [optional] |
|**finishedAt** | **OffsetDateTime** | Completion time of job |  [optional] |
|**id** | **Integer** | ID of job |  [optional] |
|**statusInfo** | [**AbstractBackgroundJobStatusInfo**](AbstractBackgroundJobStatusInfo.md) |  |  [optional] |
|**steps** | [**List&lt;BackgroundJobStep&gt;**](BackgroundJobStep.md) | Sub-steps of a job |  [optional] |
|**submittedBy** | [**UserReference**](UserReference.md) |  |  [optional] |



## Enum: BackgroundJobStatusEnum

| Name | Value |
|---- | -----|
| DRAFT | &quot;DRAFT&quot; |
| NEW | &quot;NEW&quot; |
| IN_PROGRESS | &quot;IN_PROGRESS&quot; |
| FINISHED | &quot;FINISHED&quot; |



## Enum: BackgroundJobTypeEnum

| Name | Value |
|---- | -----|
| RUN_IN_EXCEL | &quot;RUN_IN_EXCEL&quot; |
| MASS_TEST_SET_RUN_CREATION | &quot;MASS_TEST_SET_RUN_CREATION&quot; |
| DEPENDENCY_FINDER | &quot;DEPENDENCY_FINDER&quot; |
| ITEM_EXCEL_IMPORT | &quot;ITEM_EXCEL_IMPORT&quot; |
| DEPLOYMENT_EXPORT | &quot;DEPLOYMENT_EXPORT&quot; |
| WORKING_SET_UPDATE | &quot;WORKING_SET_UPDATE&quot; |



