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
 * One page of attachments.
 */
@ApiModel(description = "One page of attachments.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-13T14:02:21.403654+01:00[Europe/Budapest]")
public class AttachmentSearchResult {
  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  private List<Attachment> attachments = null;

  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private Integer page;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "pageSize";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Integer total;


  public AttachmentSearchResult attachments(List<Attachment> attachments) {
    
    this.attachments = attachments;
    return this;
  }

  public AttachmentSearchResult addAttachmentsItem(Attachment attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<Attachment>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * Found attachments
   * @return attachments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Found attachments")

  public List<Attachment> getAttachments() {
    return attachments;
  }


  public void setAttachments(List<Attachment> attachments) {
    this.attachments = attachments;
  }


  public AttachmentSearchResult page(Integer page) {
    
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


  public AttachmentSearchResult pageSize(Integer pageSize) {
    
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


  public AttachmentSearchResult total(Integer total) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentSearchResult attachmentSearchResult = (AttachmentSearchResult) o;
    return Objects.equals(this.attachments, attachmentSearchResult.attachments) &&
        Objects.equals(this.page, attachmentSearchResult.page) &&
        Objects.equals(this.pageSize, attachmentSearchResult.pageSize) &&
        Objects.equals(this.total, attachmentSearchResult.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachments, page, pageSize, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentSearchResult {\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

