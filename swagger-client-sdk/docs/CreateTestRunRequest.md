

# CreateTestRunRequest

Request model to create a test run from multiple test cases or sets
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**testCaseIds** | [**List&lt;TrackerItemReference&gt;**](TrackerItemReference.md) |  |  [optional]
**testSetIds** | [**List&lt;TrackerItemReference&gt;**](TrackerItemReference.md) |  |  [optional]
**testRunModel** | [**TrackerItem**](TrackerItem.md) |  |  [optional]
**testCaseRefs** | [**List&lt;TrackerItemReference&gt;**](TrackerItemReference.md) | Test case ids to include into the test run |  [optional]
**testSetRefs** | [**List&lt;TrackerItemReference&gt;**](TrackerItemReference.md) | Test set ids to include into the test run |  [optional]



