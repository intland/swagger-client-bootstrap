

# AttachmentMigrationRequest

Request for migrating attachments

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdAt** | **OffsetDateTime** | The date when the entity was created |  [optional] |
|**createdBy** | [**UserReference**](UserReference.md) |  |  [optional] |
|**description** | **String** | Description of the entity |  [optional] |
|**descriptionFormat** | [**DescriptionFormatEnum**](#DescriptionFormatEnum) | Description format of the entity |  [optional] |
|**files** | [**List&lt;RemoteMigrationFile&gt;**](RemoteMigrationFile.md) | List of files to migrate |  [optional] |
|**migrationAction** | [**MigrationActionEnum**](#MigrationActionEnum) | Type of action made on the source files. |  [optional] |
|**modifiedAt** | **OffsetDateTime** | The date when the entity was modified |  [optional] |
|**modifiedBy** | [**UserReference**](UserReference.md) |  |  [optional] |
|**targetItem** | [**TrackerItemReference**](TrackerItemReference.md) |  |  [optional] |



## Enum: DescriptionFormatEnum

| Name | Value |
|---- | -----|
| PLAINTEXT | &quot;PlainText&quot; |
| HTML | &quot;Html&quot; |
| WIKI | &quot;Wiki&quot; |



## Enum: MigrationActionEnum

| Name | Value |
|---- | -----|
| MOVE | &quot;MOVE&quot; |
| COPY | &quot;COPY&quot; |



