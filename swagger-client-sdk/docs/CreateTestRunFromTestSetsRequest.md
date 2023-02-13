

# CreateTestRunFromTestSetsRequest

Request model to create a test run from multiple test sets

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**runOnlyAcceptedTestCases** | **Boolean** | Generate Test Runs only from accepted Test Cases. |  [optional]
**testRunModel** | [**TrackerItem**](TrackerItem.md) |  |  [optional]
**testSetRefs** | [**List&lt;TrackerItemReference&gt;**](TrackerItemReference.md) | Test set ids to include into the test run. Only the first test set will be considered. |  [optional]



