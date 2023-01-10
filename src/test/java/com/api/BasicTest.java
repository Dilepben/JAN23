package com.api;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class BasicTest {
	private static Map<String, String> getheaders(){
		Map<String , String> map = new HashMap<String, String>();
		map.put("Accept", "application/vnd.github+json");
		map.put("Authorization", "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");
		
		return map;
		
	}
		@Test
		private void getRepodeatil() {
			RestAssured.baseURI = "https://api.github.com";
			RestAssured
			.given()
			.header("Accept", "application/vnd.github+json")
			.when()
			.get("/repos/Dilepben/Dileepan")
			.then()
			.statusCode(200);
			
			RestAssured.baseURI= "https://api.github.com";
			 response = RestAssured
			.given()
			.headers(getheaders())
			.when()
			.get("/repos/Dilepben/Dileepan")
			.then()
			.log()
			.all()
			.extract()
			.response();
			
			int statusCode = response.getStatusCode();
			
			Assert.assertEquals(statusCode, Constants.HTTP_STATUS_OK);
			System.out.println(response.asPrettyString());
			
			
			
}
}

