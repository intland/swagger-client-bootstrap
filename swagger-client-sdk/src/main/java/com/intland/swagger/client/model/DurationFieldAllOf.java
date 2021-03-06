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
 * DurationFieldAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-29T09:51:27.838+02:00[Europe/Budapest]")
public class DurationFieldAllOf {
  public static final String SERIALIZED_NAME_MIN = "min";
  @SerializedName(SERIALIZED_NAME_MIN)
  private String min;

  public static final String SERIALIZED_NAME_MAX = "max";
  @SerializedName(SERIALIZED_NAME_MAX)
  private String max;

  public static final String SERIALIZED_NAME_FORMULA = "formula";
  @SerializedName(SERIALIZED_NAME_FORMULA)
  private String formula;


  public DurationFieldAllOf min(String min) {
    
    this.min = min;
    return this;
  }

   /**
   * Minimum value of a field
   * @return min
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Minimum value of a field")

  public String getMin() {
    return min;
  }


  public void setMin(String min) {
    this.min = min;
  }


  public DurationFieldAllOf max(String max) {
    
    this.max = max;
    return this;
  }

   /**
   * Maximum value of a field
   * @return max
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum value of a field")

  public String getMax() {
    return max;
  }


  public void setMax(String max) {
    this.max = max;
  }


  public DurationFieldAllOf formula(String formula) {
    
    this.formula = formula;
    return this;
  }

   /**
   * Formula value of a field
   * @return formula
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Formula value of a field")

  public String getFormula() {
    return formula;
  }


  public void setFormula(String formula) {
    this.formula = formula;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DurationFieldAllOf durationFieldAllOf = (DurationFieldAllOf) o;
    return Objects.equals(this.min, durationFieldAllOf.min) &&
        Objects.equals(this.max, durationFieldAllOf.max) &&
        Objects.equals(this.formula, durationFieldAllOf.formula);
  }

  @Override
  public int hashCode() {
    return Objects.hash(min, max, formula);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DurationFieldAllOf {\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    formula: ").append(toIndentedString(formula)).append("\n");
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

