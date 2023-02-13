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

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Reference to an entity in dependency path
 */
@ApiModel(description = "Reference to an entity in dependency path")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-13T12:30:20.007+01:00[Europe/Budapest]")
public class DependencyEntityReference extends AbstractReference {
  public static final String SERIALIZED_NAME_TYPE_ID = "typeId";
  @SerializedName(SERIALIZED_NAME_TYPE_ID)
  private Integer typeId;


  public DependencyEntityReference typeId(Integer typeId) {
    
    this.typeId = typeId;
    return this;
  }

   /**
   * Type ID of entity
   * @return typeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type ID of entity")

  public Integer getTypeId() {
    return typeId;
  }


  public void setTypeId(Integer typeId) {
    this.typeId = typeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DependencyEntityReference dependencyEntityReference = (DependencyEntityReference) o;
    return Objects.equals(this.typeId, dependencyEntityReference.typeId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typeId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DependencyEntityReference {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
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
