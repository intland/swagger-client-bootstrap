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
 * Reference to an item
 */
@ApiModel(description = "Reference to an item")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-13T14:02:21.403654+01:00[Europe/Budapest]")
public class AbstractTrackerItemReference {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_ITEM_REVISION = "itemRevision";
  @SerializedName(SERIALIZED_NAME_ITEM_REVISION)
  private TrackerItemRevision itemRevision;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  protected String type;

  public AbstractTrackerItemReference() {
    this.type = this.getClass().getSimpleName();
  }

  public AbstractTrackerItemReference id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Id of the reference/association
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12142", value = "Id of the reference/association")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public AbstractTrackerItemReference itemRevision(TrackerItemRevision itemRevision) {
    
    this.itemRevision = itemRevision;
    return this;
  }

   /**
   * Get itemRevision
   * @return itemRevision
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TrackerItemRevision getItemRevision() {
    return itemRevision;
  }


  public void setItemRevision(TrackerItemRevision itemRevision) {
    this.itemRevision = itemRevision;
  }


  public AbstractTrackerItemReference type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type of the relation
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DownstreamTrackerItemReference", value = "Type of the relation")

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
    AbstractTrackerItemReference abstractTrackerItemReference = (AbstractTrackerItemReference) o;
    return Objects.equals(this.id, abstractTrackerItemReference.id) &&
        Objects.equals(this.itemRevision, abstractTrackerItemReference.itemRevision) &&
        Objects.equals(this.type, abstractTrackerItemReference.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, itemRevision, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbstractTrackerItemReference {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    itemRevision: ").append(toIndentedString(itemRevision)).append("\n");
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

