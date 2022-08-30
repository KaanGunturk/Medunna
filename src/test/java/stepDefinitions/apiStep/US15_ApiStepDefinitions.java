package stepDefinitions.apiStep;
/*
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import lombok.*;
import org.junit.Assert;
import org.junit.Test;
import pojos.*;
import pojos.ortakPojo.Patient;
import utilities.ConfigReader;

import java.util.HashMap;
import java.util.Map;

import static hooks.Hooks.spec;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.preemptive;
import static utilities.Authentication.generateToken;
import static utilities.WriteToTxt.saveRegistrantData;

public class US15_ApiStepDefinitions {
    static RequestSpecification specMed;
    static Response response;
    static Patient expectedPatient;

    public static void main(String[] args) throws JsonProcessingException {

        specMed = new RequestSpecBuilder().
                setBaseUri(ConfigReader.getProperty("medunnaUrl")).
                build();

        specMed.pathParams("param1", "api", "param2", "patients", "param3", "91930");

        expectedPatient = new Patient("", "", 91930
                , "Yasemin", "Patient", "2022-04-28T07:00:00Z", "100-200-1501", "FEMALE", "Bpositive", "1232 Sandia ave. Fremont", "yaseminpatient@gmail.com", "YaseminPatient", null, null, null);

        System.out.println("expectedPatient = " + expectedPatient);

        response = given().contentType(ContentType.JSON)
                .spec(specMed)
                .header("Authorization", "Bearer " + generateToken("UserTeam54","UserTeam54"))
                .when().get("/{param1}/{param2}/{param3}");

        response.prettyPrint();

        response.then().statusCode(200);
        ObjectMapper obj = new ObjectMapper();
        Patient actualPatient = obj.readValue(response.asString(), Patient.class);
        System.out.println("actualPatient = " + actualPatient);
        Assert.assertEquals(expectedPatient.getId(), actualPatient.getId());
        Assert.assertEquals(expectedPatient.getFirstName(), actualPatient.getFirstName());
        Assert.assertEquals(expectedPatient.getLastName(), actualPatient.getLastName());
        Assert.assertEquals(expectedPatient.getBirthDate(), actualPatient.getBirthDate());
        Assert.assertEquals(expectedPatient.getPhone(), actualPatient.getPhone());
        Assert.assertEquals(expectedPatient.getGender(), actualPatient.getGender());
        Assert.assertEquals(expectedPatient.getBloodGroup(), actualPatient.getBloodGroup());
        Assert.assertEquals(expectedPatient.getAdress(), actualPatient.getAdress());
        Assert.assertEquals(expectedPatient.getEmail(), actualPatient.getEmail());
        Assert.assertEquals(expectedPatient.getDescription(), actualPatient.getDescription());

    }

    private static String generateToken(String username, String password) {
        Map<String, Object> map = new HashMap<>();        map.put("username", username);        map.put("password", password);        map.put("rememberme", true);
        String endPoint = "https://www.medunna.com/api/authenticate";
        Response response = given().contentType(ContentType.JSON).body(map).when().post(endPoint);
        JsonPath token = response.jsonPath();
        return token.getString("id_token");
    }

    //////  TC01506
    @Given("yyApi Sign in as an Admin and set the path params for register")
    public void api_sign_in_as_an_admin_and_set_the_path_params_for_register() {
        specMed = new RequestSpecBuilder().
                setBaseUri(ConfigReader.getProperty("medunnaUrl")).
                build();
        specMed.pathParams("param1", "api", "param2", "patients");
    }

    @Given("yyApi Enter expected data for patient")
    public void api_enter_expected_data_for_patient() {
        expectedPatient.setFirstName("PostMehlika");
        expectedPatient.setLastName("PostPatient");
        expectedPatient.setPhone("111-222-1501");
        expectedPatient.setAdress("Yeni adres; San Francisco");
        expectedPatient.setEmail("PostMEhlika@mail.com");
        expectedPatient.setDescription("Post Description");
        // response.prettyPrint();
    }

    @Given("yyApi End request and receives response for register")
    public void api_end_request_and_receives_response_for_register() {

        response = given().spec(spec).contentType(ContentType.JSON)
                .body(expectedPatient)
                .when()
                .post("/{param1}/{param2}");
        System.out.println("actual " + expectedPatient);
        response.prettyPrint();
    }

    @Given("yyApi Save all API information for register")
    public void api_save_all_api_information_for_register() {
        try {
            response.then().statusCode(201);
            System.out.println(expectedPatient.toString());
        } catch (Exception e) {

        }
    }

    @Then("yyApi Verify API records for register")
    public void api_verify_api_records_for_register() throws JsonProcessingException {
        response.then().statusCode(201);
        response.prettyPrint();

        ObjectMapper obj = new ObjectMapper();
        Patient actualPatient = obj.readValue(response.asString(), Patient.class);
        System.out.println("Actual Data: " + actualPatient);
        Assert.assertEquals(expectedPatient.getFirstName(), actualPatient.getFirstName());
        Assert.assertEquals(expectedPatient.getLastName(), actualPatient.getLastName());
        Assert.assertEquals(expectedPatient.getEmail(), actualPatient.getEmail());
        Assert.assertEquals(expectedPatient.getDescription(), actualPatient.getDescription());
        Assert.assertEquals(expectedPatient.getAdress(), actualPatient.getAdress());
        Assert.assertEquals(expectedPatient.getGender(), actualPatient.getGender());
    }

    @Then("yyApi There are no swagger documantation for register")
    public void api_there_are_no_swagger_documantation_for_register() {
        System.out.println("there are no swagger documantation for register");
    }
}*/