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
 * TooManyRequestsException
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-13T14:02:21.403654+01:00[Europe/Budapest]")
public class TooManyRequestsException {
  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_RESOURCE_URI = "resourceUri";
  @SerializedName(SERIALIZED_NAME_RESOURCE_URI)
  private String resourceUri;

  public static final String SERIALIZED_NAME_RETRY_AFTER_SECOND = "retryAfterSecond";
  @SerializedName(SERIALIZED_NAME_RETRY_AFTER_SECOND)
  private Long retryAfterSecond;


  public TooManyRequestsException message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public TooManyRequestsException resourceUri(String resourceUri) {
    
    this.resourceUri = resourceUri;
    return this;
  }

   /**
   * Get resourceUri
   * @return resourceUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResourceUri() {
    return resourceUri;
  }


  public void setResourceUri(String resourceUri) {
    this.resourceUri = resourceUri;
  }


  public TooManyRequestsException retryAfterSecond(Long retryAfterSecond) {
    
    this.retryAfterSecond = retryAfterSecond;
    return this;
  }

   /**
   * Get retryAfterSecond
   * @return retryAfterSecond
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getRetryAfterSecond() {
    return retryAfterSecond;
  }


  public void setRetryAfterSecond(Long retryAfterSecond) {
    this.retryAfterSecond = retryAfterSecond;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TooManyRequestsException tooManyRequestsException = (TooManyRequestsException) o;
    return Objects.equals(this.message, tooManyRequestsException.message) &&
        Objects.equals(this.resourceUri, tooManyRequestsException.resourceUri) &&
        Objects.equals(this.retryAfterSecond, tooManyRequestsException.retryAfterSecond);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, resourceUri, retryAfterSecond);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TooManyRequestsException {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    resourceUri: ").append(toIndentedString(resourceUri)).append("\n");
    sb.append("    retryAfterSecond: ").append(toIndentedString(retryAfterSecond)).append("\n");
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

