

# TrackerItemReview

A tracker item review instance including its reviewers and their decisions

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**config** | [**TrackerItemReviewConfig**](TrackerItemReviewConfig.md) |  |  [optional]
**result** | [**ResultEnum**](#ResultEnum) | Whether the review is approved or rejected |  [optional]
**reviewers** | [**List&lt;TrackerItemReviewVote&gt;**](TrackerItemReviewVote.md) | List of reviewers, and their votes |  [optional]
**trackerItem** | [**TrackerItemRevision**](TrackerItemRevision.md) |  |  [optional]



## Enum: ResultEnum

Name | Value
---- | -----
APPROVED | &quot;APPROVED&quot;
REJECTED | &quot;REJECTED&quot;
UNDECIDED | &quot;UNDECIDED&quot;



