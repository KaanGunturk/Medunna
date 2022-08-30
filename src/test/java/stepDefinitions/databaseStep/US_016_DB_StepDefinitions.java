package stepDefinitions.databaseStep;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class US_016_DB_StepDefinitions {


    Connection connection;
    Statement statement;
    ResultSet resultSet;


    @Given("kullanici room database ile baglanti kurar")
    public void kullanici_room_database_ile_baglanti_kurar() throws SQLException {
        connection= DriverManager.getConnection("jdbc:postgresql://medunna.com:5432/medunna_db","medunna_user","medunna_pass_987");

        statement=connection.createStatement();

        resultSet=statement.executeQuery("select * from room where room_number=7654438");


    }
    @When("kullanici room query tanimlar")
    public void kullanici_room_query_tanimlar() throws SQLException {



    }
    @Then("kullanici oda bilgilerini gorebilmeli")
    public void kullanici_oda_bilgilerini_gorebilmeli() throws SQLException {
        List<String> actualRoom=new ArrayList<>();
        while (resultSet.next()){
            actualRoom.add(resultSet.getString("id"));
            actualRoom.add(resultSet.getString("room_number"));
            actualRoom.add(resultSet.getString("room_type"));
            actualRoom.add(resultSet.getString("price"));
            actualRoom.add(resultSet.getString("description"));
            actualRoom.add(resultSet.getString("created_date"));
            actualRoom.add(resultSet.getString("created_by"));
            actualRoom.add(resultSet.getString("last_modified_by"));
            actualRoom.add(resultSet.getString("last_modified_date"));
        }




        List<Object>expectedRoom= Arrays.asList("216171","15207","DELUXE","1500.00","daha iyiside varmış",
                "2022-08-22 12:43:43.598377",
                "team_60","team_60","2022-08-22 15:37:58.611825");

        assertEquals(expectedRoom,actualRoom);

    }

}