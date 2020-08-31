# CodeBeamer Swagger client bootstrap project

This project is meant to be the starting point for Java based client projects which are connecting to the codeBeamer ALM system.

## Requirements

Building the API client SDK requires:
1. Java 1.8+
2. Gradle
3. Running codeBeamer instance

## Installation

Clone the project into your local repository and make sure that your codeBeamer instance is running.

To regenerate the API client SDK, open the /build.gradle file in your repository and modify the codeBeamerBaseUrl definition to your codeBeamer instance:

```groovy
def codeBeamerBaseUrl = "{your codeBeamer instance base URL}"
```

In case you are not using codeBeamer 10.1 you also need to uncomment the proper codeBeamerSwaggerJsonUrl definition:

```groovy
// Until codeBeamer 9.5
// def codeBeamerSwaggerJsonUrl = "$codeBeamerBaseUrl/v2/swagger.json"
// From codeBeamer 10.0
// def codeBeamerSwaggerJsonUrl = "$codeBeamerBaseUrl/api/docs/v3/api-docs"
// From codeBeamer 10.1
def codeBeamerSwaggerJsonUrl = "$codeBeamerBaseUrl/api-docs/v3.json"
``` 

After this setup you can use the following gradle task to download the latest API definition:

```shell script
./gradlew downloadSwaggerJson
```

This command should update the swagger_api.json file in the project directory.

Based on the swagger_api.json file, now you can regenerate the client SDK library to represent the latest state of the API:

```shell script
./gradlew generateSwaggerClient
```

To build your client code you can use:

```shell script
./gradlew swagger-client:build
```

## Getting started

Please follow the [installation](#installation) instructions, import the project into your favourite IDE and execute the [Main.java](swagger-client/src/main/java/com/example/swagger/client/Main.java) file. 
It should log out a line like this:

```shell
2019-11-13 10:03:44 INFO  Main:15 - CodeBeamer Swagger client is initialized.
```