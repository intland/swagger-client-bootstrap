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
import com.intland.swagger.client.model.AbstractField;
import com.intland.swagger.client.model.ChoiceOptionReference;
import com.intland.swagger.client.model.FieldReference;
import java.io.File;
import com.intland.swagger.client.model.OutlineItemSearchResult;
import com.intland.swagger.client.model.Tracker;
import com.intland.swagger.client.model.TrackerFieldStatusPermissions;
import com.intland.swagger.client.model.TrackerItemReferenceSearchResult;
import com.intland.swagger.client.model.TrackerType;
import com.intland.swagger.client.model.TrackerTypeReference;
import com.intland.swagger.client.model.WorkflowTransition;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TrackerApi
 */
@Ignore
public class TrackerApiTest {

    private final TrackerApi api = new TrackerApi();

    
    /**
     * Deletes a tracker
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTrackerTest() throws ApiException {
        Integer trackerId = null;
        api.deleteTracker(trackerId);

        // TODO: test validations
    }
    
    /**
     * Get option of a choice field of tracker
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getChoiceOptionTest() throws ApiException {
        Integer trackerId = null;
        Integer fieldId = null;
        Integer optionId = null;
        ChoiceOptionReference response = api.getChoiceOption(trackerId, fieldId, optionId);

        // TODO: test validations
    }
    
    /**
     * Get items in a specific tracker
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getItemsByTrackerTest() throws ApiException {
        Integer trackerId = null;
        Integer page = null;
        Integer pageSize = null;
        TrackerItemReferenceSearchResult response = api.getItemsByTracker(trackerId, page, pageSize);

        // TODO: test validations
    }
    
    /**
     * Get tracker
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTrackerTest() throws ApiException {
        Integer trackerId = null;
        Tracker response = api.getTracker(trackerId);

        // TODO: test validations
    }
    
    /**
     * Get field of tracker
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTrackerFieldTest() throws ApiException {
        Integer trackerId = null;
        Integer fieldId = null;
        AbstractField response = api.getTrackerField(trackerId, fieldId);

        // TODO: test validations
    }
    
    /**
     * Get permissions of tracker field
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTrackerFieldPermissionsTest() throws ApiException {
        Integer trackerId = null;
        Integer fieldId = null;
        Integer statusId = null;
        List<TrackerFieldStatusPermissions> response = api.getTrackerFieldPermissions(trackerId, fieldId, statusId);

        // TODO: test validations
    }
    
    /**
     * Get fields of tracker
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTrackerFieldsTest() throws ApiException {
        Integer trackerId = null;
        List<FieldReference> response = api.getTrackerFields(trackerId);

        // TODO: test validations
    }
    
    /**
     * Get outline of a specific tracker
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTrackerOutlineTest() throws ApiException {
        Integer trackerId = null;
        Integer parentItemId = null;
        OutlineItemSearchResult response = api.getTrackerOutline(trackerId, parentItemId);

        // TODO: test validations
    }
    
    /**
     * Get the schema of a tracker
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTrackerSchemaTest() throws ApiException {
        Integer trackerId = null;
        List<AbstractField> response = api.getTrackerSchema(trackerId);

        // TODO: test validations
    }
    
    /**
     * Get all transitions of a specific tracker
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTrackerTransitionsTest() throws ApiException {
        Integer trackerId = null;
        Integer fromStatusId = null;
        List<WorkflowTransition> response = api.getTrackerTransitions(trackerId, fromStatusId);

        // TODO: test validations
    }
    
    /**
     * Get the immutable definition of a tracker type
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTrackerTypeTest() throws ApiException {
        Integer trackerTypeId = null;
        TrackerType response = api.getTrackerType(trackerTypeId);

        // TODO: test validations
    }
    
    /**
     * Get the list of tracker types
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTrackerTypesTest() throws ApiException {
        String outline = null;
        List<TrackerTypeReference> response = api.getTrackerTypes(outline);

        // TODO: test validations
    }
    
    /**
     * Updates a specific tracker
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTrackerTest() throws ApiException {
        Integer trackerId = null;
        Tracker tracker = null;
        Tracker response = api.updateTracker(trackerId, tracker);

        // TODO: test validations
    }
    
    /**
     * Upload a tracker icon
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTrackerIconTest() throws ApiException {
        Integer trackerId = null;
        File icon = null;
        api.updateTrackerIcon(trackerId, icon);

        // TODO: test validations
    }
    
}
