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

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.intland.swagger.client.JSON;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A report group which can contain rows or other groups based on the type.
 */
@ApiModel(description = "A report group which can contain rows or other groups based on the type.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-18T11:38:56.646+02:00[Europe/Budapest]")
public class ReportGroup {
  public static final String SERIALIZED_NAME_AGGREGATES = "aggregates";
  @SerializedName(SERIALIZED_NAME_AGGREGATES)
  private List<ReportAggregate> aggregates = null;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Double count;

  public static final String SERIALIZED_NAME_GROUPING_VALUE = "groupingValue";
  @SerializedName(SERIALIZED_NAME_GROUPING_VALUE)
  private String groupingValue;

  public static final String SERIALIZED_NAME_GROUPING_VALUE_ID = "groupingValueId";
  @SerializedName(SERIALIZED_NAME_GROUPING_VALUE_ID)
  private Integer groupingValueId;

  public static final String SERIALIZED_NAME_HEADER = "header";
  @SerializedName(SERIALIZED_NAME_HEADER)
  private String header;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  protected String type;

  public ReportGroup() { 
    this.type = this.getClass().getSimpleName();
  }

  public ReportGroup aggregates(List<ReportAggregate> aggregates) {
    
    this.aggregates = aggregates;
    return this;
  }

  public ReportGroup addAggregatesItem(ReportAggregate aggregatesItem) {
    if (this.aggregates == null) {
      this.aggregates = new ArrayList<>();
    }
    this.aggregates.add(aggregatesItem);
    return this;
  }

   /**
   * List of the aggregate values with column id.
   * @return aggregates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of the aggregate values with column id.")

  public List<ReportAggregate> getAggregates() {
    return aggregates;
  }


  public void setAggregates(List<ReportAggregate> aggregates) {
    this.aggregates = aggregates;
  }


  public ReportGroup count(Double count) {
    
    this.count = count;
    return this;
  }

   /**
   * Number of items in the group, if it has subgroups then the aggregated number of items.
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "32", value = "Number of items in the group, if it has subgroups then the aggregated number of items.")

  public Double getCount() {
    return count;
  }


  public void setCount(Double count) {
    this.count = count;
  }


  public ReportGroup groupingValue(String groupingValue) {
    
    this.groupingValue = groupingValue;
    return this;
  }

   /**
   * The common value in the group, , if it&#39;s available
   * @return groupingValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "In progress", value = "The common value in the group, , if it's available")

  public String getGroupingValue() {
    return groupingValue;
  }


  public void setGroupingValue(String groupingValue) {
    this.groupingValue = groupingValue;
  }


  public ReportGroup groupingValueId(Integer groupingValueId) {
    
    this.groupingValueId = groupingValueId;
    return this;
  }

   /**
   * The id of the common value in the group, if it&#39;s available
   * @return groupingValueId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "The id of the common value in the group, if it's available")

  public Integer getGroupingValueId() {
    return groupingValueId;
  }


  public void setGroupingValueId(Integer groupingValueId) {
    this.groupingValueId = groupingValueId;
  }


  public ReportGroup header(String header) {
    
    this.header = header;
    return this;
  }

   /**
   * Grouping header
   * @return header
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Status: In progress", value = "Grouping header")

  public String getHeader() {
    return header;
  }


  public void setHeader(String header) {
    this.header = header;
  }


  public ReportGroup type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type of the group.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "row", value = "Type of the group.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportGroup reportGroup = (ReportGroup) o;
    return Objects.equals(this.aggregates, reportGroup.aggregates) &&
        Objects.equals(this.count, reportGroup.count) &&
        Objects.equals(this.groupingValue, reportGroup.groupingValue) &&
        Objects.equals(this.groupingValueId, reportGroup.groupingValueId) &&
        Objects.equals(this.header, reportGroup.header) &&
        Objects.equals(this.type, reportGroup.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregates, count, groupingValue, groupingValueId, header, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportGroup {\n");
    sb.append("    aggregates: ").append(toIndentedString(aggregates)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    groupingValue: ").append(toIndentedString(groupingValue)).append("\n");
    sb.append("    groupingValueId: ").append(toIndentedString(groupingValueId)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("aggregates");
    openapiFields.add("count");
    openapiFields.add("groupingValue");
    openapiFields.add("groupingValueId");
    openapiFields.add("header");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReportGroup
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ReportGroup.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReportGroup is not found in the empty JSON string", ReportGroup.openapiRequiredFields.toString()));
        }
      }

      String discriminatorValue = jsonObj.get("type").getAsString();
      switch (discriminatorValue) {
        case "ReportGroupWithGroups":
          ReportGroupWithGroups.validateJsonObject(jsonObj);
          break;
        case "ReportGroupWithReferencedRows":
          ReportGroupWithReferencedRows.validateJsonObject(jsonObj);
          break;
        case "ReportGroupWithRows":
          ReportGroupWithRows.validateJsonObject(jsonObj);
          break;
        default: 
          throw new IllegalArgumentException(String.format("The value of the `type` field `%s` does not match any key defined in the discriminator's mapping.", discriminatorValue));
      }
  }


 /**
  * Create an instance of ReportGroup given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportGroup
  * @throws IOException if the JSON string is invalid with respect to ReportGroup
  */
  public static ReportGroup fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportGroup.class);
  }

 /**
  * Convert an instance of ReportGroup to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

