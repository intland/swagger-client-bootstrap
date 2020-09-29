

# TrackerReportSettings

Settings of a report on a tracker.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reportId** | **Integer** | Id of a report |  [optional]
**cbQl** | **String** | CbQL query string of the report. | 
**name** | **String** | Name of the report. | 
**description** | **String** | Description of the report. | 
**columns** | [**List&lt;ResizableReportColumnSettings&gt;**](ResizableReportColumnSettings.md) | Column definitions. | 
**showAncestors** | **Boolean** | Indicator to show the ancestors of a result item. |  [optional]
**showDescendants** | **Boolean** | Indicator to show the descendants of a result item. |  [optional]
**showAllChildren** | **Boolean** | Indicator to ability to collapse/expand all child items. |  [optional]
**tracker** | [**TrackerReference**](TrackerReference.md) |  | 
**isPublic** | **Boolean** | Public report indicator. | 
**renderingMethod** | [**RenderingMethodEnum**](#RenderingMethodEnum) | Rendering method for Intelligent Table View. |  [optional]
**referenceLevelSettings** | [**List&lt;ReportReferenceLevelSettings&gt;**](ReportReferenceLevelSettings.md) | Reference level setting for Intelligent Table View. |  [optional]



## Enum: RenderingMethodEnum

Name | Value
---- | -----
DISABLED | &quot;disabled&quot;
TABLE | &quot;table&quot;
TREE | &quot;tree&quot;



