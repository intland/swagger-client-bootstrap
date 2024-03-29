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

import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Value container of a field
 */
@ApiModel(description = "Value container of a field")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-13T14:02:21.403654+01:00[Europe/Budapest]")
public class AbstractFieldValue {
  public static final String SERIALIZED_NAME_FIELD_ID = "fieldId";
  @SerializedName(SERIALIZED_NAME_FIELD_ID)
  private Integer fieldId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SHARED_FIELD_NAME = "sharedFieldName";
  @SerializedName(SERIALIZED_NAME_SHARED_FIELD_NAME)
  private String sharedFieldName;

  public static final String SERIALIZED_NAME_SHARED_FIELD_NAMES = "sharedFieldNames";
  @SerializedName(SERIALIZED_NAME_SHARED_FIELD_NAMES)
  private List<String> sharedFieldNames = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  protected String type;

  public AbstractFieldValue() {
    this.type = this.getClass().getSimpleName();
  }

  public AbstractFieldValue fieldId(Integer fieldId) {
    
    this.fieldId = fieldId;
    return this;
  }

   /**
   * Id of the field
   * @return fieldId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Id of the field")

  public Integer getFieldId() {
    return fieldId;
  }


  public void setFieldId(Integer fieldId) {
    this.fieldId = fieldId;
  }


  public AbstractFieldValue name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the field
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the field")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AbstractFieldValue sharedFieldName(String sharedFieldName) {
    
    this.sharedFieldName = sharedFieldName;
    return this;
  }

   /**
   * The name of a shared field assigned to the field. This can be specified as an alternative to fieldId.
   * @return sharedFieldName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of a shared field assigned to the field. This can be specified as an alternative to fieldId.")

  public String getSharedFieldName() {
    return sharedFieldName;
  }


  public void setSharedFieldName(String sharedFieldName) {
    this.sharedFieldName = sharedFieldName;
  }


   /**
   * The names of a shared fields assigned to the field.
   * @return sharedFieldNames
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The names of a shared fields assigned to the field.")

  public List<String> getSharedFieldNames() {
    return sharedFieldNames;
  }




  public AbstractFieldValue type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type of the field
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Type of the field")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbstractFieldValue abstractFieldValue = (AbstractFieldValue) o;
    return Objects.equals(this.fieldId, abstractFieldValue.fieldId) &&
        Objects.equals(this.name, abstractFieldValue.name) &&
        Objects.equals(this.sharedFieldName, abstractFieldValue.sharedFieldName) &&
        Objects.equals(this.sharedFieldNames, abstractFieldValue.sharedFieldNames) &&
        Objects.equals(this.type, abstractFieldValue.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldId, name, sharedFieldName, sharedFieldNames, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbstractFieldValue {\n");
    sb.append("    fieldId: ").append(toIndentedString(fieldId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sharedFieldName: ").append(toIndentedString(sharedFieldName)).append("\n");
    sb.append("    sharedFieldNames: ").append(toIndentedString(sharedFieldNames)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

