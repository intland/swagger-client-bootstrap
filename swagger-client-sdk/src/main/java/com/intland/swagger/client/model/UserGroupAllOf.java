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
 * UserGroupAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-11-10T15:21:24.239+01:00[Europe/Budapest]")
public class UserGroupAllOf {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public UserGroupAllOf id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Id of the entity
   * @return id
  **/
  @ApiModelProperty(value = "Id of the entity")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public UserGroupAllOf uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * Reference to an object
   * @return uri
  **/
  @ApiModelProperty(value = "Reference to an object")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public UserGroupAllOf name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the entity
   * @return name
  **/
  @ApiModelProperty(value = "Name of the entity")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UserGroupAllOf type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of a referenced object
   * @return type
  **/
  @ApiModelProperty(value = "Type of a referenced object")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public UserGroupAllOf description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of a user group
   * @return description
  **/
  @ApiModelProperty(value = "Description of a user group")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserGroupAllOf userGroupAllOf = (UserGroupAllOf) o;
    return Objects.equals(this.id, userGroupAllOf.id) &&
        Objects.equals(this.uri, userGroupAllOf.uri) &&
        Objects.equals(this.name, userGroupAllOf.name) &&
        Objects.equals(this.type, userGroupAllOf.type) &&
        Objects.equals(this.description, userGroupAllOf.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, uri, name, type, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserGroupAllOf {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

