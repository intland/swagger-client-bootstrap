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

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Change item for a tracker item field row.
 */
@ApiModel(description = "Change item for a tracker item field row.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-13T14:02:21.403654+01:00[Europe/Budapest]")
public class TrackerItemRowChange extends TrackerItemChange {
  public static final String SERIALIZED_NAME_ROW_NUMBER = "rowNumber";
  @SerializedName(SERIALIZED_NAME_ROW_NUMBER)
  private Integer rowNumber;

  public TrackerItemRowChange() {
    this.type = this.getClass().getSimpleName();
  }

  public TrackerItemRowChange rowNumber(Integer rowNumber) {
    
    this.rowNumber = rowNumber;
    return this;
  }

   /**
   * Index of the changed row
   * @return rowNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "Index of the changed row")

  public Integer getRowNumber() {
    return rowNumber;
  }


  public void setRowNumber(Integer rowNumber) {
    this.rowNumber = rowNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackerItemRowChange trackerItemRowChange = (TrackerItemRowChange) o;
    return Objects.equals(this.rowNumber, trackerItemRowChange.rowNumber) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rowNumber, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackerItemRowChange {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    rowNumber: ").append(toIndentedString(rowNumber)).append("\n");
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

