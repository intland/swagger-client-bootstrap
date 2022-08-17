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


package com.intland.swagger.client.api;

import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.model.BadRequestException;
import com.intland.swagger.client.model.CreateTestRunRequest;
import com.intland.swagger.client.model.InternalServerErrorException;
import com.intland.swagger.client.model.ResourceForbiddenException;
import com.intland.swagger.client.model.ResourceNotFoundException;
import com.intland.swagger.client.model.ResourceUnauthorizedException;
import com.intland.swagger.client.model.TrackerItem;
import com.intland.swagger.client.model.UpdateTestRunRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TestRunApi
 */
@Ignore
public class TestRunApiTest {

    private final TestRunApi api = new TestRunApi();

    
    /**
     * Create a new test run for test cases or test sets
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTestRunForTestCaseTest() throws ApiException {
        Integer testRunTrackerId = null;
        CreateTestRunRequest createTestRunRequest = null;
        TrackerItem response = api.createTestRunForTestCase(testRunTrackerId, createTestRunRequest);

        // TODO: test validations
    }
    
    /**
     * Update result of a Test Run
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTestRunResultTest() throws ApiException {
        Integer testRunId = null;
        UpdateTestRunRequest updateTestRunRequest = null;
        TrackerItem response = api.updateTestRunResult(testRunId, updateTestRunRequest);

        // TODO: test validations
    }
    
}