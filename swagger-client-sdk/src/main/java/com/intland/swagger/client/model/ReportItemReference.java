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
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

import com.google.gson.Gson;
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
 * Reference data of an underlying item of a row.
 */
@ApiModel(description = "Reference data of an underlying item of a row.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-18T11:38:56.646+02:00[Europe/Budapest]")
public class ReportItemReference {
  public static final String SERIALIZED_NAME_ITEM_ID = "itemId";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private Integer itemId;

  public static final String SERIALIZED_NAME_TRACKER_ID = "trackerId";
  @SerializedName(SERIALIZED_NAME_TRACKER_ID)
  private Integer trackerId;

  public ReportItemReference() { 
  }

  public ReportItemReference itemId(Integer itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * Identifier of the underlying item.
   * @return itemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier of the underlying item.")

  public Integer getItemId() {
    return itemId;
  }


  public void setItemId(Integer itemId) {
    this.itemId = itemId;
  }


  public ReportItemReference trackerId(Integer trackerId) {
    
    this.trackerId = trackerId;
    return this;
  }

   /**
   * Identifier of the tracker of the underlying item.
   * @return trackerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier of the tracker of the underlying item.")

  public Integer getTrackerId() {
    return trackerId;
  }


  public void setTrackerId(Integer trackerId) {
    this.trackerId = trackerId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportItemReference reportItemReference = (ReportItemReference) o;
    return Objects.equals(this.itemId, reportItemReference.itemId) &&
        Objects.equals(this.trackerId, reportItemReference.trackerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, trackerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportItemReference {\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    trackerId: ").append(toIndentedString(trackerId)).append("\n");
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
    openapiFields.add("itemId");
    openapiFields.add("trackerId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReportItemReference
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ReportItemReference.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReportItemReference is not found in the empty JSON string", ReportItemReference.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ReportItemReference.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReportItemReference` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportItemReference.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportItemReference' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportItemReference> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportItemReference.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportItemReference>() {
           @Override
           public void write(JsonWriter out, ReportItemReference value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportItemReference read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportItemReference given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportItemReference
  * @throws IOException if the JSON string is invalid with respect to ReportItemReference
  */
  public static ReportItemReference fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportItemReference.class);
  }

 /**
  * Convert an instance of ReportItemReference to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

