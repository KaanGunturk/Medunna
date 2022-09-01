package stepDefinitions.apiStep;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.junit.Assert;
import utilities.ApiUtils;
import utilities.Authentication;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.path.json.JsonPath.given;

public class US17<testItems> {


    Response response;

    @Given("Nhl Admin Test Items  icin GET request yapar")
    public void nhl_admin_test_ıtems_icin_get_request_yapar() {
        response = ApiUtils.getRequest(Authentication.generateToken("healthprojectteam54", "AiGAYmJSJp.EN98"), "https://medunna.com/api/c-test-items/205486");
        response.prettyPrint();
    }

    @And("Nhl Admin gelen Test Items  datayi deserialize eder")
    public void nhl_admin_gelen_test_ıtems_datayi_deserialize_eder() throws JsonProcessingException {

        /*
        {
    "createdBy": "healthprojectteam54",
    "createdDate": "2022-08-19T15:13:59.756309Z",
    "id": 205486,
    "name": "pembe_hemoglobin",
    "description": "     ",
    "price": 150.00,
    "defaultValMin": "15",
    "defaultValMax": "19"
}

         */


        Map<String, Object> expectedDataMap = new HashMap<>();

        expectedDataMap.put("createdBy", "healthprojectteam54");
        expectedDataMap.put("createdDate", "2022-08-19T15:13:59.756309Z");
        expectedDataMap.put("id", 205486);
        expectedDataMap.put("name", "pembe_hemoglobin");
        expectedDataMap.put("description", "     ");
        expectedDataMap.put("price", 150.00);
        expectedDataMap.put("defaultValMin", "15");
        expectedDataMap.put("defaultValMax", "19");

        // System.out.println(expectedDataMap);


    }

    @Then("Nhl Admin Test Items i dogrular")
    public void nhl_admin_test_ıtems_i_dogrular() {


        Map<String, Object> actualDataMap = response.as(HashMap.class);
        System.out.println(actualDataMap);

        Assert.assertEquals("healthprojectteam54", actualDataMap.get("createdBy"));

        Assert.assertEquals("2022-08-19T15:13:59.756309Z", actualDataMap.get("createdDate"));

        Assert.assertEquals(205486, actualDataMap.get("id"));

        Assert.assertEquals("pembe_hemoglobin", actualDataMap.get("name"));

        Assert.assertEquals("     ", actualDataMap.get("description"));

        Assert.assertEquals(150.00, actualDataMap.get("price"));

        Assert.assertEquals("15", actualDataMap.get("defaultValMin"));

        Assert.assertEquals("19", actualDataMap.get("defaultValMax"));

    }

     @Given("Nhl Admin ExpectedData olusturur ve POST request yapar")
     public void nhl_admin_expected_data_olusturur_ve_post_request_yapar() {

         Map<String, Object> expectedDataMap = new HashMap<>();

         {
             expectedDataMap.put("createdBy", "healthprojectteam54\n");

             expectedDataMap.put("createdDate", "2022-08-25T15:13:59.756309Z\n");

             expectedDataMap.put("name", "yesil_albumin\n");

             expectedDataMap.put("description", "     \n");

             expectedDataMap.put("price", "200\n");

             expectedDataMap.put("defaultValMin", "11\n");

             expectedDataMap.put("defaultValMax", "17\n");

         }

             System.out.println(expectedDataMap);


         response = ApiUtils.postRequestMapper(Authentication.generateToken("healthprojectteam54",
                 "AiGAYmJSJp.EN98"), "https://medunna.com/api/c-test-items", expectedDataMap);
                 //  System.out.println(expectedDataMap);

     }

    @Then("Nlh Admin olusturdugu datayi GetRequest yapar")
    public void nlh_admin_olusturdugu_datayi_get_request_yapar() {


        response = ApiUtils.getRequest(Authentication.generateToken("healthprojectteam54",
                "AiGAYmJSJp.EN98"), "https://medunna.com/api/c-test-items/232857");
        response.prettyPrint();

    }


    @And("Nhl Admin ExpectedData ile ActualData arasinda dogrulama yapar")
    public void nhl_admin_expected_data_ile_actual_data_arasinda_dogrulama_yapar() {

/*{
        id=232857,
        createdDate=2022-08-25T15:13:59.756309Z
                , createdBy=healthprojectteam54
                , price=200
                , name=yesil_albumin
                , defaultValMin=11
                , description=
                , defaultValMax=17 */

        Map<String, Object> expectedDataMap = new HashMap<>();

        {
            expectedDataMap.put("createdBy", "healthprojectteam54");

            expectedDataMap.put("createdDate", "2022-08-25T15:13:59.756309Z");

            expectedDataMap.put("id", 232857);

            expectedDataMap.put("price", 200);

            expectedDataMap.put("name", "yesil_albumin");

            expectedDataMap.put("description", " ");

            expectedDataMap.put("defaultValMin", "11");

            expectedDataMap.put("defaultValMax", "17");

            System.out.println(expectedDataMap);


        }

        /*Map<String, Object> actualDataMap = response.as(HashMap.class);
        System.out.println(actualDataMap);

        Assert.assertEquals("healthprojectteam54", actualDataMap.get("createdBy"));

        Assert.assertEquals("2022-08-25T15:13:59.756309Z", actualDataMap.get("createdDate"));

        Assert.assertEquals(232857, actualDataMap.get("id"));

        Assert.assertEquals(200, actualDataMap.get("price"));

        Assert.assertEquals("yesil_albumin", actualDataMap.get("name"));

        Assert.assertEquals("11", actualDataMap.get("defaultValMin"));

        Assert.assertEquals(" ", actualDataMap.get("description"));

        Assert.assertEquals("17", actualDataMap.get("dafaultValMax"));
*/
    }
}








