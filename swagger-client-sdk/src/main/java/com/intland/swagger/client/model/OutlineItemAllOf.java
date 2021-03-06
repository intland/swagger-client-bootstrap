/*
 * codeBeamer swagger API
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
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intland.swagger.client.model.TrackerItemReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * OutlineItemAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-29T09:51:27.838+02:00[Europe/Budapest]")
public class OutlineItemAllOf {
  public static final String SERIALIZED_NAME_ITEM_REFERENCE = "itemReference";
  @SerializedName(SERIALIZED_NAME_ITEM_REFERENCE)
  private TrackerItemReference itemReference;


  public OutlineItemAllOf itemReference(TrackerItemReference itemReference) {
    
    this.itemReference = itemReference;
    return this;
  }

   /**
   * Get itemReference
   * @return itemReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TrackerItemReference getItemReference() {
    return itemReference;
  }


  public void setItemReference(TrackerItemReference itemReference) {
    this.itemReference = itemReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutlineItemAllOf outlineItemAllOf = (OutlineItemAllOf) o;
    return Objects.equals(this.itemReference, outlineItemAllOf.itemReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemReference);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutlineItemAllOf {\n");
    sb.append("    itemReference: ").append(toIndentedString(itemReference)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

