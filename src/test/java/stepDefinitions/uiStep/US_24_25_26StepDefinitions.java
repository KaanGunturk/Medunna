package stepDefinitions.uiStep;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.US_24_25_26Page;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class US_24_25_26StepDefinitions {

    US_24_25_26Page page =new US_24_25_26Page();
    Actions actions=new Actions(Driver.getDriver());
    Faker faker=new Faker();


    @Given("ZH Hasta medunna adresi gider")
    public void zh_hasta_medunna_adresi_gider() {

        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));

    }
    @Given("ZH Hasta Sign in1 butonuna tiklar")
    public void zh_hasta_sign_in1_butonuna_tiklar() {
        page.accountMenu.click();

    }
    @Given("ZH Hasta username ve sifresini girer")
    public void zh_hasta_username_ve_sifresini_girer() {
        page.signInButton1.click();
        page.usernameTextBox.sendKeys(ConfigReader.getProperty("zeynepHastaUserName"));
        page.passwordTextBox.sendKeys(ConfigReader.getProperty("zeynepHastaSifre"));
        page.signInButton2.click();

    }
    @Given("ZH Hasta My Pages butonuna tiklar")
    public void zh_hasta_my_pages_butonuna_tiklar() {
        page.myPages.click();

    }
    @Given("ZH Kullanici My Appointments butonuna tiklar")
    public void zh_kullanici_my_appointments_butonuna_tiklar() {
        page.myAppointments.click();

    }
    @Given("ZH Kullanici gecerli bir tarih girer")
    public void zh_kullanici_gecerli_bir_tarih_girer() throws InterruptedException {
        page.fromDate.sendKeys("08202022");
        Thread.sleep(2000);
        page.toDate.sendKeys("08312022");
        Thread.sleep(2000);
    }
    @Given("ZH Kullanici Show Tests butonuna tiklar")
    public void zh_kullanici_show_tests_butonuna_tiklar() {
        page.showTestRequest.click();

    }
    @Then("ZH Kullanici View Results butonuna tiklar")
    public void zh_kullanici_view_results_butonuna_tiklar() {
        page.viewResults.click();

    }
    @Then("ZH Kullanici acilan sayfada kan tahlili bolumlerinin gorunur oldugunu test eder")
    public void zh_kullanici_acilan_sayfada_kan_tahlili_bolumlerinin_gorunur_oldugunu_test_eder() {

        List<WebElement> kanTahliliBaslikListesi = page.kanTahliliBilgileri;

        int istenenBaslikIndexi = -3;
        for (int i = 0; i < kanTahliliBaslikListesi.size(); i++) {
            if (kanTahliliBaslikListesi.get(i).getText().equals(kanTahliliBaslikListesi)) {
                istenenBaslikIndexi = i + 1;

            }
            System.out.println(kanTahliliBaslikListesi.get(i).getText());
            assertTrue(kanTahliliBaslikListesi.size()>0);
        }

    }

    @Then("ZH Kullanici Show Invoice butonuna tiklar")
    public void zh_kullanici_show_invoice_butonuna_tiklar() {
        page.showInvoice.click();

    }

    @Then("ZH Kullanici Invoice'in gorunur oldugunu test eder")
    public void zh_kullanici_invoice_in_gorunur_oldugunu_test_eder() {

        List<WebElement> receteBilgisi = page.invoice;

        int istenenBaslikIndexi = -3;
        for (int i = 0; i < receteBilgisi.size(); i++) {
            if (receteBilgisi.get(i).getText().equals(receteBilgisi)) {
                istenenBaslikIndexi = i + 1;

            }
            System.out.println(page.invoice.get(i).getText());
            System.out.println(receteBilgisi.get(i).getText());
            assertTrue(receteBilgisi.size()>0);
        }


    }


    @Given("ZH Kullanici Make an Appointment butonuna tiklar")
    public void zh_kullanici_make_an_appointment_butonuna_tiklar() {
        page.makeAnAppointment.click();
    }
    @And("ZH Kullanici gerekli bilgileri girer")
    public void zhKullaniciGerekliBilgileriGirer() throws InterruptedException {

        page.firstName.sendKeys(faker.name().firstName());
        page.lastName.sendKeys(faker.name().lastName());
        page.snn.sendKeys("374-38-3828");
        page.email.sendKeys(faker.internet().emailAddress());
        page.phone.sendKeys("555-555-5554");
        page.appoDate.sendKeys("08232022");
        Thread.sleep(3000);

    }


    @Then("ZH Kullanici Send an Appointment Request butonuna tiklar")
    public void zh_kullanici_send_an_appointment_request_butonuna_tiklar() {
        page.sendAnAppointmentRequest.click();
    }



    @And("ZH Hasta content butonuna tiklar")
    public void zhHastaContentButonunaTiklar() {
        page.contantButonu.click();
        actions.sendKeys(Keys.DOWN);

    }
    @Given("ZH Kullanici mesaj icin gerekli olan name kutucugu doldurur")
    public void zh_kullanici_mesaj_icin_gerekli_olan_name_kutucugu_doldurur() throws InterruptedException {

        assertTrue( page.mesajName.isDisplayed());
        page.mesajName.sendKeys(faker.name().firstName());
        Thread.sleep(2000);

    }

    @Given("ZH Kullanici mesaj icin gerekli olan email kutucugu doldurur")
    public void zh_kullanici_mesaj_icin_gerekli_olan_email_kutucugu_doldurur() throws InterruptedException {
        assertTrue(page.mesajEmail.isDisplayed());
        page.mesajEmail.sendKeys(faker.internet().emailAddress());
        Thread.sleep(2000);
        actions.sendKeys(Keys.PAGE_DOWN);

    }

    @Given("ZH Kullanici mesaj icin gerekli olan Subject kutucugu doldurur")
    public void zh_kullanici_mesaj_icin_gerekli_olan_subject_kutucugu_doldurur() throws InterruptedException {
        assertTrue(page.mesajSubject.isDisplayed());
        page.mesajSubject.sendKeys("Konu Basligi");
        actions.sendKeys(Keys.DOWN);
        Thread.sleep(2000);

    }

    @Given("ZH Kullanici mesaj icin gerekli olan Message kutucugu doldurur")
    public void zh_kullanici_mesaj_icin_gerekli_olan_message_kutucugu_doldurur() throws InterruptedException {

        assertTrue(page.mesaj.isDisplayed());
        actions.sendKeys(Keys.DOWN);
        Thread.sleep(2000);
        page.mesaj.sendKeys("Mesaj bilgisinin girildigi kutucuk");
    }

    @Then("ZH Kullanici Send butonuna taklar")
    public void zh_kullanici_send_butonuna_taklar() throws InterruptedException {
        actions.sendKeys(Keys.DOWN);
        page.sendButonu.submit();
        assertTrue(page.onayMesaji.isDisplayed());




    }

    @Then("ZH Kullanici sayfayi kapatir")
    public void zh_kullanici_sayfayi_kapatir() {
        Driver.closeDriver();
    }


}
