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
 * TrackerItemFieldAccessibilityList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-18T17:30:04.683+02:00[Europe/Budapest]")
public class TrackerItemFieldAccessibilityList {
  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private List<TrackerItemFieldAccessibility> fields = null;

  public TrackerItemFieldAccessibilityList() { 
  }

  public TrackerItemFieldAccessibilityList fields(List<TrackerItemFieldAccessibility> fields) {
    
    this.fields = fields;
    return this;
  }

  public TrackerItemFieldAccessibilityList addFieldsItem(TrackerItemFieldAccessibility fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Accessibilities of fields
   * @return fields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Accessibilities of fields")

  public List<TrackerItemFieldAccessibility> getFields() {
    return fields;
  }


  public void setFields(List<TrackerItemFieldAccessibility> fields) {
    this.fields = fields;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackerItemFieldAccessibilityList trackerItemFieldAccessibilityList = (TrackerItemFieldAccessibilityList) o;
    return Objects.equals(this.fields, trackerItemFieldAccessibilityList.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackerItemFieldAccessibilityList {\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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
    openapiFields.add("fields");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TrackerItemFieldAccessibilityList
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TrackerItemFieldAccessibilityList.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TrackerItemFieldAccessibilityList is not found in the empty JSON string", TrackerItemFieldAccessibilityList.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TrackerItemFieldAccessibilityList.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TrackerItemFieldAccessibilityList` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayfields = jsonObj.getAsJsonArray("fields");
      if (jsonArrayfields != null) {
        // ensure the json data is an array
        if (!jsonObj.get("fields").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `fields` to be an array in the JSON string but got `%s`", jsonObj.get("fields").toString()));
        }

        // validate the optional field `fields` (array)
        for (int i = 0; i < jsonArrayfields.size(); i++) {
          TrackerItemFieldAccessibility.validateJsonObject(jsonArrayfields.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TrackerItemFieldAccessibilityList.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TrackerItemFieldAccessibilityList' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TrackerItemFieldAccessibilityList> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TrackerItemFieldAccessibilityList.class));

       return (TypeAdapter<T>) new TypeAdapter<TrackerItemFieldAccessibilityList>() {
           @Override
           public void write(JsonWriter out, TrackerItemFieldAccessibilityList value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TrackerItemFieldAccessibilityList read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TrackerItemFieldAccessibilityList given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TrackerItemFieldAccessibilityList
  * @throws IOException if the JSON string is invalid with respect to TrackerItemFieldAccessibilityList
  */
  public static TrackerItemFieldAccessibilityList fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TrackerItemFieldAccessibilityList.class);
  }

 /**
  * Convert an instance of TrackerItemFieldAccessibilityList to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
