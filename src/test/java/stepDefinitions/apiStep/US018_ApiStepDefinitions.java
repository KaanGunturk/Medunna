package stepDefinitions.apiStep;

import base_urls.MedunnaBaseUrl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.US018Pojo.ParentPojo;
import pojos.US018Pojo.User;
import utilities.*;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class US018_ApiStepDefinitions {

    Response response;

    @Given("Admin sends the GET request and gets the response with {string} endpoint")
    public void adminSendsTheGETRequestAndGetsTheResponseWithEndpoint(String endpoint) {
        response = ApiUtils.getRequest(Authentication.generateToken("healthprojectteam54", "AiGAYmJSJp.EN98"), "https://medunna.com/api/physicians/203613");
        response.prettyPrint();
    }

    @Then("verify expected data equals to actual data")
    public void verifyExpectedDataEqualsToActualData() {
        /*
        User dataPojo = new User("anonymousUser", "2022-07-24T16:41:39.742157Z", 138370, "staff0102",
                "Staff01", "Staff02", "hdkajdka@email.com", true, "en", null,
                null, "123-02-1234");

        ParentPojo expectedPojo = new ParentPojo("infotech", "2022-08-19T08:40:16.200281Z", 203613,
                "Sachiko", "Sanford", "1979-12-31T23:00:00Z", "2345566677", "FEMALE",
                "Opositive", "Suite 114 2194 Miss Street, O'Connerfurt, IA 34865", "", dataPojo,
                "ANESTHESIOLOGY", null, null, null, 500.00, "", null);



        ParentPojo actualPojo = JsonUtil.convertJsonToJavaObject(response.asString(), ParentPojo.class);

        Assert.assertEquals(200, response.statusCode());
        Assert.assertEquals(expectedPojo.getCreatedBy(), actualPojo.getCreatedBy());
        Assert.assertEquals(expectedPojo.getCreatedDate(), actualPojo.getCreatedDate());
        Assert.assertEquals(expectedPojo.getId(), actualPojo.getId());
        Assert.assertEquals(expectedPojo.getFirstname(), actualPojo.getFirstname());
        Assert.assertEquals(expectedPojo.getLastname(), actualPojo.getLastname());
        Assert.assertEquals(expectedPojo.getBirthDate(), actualPojo.getBirthDate());
        Assert.assertEquals(expectedPojo.getPhone(), actualPojo.getPhone());
        Assert.assertEquals(expectedPojo.getGender(), actualPojo.getGender());
        Assert.assertEquals(expectedPojo.getBloodGroup(), actualPojo.getBloodGroup());
        Assert.assertEquals(expectedPojo.getAdress(), actualPojo.getAdress());
        Assert.assertEquals(expectedPojo.getDescription(), actualPojo.getDescription());
        Assert.assertEquals(dataPojo.getCreatedBy(), actualPojo.getUser().getCreatedBy());
        Assert.assertEquals(dataPojo.getCreatedDate(), actualPojo.getUser().getCreatedDate());
        Assert.assertEquals(dataPojo.getId(), actualPojo.getUser().getId());
        Assert.assertEquals(dataPojo.getLogin(), actualPojo.getUser().getLogin());
        Assert.assertEquals(dataPojo.getFirstname(), actualPojo.getUser().getFirstname());
        Assert.assertEquals(dataPojo.getLastname(), actualPojo.getUser().getLastname());
        Assert.assertEquals(dataPojo.getEmail(), actualPojo.getUser().getEmail());
        Assert.assertEquals(dataPojo.getActivated(), actualPojo.getUser().getActivated());
        Assert.assertEquals(dataPojo.getLangKey(), actualPojo.getUser().getLangKey());
        Assert.assertEquals(dataPojo.getImageUrl(), actualPojo.getUser().getImageUrl());
        Assert.assertEquals(dataPojo.getResetDate(), actualPojo.getUser().getResetDate());
        Assert.assertEquals(dataPojo.getSsn(), actualPojo.getUser().getSsn());
        Assert.assertEquals(expectedPojo.getSpeciality(), actualPojo.getSpeciality());
        Assert.assertEquals(expectedPojo.getAppointments(), actualPojo.getAppointments());
        Assert.assertEquals(expectedPojo.getCountry(), actualPojo.getCountry());
        Assert.assertEquals(expectedPojo.getCstate(), actualPojo.getCstate());
        Assert.assertEquals(expectedPojo.getExamFee(), actualPojo.getExamFee());
        Assert.assertEquals(expectedPojo.getImage(), actualPojo.getImage());
        Assert.assertEquals(expectedPojo.getImageContentType(), actualPojo.getImageContentType());

         */

        Map<String, Object> userData = new HashMap<String, Object>();
        userData.put("createdBy", "anonymousUser");
        userData.put("createdDate", "2022-07-24T16:41:39.742157Z");
        userData.put("id", 138370);
        userData.put("login", "staff0102");
        userData.put("firstName", "Staff01");
        userData.put("lastName", "Staff02");
        userData.put("email", "hdkajdka@email.com");
        userData.put("activated", true);
        userData.put("langKey", "en");
        userData.put("imageUrl", null);
        userData.put("resetDate", null);
        userData.put("ssn", "123-02-1234");

        Map<String, Object> expectedDataMap = new HashMap<>();
        expectedDataMap.put("createdBy", "infotech");
        expectedDataMap.put("createdDate", "2022-08-19T08:40:16.200281Z");
        expectedDataMap.put("id", 203613);
        expectedDataMap.put("firstName", "Sachik");
        expectedDataMap.put("lastName", "Sanford");
        expectedDataMap.put("birthDate", "1979-12-31T23:00:00Z");
        expectedDataMap.put("phone", "2345566677");
        expectedDataMap.put("gender", "FEMALE");
        expectedDataMap.put("bloodGroup", "Opositive");
        expectedDataMap.put("adress", "Suite 114 2194 Miss Street, O'Connerfurt, IA 34865");
        expectedDataMap.put("description", "");
        expectedDataMap.put("user", userData);
        expectedDataMap.put("speciality", "ANESTHESIOLOGY");
        expectedDataMap.put("appointments", null);
        expectedDataMap.put("country", null);
        expectedDataMap.put("cstate", null);
        expectedDataMap.put("examFee", 500.00);
        expectedDataMap.put("image", "");
        expectedDataMap.put("imageContentType", null);
        System.out.println(expectedDataMap);

        //response = ApiUtils.postRequestMapper(Authentication.generateToken("healthprojectteam54", "AiGAYmJSJp.EN98"), "https://medunna.com/api/physicians/203613", expectedDataMap);

        Map<String, Object> actualDataMap = response.as(HashMap.class);
        System.out.println(actualDataMap);

        Assert.assertEquals(expectedDataMap.get("createdBy"), actualDataMap.get("createdBy"));
        Assert.assertEquals(expectedDataMap.get("createdDate"), actualDataMap.get("createdDate"));
        Assert.assertEquals(expectedDataMap.get("id"), actualDataMap.get("id"));
        Assert.assertEquals(expectedDataMap.get("firstName"), actualDataMap.get("firstName"));
        Assert.assertEquals(expectedDataMap.get("lastName"), actualDataMap.get("lastName"));
        Assert.assertEquals(expectedDataMap.get("birthDate"), actualDataMap.get("birthDate"));
        Assert.assertEquals(expectedDataMap.get("phone"), actualDataMap.get("phone"));
        Assert.assertEquals(expectedDataMap.get("gender"), actualDataMap.get("gender"));
        Assert.assertEquals(expectedDataMap.get("bloodGroup"), actualDataMap.get("bloodGroup"));
        Assert.assertEquals(expectedDataMap.get("adress"), actualDataMap.get("adress"));
        Assert.assertEquals(expectedDataMap.get("description"), actualDataMap.get("description"));
        Assert.assertEquals(userData.get("createdBy"), ((Map) actualDataMap.get("user")).get("createdBy"));
        Assert.assertEquals(userData.get("createdDate"), ((Map) actualDataMap.get("user")).get("createdDate"));
        Assert.assertEquals(userData.get("id"), ((Map) actualDataMap.get("user")).get("id"));
        Assert.assertEquals(userData.get("login"), ((Map) actualDataMap.get("user")).get("login"));
        Assert.assertEquals(userData.get("firstName"), ((Map) actualDataMap.get("user")).get("firstName"));
        Assert.assertEquals(userData.get("lastName"), ((Map) actualDataMap.get("user")).get("lastName"));
        Assert.assertEquals(userData.get("email"), ((Map) actualDataMap.get("user")).get("email"));
        Assert.assertEquals(userData.get("activated"), ((Map) actualDataMap.get("user")).get("activated"));
        Assert.assertEquals(userData.get("langKey"), ((Map) actualDataMap.get("user")).get("langKey"));
        Assert.assertEquals(userData.get("imageUrl"), ((Map) actualDataMap.get("user")).get("imageUrl"));
        Assert.assertEquals(userData.get("resetDate"), ((Map) actualDataMap.get("user")).get("resetDate"));
        Assert.assertEquals(userData.get("ssn"), ((Map) actualDataMap.get("user")).get("ssn"));
        Assert.assertEquals(expectedDataMap.get("speciality"), actualDataMap.get("speciality"));
        Assert.assertEquals(expectedDataMap.get("appointments"), actualDataMap.get("appointments"));
        Assert.assertEquals(expectedDataMap.get("country"), actualDataMap.get("country"));
        Assert.assertEquals(expectedDataMap.get("cstate"), actualDataMap.get("cstate"));
        Assert.assertEquals(expectedDataMap.get("examFee"), actualDataMap.get("examFee"));
        Assert.assertEquals(expectedDataMap.get("image"), actualDataMap.get("image"));
        Assert.assertEquals(expectedDataMap.get("imageContentType"), actualDataMap.get("imageContentType"));

    }

}
