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

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Value container of a table field
 */
@ApiModel(description = "Value container of a table field")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-13T14:02:21.403654+01:00[Europe/Budapest]")
public class TableFieldValue extends AbstractFieldValue {
  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<List<AbstractFieldValue>> values = null;

  public TableFieldValue() {
    this.type = this.getClass().getSimpleName();
  }

  public TableFieldValue values(List<List<AbstractFieldValue>> values) {
    
    this.values = values;
    return this;
  }

  public TableFieldValue addValuesItem(List<AbstractFieldValue> valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<List<AbstractFieldValue>>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Table values
   * @return values
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Table values")

  public List<List<AbstractFieldValue>> getValues() {
    return values;
  }


  public void setValues(List<List<AbstractFieldValue>> values) {
    this.values = values;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableFieldValue tableFieldValue = (TableFieldValue) o;
    return Objects.equals(this.values, tableFieldValue.values) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableFieldValue {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

