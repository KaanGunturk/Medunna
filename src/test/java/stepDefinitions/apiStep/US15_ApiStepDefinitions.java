package stepDefinitions.apiStep;

import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
<<<<<<< Updated upstream
import io.restassured.specification.RequestSpecification;

=======
>>>>>>> Stashed changes
import org.junit.Assert;
import pojos.US15_Pojo.US15_PatientPojo;
import utilities.AuthenticationUS15;

import static io.restassured.RestAssured.given;
<<<<<<< Updated upstream
import static io.restassured.RestAssured.preemptive;
import static utilities.Authentication.generateToken;
import static utilities.WriteToTxt.saveRegistrantData;

public class US15_ApiStepDefinitions {
    /*
    static RequestSpecification specMed;
    static Response response;
    static Patient expectedPatient;

    public static void main(String[] args) throws JsonProcessingException {

        specMed = new RequestSpecBuilder().
                setBaseUri(ConfigReader.getProperty("medunnaUrl")).
                build();

        specMed.pathParams("param1", "api", "param2", "patients", "param3", "91930");
=======
>>>>>>> Stashed changes


public class US15_ApiStepDefinitions {
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

<<<<<<< Updated upstream
    @Then("yyApi There are no swagger documantation for register")
    public void api_there_are_no_swagger_documantation_for_register() {
        System.out.println("there are no swagger documantation for register");
    }*/
=======

>>>>>>> Stashed changes
}
