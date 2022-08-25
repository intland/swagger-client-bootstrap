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

import io.swagger.annotations.ApiModelProperty;

/**
 * OptionChoiceFieldAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-25T12:12:17.856+02:00[Europe/Budapest]")
public class OptionChoiceFieldAllOf {
  public static final String SERIALIZED_NAME_MULTIPLE_VALUES = "multipleValues";
  @SerializedName(SERIALIZED_NAME_MULTIPLE_VALUES)
  private Boolean multipleValues;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private List<ChoiceOptionReference> options = null;

  public static final String SERIALIZED_NAME_REFERENCE_TYPE = "referenceType";
  @SerializedName(SERIALIZED_NAME_REFERENCE_TYPE)
  private String referenceType;


  public OptionChoiceFieldAllOf multipleValues(Boolean multipleValues) {
    
    this.multipleValues = multipleValues;
    return this;
  }

   /**
   * Multiple values state of a field
   * @return multipleValues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Multiple values state of a field")

  public Boolean getMultipleValues() {
    return multipleValues;
  }


  public void setMultipleValues(Boolean multipleValues) {
    this.multipleValues = multipleValues;
  }


  public OptionChoiceFieldAllOf options(List<ChoiceOptionReference> options) {
    
    this.options = options;
    return this;
  }

  public OptionChoiceFieldAllOf addOptionsItem(ChoiceOptionReference optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<ChoiceOptionReference>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * Available options of a choice field
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Available options of a choice field")

  public List<ChoiceOptionReference> getOptions() {
    return options;
  }


  public void setOptions(List<ChoiceOptionReference> options) {
    this.options = options;
  }


  public OptionChoiceFieldAllOf referenceType(String referenceType) {
    
    this.referenceType = referenceType;
    return this;
  }

   /**
   * Type of the contained references
   * @return referenceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of the contained references")

  public String getReferenceType() {
    return referenceType;
  }


  public void setReferenceType(String referenceType) {
    this.referenceType = referenceType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptionChoiceFieldAllOf optionChoiceFieldAllOf = (OptionChoiceFieldAllOf) o;
    return Objects.equals(this.multipleValues, optionChoiceFieldAllOf.multipleValues) &&
        Objects.equals(this.options, optionChoiceFieldAllOf.options) &&
        Objects.equals(this.referenceType, optionChoiceFieldAllOf.referenceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(multipleValues, options, referenceType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionChoiceFieldAllOf {\n");
    sb.append("    multipleValues: ").append(toIndentedString(multipleValues)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    referenceType: ").append(toIndentedString(referenceType)).append("\n");
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

