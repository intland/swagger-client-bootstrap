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
 * Status information of a dependency finder job
 */
@ApiModel(description = "Status information of a dependency finder job")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-25T12:12:17.856+02:00[Europe/Budapest]")
public class DependencyFinderJobStatusInfo extends AbstractBackgroundJobStatusInfo {
  public static final String SERIALIZED_NAME_DEPENDENCIES = "dependencies";
  @SerializedName(SERIALIZED_NAME_DEPENDENCIES)
  private List<CrossProjectDependency> dependencies = null;

  public static final String SERIALIZED_NAME_PROJECTS_CHECKED = "projectsChecked";
  @SerializedName(SERIALIZED_NAME_PROJECTS_CHECKED)
  private Integer projectsChecked;

  public static final String SERIALIZED_NAME_PROJECTS_SCHEDULED = "projectsScheduled";
  @SerializedName(SERIALIZED_NAME_PROJECTS_SCHEDULED)
  private Integer projectsScheduled;

  public DependencyFinderJobStatusInfo() {
    this.type = this.getClass().getSimpleName();
  }

  public DependencyFinderJobStatusInfo dependencies(List<CrossProjectDependency> dependencies) {
    
    this.dependencies = dependencies;
    return this;
  }

  public DependencyFinderJobStatusInfo addDependenciesItem(CrossProjectDependency dependenciesItem) {
    if (this.dependencies == null) {
      this.dependencies = new ArrayList<CrossProjectDependency>();
    }
    this.dependencies.add(dependenciesItem);
    return this;
  }

   /**
   * Dependencies found among projects.
   * @return dependencies
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Dependencies found among projects.")

  public List<CrossProjectDependency> getDependencies() {
    return dependencies;
  }


  public void setDependencies(List<CrossProjectDependency> dependencies) {
    this.dependencies = dependencies;
  }


  public DependencyFinderJobStatusInfo projectsChecked(Integer projectsChecked) {
    
    this.projectsChecked = projectsChecked;
    return this;
  }

   /**
   * Number of projects already checked for dependencies
   * @return projectsChecked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of projects already checked for dependencies")

  public Integer getProjectsChecked() {
    return projectsChecked;
  }


  public void setProjectsChecked(Integer projectsChecked) {
    this.projectsChecked = projectsChecked;
  }


  public DependencyFinderJobStatusInfo projectsScheduled(Integer projectsScheduled) {
    
    this.projectsScheduled = projectsScheduled;
    return this;
  }

   /**
   * Number of projects scheduled for dependency collection
   * @return projectsScheduled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of projects scheduled for dependency collection")

  public Integer getProjectsScheduled() {
    return projectsScheduled;
  }


  public void setProjectsScheduled(Integer projectsScheduled) {
    this.projectsScheduled = projectsScheduled;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DependencyFinderJobStatusInfo dependencyFinderJobStatusInfo = (DependencyFinderJobStatusInfo) o;
    return Objects.equals(this.dependencies, dependencyFinderJobStatusInfo.dependencies) &&
        Objects.equals(this.projectsChecked, dependencyFinderJobStatusInfo.projectsChecked) &&
        Objects.equals(this.projectsScheduled, dependencyFinderJobStatusInfo.projectsScheduled) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dependencies, projectsChecked, projectsScheduled, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DependencyFinderJobStatusInfo {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    dependencies: ").append(toIndentedString(dependencies)).append("\n");
    sb.append("    projectsChecked: ").append(toIndentedString(projectsChecked)).append("\n");
    sb.append("    projectsScheduled: ").append(toIndentedString(projectsScheduled)).append("\n");
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

