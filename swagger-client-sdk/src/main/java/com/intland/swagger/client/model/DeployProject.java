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
 * DeployProject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-13T14:02:21.403654+01:00[Europe/Budapest]")
public class DeployProject {
  public static final String SERIALIZED_NAME_CONFIGURATION_FILE_ID = "configurationFileId";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION_FILE_ID)
  private Integer configurationFileId;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_PROJECT = "project";
  @SerializedName(SERIALIZED_NAME_PROJECT)
  private ProjectReference project;

  public static final String SERIALIZED_NAME_PROJECT_FILE_ID = "projectFileId";
  @SerializedName(SERIALIZED_NAME_PROJECT_FILE_ID)
  private Integer projectFileId;


  public DeployProject configurationFileId(Integer configurationFileId) {
    
    this.configurationFileId = configurationFileId;
    return this;
  }

   /**
   * Id of a codebeamer document
   * @return configurationFileId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Id of a codebeamer document")

  public Integer getConfigurationFileId() {
    return configurationFileId;
  }


  public void setConfigurationFileId(Integer configurationFileId) {
    this.configurationFileId = configurationFileId;
  }


  public DeployProject password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * The password to decrypt the uploaded configuration file
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The password to decrypt the uploaded configuration file")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public DeployProject project(ProjectReference project) {
    
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProjectReference getProject() {
    return project;
  }


  public void setProject(ProjectReference project) {
    this.project = project;
  }


  public DeployProject projectFileId(Integer projectFileId) {
    
    this.projectFileId = projectFileId;
    return this;
  }

   /**
   * Id of a codebeamer document
   * @return projectFileId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Id of a codebeamer document")

  public Integer getProjectFileId() {
    return projectFileId;
  }


  public void setProjectFileId(Integer projectFileId) {
    this.projectFileId = projectFileId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeployProject deployProject = (DeployProject) o;
    return Objects.equals(this.configurationFileId, deployProject.configurationFileId) &&
        Objects.equals(this.password, deployProject.password) &&
        Objects.equals(this.project, deployProject.project) &&
        Objects.equals(this.projectFileId, deployProject.projectFileId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configurationFileId, password, project, projectFileId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeployProject {\n");
    sb.append("    configurationFileId: ").append(toIndentedString(configurationFileId)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    projectFileId: ").append(toIndentedString(projectFileId)).append("\n");
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

