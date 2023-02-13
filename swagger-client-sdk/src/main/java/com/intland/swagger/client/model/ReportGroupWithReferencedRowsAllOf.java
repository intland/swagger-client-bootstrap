/*
 * codebeamer swagger API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 3.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.intland.swagger.client.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * ReportGroupWithReferencedRowsAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-13T14:02:21.403654+01:00[Europe/Budapest]")
public class ReportGroupWithReferencedRowsAllOf {
  public static final String SERIALIZED_NAME_GROUPING_LEVEL = "groupingLevel";
  @SerializedName(SERIALIZED_NAME_GROUPING_LEVEL)
  private Integer groupingLevel;

  public static final String SERIALIZED_NAME_ROWS = "rows";
  @SerializedName(SERIALIZED_NAME_ROWS)
  private List<ReportReferencedRow> rows = null;

  public static final String SERIALIZED_NAME_STAR_ROW = "starRow";
  @SerializedName(SERIALIZED_NAME_STAR_ROW)
  private Integer starRow;


  public ReportGroupWithReferencedRowsAllOf groupingLevel(Integer groupingLevel) {
    
    this.groupingLevel = groupingLevel;
    return this;
  }

   /**
   * Get groupingLevel
   * @return groupingLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getGroupingLevel() {
    return groupingLevel;
  }


  public void setGroupingLevel(Integer groupingLevel) {
    this.groupingLevel = groupingLevel;
  }


  public ReportGroupWithReferencedRowsAllOf rows(List<ReportReferencedRow> rows) {
    
    this.rows = rows;
    return this;
  }

  public ReportGroupWithReferencedRowsAllOf addRowsItem(ReportReferencedRow rowsItem) {
    if (this.rows == null) {
      this.rows = new ArrayList<ReportReferencedRow>();
    }
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Get rows
   * @return rows
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ReportReferencedRow> getRows() {
    return rows;
  }


  public void setRows(List<ReportReferencedRow> rows) {
    this.rows = rows;
  }


  public ReportGroupWithReferencedRowsAllOf starRow(Integer starRow) {
    
    this.starRow = starRow;
    return this;
  }

   /**
   * Get starRow
   * @return starRow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getStarRow() {
    return starRow;
  }


  public void setStarRow(Integer starRow) {
    this.starRow = starRow;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportGroupWithReferencedRowsAllOf reportGroupWithReferencedRowsAllOf = (ReportGroupWithReferencedRowsAllOf) o;
    return Objects.equals(this.groupingLevel, reportGroupWithReferencedRowsAllOf.groupingLevel) &&
        Objects.equals(this.rows, reportGroupWithReferencedRowsAllOf.rows) &&
        Objects.equals(this.starRow, reportGroupWithReferencedRowsAllOf.starRow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupingLevel, rows, starRow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportGroupWithReferencedRowsAllOf {\n");
    sb.append("    groupingLevel: ").append(toIndentedString(groupingLevel)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    starRow: ").append(toIndentedString(starRow)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

