package utilities;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class Authentication {
    public static void main(String[] args) {

        String guncelToken=generateToken("UserTeam54","UserTeam54");
        System.out.println(guncelToken);
    }


    public static String generateToken(String username, String password) {
        Map<String, Object> map = new HashMap<>();        map.put("username", username);        map.put("password", password);        map.put("rememberme", true);
        String endPoint = "https://www.medunna.com/api/authenticate";
        Response response = given().contentType(ContentType.JSON).body(map).when().post(endPoint);
        JsonPath token = response.jsonPath();
        return token.getString("id_token");
    }


    public static String generateToken(){
        RequestSpecification spec = new RequestSpecBuilder().setBaseUri("https://www.medunna.com").build();

        Map<String,Object> data=new HashMap<String,Object>();
        data.put("username","team_60");
        data.put("password","123456tr*");
        data.put("rememberMe",true);


        spec.pathParams("first","api","second","authenticate");

        Response response=given().spec(spec).contentType(ContentType.JSON).body(data).when().post("/{first}/{second}");

        JsonPath json=response.jsonPath();

        System.out.println("token :"+json.getString("id_token"));


        return json.getString("id_token");
    }

}
