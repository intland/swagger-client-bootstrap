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
import java.util.Date;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Revision history entry.
 */
@ApiModel(description = "Revision history entry.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-13T14:02:21.403654+01:00[Europe/Budapest]")
public class TrackerItemHistoryRevision {
  public static final String SERIALIZED_NAME_CHANGES = "changes";
  @SerializedName(SERIALIZED_NAME_CHANGES)
  private List<TrackerItemChange> changes = null;

  public static final String SERIALIZED_NAME_ITEM_REVISION = "itemRevision";
  @SerializedName(SERIALIZED_NAME_ITEM_REVISION)
  private TrackerItemRevision itemRevision;

  public static final String SERIALIZED_NAME_MODIFIED_AT = "modifiedAt";
  @SerializedName(SERIALIZED_NAME_MODIFIED_AT)
  private Date modifiedAt;

  public static final String SERIALIZED_NAME_MODIFIED_BY = "modifiedBy";
  @SerializedName(SERIALIZED_NAME_MODIFIED_BY)
  private UserReference modifiedBy;


  public TrackerItemHistoryRevision changes(List<TrackerItemChange> changes) {
    
    this.changes = changes;
    return this;
  }

  public TrackerItemHistoryRevision addChangesItem(TrackerItemChange changesItem) {
    if (this.changes == null) {
      this.changes = new ArrayList<TrackerItemChange>();
    }
    this.changes.add(changesItem);
    return this;
  }

   /**
   * Changes happened between the previous and current revision.
   * @return changes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Changes happened between the previous and current revision.")

  public List<TrackerItemChange> getChanges() {
    return changes;
  }


  public void setChanges(List<TrackerItemChange> changes) {
    this.changes = changes;
  }


  public TrackerItemHistoryRevision itemRevision(TrackerItemRevision itemRevision) {
    
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


  public TrackerItemHistoryRevision modifiedAt(Date modifiedAt) {
    
    this.modifiedAt = modifiedAt;
    return this;
  }

   /**
   * The date when the entity was modified
   * @return modifiedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date when the entity was modified")

  public Date getModifiedAt() {
    return modifiedAt;
  }


  public void setModifiedAt(Date modifiedAt) {
    this.modifiedAt = modifiedAt;
  }


  public TrackerItemHistoryRevision modifiedBy(UserReference modifiedBy) {
    
    this.modifiedBy = modifiedBy;
    return this;
  }

   /**
   * Get modifiedBy
   * @return modifiedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserReference getModifiedBy() {
    return modifiedBy;
  }


  public void setModifiedBy(UserReference modifiedBy) {
    this.modifiedBy = modifiedBy;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackerItemHistoryRevision trackerItemHistoryRevision = (TrackerItemHistoryRevision) o;
    return Objects.equals(this.changes, trackerItemHistoryRevision.changes) &&
        Objects.equals(this.itemRevision, trackerItemHistoryRevision.itemRevision) &&
        Objects.equals(this.modifiedAt, trackerItemHistoryRevision.modifiedAt) &&
        Objects.equals(this.modifiedBy, trackerItemHistoryRevision.modifiedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changes, itemRevision, modifiedAt, modifiedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackerItemHistoryRevision {\n");
    sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
    sb.append("    itemRevision: ").append(toIndentedString(itemRevision)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
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

