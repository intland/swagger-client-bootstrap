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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Information about a background job
 */
@ApiModel(description = "Information about a background job")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-13T14:02:21.403654+01:00[Europe/Budapest]")
public class BackgroundJob {
  /**
   * Status of a background job
   */
  @JsonAdapter(BackgroundJobStatusEnum.Adapter.class)
  public enum BackgroundJobStatusEnum {
    DRAFT("DRAFT"),
    
    NEW("NEW"),
    
    IN_PROGRESS("IN_PROGRESS"),
    
    FINISHED("FINISHED");

    private String value;

    BackgroundJobStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BackgroundJobStatusEnum fromValue(String value) {
      for (BackgroundJobStatusEnum b : BackgroundJobStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<BackgroundJobStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BackgroundJobStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BackgroundJobStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return BackgroundJobStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_BACKGROUND_JOB_STATUS = "backgroundJobStatus";
  @SerializedName(SERIALIZED_NAME_BACKGROUND_JOB_STATUS)
  private BackgroundJobStatusEnum backgroundJobStatus;

  /**
   * Type of a background job
   */
  @JsonAdapter(BackgroundJobTypeEnum.Adapter.class)
  public enum BackgroundJobTypeEnum {
    RUN_IN_EXCEL("RUN_IN_EXCEL"),
    
    MASS_TEST_SET_RUN_CREATION("MASS_TEST_SET_RUN_CREATION"),
    
    DEPENDENCY_FINDER("DEPENDENCY_FINDER"),
    
    ITEM_EXCEL_IMPORT("ITEM_EXCEL_IMPORT"),
    
    DEPLOYMENT_EXPORT("DEPLOYMENT_EXPORT"),
    
    WORKING_SET_UPDATE("WORKING_SET_UPDATE");

    private String value;

    BackgroundJobTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BackgroundJobTypeEnum fromValue(String value) {
      for (BackgroundJobTypeEnum b : BackgroundJobTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<BackgroundJobTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BackgroundJobTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BackgroundJobTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return BackgroundJobTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_BACKGROUND_JOB_TYPE = "backgroundJobType";
  @SerializedName(SERIALIZED_NAME_BACKGROUND_JOB_TYPE)
  private BackgroundJobTypeEnum backgroundJobType;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private Date createdAt;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_FINISHED_AT = "finishedAt";
  @SerializedName(SERIALIZED_NAME_FINISHED_AT)
  private Date finishedAt;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_STATUS_INFO = "statusInfo";
  @SerializedName(SERIALIZED_NAME_STATUS_INFO)
  private AbstractBackgroundJobStatusInfo statusInfo;

  public static final String SERIALIZED_NAME_STEPS = "steps";
  @SerializedName(SERIALIZED_NAME_STEPS)
  private List<BackgroundJobStep> steps = null;

  public static final String SERIALIZED_NAME_SUBMITTED_BY = "submittedBy";
  @SerializedName(SERIALIZED_NAME_SUBMITTED_BY)
  private UserReference submittedBy;


  public BackgroundJob backgroundJobStatus(BackgroundJobStatusEnum backgroundJobStatus) {
    
    this.backgroundJobStatus = backgroundJobStatus;
    return this;
  }

   /**
   * Status of a background job
   * @return backgroundJobStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Status of a background job")

  public BackgroundJobStatusEnum getBackgroundJobStatus() {
    return backgroundJobStatus;
  }


  public void setBackgroundJobStatus(BackgroundJobStatusEnum backgroundJobStatus) {
    this.backgroundJobStatus = backgroundJobStatus;
  }


  public BackgroundJob backgroundJobType(BackgroundJobTypeEnum backgroundJobType) {
    
    this.backgroundJobType = backgroundJobType;
    return this;
  }

   /**
   * Type of a background job
   * @return backgroundJobType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of a background job")

  public BackgroundJobTypeEnum getBackgroundJobType() {
    return backgroundJobType;
  }


  public void setBackgroundJobType(BackgroundJobTypeEnum backgroundJobType) {
    this.backgroundJobType = backgroundJobType;
  }


  public BackgroundJob createdAt(Date createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Creation time of job
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Creation time of job")

  public Date getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }


  public BackgroundJob description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of job
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description of job")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public BackgroundJob finishedAt(Date finishedAt) {
    
    this.finishedAt = finishedAt;
    return this;
  }

   /**
   * Completion time of job
   * @return finishedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Completion time of job")

  public Date getFinishedAt() {
    return finishedAt;
  }


  public void setFinishedAt(Date finishedAt) {
    this.finishedAt = finishedAt;
  }


  public BackgroundJob id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID of job
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of job")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public BackgroundJob statusInfo(AbstractBackgroundJobStatusInfo statusInfo) {
    
    this.statusInfo = statusInfo;
    return this;
  }

   /**
   * Get statusInfo
   * @return statusInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AbstractBackgroundJobStatusInfo getStatusInfo() {
    return statusInfo;
  }


  public void setStatusInfo(AbstractBackgroundJobStatusInfo statusInfo) {
    this.statusInfo = statusInfo;
  }


  public BackgroundJob steps(List<BackgroundJobStep> steps) {
    
    this.steps = steps;
    return this;
  }

  public BackgroundJob addStepsItem(BackgroundJobStep stepsItem) {
    if (this.steps == null) {
      this.steps = new ArrayList<BackgroundJobStep>();
    }
    this.steps.add(stepsItem);
    return this;
  }

   /**
   * Sub-steps of a job
   * @return steps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sub-steps of a job")

  public List<BackgroundJobStep> getSteps() {
    return steps;
  }


  public void setSteps(List<BackgroundJobStep> steps) {
    this.steps = steps;
  }


  public BackgroundJob submittedBy(UserReference submittedBy) {
    
    this.submittedBy = submittedBy;
    return this;
  }

   /**
   * Get submittedBy
   * @return submittedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserReference getSubmittedBy() {
    return submittedBy;
  }


  public void setSubmittedBy(UserReference submittedBy) {
    this.submittedBy = submittedBy;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BackgroundJob backgroundJob = (BackgroundJob) o;
    return Objects.equals(this.backgroundJobStatus, backgroundJob.backgroundJobStatus) &&
        Objects.equals(this.backgroundJobType, backgroundJob.backgroundJobType) &&
        Objects.equals(this.createdAt, backgroundJob.createdAt) &&
        Objects.equals(this.description, backgroundJob.description) &&
        Objects.equals(this.finishedAt, backgroundJob.finishedAt) &&
        Objects.equals(this.id, backgroundJob.id) &&
        Objects.equals(this.statusInfo, backgroundJob.statusInfo) &&
        Objects.equals(this.steps, backgroundJob.steps) &&
        Objects.equals(this.submittedBy, backgroundJob.submittedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backgroundJobStatus, backgroundJobType, createdAt, description, finishedAt, id, statusInfo, steps, submittedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BackgroundJob {\n");
    sb.append("    backgroundJobStatus: ").append(toIndentedString(backgroundJobStatus)).append("\n");
    sb.append("    backgroundJobType: ").append(toIndentedString(backgroundJobType)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    statusInfo: ").append(toIndentedString(statusInfo)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    submittedBy: ").append(toIndentedString(submittedBy)).append("\n");
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

