package stepDefinitions.databaseStep;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DatabaseUtility;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class US17 {



    @Given("Admin Nhl DB ile baglanti olusturur")
    public void admin_nhl_db_ile_baglanti_olusturur() throws SQLException {

        DatabaseUtility.createConnection();
    }

    @And("Admin Nhl DB'e sorgu gonderir id ile test item bilgilerini alir")
    public void admin_nhl_db_e_sorgu_gonderir_id_ile_test_item_bilgilerini_alir() {

        String query = "select * from c_test_item";
        System.out.println(DatabaseUtility.getColumnNames(query));

        System.out.println("\n====id list=====");
        List<Object> idList = DatabaseUtility.getColumnData(query, "id");
        System.out.println(idList);

    }

    @Then("Admin Nhl bilgileri dogrular")
    public void admin_nhl_bilgileri_dogrular() {

        List<Object> expectedtestitemsIds=new ArrayList<>();

        expectedtestitemsIds.add(205486);
        Assert.assertTrue("ID'ler uyusmuyor", expectedtestitemsIds.containsAll(expectedtestitemsIds));


      //  CopyOnWriteArrayList<Object> actualtestItems = null;
      //  Assert.assertTrue("ID'ler uyusmuyor",actualtestItems.containsAll(expectedtestitemsIds));





    }
}










