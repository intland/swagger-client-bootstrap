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

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.model.TraceabilityInitialLevelFilter;
import com.intland.swagger.client.model.TraceabilityItem;
import com.intland.swagger.client.model.TraceabilityLevelFilter;
import com.intland.swagger.client.model.TraceabilityResult;

/**
 * API tests for TraceabilityApi
 */
@Ignore
public class TraceabilityApiTest {

    private final TraceabilityApi api = new TraceabilityApi();

    
    /**
     * Get initial ids
     *
     * Get traceability initial ids!
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTraceabilityInitialItemIdsTest() throws ApiException {
        TraceabilityInitialLevelFilter traceabilityInitialLevelFilter = null;
        Integer pageSize = null;
        Integer pageNo = null;
        List<TraceabilityItem> response = api.getTraceabilityInitialItemIds(traceabilityInitialLevelFilter, pageSize, pageNo);

        // TODO: test validations
    }
    
    /**
     * Get traceability level item ids
     *
     * Get traceability item ids!
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTraceabilityLevelItemIdsTest() throws ApiException {
        TraceabilityLevelFilter traceabilityLevelFilter = null;
        Integer itemsOnLevel = null;
        Integer itemsFromPreviousItem = null;
        TraceabilityResult response = api.getTraceabilityLevelItemIds(traceabilityLevelFilter, itemsOnLevel, itemsFromPreviousItem);

        // TODO: test validations
    }
    
}
