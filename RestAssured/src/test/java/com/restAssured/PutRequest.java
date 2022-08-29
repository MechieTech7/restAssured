package com.restAssured;

import io.restassured.RestAssured;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

/**
 * test id=Put
 * Description = This request is used to update the existing resources into complete new one.
 **/
public class PutRequest {


    @Test
    public  void putRequest(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Emp-ID",1849);
        jsonObject.put("Name","Lokesh");

        RestAssured.baseURI = "https://reqres.in/";

        RestAssured.given()
                .body(jsonObject.toJSONString())
                .put("api/users/2")
                .then().statusCode(200);
    }
}
