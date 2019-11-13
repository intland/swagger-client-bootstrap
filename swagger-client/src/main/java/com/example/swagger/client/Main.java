package com.example.swagger.client;

import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.auth.HttpBasicAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

	private static Logger logger = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {
		initApiClient();
		logger.info("CodeBeamer Swagger client is initialized.");
	}

	private static void initApiClient() {
		ApiClient defaultClient = Configuration.getDefaultApiClient();
		defaultClient.setBasePath("http://localhost:8080/cb/api");

		HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
		basicAuth.setUsername("admin");
		basicAuth.setPassword("secret");
	}
}