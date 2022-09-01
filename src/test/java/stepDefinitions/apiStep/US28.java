package stepDefinitions.apiStep;

import io.cucumber.java.en.Given;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.US28.US_28TestData;
import utilities.ApiUtils;
import utilities.Authentication;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class US28 {
    @Given("AEE Kullanici ulke eklendigini API ile test eder")
    public void aeeKullaniciUlkeEklendiginiAPIIleTestEder() {

        Response response = ApiUtils.getRequest(Authentication.generateToken("healthprojectteam54", "AiGAYmJSJp.EN98"), "https://medunna.com/api/countries/239732");
        response.prettyPrint();

        Map<String,Object> expectedDataMap = new HashMap<>();
        expectedDataMap.put("id",239732);
        expectedDataMap.put("name","Country54");

        Map<String,Object> actualDataMap = response.as(HashMap.class);

        assertTrue(actualDataMap.toString().contains("Country55"));
    }

    @Given("AEE Kullanıcı, API kullanarak mevcut ülkeleri güncelleyebildigi test edilir")
    public void aeeKullanıcıAPIKullanarakMevcutÜlkeleriGüncelleyebildigiTestEdilir() {

        US_28TestData expectedData = new US_28TestData();
        Map<String, Object> expectedDataMap = expectedData.exxpectedDataWhitMissingKeys(239732,"Country55");
        System.out.println(expectedDataMap);

        Response response = ApiUtils.putRequestMapl(Authentication.generateToken("healthprojectteam54", "AiGAYmJSJp.EN98"), "https://medunna.com/api/countries", expectedDataMap);
        response.prettyPrint();

        Map<String,Object> actualDataMap = response.as(HashMap.class);
        System.out.println(actualDataMap);

        Assert.assertEquals(expectedDataMap.get("name").toString(), actualDataMap.get("name").toString());

    }
}
