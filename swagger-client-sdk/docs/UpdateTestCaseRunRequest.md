

# UpdateTestCaseRunRequest

Request model to update Test Run's result for a Test Case

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**conclusion** | **String** | Optional conclusion text |  [optional] |
|**customFields** | [**List&lt;AbstractFieldValue&gt;**](AbstractFieldValue.md) | Optional field values to set on the Test Run |  [optional] |
|**reportedBugReferences** | [**List&lt;TrackerItemReference&gt;**](TrackerItemReference.md) | Optional reference list of Bugs attached to the Test result |  [optional] |
|**result** | [**ResultEnum**](#ResultEnum) | Result of the test case |  |
|**runTime** | **Integer** | Optional runtime in seconds |  [optional] |
|**testCaseReference** | [**TrackerItemReference**](TrackerItemReference.md) |  |  |



## Enum: ResultEnum

| Name | Value |
|---- | -----|
| PASSED | &quot;PASSED&quot; |
| FAILED | &quot;FAILED&quot; |
| BLOCKED | &quot;BLOCKED&quot; |
| NOT_APPLICABLE | &quot;NOT_APPLICABLE&quot; |



