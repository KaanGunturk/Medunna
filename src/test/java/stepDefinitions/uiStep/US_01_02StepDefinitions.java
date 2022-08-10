package stepDefinitions.uiStep;

import com.github.javafaker.Faker;
import com.github.javafaker.Name;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.US_01_02Page;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class US_01_02StepDefinitions {
    US_01_02Page page = new US_01_02Page();
    Faker faker = new Faker();


    //US01_TC_01
    @Given("kullanici Medunna adresine gider")
    public void physicianMedunnaAdresineGider() {
        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));
    }

    @Then("Kullanıcı profil isaretine tıklanır.")
    public void kullanıcıProfilIsaretineTıklanır() {
        page.kullaniciSembolu.click();
    }


    @And("Register butonuna tıklanır.")
    public void registerButonunaTıklanır() {
        page.register.click();
    }

    @And("SSN bolumune tıklar")
    public void ssnBolumuneTıklar() {
        page.ssn.click();
    }

    @And("SSN bolumune {int}. ve {int}. rakamdan sonra {string} girer")
    public void ssnBolumuneVeRakamdanSonraGirer(int arg0, int arg1, String arg2) {

        int ilk = faker.number().numberBetween(0, 9);
        int ikinci = faker.number().numberBetween(0, 9);
        int ucuncu = faker.number().numberBetween(0, 9);
        String isaret = "-";
        int dorduncu = faker.number().numberBetween(0, 9);
        int besinci = faker.number().numberBetween(0, 9);
        int altinci = faker.number().numberBetween(0, 9);
        int yedinci = faker.number().numberBetween(0, 9);
        int sekiz = faker.number().numberBetween(0, 9);
        int dokuz = faker.number().numberBetween(0, 9);
        List<String> ssnNuarasi = new ArrayList<>();
        ssnNuarasi.add(String.valueOf(Integer.parseInt(String.valueOf(ilk))));
        ssnNuarasi.add(String.valueOf(Integer.parseInt(String.valueOf(ikinci))));
        ssnNuarasi.add(String.valueOf(Integer.parseInt(String.valueOf(ucuncu))));
        ssnNuarasi.add(isaret);
        ssnNuarasi.add(String.valueOf(Integer.parseInt(String.valueOf(dorduncu))));
        ssnNuarasi.add(String.valueOf(Integer.parseInt(String.valueOf(besinci))));
        ssnNuarasi.add(isaret);
        ssnNuarasi.add(String.valueOf(Integer.parseInt(String.valueOf(altinci))));
        ssnNuarasi.add(String.valueOf(Integer.parseInt(String.valueOf(yedinci))));
        ssnNuarasi.add(String.valueOf(Integer.parseInt(String.valueOf(sekiz))));
        ssnNuarasi.add(String.valueOf(Integer.parseInt(String.valueOf(dokuz))));

        for (int i = 0; i < ssnNuarasi.size(); i++) {
            page.ssn.sendKeys(ssnNuarasi.get(i));
        }

    }

    @And("SSN bolumune {int} rakam girer")
    public void ssnBolumuneRakamGirer(int arg0) {
        Assert.assertTrue(page.ssn.isEnabled());
    }

    @And("Kullanıcı first name kutusuna tıklar.")
    public void kullanıcıFirstNameKutusunaTıklar() {
        page.firstName.click();
    }

    @And("Kullanıcı first name kutusuna gecerli first name girer")
    public void kullanıcıFirstNameKutusunaGecerliFirstNameGirer() {
        page.firstName.sendKeys(faker.name().firstName());

    }

    @And("Kullanıcı last name kutusuna tıklar.")
    public void kullanıcıLastNameKutusunaTıklar() {
        page.lastName.click();

    }

    @And("Kullanıcı gecerli bir {string} girer.")
    public void kullanıcıGecerliBirGirer(String arg0) {
        page.lastName.sendKeys(faker.name().lastName());
    }

    @And("Swagger ile tum kayıt bilgileri alınır")
    public void swaggerIleTumKayıtBilgileriAlınır() {

    }

    @And("Swigger ile tum kayıt bilgileri doğrulanabilmeli")
    public void swiggerIleTumKayıtBilgileriDoğrulanabilmeli() {

    }

    @And("Api ile kayıtlı kişiler listesi oluşturulur.")
    public void apiIleKayıtlıKişilerListesiOluşturulur() {
    }

    @And("Api ile kayıtlı kişiler doğrulanabilmeli")
    public void apiIleKayıtlıKişilerDoğrulanabilmeli() {

    }

    @And("DB ile SSN kimlikleri doğrulanabilmeli")
    public void dbIleSSNKimlikleriDoğrulanabilmeli() {
    }

    //US_02_TC_01
    @And("Kullanıcı Username butonuna tıklar")
    public void kullanıcıUsernameButonunaTıklar() {
      //  page.userName.click();
    }

    @And("Kullanıcı boş bırakılmayan gecerli bir username girebilmeli")
    public void kullanıcıBoşBırakılmayanGecerliBirUsernameGirebilmeli() {
       // page.userName.sendKeys(faker.name().username());
    }

    @And("Kullanıcı adı api ile kontrol edilip doğrulanabilmeli")
    public void kullanıcıAdıApiIleKontrolEdilipDoğrulanabilmeli() {

    }

    @And("Kullanıcı email butonuna tıklayabilmeli")
    public void kullanıcıEmailButonunaTıklayabilmeli() {
        page.email.click();
    }

    @And("kullanıcı {string} ve {string} i,saretleri iceren email girmeli")
    public void kullanıcıVeISaretleriIcerenEmailGirmeli(String arg0, String arg1) {
        String email=faker.internet().emailAddress();
        page.email.sendKeys(email);
        if (!email.contains("@")){
            page.email.sendKeys(email);
        }
    }

    @And("Kullanıcı email butonunu bos bırakmamalı")
    public void kullanıcıEmailButonunuBosBırakmamalı() {

    }

    @And("Kullanıcının girdiği email api ile doğrulanmalı")
    public void kullanıcınınGirdiğiEmailApiIleDoğrulanmalı() {
    }


}
