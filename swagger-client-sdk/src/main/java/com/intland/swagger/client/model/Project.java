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

import org.threeten.bp.OffsetDateTime;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Basic properties of a codebeamer project
 */
@ApiModel(description = "Basic properties of a codebeamer project")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-25T12:12:17.856+02:00[Europe/Budapest]")
public class Project {
  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_CLOSED = "closed";
  @SerializedName(SERIALIZED_NAME_CLOSED)
  private Boolean closed;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private UserReference createdBy;

  public static final String SERIALIZED_NAME_DELETED = "deleted";
  @SerializedName(SERIALIZED_NAME_DELETED)
  private Boolean deleted;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  /**
   * Description format of the entity
   */
  @JsonAdapter(DescriptionFormatEnum.Adapter.class)
  public enum DescriptionFormatEnum {
    PLAINTEXT("PlainText"),
    
    HTML("Html"),
    
    WIKI("Wiki");

    private String value;

    DescriptionFormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DescriptionFormatEnum fromValue(String value) {
      for (DescriptionFormatEnum b : DescriptionFormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DescriptionFormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DescriptionFormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DescriptionFormatEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DescriptionFormatEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DESCRIPTION_FORMAT = "descriptionFormat";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION_FORMAT)
  private DescriptionFormatEnum descriptionFormat;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_KEY_NAME = "keyName";
  @SerializedName(SERIALIZED_NAME_KEY_NAME)
  private String keyName;

  public static final String SERIALIZED_NAME_MODIFIED_AT = "modifiedAt";
  @SerializedName(SERIALIZED_NAME_MODIFIED_AT)
  private OffsetDateTime modifiedAt;

  public static final String SERIALIZED_NAME_MODIFIED_BY = "modifiedBy";
  @SerializedName(SERIALIZED_NAME_MODIFIED_BY)
  private UserReference modifiedBy;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private Boolean template;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;


  public Project category(String category) {
    
    this.category = category;
    return this;
  }

   /**
   * Category of a project
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Category of a project")

  public String getCategory() {
    return category;
  }


  public void setCategory(String category) {
    this.category = category;
  }


  public Project closed(Boolean closed) {
    
    this.closed = closed;
    return this;
  }

   /**
   * Closed status of a project
   * @return closed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Closed status of a project")

  public Boolean getClosed() {
    return closed;
  }


  public void setClosed(Boolean closed) {
    this.closed = closed;
  }


  public Project createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date when the entity was created
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date when the entity was created")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public Project createdBy(UserReference createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserReference getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(UserReference createdBy) {
    this.createdBy = createdBy;
  }


  public Project deleted(Boolean deleted) {
    
    this.deleted = deleted;
    return this;
  }

   /**
   * Delete status of a project
   * @return deleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Delete status of a project")

  public Boolean getDeleted() {
    return deleted;
  }


  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }


  public Project description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the entity
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description of the entity")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Project descriptionFormat(DescriptionFormatEnum descriptionFormat) {
    
    this.descriptionFormat = descriptionFormat;
    return this;
  }

   /**
   * Description format of the entity
   * @return descriptionFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description format of the entity")

  public DescriptionFormatEnum getDescriptionFormat() {
    return descriptionFormat;
  }


  public void setDescriptionFormat(DescriptionFormatEnum descriptionFormat) {
    this.descriptionFormat = descriptionFormat;
  }


  public Project id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Id of the entity
   * minimum: 0
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Id of the entity")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public Project keyName(String keyName) {
    
    this.keyName = keyName;
    return this;
  }

   /**
   * Key name of a project
   * @return keyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Key name of a project")

  public String getKeyName() {
    return keyName;
  }


  public void setKeyName(String keyName) {
    this.keyName = keyName;
  }


  public Project modifiedAt(OffsetDateTime modifiedAt) {
    
    this.modifiedAt = modifiedAt;
    return this;
  }

   /**
   * The date when the entity was modified
   * @return modifiedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date when the entity was modified")

  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }


  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }


  public Project modifiedBy(UserReference modifiedBy) {
    
    this.modifiedBy = modifiedBy;
    return this;
  }

   /**
   * Get modifiedBy
   * @return modifiedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserReference getModifiedBy() {
    return modifiedBy;
  }


  public void setModifiedBy(UserReference modifiedBy) {
    this.modifiedBy = modifiedBy;
  }


  public Project name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the entity
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the entity")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Project template(Boolean template) {
    
    this.template = template;
    return this;
  }

   /**
   * Template status of a project
   * @return template
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Template status of a project")

  public Boolean getTemplate() {
    return template;
  }


  public void setTemplate(Boolean template) {
    this.template = template;
  }


  public Project version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * Version of a project
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Version of a project")

  public Integer getVersion() {
    return version;
  }


  public void setVersion(Integer version) {
    this.version = version;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Project project = (Project) o;
    return Objects.equals(this.category, project.category) &&
        Objects.equals(this.closed, project.closed) &&
        Objects.equals(this.createdAt, project.createdAt) &&
        Objects.equals(this.createdBy, project.createdBy) &&
        Objects.equals(this.deleted, project.deleted) &&
        Objects.equals(this.description, project.description) &&
        Objects.equals(this.descriptionFormat, project.descriptionFormat) &&
        Objects.equals(this.id, project.id) &&
        Objects.equals(this.keyName, project.keyName) &&
        Objects.equals(this.modifiedAt, project.modifiedAt) &&
        Objects.equals(this.modifiedBy, project.modifiedBy) &&
        Objects.equals(this.name, project.name) &&
        Objects.equals(this.template, project.template) &&
        Objects.equals(this.version, project.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, closed, createdAt, createdBy, deleted, description, descriptionFormat, id, keyName, modifiedAt, modifiedBy, name, template, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Project {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    closed: ").append(toIndentedString(closed)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    descriptionFormat: ").append(toIndentedString(descriptionFormat)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

