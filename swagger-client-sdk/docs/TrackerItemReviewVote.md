

# TrackerItemReviewVote

A tracker item review instance including its reviewers and their decisions

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asRole** | [**RoleReference**](RoleReference.md) |  |  [optional]
**decision** | [**DecisionEnum**](#DecisionEnum) | The result of this particular vote |  [optional]
**reviewedAt** | **OffsetDateTime** | Date and time of the vote |  [optional]
**user** | [**UserReference**](UserReference.md) |  |  [optional]



## Enum: DecisionEnum

Name | Value
---- | -----
APPROVED | &quot;APPROVED&quot;
REJECTED | &quot;REJECTED&quot;
UNDECIDED | &quot;UNDECIDED&quot;



