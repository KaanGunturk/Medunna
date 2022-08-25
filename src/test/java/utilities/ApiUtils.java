package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.ortakPojo.Registrant;


import java.util.Map;

import static io.restassured.RestAssured.given;

public class ApiUtils {



    public static Response getRequest(String token,String endpoint ){

        Response response = given().headers(
                "Authorization",
                "Bearer " + token,
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON).when().get(endpoint);


        return  response;

    }

    public static Response putRequest(String token, String endpoint, Registrant registrant){

        Response response = given().headers(
                "Authorization",
                "Bearer " + token,
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON).contentType(ContentType.JSON).body(registrant).when().put(endpoint);


        return  response;

    }

    public static Response postRequestPojo(String token, String endpoint, Registrant registrant){

        Response response = given().headers(
                "Authorization",
                "Bearer " + token,
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON).contentType(ContentType.JSON).body(registrant).when().post(endpoint);


        return  response;

    }

    public static Response postRequestMapper(String token, String endpoint, Map<String, Object> gonderecegimMap){

        Response response = given().headers(
                "Authorization",
                "Bearer " + token,
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON).contentType(ContentType.JSON).body(gonderecegimMap).when().post(endpoint);


        return  response;

    }

    public static Response deleteRequest(String token, String endpoint){

        Response response = given().headers(
                "Authorization",
                "Bearer " + token,
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON).when().delete(endpoint);


        return  response;

    }


}