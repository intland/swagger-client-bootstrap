

# UserDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** |  |  [optional]
**name** | **String** |  |  [optional]
**dateFormat** | [**FastDateFormat**](FastDateFormat.md) |  |  [optional]
**dateTimeFormat** | [**FastDateFormat**](FastDateFormat.md) |  |  [optional]
**timeZone** | [**FastDateFormatTimeZone**](FastDateFormatTimeZone.md) |  |  [optional]
**locale** | [**FastDateFormatLocale**](FastDateFormatLocale.md) |  |  [optional]
**loggedIn** | **Boolean** |  |  [optional]
**authenticated** | **Boolean** |  |  [optional]
**ssoId** | **String** |  |  [optional]
**marketingConsentAccepted** | **Boolean** |  |  [optional]
**salesConsentAccepted** | **Boolean** |  |  [optional]
**password** | **String** |  |  [optional]
**status** | **String** |  |  [optional]
**hostName** | **String** |  |  [optional]
**firstName** | **String** |  |  [optional]
**lastName** | **String** |  |  [optional]
**title** | **String** |  |  [optional]
**address** | **String** |  |  [optional]
**zip** | **String** |  |  [optional]
**city** | **String** |  |  [optional]
**state** | **String** |  |  [optional]
**sourceOfInterest** | **String** |  |  [optional]
**scc** | **String** |  |  [optional]
**teamSize** | **String** |  |  [optional]
**divisionSize** | **String** |  |  [optional]
**company** | **String** |  |  [optional]
**registrationSource** | **String** |  |  [optional]
**country** | **String** |  |  [optional]
**language** | **String** |  |  [optional]
**email** | **String** |  |  [optional]
**emailClient** | **String** |  |  [optional]
**phone** | **String** |  |  [optional]
**mobile** | **String** |  |  [optional]
**dateFormatPattern** | **String** |  |  [optional]
**dateTimeFormatPattern** | **String** |  |  [optional]
**timeZonePattern** | **String** |  |  [optional]
**downloadLimit** | **Integer** |  |  [optional]
**browser** | **String** |  |  [optional]
**skills** | **String** |  |  [optional]
**wikiHomepageId** | **Integer** |  |  [optional]
**registryDate** | [**DateTime**](DateTime.md) |  |  [optional]
**referrerUrl** | **String** |  |  [optional]
**lastLogin** | [**DateTime**](DateTime.md) |  |  [optional]
**unused0** | **String** |  |  [optional]
**unused1** | **String** |  |  [optional]
**ldapName** | [**UserDtoLdapName**](UserDtoLdapName.md) |  |  [optional]
**currentWorkSpaceId** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**type** | **String** |  |  [optional]
**kind** | [**KindEnum**](#KindEnum) |  |  [optional]
**geoLocation** | [**GeoLocationDto**](GeoLocationDto.md) |  |  [optional]
**industry** | **String** |  |  [optional]
**realName** | **String** |  |  [optional]
**disabled** | **Boolean** |  |  [optional]
**initials** | **String** |  |  [optional]
**urlLink** | **String** |  |  [optional]
**countryName** | **String** |  |  [optional]
**authentication** | **Boolean** |  |  [optional]
**datePattern** | **String** |  |  [optional]
**activated** | **Boolean** |  |  [optional]
**emails** | **List&lt;String&gt;** |  |  [optional]
**dateTimePattern** | **String** |  |  [optional]
**customizedName** | **String** |  |  [optional]
**lastLoginTime** | **Long** |  |  [optional]
**inActivation** | **Boolean** |  |  [optional]
**shortDescription** | **String** |  |  [optional]
**interwikiLink** | **String** |  |  [optional]
**iconUrl** | **String** |  |  [optional]
**mapUrl** | **String** |  |  [optional]



## Enum: KindEnum

Name | Value
---- | -----
USER_WITH_NAMED_LICENSE | &quot;User with Named license&quot;
USER_WITH_FLOATING_LICENSE | &quot;User with Floating license&quot;
CUSTOMER_WITH_NAMED_LICENSE | &quot;Customer with Named license&quot;
CUSTOMER_WITH_FLOATING_LICENSE | &quot;Customer with Floating license&quot;



