package com.restAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

/**
 * test id=Post
 * Description = Post request is used to create a resource on web server.
 **/
public class PostMethod {

    @Test
    public void postRequest(){

        //Creating JSON Objects here to post the response to the web server
        JSONObject object = new JSONObject();
        object.put("EMP_ID",1849);
        object.put("NAME","Lokesh Chandramurthy");

        System.out.println(object.toString());


        //Here i skipped then method to get actual status code
        RestAssured.baseURI = "https://reqres.in";
        Response response = RestAssured
                                                .given()
                                                    .header("","","")
                                                    .body(object.toJSONString())
                                                .post("/api/users");
                                                //.then()
                                                   // .statusCode(201);
        System.out.println(response.statusCode());


        ValidatableResponse response1 = RestAssured
                                                    .given()
                                                            .header("","","")
                                                            .body(object.toJSONString())
                                                    .post("/api/users")
                                                    .then()
                                                            .statusCode(201);


                                    }
}