

# AutomatedTestRunRequest

Request model to create a test run from test case runs

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createNonExistentTestCases** | **Boolean** | Flag to create new test cases from testResults if necessary |  [optional]
**testCaseTrackerId** | **Integer** | ID of the Test Case tracker | 
**testResults** | [**List&lt;AutomatedTestCaseRunResult&gt;**](AutomatedTestCaseRunResult.md) | Test case results to include into the test run | 
**testRunModel** | [**TrackerItem**](TrackerItem.md) |  |  [optional]



