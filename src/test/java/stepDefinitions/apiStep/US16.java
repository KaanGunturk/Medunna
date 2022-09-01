package stepDefinitions.apiStep;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import pojos.US16.Room;
import utilities.ApiUtils;
import utilities.Authentication;
import utilities.ConfigReader;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;
import static utilities.Authentication.generateToken;

public class US16 {

    Response response;


    @Given("kullanici roomlar icin post request yapar")
    public void kullanici_roomlar_icin_post_request_yapar() {

        Map<String, Object> expectedDataMap = new HashMap<>();

        {
            /*
           "createdBy": "userteam54",
    "createdDate": "2022-08-29T18:28:52.937484Z",
    "id": 246872,
    "roomNumber": 76438,
    "roomType": "DELUXE",
    "status": true,
    "price": 12900,
    "description": "Oda olusturdum"

             */
            expectedDataMap.put("createdBy","userteam54");
            expectedDataMap.put("createdDate","2022-08-29T18:28:52.937484Z");
            expectedDataMap.put( "roomNumber",76438);
            expectedDataMap.put("roomType","DELUXE");
            expectedDataMap.put("status",true);
            expectedDataMap.put("price",12900);
            expectedDataMap.put("description","Oda olusturdum");

        }
        response = ApiUtils.postRequestMapper(Authentication.generateToken("healthprojectteam54",
                "AiGAYmJSJp.EN98"), "https://medunna.com/api/rooms", expectedDataMap);
         //System.out.println(expectedDataMap);

    }

    @Given("kullanici olusturdugu datayi okumak icin get request yapar")
    public void kullanici_olusturdugu_datayi_okumak_icin_get_request_yapar() {

        response = ApiUtils.getRequest(Authentication.generateToken("healthprojectteam54",
                "AiGAYmJSJp.EN98"), "https://medunna.com/api/rooms/246872");

        response.prettyPrint();


    }

    @Then("kullanici post request validation yapar")
    public void kullanici_post_request_validation_yapar() {

        Map<String, Object> expectedDataMap = new HashMap<>();

        /*"createdBy": "userteam54",
                "createdDate": "2022-08-29T18:28:52.937484Z",
                "id": 246872,
                "roomNumber": 76438,
                "roomType": "DELUXE",
                "status": true,
                "price": 12900,
                "description": "Oda olusturdum"

        {

         */
            expectedDataMap.put("createdBy", "userteam54");
            expectedDataMap.put("createdDate","2022-08-29T18:28:52.937484Z");
            expectedDataMap.put("id", 246872);
            expectedDataMap.put( "roomNumber",76438);
            expectedDataMap.put("roomType","DELUXE");
            expectedDataMap.put("status",true);
            expectedDataMap.put("price",12900);
            expectedDataMap.put( "description","Oda olusturdum");

        }


        @Given("kullanici roomlar icin put request yapar")
    public void kullanici_roomlar_icin_put_request_yapar() {

        Room roomPut = new Room();

        roomPut.setId(246872);
        roomPut.setRoomType("DELUXE");
        roomPut.setRoomNumber(76438);
        roomPut.setDescription("API ILE DEGISTIRDIM");
        roomPut.setStatus(true);
        roomPut.setPrice(12900);


        response=given().headers("Authorization",
                "Bearer "+generateToken(),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON).body(roomPut).contentType(ContentType.JSON).
                when().put(ConfigReader.getProperty("roomPut_endpoint"));
    }


    @Then("kullanici put request validation yapar")
    public void kullanici_put_request_validation_yapar() {
        response.then().assertThat().
                body("price",equalTo(12900)).
                body("roomNumber",equalTo(76438)).
                body("roomType",equalTo("DELUXE")).
                body("status",equalTo(true)).
                body("description",equalTo("API ILE DEGISTIRDIM"));


    }


    /*
    Room[] rooms;

    Room roomGet ;

    RoomPost roomPost = new RoomPost();

    Room roomPut = new Room();



    //GET
    @Given("kullanici roomlar icin get request yapar")
    public void kullanici_roomlar_icin_get_request_yapar() {

        response = given().headers("Authorization",
                "Bearer " + generateToken(),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON).when().get(ConfigReader.getProperty("room_endpoint"));

        response.prettyPrint();


    }

    @Given("kullanici gelen room datayi deserialize eder")
    public void kullanici_gelen_room_datayi_deserialize_eder() throws Exception {


        ObjectMapper obj = new ObjectMapper();//pojo yu fasterxml den import yaptik o yuzden burada da ObjectMapper i fasterxml den kullaniyoryuz
        //ObjectMapper readValue yontemiyle Jsondan gelen obj yi Javaya ceviricek
        rooms = obj.readValue(response.asString(), Room[].class);

        System.out.println("kac tane test item oldugunu gosterir " + rooms.length);//864 yaptigimda bu kadar test item vardi

        for (int i = 0; i < rooms.length; i++) {
            System.out.println("CreatedBy ==>" + rooms[i].getCreatedBy());
            System.out.println("CreatedDate==> " + rooms[i].getCreatedDate());
            System.out.println("id ==> " + rooms[i].getId());
            System.out.println("Description ==>" + rooms[i].getDescription());
            System.out.println("Price ==>" + rooms[i].getPrice());
            System.out.println(rooms[i].getStatus());
            System.out.println(rooms[i].getRoomNumber());
            System.out.println(rooms[i].getRoomType());

            System.out.println("==========================================================================");





        ObjectMapper obj=new ObjectMapper();

        roomGet=obj.readValue(response.asString(),Room.class);

        System.out.println(roomGet.getId().toString());




    }

    @Then("kullanici room datasini validate eder")
    public void kullanici_room_datasini_validate_eder() {

    }


    //POST

    @Given("kullanici roomlar icin post request yapar")
    public void kullaniciRoomlarIcinPostRequestYapar() {
        roomPost.setRoomNumber(1530716);
        roomPost.setRoomType("TWIN");
        roomPost.setPrice(1500);
        roomPost.setStatus(true);
        roomPost.setDescription("API ILE YAPILDI");



        response=given().headers("Authorization",
                "Bearer " + generateToken(),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON).body(roomPost).contentType(ContentType.JSON).when().post(ConfigReader.getProperty("roomPost_endpoint"));

    }




    @Then("kullanici post request validation yapar")
    public void kullaniciPostRequestValidationYapar() {
        //1.VALIDATION
        response.then().assertThat().
                body("price",equalTo(1500)).
                body("roomNumber",equalTo(1530716)).
                body("roomType",equalTo("TWIN")).
                body("status",equalTo(true)).
                body("description",equalTo("API ILE YAPILDI"));


    }

    // PUT
    @Given("kullanici roomlar icin put request yapar")
    public void kullaniciRoomlarIcinPutRequestYapar() {
        roomPut.setId(228142);
        roomPut.setRoomType("DELUXE");
        roomPut.setRoomNumber(1550728);
        roomPut.setDescription("API ILE DEGISTIRILDI");
        roomPut.setStatus(true);
        roomPut.setPrice(1600);


        response=given().headers("Authorization",
                "Bearer "+generateToken(),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON).body(roomPut).contentType(ContentType.JSON).when().put(ConfigReader.getProperty("roomPut_endpoint"));
    }


    @Then("kullanici put request validation yapar")
    public void kullaniciPutRequestValidationYapar() {
        response.then().assertThat().
                body("price",equalTo(1600)).
                body("roomNumber",equalTo(1550728)).
                body("roomType",equalTo("DELUXE")).
                body("status",equalTo(true)).
                body("description",equalTo("API ILE DEGISTIRILDI"));

    }



 */

}