

# AttachmentMigrationRequest

Request for migrating attachments
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**targetItem** | [**TrackerItemReference**](TrackerItemReference.md) |  |  [optional]
**createdAt** | [**DateTime**](DateTime.md) | The date when the entity was created |  [optional]
**createdBy** | [**UserReference**](UserReference.md) |  |  [optional]
**modifiedAt** | [**DateTime**](DateTime.md) | The date when the entity was modified |  [optional]
**modifiedBy** | [**UserReference**](UserReference.md) |  |  [optional]
**description** | **String** | Description of the entity |  [optional]
**descriptionFormat** | [**DescriptionFormatEnum**](#DescriptionFormatEnum) | Description format of the entity |  [optional]
**migrationAction** | [**MigrationActionEnum**](#MigrationActionEnum) | Type of action made on the source files. |  [optional]
**files** | [**List&lt;RemoteMigrationFile&gt;**](RemoteMigrationFile.md) | List of files to migrate |  [optional]



## Enum: DescriptionFormatEnum

Name | Value
---- | -----
PLAINTEXT | &quot;PlainText&quot;
HTML | &quot;Html&quot;
WIKI | &quot;Wiki&quot;



## Enum: MigrationActionEnum

Name | Value
---- | -----
MOVE | &quot;MOVE&quot;
COPY | &quot;COPY&quot;



