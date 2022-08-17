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
import com.intland.swagger.client.model.TrackerItem;
import com.intland.swagger.client.model.TrackerItemReviewExport;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A Tracker Item with all of its corresponding Tracker Item Reviews
 */
@ApiModel(description = "A Tracker Item with all of its corresponding Tracker Item Reviews")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-29T09:51:27.838+02:00[Europe/Budapest]")
public class TrackerItemWithTrackerItemReviewsExport {
  public static final String SERIALIZED_NAME_TRACKER_ITEM = "trackerItem";
  @SerializedName(SERIALIZED_NAME_TRACKER_ITEM)
  private TrackerItem trackerItem;

  public static final String SERIALIZED_NAME_TRACKER_ITEM_REVIEWS = "trackerItemReviews";
  @SerializedName(SERIALIZED_NAME_TRACKER_ITEM_REVIEWS)
  private List<TrackerItemReviewExport> trackerItemReviews = null;


  public TrackerItemWithTrackerItemReviewsExport trackerItem(TrackerItem trackerItem) {
    
    this.trackerItem = trackerItem;
    return this;
  }

   /**
   * Get trackerItem
   * @return trackerItem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TrackerItem getTrackerItem() {
    return trackerItem;
  }


  public void setTrackerItem(TrackerItem trackerItem) {
    this.trackerItem = trackerItem;
  }


  public TrackerItemWithTrackerItemReviewsExport trackerItemReviews(List<TrackerItemReviewExport> trackerItemReviews) {
    
    this.trackerItemReviews = trackerItemReviews;
    return this;
  }

  public TrackerItemWithTrackerItemReviewsExport addTrackerItemReviewsItem(TrackerItemReviewExport trackerItemReviewsItem) {
    if (this.trackerItemReviews == null) {
      this.trackerItemReviews = new ArrayList<TrackerItemReviewExport>();
    }
    this.trackerItemReviews.add(trackerItemReviewsItem);
    return this;
  }

   /**
   * List of Tracker Item Reviews
   * @return trackerItemReviews
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of Tracker Item Reviews")

  public List<TrackerItemReviewExport> getTrackerItemReviews() {
    return trackerItemReviews;
  }


  public void setTrackerItemReviews(List<TrackerItemReviewExport> trackerItemReviews) {
    this.trackerItemReviews = trackerItemReviews;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackerItemWithTrackerItemReviewsExport trackerItemWithTrackerItemReviewsExport = (TrackerItemWithTrackerItemReviewsExport) o;
    return Objects.equals(this.trackerItem, trackerItemWithTrackerItemReviewsExport.trackerItem) &&
        Objects.equals(this.trackerItemReviews, trackerItemWithTrackerItemReviewsExport.trackerItemReviews);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trackerItem, trackerItemReviews);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackerItemWithTrackerItemReviewsExport {\n");
    sb.append("    trackerItem: ").append(toIndentedString(trackerItem)).append("\n");
    sb.append("    trackerItemReviews: ").append(toIndentedString(trackerItemReviews)).append("\n");
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
