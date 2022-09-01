package stepDefinitions.apiStep;

import io.cucumber.java.en.Given;
import io.restassured.response.Response;
import org.junit.Assert;
import utilities.ApiUtils;
import utilities.Authentication;
import java.util.HashMap;
import java.util.Map;

public class US27 {

    Response response;

    @Given("kullanici post request yapar")
    public void kullanici_post_request_yapar() {

        Map<String, Object> expectedDataMap = new HashMap<>();
        {
            expectedDataMap.put("name", "Esra");
            expectedDataMap.put("email", "patientteam54@gmail.com");
            expectedDataMap.put("subject", "API Test");
            expectedDataMap.put("message", "API Test Mesaji");
        }

        response = ApiUtils.postRequestMapper(Authentication.generateToken("healthprojectteam54", "AiGAYmJSJp.EN98"), "https://medunna.com/api/c-messages",expectedDataMap);
        response.prettyPrint();
    }

    @Given("kullanici message okumak icin get request yapar")
    public void kullanici_message_okumak_icin_get_request_yapar() {

        /*
        {
    "id": 236954,
    "name": "Esra",
    "email": "patientteam54@gmail.com",
    "subject": "API Test",
    "message": "API Test Mesaji"
}
         */
        response = ApiUtils.getRequest(Authentication.generateToken("healthprojectteam54", "AiGAYmJSJp.EN98"), "https://medunna.com/api/c-messages/236954");
        response.prettyPrint();

    }
    @Given("kullanici gelen message deserialize eder")
    public void kullanici_gelen_message_deserialize_eder() {

        Map<String, Object> expectedDataMap = new HashMap<>();
        {
            expectedDataMap.put("id", 236954);
            expectedDataMap.put("name", "Esra");
            expectedDataMap.put("email", "patientteam54@gmail.com");
            expectedDataMap.put("subject", "API Test");
            expectedDataMap.put("message", "API Test Mesaji");
        }


    }
    @Given("kullanici message dogrular")
    public void kullanici_message_dogrular() {

        Map<String, Object> actualDataMap = response.as(HashMap.class);
        System.out.println(actualDataMap);

        Assert.assertEquals(236954,actualDataMap.get("id"));
        Assert.assertEquals("Esra",actualDataMap.get("name"));
        Assert.assertEquals("patientteam54@gmail.com",actualDataMap.get("email"));
        Assert.assertEquals("API Test",actualDataMap.get("subject"));
        Assert.assertEquals("API Test Mesaji",actualDataMap.get("message"));

    }
}
