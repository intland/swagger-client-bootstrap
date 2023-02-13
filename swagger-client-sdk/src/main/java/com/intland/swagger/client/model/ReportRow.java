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

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A row of the report containing cell information.
 */
@ApiModel(description = "A row of the report containing cell information.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-13T14:02:21.403654+01:00[Europe/Budapest]")
public class ReportRow {
  public static final String SERIALIZED_NAME_CELLS = "cells";
  @SerializedName(SERIALIZED_NAME_CELLS)
  private List<ReportCell> cells = null;

  public static final String SERIALIZED_NAME_IS_REAL_RESULT = "isRealResult";
  @SerializedName(SERIALIZED_NAME_IS_REAL_RESULT)
  private Boolean isRealResult;

  public static final String SERIALIZED_NAME_ITEM_REF = "itemRef";
  @SerializedName(SERIALIZED_NAME_ITEM_REF)
  private ReportItemReference itemRef;

  public static final String SERIALIZED_NAME_OUTLINE_LEVEL = "outlineLevel";
  @SerializedName(SERIALIZED_NAME_OUTLINE_LEVEL)
  private Integer outlineLevel;


  public ReportRow cells(List<ReportCell> cells) {
    
    this.cells = cells;
    return this;
  }

  public ReportRow addCellsItem(ReportCell cellsItem) {
    if (this.cells == null) {
      this.cells = new ArrayList<ReportCell>();
    }
    this.cells.add(cellsItem);
    return this;
  }

   /**
   * Cells in a row.
   * @return cells
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Cells in a row.")

  public List<ReportCell> getCells() {
    return cells;
  }


  public void setCells(List<ReportCell> cells) {
    this.cells = cells;
  }


  public ReportRow isRealResult(Boolean isRealResult) {
    
    this.isRealResult = isRealResult;
    return this;
  }

   /**
   * Indicator if the item is a real query result (e.g. not an ancestor item).
   * @return isRealResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicator if the item is a real query result (e.g. not an ancestor item).")

  public Boolean getIsRealResult() {
    return isRealResult;
  }


  public void setIsRealResult(Boolean isRealResult) {
    this.isRealResult = isRealResult;
  }


  public ReportRow itemRef(ReportItemReference itemRef) {
    
    this.itemRef = itemRef;
    return this;
  }

   /**
   * Get itemRef
   * @return itemRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReportItemReference getItemRef() {
    return itemRef;
  }


  public void setItemRef(ReportItemReference itemRef) {
    this.itemRef = itemRef;
  }


  public ReportRow outlineLevel(Integer outlineLevel) {
    
    this.outlineLevel = outlineLevel;
    return this;
  }

   /**
   * Item&#39;s level in the tracker outline.
   * @return outlineLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Item's level in the tracker outline.")

  public Integer getOutlineLevel() {
    return outlineLevel;
  }


  public void setOutlineLevel(Integer outlineLevel) {
    this.outlineLevel = outlineLevel;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportRow reportRow = (ReportRow) o;
    return Objects.equals(this.cells, reportRow.cells) &&
        Objects.equals(this.isRealResult, reportRow.isRealResult) &&
        Objects.equals(this.itemRef, reportRow.itemRef) &&
        Objects.equals(this.outlineLevel, reportRow.outlineLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cells, isRealResult, itemRef, outlineLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportRow {\n");
    sb.append("    cells: ").append(toIndentedString(cells)).append("\n");
    sb.append("    isRealResult: ").append(toIndentedString(isRealResult)).append("\n");
    sb.append("    itemRef: ").append(toIndentedString(itemRef)).append("\n");
    sb.append("    outlineLevel: ").append(toIndentedString(outlineLevel)).append("\n");
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

