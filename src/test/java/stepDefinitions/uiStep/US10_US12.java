package stepDefinitions.uiStep;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.US10_US12_;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class US10_US12 {

    US10_US12_ page = new US10_US12_();


    @Given("Doktor Medunna adresine gider")
    public void doktor_medunna_adresine_gider() {
        {
            Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));
        }

    }

    @Given("Doktor profil butonuna tiklar")
    public void doktor_profil_butonuna_tiklar() {

      page.profilButonu.click();
    }

    @Then("Doktor giris yapmak icin sign in butonuna basar")
    public void doktor_giris_yapmak_icin_sign_in_butonuna_basar() {

        page.signInButonu.click();
    }

    @Then("Doktor username ile sifresini girer")
    public void doktor_username_ile_sifresini_girer() {

        page.usernameTextBox.sendKeys(ConfigReader.getProperty("userNamePhysician"));
        page.passwordTextBox.sendKeys(ConfigReader.getProperty("sifrePhysician"));

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("Doktor sign in butonuna basar")
    public void doktor_sign_in_butonuna_basar() {

      page.signIn2Butonu.click();

    }

    @Then("Doktor MyPages butonuna tiklar")
    public void doktor_my_pages_butonuna_tiklar() {

      page.myPages.click();
    }

    @Then("Doktor MyAppointments butonuna tiklar")
    public void doktor_my_appointments_butonuna_tiklar() throws InterruptedException {

        page.myAppointments.click();
        Thread.sleep(2000);
    }

    @Then("Doktor randevu listesini ve zaman dilimlerini My Appointments sekmesinden görebilmelidir.")
    public void doktor_randevu_listesinii_ve_zaman_dilimlerini_my_aappointments_sekmesinden_görebilmelidir() {

        Assert.assertTrue(page.zamanDilimi1.isDisplayed());
        Assert.assertTrue(page.zamanDilimi2.isDisplayed());
    }

    @And("Doktor patient id, start date, end date, status bilgilerini görebilmeli")
    public void doktorPatientIdStartDateEndDateStatusBilgileriniGörebilmeli() {

       Assert.assertTrue(page.id.isDisplayed());
       Assert.assertTrue(page.startDateTime.isDisplayed());
       Assert.assertTrue((page.endDateTime.isDisplayed()));
       Assert.assertTrue(page.status.isDisplayed());
    }


    @And("Doktor acilan sayfadaki istenen hastanin edit butonun tiklar")
    public void doktorAcilanSayfadakiIstenenHastaninEditButonunTiklar() throws InterruptedException {

        page.hastaEditButon.click();
        Thread.sleep(2000);
    }

    @Then("Doktor acilan sayfada Request A Test butonuna tiklar")
    public void doktorAcilanSayfadaRequestATestButonunaTiklar() throws InterruptedException {


       page.requestATestButon.click();


    }


    @And("Test items tablosunun gorunur oldugunu test eder")
    public void testItemsTablosununGorunurOldugunuTestEder() throws InterruptedException {

        Assert.assertTrue(page.testitemsTablo.isDisplayed());
        Thread.sleep(3000);
    }


    @And("Doktor Glucose, Urea, Creatinine,Sodium,Potassium,Total protein, Albumin, Hemoglobin seceneklerini gormeli")
    public void doktorGlucoseUreaCreatinineSodiumPotassiumTotalProteinAlbuminHemoglobinSecenekleriniGormeli() {


           List<String> istenenTestIsimleri = new ArrayList<>();

            istenenTestIsimleri.add("Sodium");
            istenenTestIsimleri.add("Urea");
            istenenTestIsimleri.add("Hemoglobin");
            istenenTestIsimleri.add("Albumin");
            istenenTestIsimleri.add("Creatinine");
            istenenTestIsimleri.add("Total Protein-");
            istenenTestIsimleri.add("glucose");
            istenenTestIsimleri.add("Potassium");



            List<String> sutundakiTumTestlerListesi = new ArrayList<>();

            for (WebElement each:page.isimListesi
            ) {
                sutundakiTumTestlerListesi.add(each.getText());

            }
            System.out.println(sutundakiTumTestlerListesi);

            for (int i = 0; i < istenenTestIsimleri.size(); i++) {
                Assert.assertTrue(sutundakiTumTestlerListesi.contains(istenenTestIsimleri.get(i)));

            }

        }

    @Then("Doktor sayfayi kapatir")
    public void doktorSayfayiKapatir() {
        Driver.closeDriver();
    }
}








