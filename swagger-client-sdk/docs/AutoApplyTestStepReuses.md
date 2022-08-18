

# AutoApplyTestStepReuses

Specifies which Test Cases are checked for duplicate Steps

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**scanTestCaseLibraries** | **Boolean** | If it scans/finds the duplicate Steps in Test Case libraries of the user? Note: that only Reusable Steps will be reused from these libraries! |  [optional] |
|**testCases** | [**List&lt;TrackerItemReference&gt;**](TrackerItemReference.md) | The Test Cases to find the duplicated steps inside: if these Test Cases has duplicated Steps these will be converted to Step-Reuses. |  [optional] |



