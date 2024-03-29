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
import java.util.Date;
import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Properties of a codebeamer user
 */
@ApiModel(description = "Properties of a codebeamer user")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-13T14:02:21.403654+01:00[Europe/Budapest]")
public class User {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_COMPANY = "company";
  @SerializedName(SERIALIZED_NAME_COMPANY)
  private String company;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_DATE_FORMAT = "dateFormat";
  @SerializedName(SERIALIZED_NAME_DATE_FORMAT)
  private String dateFormat;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_LAST_LOGIN_DATE = "lastLoginDate";
  @SerializedName(SERIALIZED_NAME_LAST_LOGIN_DATE)
  private Date lastLoginDate;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_REGISTRY_DATE = "registryDate";
  @SerializedName(SERIALIZED_NAME_REGISTRY_DATE)
  private Date registryDate;

  public static final String SERIALIZED_NAME_SKILLS = "skills";
  @SerializedName(SERIALIZED_NAME_SKILLS)
  private String skills;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  /**
   * Status of a user
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ACTIVATED("ACTIVATED"),
    
    DISABLED("DISABLED"),
    
    INACTIVATION("INACTIVATION");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_TIME_ZONE = "timeZone";
  @SerializedName(SERIALIZED_NAME_TIME_ZONE)
  private String timeZone;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_ZIP = "zip";
  @SerializedName(SERIALIZED_NAME_ZIP)
  private String zip;


  public User address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Address of a user
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Address of a user")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public User city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * City of a user
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "City of a user")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public User company(String company) {
    
    this.company = company;
    return this;
  }

   /**
   * Company of a user
   * @return company
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Company of a user")

  public String getCompany() {
    return company;
  }


  public void setCompany(String company) {
    this.company = company;
  }


  public User country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Country of a user in ISO 3166-1 alpha-2 format
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Country of a user in ISO 3166-1 alpha-2 format")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public User dateFormat(String dateFormat) {
    
    this.dateFormat = dateFormat;
    return this;
  }

   /**
   * Date format of a user
   * @return dateFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date format of a user")

  public String getDateFormat() {
    return dateFormat;
  }


  public void setDateFormat(String dateFormat) {
    this.dateFormat = dateFormat;
  }


  public User email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Email of a user
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Email of a user")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public User firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * First name of a user
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "First name of a user")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public User id(Integer id) {
    
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


  public User language(String language) {
    
    this.language = language;
    return this;
  }

   /**
   * Language of a user in ISO 639-1 format
   * @return language
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Language of a user in ISO 639-1 format")

  public String getLanguage() {
    return language;
  }


  public void setLanguage(String language) {
    this.language = language;
  }


  public User lastLoginDate(Date lastLoginDate) {
    
    this.lastLoginDate = lastLoginDate;
    return this;
  }

   /**
   * Last login date of a user
   * @return lastLoginDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Last login date of a user")

  public Date getLastLoginDate() {
    return lastLoginDate;
  }


  public void setLastLoginDate(Date lastLoginDate) {
    this.lastLoginDate = lastLoginDate;
  }


  public User lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Last name of a user
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Last name of a user")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public User name(String name) {
    
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


  public User phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * Phone number of a user
   * @return phone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Phone number of a user")

  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }


  public User registryDate(Date registryDate) {
    
    this.registryDate = registryDate;
    return this;
  }

   /**
   * Registration date of a user
   * @return registryDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Registration date of a user")

  public Date getRegistryDate() {
    return registryDate;
  }


  public void setRegistryDate(Date registryDate) {
    this.registryDate = registryDate;
  }


  public User skills(String skills) {
    
    this.skills = skills;
    return this;
  }

   /**
   * Skills of a user
   * @return skills
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Skills of a user")

  public String getSkills() {
    return skills;
  }


  public void setSkills(String skills) {
    this.skills = skills;
  }


  public User state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * State / providence of a user
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "State / providence of a user")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public User status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Status of a user
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Status of a user")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public User timeZone(String timeZone) {
    
    this.timeZone = timeZone;
    return this;
  }

   /**
   * Time zone of a user
   * @return timeZone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "America/New_York", value = "Time zone of a user")

  public String getTimeZone() {
    return timeZone;
  }


  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }


  public User title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Title of a user
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Title of a user")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public User zip(String zip) {
    
    this.zip = zip;
    return this;
  }

   /**
   * Zip of a user
   * @return zip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Zip of a user")

  public String getZip() {
    return zip;
  }


  public void setZip(String zip) {
    this.zip = zip;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.address, user.address) &&
        Objects.equals(this.city, user.city) &&
        Objects.equals(this.company, user.company) &&
        Objects.equals(this.country, user.country) &&
        Objects.equals(this.dateFormat, user.dateFormat) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.firstName, user.firstName) &&
        Objects.equals(this.id, user.id) &&
        Objects.equals(this.language, user.language) &&
        Objects.equals(this.lastLoginDate, user.lastLoginDate) &&
        Objects.equals(this.lastName, user.lastName) &&
        Objects.equals(this.name, user.name) &&
        Objects.equals(this.phone, user.phone) &&
        Objects.equals(this.registryDate, user.registryDate) &&
        Objects.equals(this.skills, user.skills) &&
        Objects.equals(this.state, user.state) &&
        Objects.equals(this.status, user.status) &&
        Objects.equals(this.timeZone, user.timeZone) &&
        Objects.equals(this.title, user.title) &&
        Objects.equals(this.zip, user.zip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, city, company, country, dateFormat, email, firstName, id, language, lastLoginDate, lastName, name, phone, registryDate, skills, state, status, timeZone, title, zip);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    lastLoginDate: ").append(toIndentedString(lastLoginDate)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    registryDate: ").append(toIndentedString(registryDate)).append("\n");
    sb.append("    skills: ").append(toIndentedString(skills)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
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

