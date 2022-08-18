

# CreateTestRunRequest

Request model to create a test run from multiple test cases or 1 test set

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**testCaseIds** | [**List&lt;TrackerItemReference&gt;**](TrackerItemReference.md) |  |  [optional] |
|**testCaseRefs** | [**List&lt;TrackerItemReference&gt;**](TrackerItemReference.md) | Test case ids to include into the test run |  [optional] |
|**testRunModel** | [**TrackerItem**](TrackerItem.md) |  |  [optional] |
|**testSetIds** | [**List&lt;TrackerItemReference&gt;**](TrackerItemReference.md) |  |  [optional] |
|**testSetRefs** | [**List&lt;TrackerItemReference&gt;**](TrackerItemReference.md) | Test set ids to include into the test run. Only the first test set will be considered. |  [optional] |



