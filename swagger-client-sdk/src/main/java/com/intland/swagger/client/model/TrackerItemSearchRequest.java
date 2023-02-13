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

import io.swagger.annotations.ApiModelProperty;

/**
 * TrackerItemSearchRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-13T13:51:27.016473+01:00[Europe/Budapest]")
public class TrackerItemSearchRequest {
  public static final String SERIALIZED_NAME_BASELINE_ID = "baselineId";
  @SerializedName(SERIALIZED_NAME_BASELINE_ID)
  private Integer baselineId;

  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private Integer page = 1;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "pageSize";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize = 25;

  public static final String SERIALIZED_NAME_QUERY_STRING = "queryString";
  @SerializedName(SERIALIZED_NAME_QUERY_STRING)
  private String queryString;


  public TrackerItemSearchRequest baselineId(Integer baselineId) {
    
    this.baselineId = baselineId;
    return this;
  }

   /**
   * Baseline on which the query is applied.
   * @return baselineId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234", value = "Baseline on which the query is applied.")

  public Integer getBaselineId() {
    return baselineId;
  }


  public void setBaselineId(Integer baselineId) {
    this.baselineId = baselineId;
  }


  public TrackerItemSearchRequest page(Integer page) {
    
    this.page = page;
    return this;
  }

   /**
   * Index of the page
   * @return page
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Index of the page")

  public Integer getPage() {
    return page;
  }


  public void setPage(Integer page) {
    this.page = page;
  }


  public TrackerItemSearchRequest pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Size of the found page
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "25", value = "Size of the found page")

  public Integer getPageSize() {
    return pageSize;
  }


  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  public TrackerItemSearchRequest queryString(String queryString) {
    
    this.queryString = queryString;
    return this;
  }

   /**
   * CbQL query for the requested items
   * @return queryString
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "priority='Normal'", required = true, value = "CbQL query for the requested items")

  public String getQueryString() {
    return queryString;
  }


  public void setQueryString(String queryString) {
    this.queryString = queryString;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackerItemSearchRequest trackerItemSearchRequest = (TrackerItemSearchRequest) o;
    return Objects.equals(this.baselineId, trackerItemSearchRequest.baselineId) &&
        Objects.equals(this.page, trackerItemSearchRequest.page) &&
        Objects.equals(this.pageSize, trackerItemSearchRequest.pageSize) &&
        Objects.equals(this.queryString, trackerItemSearchRequest.queryString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baselineId, page, pageSize, queryString);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackerItemSearchRequest {\n");
    sb.append("    baselineId: ").append(toIndentedString(baselineId)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    queryString: ").append(toIndentedString(queryString)).append("\n");
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

