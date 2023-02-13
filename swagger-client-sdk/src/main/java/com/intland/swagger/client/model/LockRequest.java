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
 * Requested lock configuration
 */
@ApiModel(description = "Requested lock configuration")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-13T14:02:21.403654+01:00[Europe/Budapest]")
public class LockRequest {
  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private String duration;

  public static final String SERIALIZED_NAME_HARD = "hard";
  @SerializedName(SERIALIZED_NAME_HARD)
  private Boolean hard;


  public LockRequest duration(String duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * If not a hard lock, the duration specified in time notation
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1:30h", value = "If not a hard lock, the duration specified in time notation")

  public String getDuration() {
    return duration;
  }


  public void setDuration(String duration) {
    this.duration = duration;
  }


  public LockRequest hard(Boolean hard) {
    
    this.hard = hard;
    return this;
  }

   /**
   * Whether the lock should be hard
   * @return hard
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the lock should be hard")

  public Boolean getHard() {
    return hard;
  }


  public void setHard(Boolean hard) {
    this.hard = hard;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LockRequest lockRequest = (LockRequest) o;
    return Objects.equals(this.duration, lockRequest.duration) &&
        Objects.equals(this.hard, lockRequest.hard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, hard);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LockRequest {\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    hard: ").append(toIndentedString(hard)).append("\n");
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

