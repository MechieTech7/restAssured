package com.restAssured;

import io.restassured.RestAssured;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

/**
 * test id=Patch
 * Description = This request will update the resource partially in the existing resources.
 **/
public class PatchRequest {

    @Test
    public  void patchRequest(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Emp-ID",1849);
        jsonObject.put("Name","Lokesh");

        RestAssured.baseURI = "https://reqres.in/";

        RestAssured.given()
                .body(jsonObject.toJSONString())
                .patch("api/users/2")
                .then().statusCode(200);
    }
}
