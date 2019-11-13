

# UserAllOf

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Id of the entity |  [optional]
**uri** | **String** | Reference to an object |  [optional]
**name** | **String** | Name of the entity |  [optional]
**type** | **String** | Type of a referenced object |  [optional]
**firstName** | **String** | First name of a user |  [optional]
**lastName** | **String** | Last name of a user |  [optional]
**email** | **String** | Email of a user |  [optional]
**title** | **String** | Title of a user |  [optional]
**company** | **String** | Company of a user |  [optional]
**address** | **String** | Address of a user |  [optional]
**zip** | **String** | Zip of a user |  [optional]
**city** | **String** | City of a user |  [optional]
**state** | **String** | State / providence of a user |  [optional]
**country** | **String** | Country of a user in ISO 3166-1 alpha-2 format |  [optional]
**dateFormat** | **String** | Date format of a user |  [optional]
**timeZone** | **String** | Time zone of a user |  [optional]
**language** | **String** | Language of a user in ISO 639-1 format |  [optional]
**phone** | **String** | Phone number of a user |  [optional]
**skills** | **String** | Skills of a user |  [optional]
**registryDate** | [**DateTime**](DateTime.md) | Registration date of a user |  [optional]
**lastLoginDate** | [**DateTime**](DateTime.md) | Last login date of a user |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Status of a user |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
ACTIVATED | &quot;ACTIVATED&quot;
DISABLED | &quot;DISABLED&quot;
INACTIVATION | &quot;INACTIVATION&quot;



