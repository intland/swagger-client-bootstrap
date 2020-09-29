

# TrackerItemReviewConfig

The configuration from which the review was created
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requiredSignature** | [**RequiredSignatureEnum**](#RequiredSignatureEnum) | Whether the user has to provide its credentials to vote |  [optional]
**requiredApprovals** | **Integer** | Number of approvals after which the review is considered approved |  [optional]
**requiredRejections** | **Integer** | Number of rejections after which the review is considered rejected |  [optional]
**roleRequired** | **Boolean** | Whether the reviewers have to chose in which of their roles do they want to vote |  [optional]



## Enum: RequiredSignatureEnum

Name | Value
---- | -----
NONE | &quot;NONE&quot;
PASSWORD | &quot;PASSWORD&quot;
USERNAME_AND_PASSWORD | &quot;USERNAME_AND_PASSWORD&quot;



