package stepDefinitions.apiStep;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;

public class US10 {

    Response response;

    //String TokenYeni="eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJwaHlzaWNpYW50ZWFtNTQiLCJhdXRoIjoiUk9MRV9QSFlTSUNJQU4iLCJleHAiOjE2NjE2NzA0OTV9.-5AiS-lTzNzGEmGBt1Srbgsw0NFgRbmWtxVr6kFGqHQPprfr6SMTHzHCoYOczWPcAA0J8k2eWhQf156MYn7sEA";
    @Given("Doktor Nihal hasta randevulari icin GetRequest yapar")
    public void doktor_nihal_hasta_randevulari_icin_get_request_yapar() {


        response = given().headers(
                "Authorization",
                "Bearer " + generateToken("PhysicianTeam54", "PhysicianTeam54"),
                "Content-Type", ContentType.JSON,
                "Accept", ContentType.JSON
        ).when().get("https://medunna.com/api/appointments/172716");
        response.prettyPrint();
        System.out.println(172716);
    }


    @Given("Doktor Nihal gelen datayi deserialize eder")
    public void doktor_nihal_gelen_datayi_deserialize_eder() throws JsonProcessingException {


/*    "createdBy": "hasta54",
    "createdDate": "2022-08-10T11:22:51.025159Z",
    "id": 172716,
    "startDate": "2022-08-25T00:00:00Z",
    "endDate": "2022-08-25T01:00:00Z",
    "status": "PENDING",
   */

        Map<String, Object> expectedDataMap = new HashMap<>();

        expectedDataMap.put("createdBy", "hasta54");

        expectedDataMap.put("id", 172716);

        expectedDataMap.put("startDate", "2022-08-25T00:00:00Z");

        expectedDataMap.put("endDate", "2022-08-25T01:00:00Z");

         expectedDataMap.put("status", "PENDING");

    }


     @Then("Doktor Nihal hasta randevulari test eder")
    public void doktor_nihal_hasta_randevulari_test_eder() {

         Map<String, Object> actualDataMap = response.as(HashMap.class);
         System.out.println(actualDataMap);

         Assert.assertEquals("hasta54", actualDataMap.get("createdBy"));

         Assert.assertEquals(172716, actualDataMap.get("id"));

         Assert.assertEquals("2022-08-25T00:00:00Z", actualDataMap.get("startDate"));

         Assert.assertEquals("2022-08-25T01:00:00Z", actualDataMap.get("endDate"));

         Assert.assertEquals("PENDING",actualDataMap.get("status"));



     }
}



