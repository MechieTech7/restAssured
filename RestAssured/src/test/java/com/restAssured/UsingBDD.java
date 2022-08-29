package com.restAssured;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import org.testng.annotations.Test;

/**
 * test id=BDD
 * Description = Method Chaining method
 **/
public class UsingBDD {
    @Test
    public void usingBDDstyle(){

        RestAssured.baseURI = "https://reqres.in/api";

        ValidatableResponse response = RestAssured
                .given()
                     .param("","")
                     .header("","")
                .when()
                      .get("/users/2")
                .then()
                      .statusCode(200); //whenever we are using then we have use the validate response datatype
    }
}
