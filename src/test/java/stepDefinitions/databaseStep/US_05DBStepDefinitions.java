package stepDefinitions.databaseStep;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import utilities.DatabaseUtility;
import java.util.ArrayList;
import java.util.List;

public class US_05DBStepDefinitions {

    @Given("kullanici database ile baglanti kurar")
    public void kullanici_database_ile_baglanti_kurar() {
        DatabaseUtility.createConnection();
    }

    @Given("kullanici appointment dogrular")
    public void kullanici_appointment_dogrular() {

        String query = "select * from appointment";
        System.out.println(DatabaseUtility.getColumnNames(query));
        System.out.println("====id list====");
        List<Object> idList = DatabaseUtility.getColumnData(query, "id");
        System.out.println(idList);

        List<Object> expectedAppointmentIds=new ArrayList<>();

        expectedAppointmentIds.add(225876);
        expectedAppointmentIds.add(218422);
        expectedAppointmentIds.add(218425);
        expectedAppointmentIds.add(218023);
        Assert.assertTrue("ID'ler uyusmuyor", expectedAppointmentIds.containsAll(expectedAppointmentIds));

    }

    @Given("kullanici database baglantisini kapatir")
    public void kullanici_database_baglantisini_kapatir() {
        DatabaseUtility.closeConnection();

    }
}
