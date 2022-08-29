package com.restAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

/**
 * test id=NewServer
 * Description = Tried all the operations here
 **/
public class CreatedServer {
    @Test
    public void usingBDDstyle(){

        RestAssured.baseURI = "http://localhost:3000/";

        ValidatableResponse response = RestAssured
                .given()
                .param("","")
                .header("","")
                .when()
                .get("employees")
                .then()
                .statusCode(200); //whenever we are using then we have use the validate response datatype
    }
    @Test
    public void postRequest(){

        //Creating JSON Objects here to post the response to the web server
        JSONObject object = new JSONObject();
        object.put("EMP_ID",1849);
        object.put("NAME","Lokesh Chandramurthy");

        System.out.println(object.toString());
        RestAssured.baseURI = "http://localhost:3000/";
        ValidatableResponse response1 = RestAssured
                .given()
                .header("","","")
                .body(object.toJSONString())
                .post("employees")
                .then()
                .statusCode(201);
    }
    @Test
    public  void patchRequest(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Emp-ID",1849);
        jsonObject.put("Name","Lokesh");

        RestAssured.baseURI = "http://localhost:3000/";

        RestAssured.given()
                .body(jsonObject.toJSONString())
                .patch("employees")
                .then().statusCode(404);
    }
    @Test
    public  void deleteRequest(){

        baseURI = "http://localhost:3000/";

        given()
                .when()
                .delete("posts")
                .then().statusCode(404);
    }
}
