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
import com.intland.swagger.client.model.TraceabilityInitialLevelFilter;
import com.intland.swagger.client.model.TraceabilityItem;
import com.intland.swagger.client.model.TraceabilityLevelFilter;
import com.intland.swagger.client.model.TraceabilityResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        Integer pageSize = null;
        Integer pageNo = null;
        TraceabilityInitialLevelFilter traceabilityInitialLevelFilter = null;
        List<TraceabilityItem> response = api.getTraceabilityInitialItemIds(pageSize, pageNo, traceabilityInitialLevelFilter);

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
        Integer itemsOnLevel = null;
        Integer itemsFromPreviousItem = null;
        TraceabilityLevelFilter traceabilityLevelFilter = null;
        TraceabilityResult response = api.getTraceabilityLevelItemIds(itemsOnLevel, itemsFromPreviousItem, traceabilityLevelFilter);

        // TODO: test validations
    }
    
}
