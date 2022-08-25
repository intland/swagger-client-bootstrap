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
 * Request model to render a wiki page in a specific context
 */
@ApiModel(description = "Request model to render a wiki page in a specific context")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-25T12:12:17.856+02:00[Europe/Budapest]")
public class WikiRenderRequest {
  public static final String SERIALIZED_NAME_CONTEXT_ID = "contextId";
  @SerializedName(SERIALIZED_NAME_CONTEXT_ID)
  private Integer contextId;

  public static final String SERIALIZED_NAME_CONTEXT_VERSION = "contextVersion";
  @SerializedName(SERIALIZED_NAME_CONTEXT_VERSION)
  private Integer contextVersion;

  public static final String SERIALIZED_NAME_MARKUP = "markup";
  @SerializedName(SERIALIZED_NAME_MARKUP)
  private String markup;

  /**
   * Type of the entity used as rendering context
   */
  @JsonAdapter(RenderingContextTypeEnum.Adapter.class)
  public enum RenderingContextTypeEnum {
    TRACKER_ITEM("TRACKER_ITEM"),
    
    WIKI("WIKI");

    private String value;

    RenderingContextTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RenderingContextTypeEnum fromValue(String value) {
      for (RenderingContextTypeEnum b : RenderingContextTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RenderingContextTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RenderingContextTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RenderingContextTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RenderingContextTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RENDERING_CONTEXT_TYPE = "renderingContextType";
  @SerializedName(SERIALIZED_NAME_RENDERING_CONTEXT_TYPE)
  private RenderingContextTypeEnum renderingContextType;


  public WikiRenderRequest contextId(Integer contextId) {
    
    this.contextId = contextId;
    return this;
  }

   /**
   * Id of the entity used as rendering context
   * @return contextId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Id of the entity used as rendering context")

  public Integer getContextId() {
    return contextId;
  }


  public void setContextId(Integer contextId) {
    this.contextId = contextId;
  }


  public WikiRenderRequest contextVersion(Integer contextVersion) {
    
    this.contextVersion = contextVersion;
    return this;
  }

   /**
   * Version of the entity used as rendering context
   * @return contextVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Version of the entity used as rendering context")

  public Integer getContextVersion() {
    return contextVersion;
  }


  public void setContextVersion(Integer contextVersion) {
    this.contextVersion = contextVersion;
  }


  public WikiRenderRequest markup(String markup) {
    
    this.markup = markup;
    return this;
  }

   /**
   * Wiki markup to render as HTML
   * @return markup
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Hello __World__!", required = true, value = "Wiki markup to render as HTML")

  public String getMarkup() {
    return markup;
  }


  public void setMarkup(String markup) {
    this.markup = markup;
  }


  public WikiRenderRequest renderingContextType(RenderingContextTypeEnum renderingContextType) {
    
    this.renderingContextType = renderingContextType;
    return this;
  }

   /**
   * Type of the entity used as rendering context
   * @return renderingContextType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of the entity used as rendering context")

  public RenderingContextTypeEnum getRenderingContextType() {
    return renderingContextType;
  }


  public void setRenderingContextType(RenderingContextTypeEnum renderingContextType) {
    this.renderingContextType = renderingContextType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WikiRenderRequest wikiRenderRequest = (WikiRenderRequest) o;
    return Objects.equals(this.contextId, wikiRenderRequest.contextId) &&
        Objects.equals(this.contextVersion, wikiRenderRequest.contextVersion) &&
        Objects.equals(this.markup, wikiRenderRequest.markup) &&
        Objects.equals(this.renderingContextType, wikiRenderRequest.renderingContextType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contextId, contextVersion, markup, renderingContextType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WikiRenderRequest {\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    contextVersion: ").append(toIndentedString(contextVersion)).append("\n");
    sb.append("    markup: ").append(toIndentedString(markup)).append("\n");
    sb.append("    renderingContextType: ").append(toIndentedString(renderingContextType)).append("\n");
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

