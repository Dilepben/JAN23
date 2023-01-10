package com.api;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class Base_TestApi {
@Test
	public static void GetingRestA() {

	given()
	.baseUri("https://reqres.in")
	 .when()
	 .get("/api/users/2")
	 .prettyPrint();
	
	
	}
@Test
public static  void RestAssuredPOst() {

	given()
	  .baseUri("https://api.github.com")
	  .header("Accept","application/vnd.github+json")
	  .header("Authorization","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")
	  .body("{\r\n"
	  		+ "    \"name\": \"Dileepan\",\r\n"
	  		+ "    \"description\": \"This is your 7Th repo!\",\r\n"
	  		+ "    \"homepage\": \"https://github.com\",\r\n"
	  		+ "    \"private\": false,\r\n"
	  		+ "    \"is_template\": true\r\n"
	  		+ "}")
	  .when()
	  .post("/user/repos")
	  .prettyPrint();
}
	
}
