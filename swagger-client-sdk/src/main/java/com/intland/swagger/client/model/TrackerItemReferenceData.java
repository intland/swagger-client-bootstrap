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
 * Properties of a tracker item reference
 */
@ApiModel(description = "Properties of a tracker item reference")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-25T12:12:17.856+02:00[Europe/Budapest]")
public class TrackerItemReferenceData {
  /**
   * Type of suspect propagation
   */
  @JsonAdapter(SuspectPropagationEnum.Adapter.class)
  public enum SuspectPropagationEnum {
    DO_NOT_PROPAGATE("DO_NOT_PROPAGATE"),
    
    PROPAGATE("PROPAGATE"),
    
    REVERSE("REVERSE"),
    
    BIDIRECTIONAL("BIDIRECTIONAL");

    private String value;

    SuspectPropagationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SuspectPropagationEnum fromValue(String value) {
      for (SuspectPropagationEnum b : SuspectPropagationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SuspectPropagationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SuspectPropagationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SuspectPropagationEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SuspectPropagationEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SUSPECT_PROPAGATION = "suspectPropagation";
  @SerializedName(SERIALIZED_NAME_SUSPECT_PROPAGATION)
  private SuspectPropagationEnum suspectPropagation;


  public TrackerItemReferenceData suspectPropagation(SuspectPropagationEnum suspectPropagation) {
    
    this.suspectPropagation = suspectPropagation;
    return this;
  }

   /**
   * Type of suspect propagation
   * @return suspectPropagation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of suspect propagation")

  public SuspectPropagationEnum getSuspectPropagation() {
    return suspectPropagation;
  }


  public void setSuspectPropagation(SuspectPropagationEnum suspectPropagation) {
    this.suspectPropagation = suspectPropagation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackerItemReferenceData trackerItemReferenceData = (TrackerItemReferenceData) o;
    return Objects.equals(this.suspectPropagation, trackerItemReferenceData.suspectPropagation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(suspectPropagation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackerItemReferenceData {\n");
    sb.append("    suspectPropagation: ").append(toIndentedString(suspectPropagation)).append("\n");
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

