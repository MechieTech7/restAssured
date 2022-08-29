package com.restAssured;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

/**
 * test id=Matchers/Hamcrest Matchers
 * Description = This is used to validate and match the resources in json files in existing resources.
 **/
public class HamcrestMatchers {


    @Test
    public void checkLeagueID(){

        get("http://localhost:3000/data")
                .then()
                 .body("leagueId",equalTo(11));

    }

    @Test
    public void checkHomeTeam(){

        get("http://localhost:3000/data")
                .then()
                    .body("homeTeam",equalToIgnoringCase("CSK"));
    }

    @Test
    public void checkTrophies(){

        baseURI = "http://localhost:3000";

        given()
                .when().get("/data")
                .then().body("Trophies",equalTo(4));
        //TIP: If we are using equal to value for decimal values, must append f after the value.
    }

    @Test
    public void checkRunTimeStatus(){
        //To check how many seconds it takes to validate the resources
        get("http://localhost:3000/data")
                .then()
                .time(lessThan(1L), TimeUnit.SECONDS);

    }

    @Test
    public void checkArraySize() {

        baseURI = "http://localhost:3000";

        given()
                .when().get("/odds")
                .then().body("", hasSize(2));
    }

    @Test
    public void checkArraySizeIsEmpty() {

        baseURI = "http://localhost:3000";

        given()
                .when().get("/odds")
                .then().body("", empty());
    }

}
