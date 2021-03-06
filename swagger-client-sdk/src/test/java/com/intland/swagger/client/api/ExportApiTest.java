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
import com.intland.swagger.client.model.BatchGetTrackerItemReviewsRequest;
import com.intland.swagger.client.model.ExportProject;
import java.io.File;
import com.intland.swagger.client.model.TrackerItem;
import com.intland.swagger.client.model.TrackerItemWithTrackerItemReviewsExport;
import com.intland.swagger.client.model.TrackerItemsRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ExportApi
 */
@Ignore
public class ExportApiTest {

    private final ExportApi api = new ExportApi();

    
    /**
     * Get tracker item reviews by a list of tracker item IDs
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void batchGetTrackerItemReviewsTest() throws ApiException {
        BatchGetTrackerItemReviewsRequest batchGetTrackerItemReviewsRequest = null;
        List<TrackerItemWithTrackerItemReviewsExport> response = api.batchGetTrackerItemReviews(batchGetTrackerItemReviewsRequest);

        // TODO: test validations
    }
    
    /**
     * Exports the specified project to a zip file
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void exportTest() throws ApiException {
        Integer projectId = null;
        ExportProject exportProject = null;
        File response = api.export(projectId, exportProject);

        // TODO: test validations
    }
    
    /**
     * Get tracker items
     *
     * API can be used for fetching basic information of tracker items
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTrackerItemsTest() throws ApiException {
        Integer baselineId = null;
        TrackerItemsRequest trackerItemsRequest = null;
        List<TrackerItem> response = api.getTrackerItems(baselineId, trackerItemsRequest);

        // TODO: test validations
    }
    
}
