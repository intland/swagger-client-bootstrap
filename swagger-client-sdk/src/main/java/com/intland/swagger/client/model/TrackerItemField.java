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
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intland.swagger.client.JSON;

import io.swagger.annotations.ApiModelProperty;

/**
 * TrackerItemField
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-18T17:30:04.683+02:00[Europe/Budapest]")
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

  public TrackerItemField() { 
  }

  public TrackerItemField editableFields(List<AbstractFieldValue> editableFields) {
    
    this.editableFields = editableFields;
    return this;
  }

  public TrackerItemField addEditableFieldsItem(AbstractFieldValue editableFieldsItem) {
    if (this.editableFields == null) {
      this.editableFields = new ArrayList<>();
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
      this.editableTableFields = new ArrayList<>();
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
      this.readOnlyFields = new ArrayList<>();
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
      this.readOnlyTableFields = new ArrayList<>();
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("editableFields");
    openapiFields.add("editableTableFields");
    openapiFields.add("readOnlyFields");
    openapiFields.add("readOnlyTableFields");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TrackerItemField
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TrackerItemField.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TrackerItemField is not found in the empty JSON string", TrackerItemField.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TrackerItemField.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TrackerItemField` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayeditableFields = jsonObj.getAsJsonArray("editableFields");
      if (jsonArrayeditableFields != null) {
        // ensure the json data is an array
        if (!jsonObj.get("editableFields").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `editableFields` to be an array in the JSON string but got `%s`", jsonObj.get("editableFields").toString()));
        }

        // validate the optional field `editableFields` (array)
        for (int i = 0; i < jsonArrayeditableFields.size(); i++) {
          AbstractFieldValue.validateJsonObject(jsonArrayeditableFields.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayeditableTableFields = jsonObj.getAsJsonArray("editableTableFields");
      if (jsonArrayeditableTableFields != null) {
        // ensure the json data is an array
        if (!jsonObj.get("editableTableFields").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `editableTableFields` to be an array in the JSON string but got `%s`", jsonObj.get("editableTableFields").toString()));
        }

        // validate the optional field `editableTableFields` (array)
        for (int i = 0; i < jsonArrayeditableTableFields.size(); i++) {
          TableFieldValue.validateJsonObject(jsonArrayeditableTableFields.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayreadOnlyFields = jsonObj.getAsJsonArray("readOnlyFields");
      if (jsonArrayreadOnlyFields != null) {
        // ensure the json data is an array
        if (!jsonObj.get("readOnlyFields").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `readOnlyFields` to be an array in the JSON string but got `%s`", jsonObj.get("readOnlyFields").toString()));
        }

        // validate the optional field `readOnlyFields` (array)
        for (int i = 0; i < jsonArrayreadOnlyFields.size(); i++) {
          AbstractFieldValue.validateJsonObject(jsonArrayreadOnlyFields.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayreadOnlyTableFields = jsonObj.getAsJsonArray("readOnlyTableFields");
      if (jsonArrayreadOnlyTableFields != null) {
        // ensure the json data is an array
        if (!jsonObj.get("readOnlyTableFields").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `readOnlyTableFields` to be an array in the JSON string but got `%s`", jsonObj.get("readOnlyTableFields").toString()));
        }

        // validate the optional field `readOnlyTableFields` (array)
        for (int i = 0; i < jsonArrayreadOnlyTableFields.size(); i++) {
          TableFieldValue.validateJsonObject(jsonArrayreadOnlyTableFields.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TrackerItemField.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TrackerItemField' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TrackerItemField> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TrackerItemField.class));

       return (TypeAdapter<T>) new TypeAdapter<TrackerItemField>() {
           @Override
           public void write(JsonWriter out, TrackerItemField value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TrackerItemField read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TrackerItemField given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TrackerItemField
  * @throws IOException if the JSON string is invalid with respect to TrackerItemField
  */
  public static TrackerItemField fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TrackerItemField.class);
  }

 /**
  * Convert an instance of TrackerItemField to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
