package stepDefinitions.uiStep;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.US_28Page;
import utilities.ConfigReader;

import java.security.Key;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class US_28StepDefinitions {

    US_28Page page = new US_28Page();

    // ----- TC_01 ----- \\

    @Then("AEE Kullanici Admin olarak giris yapar")
    public void aee_kullanici_admin_olarak_giris_yapar() throws InterruptedException {
        page.usernameTextBox.sendKeys(ConfigReader.getProperty("userNameAdmin"));
        Thread.sleep(500);
        page.passwordTextBox.sendKeys(ConfigReader.getProperty("sifreAdmin"));
        Thread.sleep(500);
        page.signInButonu2.click();
        Thread.sleep(1300);
    }

    @Then("AEE Kullanici Items&Titles butonuna tiklar")
    public void aee_kullanici_items_titles_butonuna_tiklar() throws InterruptedException {
        page.itemTitlesButonu.click();
        Thread.sleep(500);
    }

    @Then("AEE Kullanici Country butonuna tiklar")
    public void aee_kullanici_country_butonuna_tiklar() throws InterruptedException {
        page.countryButonu.click();
        Thread.sleep(500);
    }

    @Then("AEE Kullanici Creat a new Country butonuna tiklar")
    public void aee_kullanici_creat_a_new_country_butonuna_tiklar() throws InterruptedException {
        page.createNewCountryButonu.click();
        Thread.sleep(500);
    }

    @Then("AEE Kullanici Name kismina eklemek istedigi ulke ismini yazar")
    public void aee_kullanici_name_kismina_eklemek_istedigi_ulke_ismini_yazar() {
        page.nameTextBox.sendKeys(ConfigReader.getProperty("ulkeIsmi"));
    }

    @Then("AEE Kullanici Creat Country Save butonuna tiklar")
    public void aee_kullanici_creat_country_save_butonuna_tiklar() throws InterruptedException {
        page.creatCountrySaveButonu.click();
        Thread.sleep(500);
    }

    @Then("AEE Creat Country Basari mesaji geldigi test edilir")
    public void aee_creat_country_basari_mesaji_geldigi_test_edilir() {
        page.creatCountryBasariMesaji.isEnabled();
    }

    // ----- TC_02 ----- \\

    @And("AEE Kullanici State\\/City butonuna tiklar")
    public void aeeKullaniciStateCityButonunaTiklar() throws InterruptedException {
        page.stateCityButonu.click();
        Thread.sleep(500);
    }

    @And("AEE Kullanici Creat a new State\\/City butonuna tiklar")
    public void aeeKullaniciCreatANewStateCityButonunaTiklar() {
        page.creatCtiyButonu.click();
    }

    @And("AEE Kullanici Name kismina eklemek istedigi eyalet veya sehir ismini yazar")
    public void aeeKullaniciNameKisminaEklemekIstedigiEyaletVeyaSehirIsminiYazar() {
        page.cityNameTextBox.sendKeys(ConfigReader.getProperty("sehirIsmi"));
    }

    @Then("AEE Kullanici State\\/City kisminda uzerine eklemek istedigi ulkeyi secer")
    public void aee_kullanici_state_city_kisminda_uzerine_eklemek_istedigi_ulkeyi_secer() {
        page.countrySecmeButonu.sendKeys(ConfigReader.getProperty("ulkeIsmi"), Keys.ENTER);
    }

    @Then("AEE Kullanici Creat City Save butonuna tiklar")
    public void aee_kullanici_creat_city_save_butonuna_tiklar() throws InterruptedException {
        Thread.sleep(500);
        page.creatCitySaveButonu.click();
        Thread.sleep(500);
    }

    @Then("AEE Creat Ctiy Basari mesaji geldigi test edilir")
    public void aee_creat_ctiy_basari_mesaji_geldigi_test_edilir() throws InterruptedException {
        assertFalse(page.creatCityBasarisizlikMesaji.isDisplayed());
        Thread.sleep(600);
    }

    // ----- TC_06 ----- \\

    @Then("AEE Kullanici silmek istedigi ulkenin Delete butonuna tiklar")
    public void aee_kullanici_silmek_istedigi_ulkenin_delete_butonuna_tiklar() {
        page.countryDeleteButonu.sendKeys(Keys.ENTER);
    }

    @Then("AEE Kullanici acilan pencerede Delete butonuna tiklar")
    public void aee_kullanici_acilan_pencerede_delete_butonuna_tiklar() throws InterruptedException {
        Thread.sleep(500);
        page.acilanPencereDeleteButonu.click();
    }

    @Then("AEE Delete Country Basari mesaji geldigi test edilir")
    public void aee_delete_country_basari_mesaji_geldigi_test_edilir() {
        assertTrue(page.countryDeleteBasariMesaji.isDisplayed());
    }

}
