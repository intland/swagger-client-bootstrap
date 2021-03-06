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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Represents the index of an item on a specific outline level.
 */
@ApiModel(description = "Represents the index of an item on a specific outline level.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-29T09:51:27.838+02:00[Europe/Budapest]")
public class OutlineIndex {
  public static final String SERIALIZED_NAME_LEVEL = "level";
  @SerializedName(SERIALIZED_NAME_LEVEL)
  private Integer level;

  public static final String SERIALIZED_NAME_INDEX = "index";
  @SerializedName(SERIALIZED_NAME_INDEX)
  private Integer index;


  public OutlineIndex level(Integer level) {
    
    this.level = level;
    return this;
  }

   /**
   * Outline level
   * @return level
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "Outline level")

  public Integer getLevel() {
    return level;
  }


  public void setLevel(Integer level) {
    this.level = level;
  }


  public OutlineIndex index(Integer index) {
    
    this.index = index;
    return this;
  }

   /**
   * Outline index
   * @return index
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Outline index")

  public Integer getIndex() {
    return index;
  }


  public void setIndex(Integer index) {
    this.index = index;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutlineIndex outlineIndex = (OutlineIndex) o;
    return Objects.equals(this.level, outlineIndex.level) &&
        Objects.equals(this.index, outlineIndex.index);
  }

  @Override
  public int hashCode() {
    return Objects.hash(level, index);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutlineIndex {\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
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

