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

import java.io.IOException;
import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Reference to a background job
 */
@ApiModel(description = "Reference to a background job")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-13T14:02:21.403654+01:00[Europe/Budapest]")
public class JobReference {
  public static final String SERIALIZED_NAME_JOB_ID = "jobId";
  @SerializedName(SERIALIZED_NAME_JOB_ID)
  private Integer jobId;

  /**
   * Type of a background job
   */
  @JsonAdapter(JobTypeEnum.Adapter.class)
  public enum JobTypeEnum {
    RUN_IN_EXCEL("RUN_IN_EXCEL"),
    
    MASS_TEST_SET_RUN_CREATION("MASS_TEST_SET_RUN_CREATION"),
    
    DEPENDENCY_FINDER("DEPENDENCY_FINDER"),
    
    ITEM_EXCEL_IMPORT("ITEM_EXCEL_IMPORT"),
    
    DEPLOYMENT_EXPORT("DEPLOYMENT_EXPORT"),
    
    WORKING_SET_UPDATE("WORKING_SET_UPDATE");

    private String value;

    JobTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static JobTypeEnum fromValue(String value) {
      for (JobTypeEnum b : JobTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<JobTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final JobTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public JobTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return JobTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_JOB_TYPE = "jobType";
  @SerializedName(SERIALIZED_NAME_JOB_TYPE)
  private JobTypeEnum jobType;


  public JobReference jobId(Integer jobId) {
    
    this.jobId = jobId;
    return this;
  }

   /**
   * Id of the job
   * @return jobId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Id of the job")

  public Integer getJobId() {
    return jobId;
  }


  public void setJobId(Integer jobId) {
    this.jobId = jobId;
  }


  public JobReference jobType(JobTypeEnum jobType) {
    
    this.jobType = jobType;
    return this;
  }

   /**
   * Type of a background job
   * @return jobType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Type of a background job")

  public JobTypeEnum getJobType() {
    return jobType;
  }


  public void setJobType(JobTypeEnum jobType) {
    this.jobType = jobType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobReference jobReference = (JobReference) o;
    return Objects.equals(this.jobId, jobReference.jobId) &&
        Objects.equals(this.jobType, jobReference.jobType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId, jobType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobReference {\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
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

