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

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.model.MaintenanceMode;
import com.intland.swagger.client.model.SystemStatus;

/**
 * API tests for SystemApi
 */
@Disabled
public class SystemApiTest {

    private final SystemApi api = new SystemApi();

    /**
     * Get system maintenance status
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSystemStatusTest() throws ApiException {
        SystemStatus response = api.getSystemStatus();
        // TODO: test validations
    }

    /**
     * Set system maintenance status
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setSystemStatusTest() throws ApiException {
        MaintenanceMode maintenanceMode = null;
        SystemStatus response = api.setSystemStatus(maintenanceMode);
        // TODO: test validations
    }

}
