package stepDefinitions.apiStep;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.ortakPojo.Registrant;
import utilities.ApiUtils;
import utilities.Authentication;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static io.restassured.RestAssured.given;

public class US28Nihal {

     Response response;
    @Given("Nhl Admin Country icin GET request yapar")
    public void nhl_admin_country_icin_get_request_yapar() {

        response = ApiUtils.getRequest(Authentication.generateToken("healthprojectteam54", "AiGAYmJSJp.EN98"), "https://medunna.com/api/countries/238469");
        response.prettyPrint();

    }
    @And("Nhl Admin gelen datayi deserialize eder")
    public void nhl_admin_gelen_datayi_deserialize_eder() {

        /*{

    "id": 238469,

    "name": "Holland"
    }
*/
        Map<String, Object> expectedDataMap = new HashMap<>();

        expectedDataMap.put("id",238469);
        expectedDataMap.put("name","Holland");

    }
    @Then("Nhl Admin Country dogrular")
     public void nhl_admin_country_dogrular() {


        Map<String, Object> actualDataMap = response.as(HashMap.class);
        System.out.println(actualDataMap);

        Assert.assertEquals(238469, actualDataMap.get("id"));
        Assert.assertEquals("Holland", actualDataMap.get("name"));

    }
       // =================================================================================================

       @Given("Nhl Admin mevcut ulkeler icin Get request yapar")
        public void nhl_admin_mevcut_ulkeler_icin_get_request_yapar() {


       //    response = ApiUtils.getRequest(Authentication.generateToken("healthprojectteam54", "AiGAYmJSJp.EN98"), "https://medunna.com/api/countries");
       //    response.prettyPrint();
       }

        @Given("Nhl Admin mevcut ulkeyi gunceller")
        public void nhl_admin_mevcut_ulkeyi_gunceller() {

            response = ApiUtils.getRequest(Authentication.generateToken("healthprojectteam54", "AiGAYmJSJp.EN98"), "https://medunna.com/api/countries/236623");
           // response.prettyPrint();
            System.out.println();

        }
        @Then("Nhl Admin guncellenen ulkeyi dogrular")
        public void nhl_admin_guncellenen_ulkeyi_dogrular() {

        }
    }

