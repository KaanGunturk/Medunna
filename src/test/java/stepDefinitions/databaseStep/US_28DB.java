package stepDefinitions.databaseStep;

import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utilities.DatabaseUtility;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertTrue;

public class US_28DB {
    List<Object> actualData = new ArrayList<>();

    @Given("Kullanici  database baglanir")
    public void kullanici_database_baglanir() {
        DatabaseUtility.createConnection();
    }

    @Given("Kullanici database query gonderir")
    public void kullanici_database_query_gonderir() {
        String query = "select * from country";
        actualData = DatabaseUtility.getColumnData(query, "name");
    }

    @Then("Kullanici expected data ile actual datayi karsilastirir")
    public void kullaniciExpectedDataIleActualDatayiKarsilastirir() {
        List<Object> expectedData = new ArrayList<>();
        expectedData.add("Country55");

        System.out.println(expectedData);
        System.out.println(actualData);

        assertTrue(actualData.toString().contains(expectedData.get(0).toString()));
    }
}


