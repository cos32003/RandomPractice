package PracticeCoding;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.io.BufferedReader;
import java.io.FileReader;

import static io.restassured.RestAssured.*;
import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

public class GetDistanceBetweenSFAndSeattle {
    String APIkey = "AIzaSyB3iZxOU3FZ_Uz9nfRin4IYAn5vcY8FNRs";
    String ExpectDistance = "San Francisco, CA, USA";
    int Response_Code_200 = 200;
    int Distance_value = 1299748;



    @Test
    public void TC1_verifyStatusCodeAndDistanceAndDestination(){
        baseURI = "https://maps.googleapis.com/maps/api/distancematrix";

        //Make a get call
        Response response = RestAssured.given()
                .queryParam("destinations","San+Francisco")
                .queryParam("key",APIkey).get("/json?origins=Seattle");

        System.out.print(response.asString());
        //Get status code from response
        int ActualStatusCode = response.getStatusCode();
        log.println("Log : " + ActualStatusCode);
        System.out.println(ActualStatusCode);
        //Verify status code
        Assert.assertEquals(ActualStatusCode,Response_Code_200);

        //Get destination address from response
       String ActualDestination = response.jsonPath().getString("destination_addresses[0]");
       System.out.println(ActualDestination);
       //Verify destination value
       Assert.assertEquals(ActualDestination,ExpectDistance);

        //Get value of distance from response
       String ActualDistance = response.jsonPath().getString("rows[0].elements[0].distance.value");
       System.out.println(ActualDistance);
       //Verify value of distance
       Assert.assertEquals(Integer.valueOf(ActualDistance),Distance_value);
    }
   // @Test
    //public void TC2(){
       // Gson gson = new Gson();
        //CreateIssuePayload mypojo = null;
        //BufferedReader bf = new BufferedReader(new FileReader("xx.json"));
        //mypojo = gson.fromJson(bf,CreateIssuePayload.class);
        //baseURI = "https://www.google.com";
        //Response response = RestAssured.given().header().queryParam().body(mypojo).post("/fsfdf=fdfd");

    //}
}
