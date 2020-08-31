

# TrackerItemReviewVote

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**user** | [**UserReference**](UserReference.md) |  |  [optional]
**asRole** | [**RoleReference**](RoleReference.md) |  |  [optional]
**decision** | [**DecisionEnum**](#DecisionEnum) | The result of this particular vote |  [optional]
**reviewedAt** | [**DateTime**](DateTime.md) | Date and time of the vote |  [optional]



## Enum: DecisionEnum

Name | Value
---- | -----
APPROVED | &quot;APPROVED&quot;
REJECTED | &quot;REJECTED&quot;
UNDECIDED | &quot;UNDECIDED&quot;



