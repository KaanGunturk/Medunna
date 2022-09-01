package stepDefinitions.apiStep;

import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.US15.US15_PatientPojo;
import utilities.AuthenticationUS15;

import static io.restassured.RestAssured.given;

public class US15 {
    Response response;
    String ID;

    @Given("EA Kullanici {string} Medunna Api Endpointinden hastalari goruntuler")
    public void ea_kullanici_medunna_api_endpointinden_hastalari_goruntuler(String endpoint) {
        response = given().headers(
                        "Authorization",
                        "Bearer " + AuthenticationUS15.generateToken(),
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON)
                .when()
                .get(endpoint)
                .then()
                .extract()
                .response();
        response.prettyPrint();

    }
    @Given("EA Kullanici {string} Medunna Api Endpointine,{string} li hastanin bilgilerinin  {string}, {string}, {string}, {string}, {string} oldugunu dogrular")
    public void ea_kullanici_medunna_api_endpointine_li_hastanin_bilgilerinin_oldugunu_dogrular(String endPoint, String id, String firstname, String lastname, String email, String phone, String address) {

        US15_PatientPojo expectedData = new US15_PatientPojo(firstname,lastname,phone,address,email);


        response = given().headers(
                        "Authorization",
                        "Bearer " + AuthenticationUS15.generateToken(),
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON)
                .when()
                .get(endPoint+"/"+id)
                .then()
                .extract()
                .response();
        response.prettyPrint();

        US15_PatientPojo actualData = response.as(US15_PatientPojo.class);

        System.out.println("expectedData = " + expectedData);
        System.out.println("actualData = " + actualData);

        Assert.assertEquals(expectedData.getFirstName(),actualData.getFirstName());
        Assert.assertEquals(expectedData.getLastName(),actualData.getLastName());
        Assert.assertEquals(expectedData.getEmail(),actualData.getEmail());
        Assert.assertEquals(expectedData.getPhone(),actualData.getPhone());
        Assert.assertEquals(expectedData.getAdress(),actualData.getAdress());

    }
}
