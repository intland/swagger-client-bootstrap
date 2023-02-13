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
 * Language field
 */
@ApiModel(description = "Language field")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-13T13:51:27.016473+01:00[Europe/Budapest]")
public class LanguageField extends AbstractField {
  public static final String SERIALIZED_NAME_AVAILABLE_OPTIONS = "availableOptions";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_OPTIONS)
  private List<String> availableOptions = null;

  public LanguageField() {
    this.type = this.getClass().getSimpleName();
  }

  public LanguageField availableOptions(List<String> availableOptions) {
    
    this.availableOptions = availableOptions;
    return this;
  }

  public LanguageField addAvailableOptionsItem(String availableOptionsItem) {
    if (this.availableOptions == null) {
      this.availableOptions = new ArrayList<String>();
    }
    this.availableOptions.add(availableOptionsItem);
    return this;
  }

   /**
   * Get availableOptions
   * @return availableOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getAvailableOptions() {
    return availableOptions;
  }


  public void setAvailableOptions(List<String> availableOptions) {
    this.availableOptions = availableOptions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LanguageField languageField = (LanguageField) o;
    return Objects.equals(this.availableOptions, languageField.availableOptions) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableOptions, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LanguageField {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    availableOptions: ").append(toIndentedString(availableOptions)).append("\n");
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

