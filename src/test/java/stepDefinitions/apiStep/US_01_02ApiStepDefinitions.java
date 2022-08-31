package stepDefinitions.apiStep;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Assert;
import pojos.US_01_02Pojo.US_01Staff_Country;
import pojos.US_01_02Pojo.US_01Staff_Cstate;
import pojos.US_01_02Pojo.US_01Staff_User;
import pojos.US_01_02Pojo.US_01_02Pojo;


import utilities.Authentication;
import utilities.ConfigReader;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class US_01_02ApiStepDefinitions {

    String token = Authentication.generateToken("healthprojectteam54", "AiGAYmJSJp.EN98");
    Response response;
    US_01Staff_User[] user;
    US_01Staff_Cstate[] cstate;
    US_01Staff_Country[] country;
    US_01_02Pojo[] pojo;

    @Given("Kullanici kayıtlı kişiler listesi için get request yapar")
    public void kullaniciKayıtlıKişilerListesiIçinGetRequestYapar() {
        response = given().headers("Authorization",
                        "Bearer " + token,
                        "Content-Type",
                        ContentType.JSON, "Accept", ContentType.JSON)
                .when().
                get("https://medunna.com/api/staff");
        response.then().assertThat().statusCode(200);
        response.prettyPrint();
    }

    @Then("Kullanici kayıtlı kişiler listesini de-seralazition eder")
    public void kullaniciKayıtlıKişilerListesiniDeSeralazitionEder() throws IOException {
        ObjectMapper obj = new ObjectMapper();

        pojo = obj.readValue(response.asString(), US_01_02Pojo[].class);


        for (int i = 0; i < pojo.length; i++) {
            System.out.println(pojo[i].getFirstName());
        }
    }
}




