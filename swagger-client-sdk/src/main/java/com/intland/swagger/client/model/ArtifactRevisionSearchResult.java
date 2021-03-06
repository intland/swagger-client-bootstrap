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
import com.intland.swagger.client.model.ArtifactRevision;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * One page of artifact revisions.
 */
@ApiModel(description = "One page of artifact revisions.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-29T09:51:27.838+02:00[Europe/Budapest]")
public class ArtifactRevisionSearchResult {
  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private Integer page;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "pageSize";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Integer total;

  public static final String SERIALIZED_NAME_REVISIONS = "revisions";
  @SerializedName(SERIALIZED_NAME_REVISIONS)
  private List<ArtifactRevision> revisions = null;


  public ArtifactRevisionSearchResult page(Integer page) {
    
    this.page = page;
    return this;
  }

   /**
   * Index of the page
   * @return page
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Index of the page")

  public Integer getPage() {
    return page;
  }


  public void setPage(Integer page) {
    this.page = page;
  }


  public ArtifactRevisionSearchResult pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Size of the found page
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Size of the found page")

  public Integer getPageSize() {
    return pageSize;
  }


  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  public ArtifactRevisionSearchResult total(Integer total) {
    
    this.total = total;
    return this;
  }

   /**
   * Number of matched tracker items by the search criteria
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of matched tracker items by the search criteria")

  public Integer getTotal() {
    return total;
  }


  public void setTotal(Integer total) {
    this.total = total;
  }


  public ArtifactRevisionSearchResult revisions(List<ArtifactRevision> revisions) {
    
    this.revisions = revisions;
    return this;
  }

  public ArtifactRevisionSearchResult addRevisionsItem(ArtifactRevision revisionsItem) {
    if (this.revisions == null) {
      this.revisions = new ArrayList<ArtifactRevision>();
    }
    this.revisions.add(revisionsItem);
    return this;
  }

   /**
   * Found artifact revision
   * @return revisions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Found artifact revision")

  public List<ArtifactRevision> getRevisions() {
    return revisions;
  }


  public void setRevisions(List<ArtifactRevision> revisions) {
    this.revisions = revisions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArtifactRevisionSearchResult artifactRevisionSearchResult = (ArtifactRevisionSearchResult) o;
    return Objects.equals(this.page, artifactRevisionSearchResult.page) &&
        Objects.equals(this.pageSize, artifactRevisionSearchResult.pageSize) &&
        Objects.equals(this.total, artifactRevisionSearchResult.total) &&
        Objects.equals(this.revisions, artifactRevisionSearchResult.revisions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, pageSize, total, revisions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArtifactRevisionSearchResult {\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    revisions: ").append(toIndentedString(revisions)).append("\n");
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

