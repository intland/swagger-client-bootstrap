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


package com.intland.swagger.client.api;

import org.junit.Ignore;
import org.junit.Test;

import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.model.BackgroundJob;

/**
 * API tests for BackgroundJobApi
 */
@Ignore
public class BackgroundJobApiTest {

    private final BackgroundJobApi api = new BackgroundJobApi();

    
    /**
     * Retrieve background job information
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBackgroundJobTest() throws ApiException {
        Integer jobId = null;
        BackgroundJob response = api.getBackgroundJob(jobId);

        // TODO: test validations
    }
    
}
