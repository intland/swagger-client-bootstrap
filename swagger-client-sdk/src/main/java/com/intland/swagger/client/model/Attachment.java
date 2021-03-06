/*
 * codeBeamer swagger API
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
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intland.swagger.client.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.joda.time.DateTime;

/**
 * Attachment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-29T09:51:27.838+02:00[Europe/Budapest]")
public class Attachment {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

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

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private DateTime createdAt;

  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private UserReference createdBy;

  public static final String SERIALIZED_NAME_MODIFIED_AT = "modifiedAt";
  @SerializedName(SERIALIZED_NAME_MODIFIED_AT)
  private DateTime modifiedAt;

  public static final String SERIALIZED_NAME_MODIFIED_BY = "modifiedBy";
  @SerializedName(SERIALIZED_NAME_MODIFIED_BY)
  private UserReference modifiedBy;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Long size;

  public static final String SERIALIZED_NAME_MD5 = "md5";
  @SerializedName(SERIALIZED_NAME_MD5)
  private String md5;


  public Attachment id(Integer id) {
    
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


  public Attachment name(String name) {
    
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


  public Attachment description(String description) {
    
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


  public Attachment descriptionFormat(DescriptionFormatEnum descriptionFormat) {
    
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


  public Attachment createdAt(DateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date when the entity was created
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date when the entity was created")

  public DateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(DateTime createdAt) {
    this.createdAt = createdAt;
  }


  public Attachment createdBy(UserReference createdBy) {
    
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


  public Attachment modifiedAt(DateTime modifiedAt) {
    
    this.modifiedAt = modifiedAt;
    return this;
  }

   /**
   * The date when the entity was modified
   * @return modifiedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date when the entity was modified")

  public DateTime getModifiedAt() {
    return modifiedAt;
  }


  public void setModifiedAt(DateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }


  public Attachment modifiedBy(UserReference modifiedBy) {
    
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


  public Attachment version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * Version of a attachment
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Version of a attachment")

  public Integer getVersion() {
    return version;
  }


  public void setVersion(Integer version) {
    this.version = version;
  }


  public Attachment size(Long size) {
    
    this.size = size;
    return this;
  }

   /**
   * Size of a attachment
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Size of a attachment")

  public Long getSize() {
    return size;
  }


  public void setSize(Long size) {
    this.size = size;
  }


  public Attachment md5(String md5) {
    
    this.md5 = md5;
    return this;
  }

   /**
   * Size of a attachment
   * @return md5
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Size of a attachment")

  public String getMd5() {
    return md5;
  }


  public void setMd5(String md5) {
    this.md5 = md5;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Attachment attachment = (Attachment) o;
    return Objects.equals(this.id, attachment.id) &&
        Objects.equals(this.name, attachment.name) &&
        Objects.equals(this.description, attachment.description) &&
        Objects.equals(this.descriptionFormat, attachment.descriptionFormat) &&
        Objects.equals(this.createdAt, attachment.createdAt) &&
        Objects.equals(this.createdBy, attachment.createdBy) &&
        Objects.equals(this.modifiedAt, attachment.modifiedAt) &&
        Objects.equals(this.modifiedBy, attachment.modifiedBy) &&
        Objects.equals(this.version, attachment.version) &&
        Objects.equals(this.size, attachment.size) &&
        Objects.equals(this.md5, attachment.md5);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, descriptionFormat, createdAt, createdBy, modifiedAt, modifiedBy, version, size, md5);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attachment {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    descriptionFormat: ").append(toIndentedString(descriptionFormat)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    md5: ").append(toIndentedString(md5)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

