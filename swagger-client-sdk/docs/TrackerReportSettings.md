

# TrackerReportSettings

Settings of a report on a tracker.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cbQl** | **String** | CbQL query string of the report. |  |
|**columns** | [**List&lt;ResizableReportColumnSettings&gt;**](ResizableReportColumnSettings.md) | Column definitions. |  |
|**description** | **String** | Description of the report. |  |
|**isPublic** | **Boolean** | Public report indicator. |  |
|**name** | **String** | Name of the report. |  |
|**referenceLevelSettings** | [**List&lt;ReportReferenceLevelSettings&gt;**](ReportReferenceLevelSettings.md) | Reference level setting for Intelligent Table View. |  [optional] |
|**renderingMethod** | [**RenderingMethodEnum**](#RenderingMethodEnum) | Rendering method for Intelligent Table View. |  [optional] |
|**reportId** | **Integer** | Id of a report |  [optional] |
|**showAllChildren** | **Boolean** | Indicator to ability to collapse/expand all child items. |  [optional] |
|**showAncestors** | **Boolean** | Indicator to show the ancestors of a result item. |  [optional] |
|**showDescendants** | **Boolean** | Indicator to show the descendants of a result item. |  [optional] |
|**tracker** | [**TrackerReference**](TrackerReference.md) |  |  |



## Enum: RenderingMethodEnum

| Name | Value |
|---- | -----|
| DISABLED | &quot;disabled&quot; |
| TABLE | &quot;table&quot; |
| TREE | &quot;tree&quot; |



