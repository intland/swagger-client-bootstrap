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
 * Request model to fetch Tracker Item Reviews for multiple Tracker Items.
 */
@ApiModel(description = "Request model to fetch Tracker Item Reviews for multiple Tracker Items.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-18T11:38:56.646+02:00[Europe/Budapest]")
public class BatchGetTrackerItemReviewsRequest {
  public static final String SERIALIZED_NAME_BASELINE_ID = "baselineId";
  @SerializedName(SERIALIZED_NAME_BASELINE_ID)
  private Integer baselineId;

  public static final String SERIALIZED_NAME_ITEM_IDS = "itemIds";
  @SerializedName(SERIALIZED_NAME_ITEM_IDS)
  private List<Integer> itemIds = null;

  public BatchGetTrackerItemReviewsRequest() { 
  }

  public BatchGetTrackerItemReviewsRequest baselineId(Integer baselineId) {
    
    this.baselineId = baselineId;
    return this;
  }

   /**
   * Optional Baseline ID
   * @return baselineId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional Baseline ID")

  public Integer getBaselineId() {
    return baselineId;
  }


  public void setBaselineId(Integer baselineId) {
    this.baselineId = baselineId;
  }


  public BatchGetTrackerItemReviewsRequest itemIds(List<Integer> itemIds) {
    
    this.itemIds = itemIds;
    return this;
  }

  public BatchGetTrackerItemReviewsRequest addItemIdsItem(Integer itemIdsItem) {
    if (this.itemIds == null) {
      this.itemIds = new ArrayList<>();
    }
    this.itemIds.add(itemIdsItem);
    return this;
  }

   /**
   * List of Tracker Item IDs
   * @return itemIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of Tracker Item IDs")

  public List<Integer> getItemIds() {
    return itemIds;
  }


  public void setItemIds(List<Integer> itemIds) {
    this.itemIds = itemIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchGetTrackerItemReviewsRequest batchGetTrackerItemReviewsRequest = (BatchGetTrackerItemReviewsRequest) o;
    return Objects.equals(this.baselineId, batchGetTrackerItemReviewsRequest.baselineId) &&
        Objects.equals(this.itemIds, batchGetTrackerItemReviewsRequest.itemIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baselineId, itemIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchGetTrackerItemReviewsRequest {\n");
    sb.append("    baselineId: ").append(toIndentedString(baselineId)).append("\n");
    sb.append("    itemIds: ").append(toIndentedString(itemIds)).append("\n");
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
    openapiFields.add("baselineId");
    openapiFields.add("itemIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BatchGetTrackerItemReviewsRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BatchGetTrackerItemReviewsRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BatchGetTrackerItemReviewsRequest is not found in the empty JSON string", BatchGetTrackerItemReviewsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BatchGetTrackerItemReviewsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BatchGetTrackerItemReviewsRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("itemIds") != null && !jsonObj.get("itemIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `itemIds` to be an array in the JSON string but got `%s`", jsonObj.get("itemIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BatchGetTrackerItemReviewsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BatchGetTrackerItemReviewsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BatchGetTrackerItemReviewsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BatchGetTrackerItemReviewsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<BatchGetTrackerItemReviewsRequest>() {
           @Override
           public void write(JsonWriter out, BatchGetTrackerItemReviewsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BatchGetTrackerItemReviewsRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BatchGetTrackerItemReviewsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BatchGetTrackerItemReviewsRequest
  * @throws IOException if the JSON string is invalid with respect to BatchGetTrackerItemReviewsRequest
  */
  public static BatchGetTrackerItemReviewsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BatchGetTrackerItemReviewsRequest.class);
  }

 /**
  * Convert an instance of BatchGetTrackerItemReviewsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

