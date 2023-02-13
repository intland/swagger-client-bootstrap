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
 * Tracker field permissions
 */
@ApiModel(description = "Tracker field permissions")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-13T14:02:21.403654+01:00[Europe/Budapest]")
public class TrackerFieldPermissions {
  public static final String SERIALIZED_NAME_FIELD_PERMISSIONS = "fieldPermissions";
  @SerializedName(SERIALIZED_NAME_FIELD_PERMISSIONS)
  private List<TrackerFieldStatusPermissions> fieldPermissions = null;

  public static final String SERIALIZED_NAME_FIELD_REFERENCE = "fieldReference";
  @SerializedName(SERIALIZED_NAME_FIELD_REFERENCE)
  private FieldReference fieldReference;


  public TrackerFieldPermissions fieldPermissions(List<TrackerFieldStatusPermissions> fieldPermissions) {
    
    this.fieldPermissions = fieldPermissions;
    return this;
  }

  public TrackerFieldPermissions addFieldPermissionsItem(TrackerFieldStatusPermissions fieldPermissionsItem) {
    if (this.fieldPermissions == null) {
      this.fieldPermissions = new ArrayList<TrackerFieldStatusPermissions>();
    }
    this.fieldPermissions.add(fieldPermissionsItem);
    return this;
  }

   /**
   * Permissions for the given field
   * @return fieldPermissions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Permissions for the given field")

  public List<TrackerFieldStatusPermissions> getFieldPermissions() {
    return fieldPermissions;
  }


  public void setFieldPermissions(List<TrackerFieldStatusPermissions> fieldPermissions) {
    this.fieldPermissions = fieldPermissions;
  }


  public TrackerFieldPermissions fieldReference(FieldReference fieldReference) {
    
    this.fieldReference = fieldReference;
    return this;
  }

   /**
   * Get fieldReference
   * @return fieldReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FieldReference getFieldReference() {
    return fieldReference;
  }


  public void setFieldReference(FieldReference fieldReference) {
    this.fieldReference = fieldReference;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackerFieldPermissions trackerFieldPermissions = (TrackerFieldPermissions) o;
    return Objects.equals(this.fieldPermissions, trackerFieldPermissions.fieldPermissions) &&
        Objects.equals(this.fieldReference, trackerFieldPermissions.fieldReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldPermissions, fieldReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackerFieldPermissions {\n");
    sb.append("    fieldPermissions: ").append(toIndentedString(fieldPermissions)).append("\n");
    sb.append("    fieldReference: ").append(toIndentedString(fieldReference)).append("\n");
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

