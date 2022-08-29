package com.restAssured;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;


// if we are gonna import static restAssured then there is no need of using restAssured in a script
/**
 * test id=Delete
 * Description = This request is used to delete the existing resources from the server and it cannot be accessed again
 **/
public class DeleteRequest {
    @Test
    public  void deleteRequest(){

        baseURI = "https://reqres.in/";

        given()
                .when()
                .delete("api/users/2")
                .then().statusCode(204);
    }
}

