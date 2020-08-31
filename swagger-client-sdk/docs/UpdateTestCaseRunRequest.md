

# UpdateTestCaseRunRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**testCaseReference** | [**TrackerItemReference**](TrackerItemReference.md) |  | 
**result** | [**ResultEnum**](#ResultEnum) | Result of the test case | 
**conclusion** | **String** | Optional conclusion text |  [optional]
**runTime** | **Integer** | Optional runtime in seconds |  [optional]
**reportedBugReferences** | [**List&lt;TrackerItemReference&gt;**](TrackerItemReference.md) | Optional reference list of Bugs attached to the Test result |  [optional]



## Enum: ResultEnum

Name | Value
---- | -----
PASSED | &quot;PASSED&quot;
FAILED | &quot;FAILED&quot;
BLOCKED | &quot;BLOCKED&quot;



