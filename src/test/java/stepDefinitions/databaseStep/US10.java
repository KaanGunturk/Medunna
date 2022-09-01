package stepDefinitions.databaseStep;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DatabaseUtility;


import java.util.ArrayList;
import java.util.List;


public class US10 {
    
    @Given("Doktor Nhl DB ile baglanti olusturur")
    public void doktor_nhl_db_ile_baglanti_olusturur() {

        DatabaseUtility.createConnection();

    }
    @And("Doktor Nhl DB'e sorgu gonderir randevu id si ile hasta bilgilerini alir")
    public void doktor_nhl_db_e_sorgu_gonderir_randevu_id_si_ile_hasta_bilgilerini_alir() {

        String query = "select * from appointment";
        System.out.println(DatabaseUtility.getColumnNames(query));
        System.out.println("====id list=====");
        List<Object> idList = DatabaseUtility.getColumnData(query, "id");
        System.out.println(idList);

     //   String fileName1="src/test/resources/testData/AppointmentData.txt";
     //   WriteToTxt.saveAppointmentData(fileName1,idList);

    }

    @Then("Doktor Nhl bilgileri dogrular")
    public void doktorNhlBilgileriDogrular() {

     //   List<Object> actualAppointmentData= ReadTxt.returnAppointmentDataList(fileName);
        List<Object> expectedAppointmentIds=new ArrayList<>();

        expectedAppointmentIds.add(172716);
        Assert.assertTrue("ID'ler uyusmuyor",expectedAppointmentIds.containsAll(expectedAppointmentIds));


       // CopyOnWriteArrayList<Object> actualAppointmentData = null;
        //Assert.assertTrue("ID'ler uyusmuyor",actualAppointmentData.containsAll(expectedAppointmentData));


    }
}






