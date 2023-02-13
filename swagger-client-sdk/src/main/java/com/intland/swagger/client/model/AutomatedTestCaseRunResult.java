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
 * Request model to create a test run from test case
 */
@ApiModel(description = "Request model to create a test run from test case")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-13T14:02:21.403654+01:00[Europe/Budapest]")
public class AutomatedTestCaseRunResult {
  public static final String SERIALIZED_NAME_CONCLUSION = "conclusion";
  @SerializedName(SERIALIZED_NAME_CONCLUSION)
  private String conclusion;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_GROUP_NAME = "groupName";
  @SerializedName(SERIALIZED_NAME_GROUP_NAME)
  private String groupName;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * Result of the test case
   */
  @JsonAdapter(ResultEnum.Adapter.class)
  public enum ResultEnum {
    PASSED("PASSED"),
    
    FAILED("FAILED"),
    
    BLOCKED("BLOCKED"),
    
    NOT_APPLICABLE("NOT_APPLICABLE");

    private String value;

    ResultEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ResultEnum fromValue(String value) {
      for (ResultEnum b : ResultEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ResultEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ResultEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ResultEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ResultEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private ResultEnum result;

  public static final String SERIALIZED_NAME_RUN_TIME = "runTime";
  @SerializedName(SERIALIZED_NAME_RUN_TIME)
  private Integer runTime;


  public AutomatedTestCaseRunResult conclusion(String conclusion) {
    
    this.conclusion = conclusion;
    return this;
  }

   /**
   * Optional Test Case Run conclusion
   * @return conclusion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional Test Case Run conclusion")

  public String getConclusion() {
    return conclusion;
  }


  public void setConclusion(String conclusion) {
    this.conclusion = conclusion;
  }


  public AutomatedTestCaseRunResult description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the Test Case
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description of the Test Case")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public AutomatedTestCaseRunResult groupName(String groupName) {
    
    this.groupName = groupName;
    return this;
  }

   /**
   * Group name of the Test Case
   * @return groupName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Group name of the Test Case")

  public String getGroupName() {
    return groupName;
  }


  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }


  public AutomatedTestCaseRunResult name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the Test Case
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the Test Case")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AutomatedTestCaseRunResult result(ResultEnum result) {
    
    this.result = result;
    return this;
  }

   /**
   * Result of the test case
   * @return result
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Result of the test case")

  public ResultEnum getResult() {
    return result;
  }


  public void setResult(ResultEnum result) {
    this.result = result;
  }


  public AutomatedTestCaseRunResult runTime(Integer runTime) {
    
    this.runTime = runTime;
    return this;
  }

   /**
   * Optional runtime in seconds
   * @return runTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional runtime in seconds")

  public Integer getRunTime() {
    return runTime;
  }


  public void setRunTime(Integer runTime) {
    this.runTime = runTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutomatedTestCaseRunResult automatedTestCaseRunResult = (AutomatedTestCaseRunResult) o;
    return Objects.equals(this.conclusion, automatedTestCaseRunResult.conclusion) &&
        Objects.equals(this.description, automatedTestCaseRunResult.description) &&
        Objects.equals(this.groupName, automatedTestCaseRunResult.groupName) &&
        Objects.equals(this.name, automatedTestCaseRunResult.name) &&
        Objects.equals(this.result, automatedTestCaseRunResult.result) &&
        Objects.equals(this.runTime, automatedTestCaseRunResult.runTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conclusion, description, groupName, name, result, runTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutomatedTestCaseRunResult {\n");
    sb.append("    conclusion: ").append(toIndentedString(conclusion)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    runTime: ").append(toIndentedString(runTime)).append("\n");
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

