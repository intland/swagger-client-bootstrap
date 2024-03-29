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
 * Specifies which Test Cases are checked for duplicate Steps
 */
@ApiModel(description = "Specifies which Test Cases are checked for duplicate Steps")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-13T14:02:21.403654+01:00[Europe/Budapest]")
public class AutoApplyTestStepReuses {
  public static final String SERIALIZED_NAME_SCAN_TEST_CASE_LIBRARIES = "scanTestCaseLibraries";
  @SerializedName(SERIALIZED_NAME_SCAN_TEST_CASE_LIBRARIES)
  private Boolean scanTestCaseLibraries;

  public static final String SERIALIZED_NAME_TEST_CASES = "testCases";
  @SerializedName(SERIALIZED_NAME_TEST_CASES)
  private List<TrackerItemReference> testCases = null;


  public AutoApplyTestStepReuses scanTestCaseLibraries(Boolean scanTestCaseLibraries) {
    
    this.scanTestCaseLibraries = scanTestCaseLibraries;
    return this;
  }

   /**
   * If it scans/finds the duplicate Steps in Test Case libraries of the user? Note: that only Reusable Steps will be reused from these libraries!
   * @return scanTestCaseLibraries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If it scans/finds the duplicate Steps in Test Case libraries of the user? Note: that only Reusable Steps will be reused from these libraries!")

  public Boolean getScanTestCaseLibraries() {
    return scanTestCaseLibraries;
  }


  public void setScanTestCaseLibraries(Boolean scanTestCaseLibraries) {
    this.scanTestCaseLibraries = scanTestCaseLibraries;
  }


  public AutoApplyTestStepReuses testCases(List<TrackerItemReference> testCases) {
    
    this.testCases = testCases;
    return this;
  }

  public AutoApplyTestStepReuses addTestCasesItem(TrackerItemReference testCasesItem) {
    if (this.testCases == null) {
      this.testCases = new ArrayList<TrackerItemReference>();
    }
    this.testCases.add(testCasesItem);
    return this;
  }

   /**
   * The Test Cases to find the duplicated steps inside: if these Test Cases has duplicated Steps these will be converted to Step-Reuses.
   * @return testCases
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Test Cases to find the duplicated steps inside: if these Test Cases has duplicated Steps these will be converted to Step-Reuses.")

  public List<TrackerItemReference> getTestCases() {
    return testCases;
  }


  public void setTestCases(List<TrackerItemReference> testCases) {
    this.testCases = testCases;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoApplyTestStepReuses autoApplyTestStepReuses = (AutoApplyTestStepReuses) o;
    return Objects.equals(this.scanTestCaseLibraries, autoApplyTestStepReuses.scanTestCaseLibraries) &&
        Objects.equals(this.testCases, autoApplyTestStepReuses.testCases);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scanTestCaseLibraries, testCases);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoApplyTestStepReuses {\n");
    sb.append("    scanTestCaseLibraries: ").append(toIndentedString(scanTestCaseLibraries)).append("\n");
    sb.append("    testCases: ").append(toIndentedString(testCases)).append("\n");
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

