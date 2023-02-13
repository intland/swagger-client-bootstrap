

# AutomatedTestCaseRunResult

Request model to create a test run from test case

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | Description of the Test Case |  [optional]
**groupName** | **String** | Group name of the Test Case |  [optional]
**name** | **String** | Name of the Test Case | 
**result** | [**ResultEnum**](#ResultEnum) | Result of the test case | 
**runTime** | **Integer** | Optional runtime in seconds |  [optional]



## Enum: ResultEnum

Name | Value
---- | -----
PASSED | &quot;PASSED&quot;
FAILED | &quot;FAILED&quot;
BLOCKED | &quot;BLOCKED&quot;
NOT_APPLICABLE | &quot;NOT_APPLICABLE&quot;



