package com.restAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;

/**
 * test id=Get
 * Description = This method sends a request to the already existing source from the web and returns the same which already exists.
 **/
public class GetRequest {
    //We do not use main method
    //As we are beginner im just using this to get clear understanding

    public static void main(String[] args) {

      Response response =   RestAssured.get("https://www.guru99.com/rest-assured.html");

      int statusCode = response.getStatusCode();
      String statusLine = response.getStatusLine();

        System.out.println(statusCode);
        System.out.println(statusLine);


    }
}
