package stepDefinitions.uiStep;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.US_009Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_009_StepDefinitions {

    US_009Page us009Page = new US_009Page();


    @Given("Kullanici {string} anasayfasinda")
    public void kullanici_anasayfasinda(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }
    @Then("Kullanıcı profil isaretine tıklar")
    public void kullanıcı_profil_isaretine_tıklar() {
        us009Page.anasayfaInsanIkonu.click();
    }
    @Then("Kullanici giris yapmak icin Sign in sekmesine tiklar")
    public void kullanici_giris_yapmak_icin_sign_in_sekmesine_tiklar() {
        us009Page.anasayfaInsanIkonuSignInElementi.click();

    }
    @Then("Kullanici Staff olarak username {string} ve sifresini {string} girer")
    public void kullanici_staff_olarak_username_ve_sifresini_girer(String staffuserName, String staffPassword) {
        us009Page.loginUsernameTextBox.sendKeys(ConfigReader.getProperty(staffuserName));
        us009Page.loginPasswordTextBox.sendKeys(ConfigReader.getProperty(staffPassword));

    }
    @Then("Kullanici ikinci Sign in butonuna tiklar")
    public void kullanici_ikinci_sign_in_butonuna_tiklar() {
        us009Page.loginSignInButonu.click();

    }
    @Then("Kullanici my pages butonuna tiklar")
    public void kullanici_my_pages_butonuna_tiklar() {
        us009Page.myPagesDropdownMenuElementi.click();
    }
    @Then("Kullanici Search Patient butonuna tiklar")
    public void kullanici_search_patient_butonuna_tiklar() {
        us009Page.myPagesDropdownMenuSearchPatientElementi.click();
    }
    @Then("Patients tablosunun ve hasta bilgilerinin gorunur oldugunu test eder")
    public void patients_tablosunun_ve_hasta_bilgilerinin_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(us009Page.patientsTableElementi.isDisplayed());
    }
    @Then("Tabloda bilgilerini düzenlenmek istedigi hastanın yanındaki edit butonuna tıklar")
    public void tabloda_bilgilerini_düzenlenmek_istedigi_hastanın_yanındaki_edit_butonuna_tıklar() {
        us009Page.patientsTableHastaEditElementi.click();

    }
    @Then("Hasta bilgilerinin düzenlenebilir oldugunu test eder")
    public void hasta_bilgilerinin_düzenlenebilir_oldugunu_test_eder() {
        Assert.assertTrue(us009Page.hastaBilgileriGuncellemeFirstNameTextBoxElementi.isEnabled());
        Assert.assertTrue(us009Page.hastaBilgileriGuncellemeLastNameTextBoxElementi.isEnabled());
        Assert.assertTrue(us009Page.hastaBilgileriGuncellemeBirthDateTextBoxElementi.isEnabled());
        Assert.assertTrue(us009Page.hastaBilgileriGuncellemeEmailTextBoxElementi.isEnabled());
        Assert.assertTrue(us009Page.hastaBilgileriGuncellemePhoneTextBoxElementi.isEnabled());
        Assert.assertTrue(us009Page.hastaBilgileriGuncellemeGenderSelectMenuElementi.isEnabled());
        Assert.assertTrue(us009Page.hastaBilgileriGuncellemeBloodGroupSelectMenuElementi.isEnabled());
        Assert.assertTrue(us009Page.hastaBilgileriGuncellemeAdressTextBoxElementi.isEnabled());
        Assert.assertTrue(us009Page.hastaBilgileriGuncellemeDescriptionTextBoxElementi.isEnabled());
        Assert.assertTrue(us009Page.hastaBilgileriGuncellemeUserSelectMenuElementi.isEnabled());
        Assert.assertTrue(us009Page.hastaBilgileriGuncellemeCountrySelectMenuElementi.isEnabled());
        Assert.assertTrue(us009Page.hastaBilgileriGuncellemeStateSelectMenuElementi.isEnabled());

    }
    @Then("YG Kullanici Patient SSN kısmına hastanın SSN bilgisini girer")
    public void yg_kullanici_patient_ssn_kısmına_hastanın_ssn_bilgisini_girer() throws InterruptedException {
        us009Page.patientsTableSSNsearchTextBox.sendKeys("587-45-8880");
        Thread.sleep(1000);
    }

    @Then("Kullanici Ilgili hastanın yanındaki view butonuna tıklar")
    public void kullanici_ılgili_hastanın_yanındaki_view_butonuna_tıklar() {

        us009Page.patientsTableHastaViewElementi.click();
    }
    @Then("Kullanici kayit bilgilerinin gorunur oldugunu test eder")
    public void kullanici_kayit_bilgilerinin_gorunur_oldugunu_test_eder() throws InterruptedException {
        String deger1=us009Page.tablePhone.getText();
        System.out.println(deger1);
        Thread.sleep(1000);
        Assert.assertFalse("alan bos",deger1.isBlank());

        String deger2=us009Page.tableEmail.getText();
        Thread.sleep(1000);
        Assert.assertFalse("alan bos",deger2.isBlank());

        String deger3=us009Page.tableGender.getText();
        Thread.sleep(1000);
        Assert.assertFalse("alan bos",deger3.isBlank());

        String deger4=us009Page.tableBlood.getText();
        Thread.sleep(1000);
        Assert.assertFalse("alan bos",deger4.isBlank());

        String deger5=us009Page.tableAddress.getText();
        Thread.sleep(1000);
        Assert.assertFalse("alan bos",deger5.isBlank());

        String deger6=us009Page.tableDescription.getText();
        Thread.sleep(1000);
        Assert.assertFalse("alan bos",deger6.isBlank());

        String deger7=us009Page.tableDate.getText();
        Thread.sleep(1000);
        Assert.assertFalse("alan bos",deger7.isBlank());

        String deger8=us009Page.tableuser.getText();
        Thread.sleep(1000);
        Assert.assertFalse("alan bos",deger8.isBlank());

        String deger9=us009Page.tableCountry.getText();
        Thread.sleep(1000);
        Assert.assertFalse("alan bos",deger9.isBlank());

        String deger10=us009Page.tableState.getText();
        Thread.sleep(1000);
        Assert.assertFalse("alan bos",deger10.isBlank());



    }
    @Then("Kullanici Tabloda bilgilerini düzenlenmek istedigi hastanın yanındaki edit butonuna tıklar")
    public void kullanici_tabloda_bilgilerini_düzenlenmek_istedigi_hastanın_yanındaki_edit_butonuna_tıklar() throws InterruptedException {

        Thread.sleep(2000);
        us009Page.patientsTableHastaEditElementi.click();
    }
    @Then("Kullanici {int} saniye bekler")
    public void kullanici_saniye_bekler(Integer second) throws InterruptedException {
        Thread.sleep(second * 1000);

    }
    @Then("Kullanici kayit bilgilerini siler ve Save butonuna tıklar")
    public void kullanici_kayit_bilgilerini_siler() throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());
        Assert.assertTrue(us009Page.hastaBilgileriGuncellemeAdressTextBoxElementi.isEnabled());
        us009Page.hastaBilgileriGuncellemeFirstNameTextBoxElementi.clear();

    }
    @Then("Kullanici bilgilerin silinip silinmedigini test eder")
    public void kullanici_bilgilerin_silinip_silinmedigini_test_eder() throws InterruptedException {
        String firstNameText=us009Page.hastaBilgileriGuncellemeFirstNameTextBoxElementi.getText();
        Thread.sleep(1000);
        Assert.assertTrue("",firstNameText.isBlank());
    }

    @Then("KG sayfayi kapatir")
    public void kg_sayfayi_kapatir() {
        Driver.closeDriver();
    }



}
