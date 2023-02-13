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
 * TrackerItemField
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-13T14:02:21.403654+01:00[Europe/Budapest]")
public class TrackerItemField {
  public static final String SERIALIZED_NAME_EDITABLE_FIELDS = "editableFields";
  @SerializedName(SERIALIZED_NAME_EDITABLE_FIELDS)
  private List<AbstractFieldValue> editableFields = null;

  public static final String SERIALIZED_NAME_EDITABLE_TABLE_FIELDS = "editableTableFields";
  @SerializedName(SERIALIZED_NAME_EDITABLE_TABLE_FIELDS)
  private List<TableFieldValue> editableTableFields = null;

  public static final String SERIALIZED_NAME_READ_ONLY_FIELDS = "readOnlyFields";
  @SerializedName(SERIALIZED_NAME_READ_ONLY_FIELDS)
  private List<AbstractFieldValue> readOnlyFields = null;

  public static final String SERIALIZED_NAME_READ_ONLY_TABLE_FIELDS = "readOnlyTableFields";
  @SerializedName(SERIALIZED_NAME_READ_ONLY_TABLE_FIELDS)
  private List<TableFieldValue> readOnlyTableFields = null;


  public TrackerItemField editableFields(List<AbstractFieldValue> editableFields) {
    
    this.editableFields = editableFields;
    return this;
  }

  public TrackerItemField addEditableFieldsItem(AbstractFieldValue editableFieldsItem) {
    if (this.editableFields == null) {
      this.editableFields = new ArrayList<AbstractFieldValue>();
    }
    this.editableFields.add(editableFieldsItem);
    return this;
  }

   /**
   * Fields which can be modified
   * @return editableFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Fields which can be modified")

  public List<AbstractFieldValue> getEditableFields() {
    return editableFields;
  }


  public void setEditableFields(List<AbstractFieldValue> editableFields) {
    this.editableFields = editableFields;
  }


  public TrackerItemField editableTableFields(List<TableFieldValue> editableTableFields) {
    
    this.editableTableFields = editableTableFields;
    return this;
  }

  public TrackerItemField addEditableTableFieldsItem(TableFieldValue editableTableFieldsItem) {
    if (this.editableTableFields == null) {
      this.editableTableFields = new ArrayList<TableFieldValue>();
    }
    this.editableTableFields.add(editableTableFieldsItem);
    return this;
  }

   /**
   * Table fields which can be modified
   * @return editableTableFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Table fields which can be modified")

  public List<TableFieldValue> getEditableTableFields() {
    return editableTableFields;
  }


  public void setEditableTableFields(List<TableFieldValue> editableTableFields) {
    this.editableTableFields = editableTableFields;
  }


  public TrackerItemField readOnlyFields(List<AbstractFieldValue> readOnlyFields) {
    
    this.readOnlyFields = readOnlyFields;
    return this;
  }

  public TrackerItemField addReadOnlyFieldsItem(AbstractFieldValue readOnlyFieldsItem) {
    if (this.readOnlyFields == null) {
      this.readOnlyFields = new ArrayList<AbstractFieldValue>();
    }
    this.readOnlyFields.add(readOnlyFieldsItem);
    return this;
  }

   /**
   * Fields which are not writable in the current state
   * @return readOnlyFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Fields which are not writable in the current state")

  public List<AbstractFieldValue> getReadOnlyFields() {
    return readOnlyFields;
  }


  public void setReadOnlyFields(List<AbstractFieldValue> readOnlyFields) {
    this.readOnlyFields = readOnlyFields;
  }


  public TrackerItemField readOnlyTableFields(List<TableFieldValue> readOnlyTableFields) {
    
    this.readOnlyTableFields = readOnlyTableFields;
    return this;
  }

  public TrackerItemField addReadOnlyTableFieldsItem(TableFieldValue readOnlyTableFieldsItem) {
    if (this.readOnlyTableFields == null) {
      this.readOnlyTableFields = new ArrayList<TableFieldValue>();
    }
    this.readOnlyTableFields.add(readOnlyTableFieldsItem);
    return this;
  }

   /**
   * Table fields which are not writable in the current state
   * @return readOnlyTableFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Table fields which are not writable in the current state")

  public List<TableFieldValue> getReadOnlyTableFields() {
    return readOnlyTableFields;
  }


  public void setReadOnlyTableFields(List<TableFieldValue> readOnlyTableFields) {
    this.readOnlyTableFields = readOnlyTableFields;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackerItemField trackerItemField = (TrackerItemField) o;
    return Objects.equals(this.editableFields, trackerItemField.editableFields) &&
        Objects.equals(this.editableTableFields, trackerItemField.editableTableFields) &&
        Objects.equals(this.readOnlyFields, trackerItemField.readOnlyFields) &&
        Objects.equals(this.readOnlyTableFields, trackerItemField.readOnlyTableFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(editableFields, editableTableFields, readOnlyFields, readOnlyTableFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackerItemField {\n");
    sb.append("    editableFields: ").append(toIndentedString(editableFields)).append("\n");
    sb.append("    editableTableFields: ").append(toIndentedString(editableTableFields)).append("\n");
    sb.append("    readOnlyFields: ").append(toIndentedString(readOnlyFields)).append("\n");
    sb.append("    readOnlyTableFields: ").append(toIndentedString(readOnlyTableFields)).append("\n");
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

