/*
 * codeBeamer swagger API
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
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intland.swagger.client.model.TrackerItemRevision;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * Traceability level filter
 */
@ApiModel(description = "Traceability level filter")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-29T09:51:27.838+02:00[Europe/Budapest]")
public class TraceabilityLevelFilter {
  public static final String SERIALIZED_NAME_PREVIOUS_LEVEL_ITEMS = "previousLevelItems";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_LEVEL_ITEMS)
  private List<TrackerItemRevision> previousLevelItems = null;

  public static final String SERIALIZED_NAME_OUTGOING_REFERENCE = "outgoingReference";
  @SerializedName(SERIALIZED_NAME_OUTGOING_REFERENCE)
  private Boolean outgoingReference = true;

  public static final String SERIALIZED_NAME_INCOMING_REFERENCE = "incomingReference";
  @SerializedName(SERIALIZED_NAME_INCOMING_REFERENCE)
  private Boolean incomingReference = true;

  public static final String SERIALIZED_NAME_OUTGOING_ASSOCIATION = "outgoingAssociation";
  @SerializedName(SERIALIZED_NAME_OUTGOING_ASSOCIATION)
  private Boolean outgoingAssociation = true;

  public static final String SERIALIZED_NAME_INCOMING_ASSOCIATION = "incomingAssociation";
  @SerializedName(SERIALIZED_NAME_INCOMING_ASSOCIATION)
  private Boolean incomingAssociation = true;

  public static final String SERIALIZED_NAME_FOLDERS_AND_INFORMATION = "foldersAndInformation";
  @SerializedName(SERIALIZED_NAME_FOLDERS_AND_INFORMATION)
  private Boolean foldersAndInformation = false;

  public static final String SERIALIZED_NAME_CB_Q_L = "cbQL";
  @SerializedName(SERIALIZED_NAME_CB_Q_L)
  private String cbQL;

  public static final String SERIALIZED_NAME_HISTORY_DATE = "historyDate";
  @SerializedName(SERIALIZED_NAME_HISTORY_DATE)
  private DateTime historyDate;

  public static final String SERIALIZED_NAME_HISTORY_BASELINE_ID = "historyBaselineId";
  @SerializedName(SERIALIZED_NAME_HISTORY_BASELINE_ID)
  private Integer historyBaselineId;


  public TraceabilityLevelFilter previousLevelItems(List<TrackerItemRevision> previousLevelItems) {
    
    this.previousLevelItems = previousLevelItems;
    return this;
  }

  public TraceabilityLevelFilter addPreviousLevelItemsItem(TrackerItemRevision previousLevelItemsItem) {
    if (this.previousLevelItems == null) {
      this.previousLevelItems = new ArrayList<TrackerItemRevision>();
    }
    this.previousLevelItems.add(previousLevelItemsItem);
    return this;
  }

   /**
   * Previous Level Items
   * @return previousLevelItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Previous Level Items")

  public List<TrackerItemRevision> getPreviousLevelItems() {
    return previousLevelItems;
  }


  public void setPreviousLevelItems(List<TrackerItemRevision> previousLevelItems) {
    this.previousLevelItems = previousLevelItems;
  }


  public TraceabilityLevelFilter outgoingReference(Boolean outgoingReference) {
    
    this.outgoingReference = outgoingReference;
    return this;
  }

   /**
   * Show outgoing references
   * @return outgoingReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Show outgoing references")

  public Boolean getOutgoingReference() {
    return outgoingReference;
  }


  public void setOutgoingReference(Boolean outgoingReference) {
    this.outgoingReference = outgoingReference;
  }


  public TraceabilityLevelFilter incomingReference(Boolean incomingReference) {
    
    this.incomingReference = incomingReference;
    return this;
  }

   /**
   * Show incoming references
   * @return incomingReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Show incoming references")

  public Boolean getIncomingReference() {
    return incomingReference;
  }


  public void setIncomingReference(Boolean incomingReference) {
    this.incomingReference = incomingReference;
  }


  public TraceabilityLevelFilter outgoingAssociation(Boolean outgoingAssociation) {
    
    this.outgoingAssociation = outgoingAssociation;
    return this;
  }

   /**
   * Show outgoing association
   * @return outgoingAssociation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Show outgoing association")

  public Boolean getOutgoingAssociation() {
    return outgoingAssociation;
  }


  public void setOutgoingAssociation(Boolean outgoingAssociation) {
    this.outgoingAssociation = outgoingAssociation;
  }


  public TraceabilityLevelFilter incomingAssociation(Boolean incomingAssociation) {
    
    this.incomingAssociation = incomingAssociation;
    return this;
  }

   /**
   * Show incoming association
   * @return incomingAssociation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Show incoming association")

  public Boolean getIncomingAssociation() {
    return incomingAssociation;
  }


  public void setIncomingAssociation(Boolean incomingAssociation) {
    this.incomingAssociation = incomingAssociation;
  }


  public TraceabilityLevelFilter foldersAndInformation(Boolean foldersAndInformation) {
    
    this.foldersAndInformation = foldersAndInformation;
    return this;
  }

   /**
   * Show folders and information
   * @return foldersAndInformation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Show folders and information")

  public Boolean getFoldersAndInformation() {
    return foldersAndInformation;
  }


  public void setFoldersAndInformation(Boolean foldersAndInformation) {
    this.foldersAndInformation = foldersAndInformation;
  }


  public TraceabilityLevelFilter cbQL(String cbQL) {
    
    this.cbQL = cbQL;
    return this;
  }

   /**
   * cbQL
   * @return cbQL
  **/
  @ApiModelProperty(required = true, value = "cbQL")

  public String getCbQL() {
    return cbQL;
  }


  public void setCbQL(String cbQL) {
    this.cbQL = cbQL;
  }


  public TraceabilityLevelFilter historyDate(DateTime historyDate) {
    
    this.historyDate = historyDate;
    return this;
  }

   /**
   * History Date - Snapshot view of the given date
   * @return historyDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "History Date - Snapshot view of the given date")

  public DateTime getHistoryDate() {
    return historyDate;
  }


  public void setHistoryDate(DateTime historyDate) {
    this.historyDate = historyDate;
  }


  public TraceabilityLevelFilter historyBaselineId(Integer historyBaselineId) {
    
    this.historyBaselineId = historyBaselineId;
    return this;
  }

   /**
   * History Baseline Id - Snapshot view of the given baseline
   * @return historyBaselineId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "History Baseline Id - Snapshot view of the given baseline")

  public Integer getHistoryBaselineId() {
    return historyBaselineId;
  }


  public void setHistoryBaselineId(Integer historyBaselineId) {
    this.historyBaselineId = historyBaselineId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TraceabilityLevelFilter traceabilityLevelFilter = (TraceabilityLevelFilter) o;
    return Objects.equals(this.previousLevelItems, traceabilityLevelFilter.previousLevelItems) &&
        Objects.equals(this.outgoingReference, traceabilityLevelFilter.outgoingReference) &&
        Objects.equals(this.incomingReference, traceabilityLevelFilter.incomingReference) &&
        Objects.equals(this.outgoingAssociation, traceabilityLevelFilter.outgoingAssociation) &&
        Objects.equals(this.incomingAssociation, traceabilityLevelFilter.incomingAssociation) &&
        Objects.equals(this.foldersAndInformation, traceabilityLevelFilter.foldersAndInformation) &&
        Objects.equals(this.cbQL, traceabilityLevelFilter.cbQL) &&
        Objects.equals(this.historyDate, traceabilityLevelFilter.historyDate) &&
        Objects.equals(this.historyBaselineId, traceabilityLevelFilter.historyBaselineId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(previousLevelItems, outgoingReference, incomingReference, outgoingAssociation, incomingAssociation, foldersAndInformation, cbQL, historyDate, historyBaselineId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TraceabilityLevelFilter {\n");
    sb.append("    previousLevelItems: ").append(toIndentedString(previousLevelItems)).append("\n");
    sb.append("    outgoingReference: ").append(toIndentedString(outgoingReference)).append("\n");
    sb.append("    incomingReference: ").append(toIndentedString(incomingReference)).append("\n");
    sb.append("    outgoingAssociation: ").append(toIndentedString(outgoingAssociation)).append("\n");
    sb.append("    incomingAssociation: ").append(toIndentedString(incomingAssociation)).append("\n");
    sb.append("    foldersAndInformation: ").append(toIndentedString(foldersAndInformation)).append("\n");
    sb.append("    cbQL: ").append(toIndentedString(cbQL)).append("\n");
    sb.append("    historyDate: ").append(toIndentedString(historyDate)).append("\n");
    sb.append("    historyBaselineId: ").append(toIndentedString(historyBaselineId)).append("\n");
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

