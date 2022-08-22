package stepDefinitions.databaseStep;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import utilities.DBUtils;

import java.sql.*;

public class US_10_12StepDefinitions {


    String url = "jdbc:sqlserver://184.168.194.58:1433;databaseName=medunna  ; user=PhysicianTeam54;password=PhysicianTeam54";
    String username = "PhysicianTeam54";
    String password = "PhysicianTeam54";


    Connection connection;
    Statement statement;
    ResultSet resultSet;

    @Given("Doktor Medunna veritabanina baglanir")
    public void doktor_medunna_veritabanina_baglanir() throws SQLException {


        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    }

    @Given("My Appoinments sayfasindaki verileri alir")
    public void my_appoinments_sayfasindaki_verileri_alir(String tablo, String field) throws SQLException {


        String query = "SELECT" + field + "FROM" + tablo;
        resultSet = statement.executeQuery(query);

    }
    @Given("My Appointments verilerini okur")
    public void my_appointments_verilerini_okur() throws SQLException {

        resultSet.first();
        System.out.println(resultSet.getString("MY Appoinments"));

    }
}

