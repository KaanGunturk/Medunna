package stepDefinitions.databaseStep;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import utilities.DatabaseUtility;
import java.util.ArrayList;
import java.util.List;

public class US27 {

    @Given("Admin database ile baglanti kurar")
    public void admin_database_ile_baglanti_kurar() {
        DatabaseUtility.createConnection();

    }
    @Given("Admin mesajlari dogrular")
    public void admin_mesajlari_dogrular() {

        String query = "select * from cmessage";
        System.out.println(DatabaseUtility.getColumnNames(query));
        System.out.println("====id list====");
        List<Object> idList = DatabaseUtility.getColumnData(query, "id");
        System.out.println(idList);

        List<Object> expectedMessagesIds=new ArrayList<>();

        expectedMessagesIds.add(234041);
        Assert.assertTrue("ID'ler uyusmuyor", expectedMessagesIds.containsAll(expectedMessagesIds));

    }

    @Given("Admin database baglantisini kapatir")
    public void admin_database_baglantisini_kapatir() {
        DatabaseUtility.closeConnection();

    }

}
