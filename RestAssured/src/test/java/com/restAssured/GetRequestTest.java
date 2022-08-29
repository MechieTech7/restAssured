package com.restAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ValidatableResponse;
import org.testng.annotations.Test;

/**
 * test id=01
 * Description = Get Method from the test server to read the file and store as file and to display to the user.
 **/
public class GetRequestTest {
    @Test
    public void getRequest(){

        //Getting response from the sample site
        Response response = RestAssured.get("https://reqres.in/api/users/2");

        //response.getBody(); both getbody and body performs same functions
        //Store it in a body
        ResponseBody responseBody = response.body();

        //As we known earlier, whenever using JSON , we use json objects to convert as a string
        //returning the values as user readable file as mentioned as Prettystring
        //Pretty string differs from string in Splitting up lines
        System.out.println(responseBody.asPrettyString());
    }
}
