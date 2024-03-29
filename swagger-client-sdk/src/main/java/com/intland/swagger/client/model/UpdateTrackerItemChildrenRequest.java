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
 * Tracker item child update request
 */
@ApiModel(description = "Tracker item child update request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-13T14:02:21.403654+01:00[Europe/Budapest]")
public class UpdateTrackerItemChildrenRequest {
  public static final String SERIALIZED_NAME_CHILDREN = "children";
  @SerializedName(SERIALIZED_NAME_CHILDREN)
  private List<TrackerItemReference> children = null;


  public UpdateTrackerItemChildrenRequest children(List<TrackerItemReference> children) {
    
    this.children = children;
    return this;
  }

  public UpdateTrackerItemChildrenRequest addChildrenItem(TrackerItemReference childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<TrackerItemReference>();
    }
    this.children.add(childrenItem);
    return this;
  }

   /**
   * Child items to update
   * @return children
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Child items to update")

  public List<TrackerItemReference> getChildren() {
    return children;
  }


  public void setChildren(List<TrackerItemReference> children) {
    this.children = children;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateTrackerItemChildrenRequest updateTrackerItemChildrenRequest = (UpdateTrackerItemChildrenRequest) o;
    return Objects.equals(this.children, updateTrackerItemChildrenRequest.children);
  }

  @Override
  public int hashCode() {
    return Objects.hash(children);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateTrackerItemChildrenRequest {\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
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

