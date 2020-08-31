

# TrackerItemReview

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reviewers** | [**List&lt;TrackerItemReviewVote&gt;**](TrackerItemReviewVote.md) | List of reviewers, and their votes |  [optional]
**result** | [**ResultEnum**](#ResultEnum) | Whether the review is approved or rejected |  [optional]
**trackerItem** | [**TrackerItemRevision**](TrackerItemRevision.md) |  |  [optional]
**config** | [**TrackerItemReviewConfig**](TrackerItemReviewConfig.md) |  |  [optional]



## Enum: ResultEnum

Name | Value
---- | -----
APPROVED | &quot;APPROVED&quot;
REJECTED | &quot;REJECTED&quot;
UNDECIDED | &quot;UNDECIDED&quot;



