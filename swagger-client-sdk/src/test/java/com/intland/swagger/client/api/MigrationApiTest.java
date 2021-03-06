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
import com.intland.swagger.client.model.AttachmentMigrationRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MigrationApi
 */
@Ignore
public class MigrationApiTest {

    private final MigrationApi api = new MigrationApi();

    
    /**
     * Migrate attachments
     *
     * An endpoint for migrating attachments from a preconfigured source directory.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void migrateAttachmentsTest() throws ApiException {
        AttachmentMigrationRequest attachmentMigrationRequest = null;
        api.migrateAttachments(attachmentMigrationRequest);

        // TODO: test validations
    }
    
}
