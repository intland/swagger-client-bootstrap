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
import com.intland.swagger.client.model.AbstractField;
import com.intland.swagger.client.model.ChoiceOptionReference;
import com.intland.swagger.client.model.MemberFieldAllOf;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Member field
 */
@ApiModel(description = "Member field")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-29T09:51:27.838+02:00[Europe/Budapest]")
public class MemberField extends AbstractField {
  public static final String SERIALIZED_NAME_MULTIPLE_VALUES = "multipleValues";
  @SerializedName(SERIALIZED_NAME_MULTIPLE_VALUES)
  private Boolean multipleValues;

  /**
   * Supported member type of a member field
   */
  @JsonAdapter(MemberTypesEnum.Adapter.class)
  public enum MemberTypesEnum {
    USER("USER"),
    
    ROLE("ROLE"),
    
    GROUP("GROUP");

    private String value;

    MemberTypesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MemberTypesEnum fromValue(String value) {
      for (MemberTypesEnum b : MemberTypesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MemberTypesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MemberTypesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MemberTypesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MemberTypesEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MEMBER_TYPES = "memberTypes";
  @SerializedName(SERIALIZED_NAME_MEMBER_TYPES)
  private List<MemberTypesEnum> memberTypes = null;


  public MemberField multipleValues(Boolean multipleValues) {
    
    this.multipleValues = multipleValues;
    return this;
  }

   /**
   * Multiple values state of a field
   * @return multipleValues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Multiple values state of a field")

  public Boolean getMultipleValues() {
    return multipleValues;
  }


  public void setMultipleValues(Boolean multipleValues) {
    this.multipleValues = multipleValues;
  }


  public MemberField memberTypes(List<MemberTypesEnum> memberTypes) {
    
    this.memberTypes = memberTypes;
    return this;
  }

  public MemberField addMemberTypesItem(MemberTypesEnum memberTypesItem) {
    if (this.memberTypes == null) {
      this.memberTypes = new ArrayList<MemberTypesEnum>();
    }
    this.memberTypes.add(memberTypesItem);
    return this;
  }

   /**
   * Supported member type of a member field
   * @return memberTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Supported member type of a member field")

  public List<MemberTypesEnum> getMemberTypes() {
    return memberTypes;
  }


  public void setMemberTypes(List<MemberTypesEnum> memberTypes) {
    this.memberTypes = memberTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MemberField memberField = (MemberField) o;
    return Objects.equals(this.multipleValues, memberField.multipleValues) &&
        Objects.equals(this.memberTypes, memberField.memberTypes) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(multipleValues, memberTypes, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberField {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    multipleValues: ").append(toIndentedString(multipleValues)).append("\n");
    sb.append("    memberTypes: ").append(toIndentedString(memberTypes)).append("\n");
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

