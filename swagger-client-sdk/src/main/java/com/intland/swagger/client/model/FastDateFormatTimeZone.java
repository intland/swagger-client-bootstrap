/*
 * codeBeamer swagger API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.0
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
 * FastDateFormatTimeZone
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-11-10T15:21:24.239+01:00[Europe/Budapest]")
public class FastDateFormatTimeZone {
  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_RAW_OFFSET = "rawOffset";
  @SerializedName(SERIALIZED_NAME_RAW_OFFSET)
  private Integer rawOffset;

  public static final String SERIALIZED_NAME_DSTSAVINGS = "dstsavings";
  @SerializedName(SERIALIZED_NAME_DSTSAVINGS)
  private Integer dstsavings;

  public FastDateFormatTimeZone displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @ApiModelProperty(value = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public FastDateFormatTimeZone id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FastDateFormatTimeZone rawOffset(Integer rawOffset) {
    this.rawOffset = rawOffset;
    return this;
  }

   /**
   * Get rawOffset
   * @return rawOffset
  **/
  @ApiModelProperty(value = "")
  public Integer getRawOffset() {
    return rawOffset;
  }

  public void setRawOffset(Integer rawOffset) {
    this.rawOffset = rawOffset;
  }

  public FastDateFormatTimeZone dstsavings(Integer dstsavings) {
    this.dstsavings = dstsavings;
    return this;
  }

   /**
   * Get dstsavings
   * @return dstsavings
  **/
  @ApiModelProperty(value = "")
  public Integer getDstsavings() {
    return dstsavings;
  }

  public void setDstsavings(Integer dstsavings) {
    this.dstsavings = dstsavings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FastDateFormatTimeZone fastDateFormatTimeZone = (FastDateFormatTimeZone) o;
    return Objects.equals(this.displayName, fastDateFormatTimeZone.displayName) &&
        Objects.equals(this.id, fastDateFormatTimeZone.id) &&
        Objects.equals(this.rawOffset, fastDateFormatTimeZone.rawOffset) &&
        Objects.equals(this.dstsavings, fastDateFormatTimeZone.dstsavings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, id, rawOffset, dstsavings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FastDateFormatTimeZone {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    rawOffset: ").append(toIndentedString(rawOffset)).append("\n");
    sb.append("    dstsavings: ").append(toIndentedString(dstsavings)).append("\n");
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

