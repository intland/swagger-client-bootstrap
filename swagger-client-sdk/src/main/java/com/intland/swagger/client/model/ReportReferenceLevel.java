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

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Reference results for an item.
 */
@ApiModel(description = "Reference results for an item.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-18T11:38:56.646+02:00[Europe/Budapest]")
public class ReportReferenceLevel {
  public static final String SERIALIZED_NAME_COLUMNS = "columns";
  @SerializedName(SERIALIZED_NAME_COLUMNS)
  private List<ReportColumn> columns = null;

  public static final String SERIALIZED_NAME_DOWNSTREAM_REFERENCE_ROWS = "downstreamReferenceRows";
  @SerializedName(SERIALIZED_NAME_DOWNSTREAM_REFERENCE_ROWS)
  private List<ReportReferencedRow> downstreamReferenceRows = null;

  public static final String SERIALIZED_NAME_REFERENCE_LEVEL = "referenceLevel";
  @SerializedName(SERIALIZED_NAME_REFERENCE_LEVEL)
  private Integer referenceLevel;

  public static final String SERIALIZED_NAME_UPSTREAM_REFERENCE_ROWS = "upstreamReferenceRows";
  @SerializedName(SERIALIZED_NAME_UPSTREAM_REFERENCE_ROWS)
  private List<ReportReferencedRow> upstreamReferenceRows = null;

  public ReportReferenceLevel() { 
  }

  public ReportReferenceLevel columns(List<ReportColumn> columns) {
    
    this.columns = columns;
    return this;
  }

  public ReportReferenceLevel addColumnsItem(ReportColumn columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<>();
    }
    this.columns.add(columnsItem);
    return this;
  }

   /**
   * Columns to show on this reference level.
   * @return columns
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Columns to show on this reference level.")

  public List<ReportColumn> getColumns() {
    return columns;
  }


  public void setColumns(List<ReportColumn> columns) {
    this.columns = columns;
  }


  public ReportReferenceLevel downstreamReferenceRows(List<ReportReferencedRow> downstreamReferenceRows) {
    
    this.downstreamReferenceRows = downstreamReferenceRows;
    return this;
  }

  public ReportReferenceLevel addDownstreamReferenceRowsItem(ReportReferencedRow downstreamReferenceRowsItem) {
    if (this.downstreamReferenceRows == null) {
      this.downstreamReferenceRows = new ArrayList<>();
    }
    this.downstreamReferenceRows.add(downstreamReferenceRowsItem);
    return this;
  }

   /**
   * Downstream reference results.
   * @return downstreamReferenceRows
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Downstream reference results.")

  public List<ReportReferencedRow> getDownstreamReferenceRows() {
    return downstreamReferenceRows;
  }


  public void setDownstreamReferenceRows(List<ReportReferencedRow> downstreamReferenceRows) {
    this.downstreamReferenceRows = downstreamReferenceRows;
  }


  public ReportReferenceLevel referenceLevel(Integer referenceLevel) {
    
    this.referenceLevel = referenceLevel;
    return this;
  }

   /**
   * Reference level.
   * @return referenceLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Reference level.")

  public Integer getReferenceLevel() {
    return referenceLevel;
  }


  public void setReferenceLevel(Integer referenceLevel) {
    this.referenceLevel = referenceLevel;
  }


  public ReportReferenceLevel upstreamReferenceRows(List<ReportReferencedRow> upstreamReferenceRows) {
    
    this.upstreamReferenceRows = upstreamReferenceRows;
    return this;
  }

  public ReportReferenceLevel addUpstreamReferenceRowsItem(ReportReferencedRow upstreamReferenceRowsItem) {
    if (this.upstreamReferenceRows == null) {
      this.upstreamReferenceRows = new ArrayList<>();
    }
    this.upstreamReferenceRows.add(upstreamReferenceRowsItem);
    return this;
  }

   /**
   * Upstream reference results.
   * @return upstreamReferenceRows
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Upstream reference results.")

  public List<ReportReferencedRow> getUpstreamReferenceRows() {
    return upstreamReferenceRows;
  }


  public void setUpstreamReferenceRows(List<ReportReferencedRow> upstreamReferenceRows) {
    this.upstreamReferenceRows = upstreamReferenceRows;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportReferenceLevel reportReferenceLevel = (ReportReferenceLevel) o;
    return Objects.equals(this.columns, reportReferenceLevel.columns) &&
        Objects.equals(this.downstreamReferenceRows, reportReferenceLevel.downstreamReferenceRows) &&
        Objects.equals(this.referenceLevel, reportReferenceLevel.referenceLevel) &&
        Objects.equals(this.upstreamReferenceRows, reportReferenceLevel.upstreamReferenceRows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns, downstreamReferenceRows, referenceLevel, upstreamReferenceRows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportReferenceLevel {\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    downstreamReferenceRows: ").append(toIndentedString(downstreamReferenceRows)).append("\n");
    sb.append("    referenceLevel: ").append(toIndentedString(referenceLevel)).append("\n");
    sb.append("    upstreamReferenceRows: ").append(toIndentedString(upstreamReferenceRows)).append("\n");
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
    openapiFields.add("columns");
    openapiFields.add("downstreamReferenceRows");
    openapiFields.add("referenceLevel");
    openapiFields.add("upstreamReferenceRows");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReportReferenceLevel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ReportReferenceLevel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReportReferenceLevel is not found in the empty JSON string", ReportReferenceLevel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ReportReferenceLevel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReportReferenceLevel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraycolumns = jsonObj.getAsJsonArray("columns");
      if (jsonArraycolumns != null) {
        // ensure the json data is an array
        if (!jsonObj.get("columns").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `columns` to be an array in the JSON string but got `%s`", jsonObj.get("columns").toString()));
        }

        // validate the optional field `columns` (array)
        for (int i = 0; i < jsonArraycolumns.size(); i++) {
          ReportColumn.validateJsonObject(jsonArraycolumns.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArraydownstreamReferenceRows = jsonObj.getAsJsonArray("downstreamReferenceRows");
      if (jsonArraydownstreamReferenceRows != null) {
        // ensure the json data is an array
        if (!jsonObj.get("downstreamReferenceRows").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `downstreamReferenceRows` to be an array in the JSON string but got `%s`", jsonObj.get("downstreamReferenceRows").toString()));
        }

        // validate the optional field `downstreamReferenceRows` (array)
        for (int i = 0; i < jsonArraydownstreamReferenceRows.size(); i++) {
          ReportReferencedRow.validateJsonObject(jsonArraydownstreamReferenceRows.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayupstreamReferenceRows = jsonObj.getAsJsonArray("upstreamReferenceRows");
      if (jsonArrayupstreamReferenceRows != null) {
        // ensure the json data is an array
        if (!jsonObj.get("upstreamReferenceRows").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `upstreamReferenceRows` to be an array in the JSON string but got `%s`", jsonObj.get("upstreamReferenceRows").toString()));
        }

        // validate the optional field `upstreamReferenceRows` (array)
        for (int i = 0; i < jsonArrayupstreamReferenceRows.size(); i++) {
          ReportReferencedRow.validateJsonObject(jsonArrayupstreamReferenceRows.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportReferenceLevel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportReferenceLevel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportReferenceLevel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportReferenceLevel.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportReferenceLevel>() {
           @Override
           public void write(JsonWriter out, ReportReferenceLevel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportReferenceLevel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportReferenceLevel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportReferenceLevel
  * @throws IOException if the JSON string is invalid with respect to ReportReferenceLevel
  */
  public static ReportReferenceLevel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportReferenceLevel.class);
  }

 /**
  * Convert an instance of ReportReferenceLevel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

