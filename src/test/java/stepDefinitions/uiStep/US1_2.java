package stepDefinitions.uiStep;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class US1_2 {
    pages.US1_2 page = new pages.US1_2();
    Faker faker = new Faker();




    //US01_TC_01
    @Given("kullanici Medunna adresine gider")
    public void physicianMedunnaAdresineGider() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));

        Thread.sleep(2000);
    }

    @Then("Kullanıcı profil isaretine tıklanır.")
    public void kullanıcıProfilIsaretineTıklanır() throws InterruptedException {
        page.kullaniciSembolu.click();
        Thread.sleep(2000);
    }


    @And("Register butonuna tıklanır.")
    public void registerButonunaTıklanır() throws InterruptedException {
        page.register.click();
        Thread.sleep(2000);
    }

    @And("SSN bolumune tıklar")
    public void ssnBolumuneTıklar() throws InterruptedException {
        page.ssn.click();
        Thread.sleep(2000);
    }

    @And("SSN bolumune {int}. ve {int}. rakamdan sonra {string} girer")
    public void ssnBolumuneVeRakamdanSonraGirer(int arg0, int arg1, String arg2) throws InterruptedException {

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
        Thread.sleep(2000);

    }

    @And("SSN bolumune {int} rakam girer")
    public void ssnBolumuneRakamGirer(int arg0) throws InterruptedException {
        Assert.assertTrue(page.ssn.isEnabled());
        Thread.sleep(2000);
    }

    @And("Kullanıcı first name kutusuna tıklar.")
    public void kullanıcıFirstNameKutusunaTıklar() throws InterruptedException {
        page.firstName.click();
        Thread.sleep(2000);
    }

    @And("Kullanıcı first name kutusuna gecerli first name girer")
    public void kullanıcıFirstNameKutusunaGecerliFirstNameGirer() throws InterruptedException {
        page.firstName.sendKeys(faker.name().firstName());
        Thread.sleep(2000);
    }

    @And("Kullanıcı last name kutusuna tıklar.")
    public void kullanıcıLastNameKutusunaTıklar() throws InterruptedException {
        page.lastName.click();
        Thread.sleep(2000);
    }

    @And("Kullanıcı gecerli bir {string} girer.")
    public void kullanıcıGecerliBirGirer(String arg0) throws InterruptedException {
        page.lastName.sendKeys(faker.name().lastName());
        Thread.sleep(2000);
    }



    //US_02_TC_01
    @And("Kullanıcı Username butonuna tıklar")
    public void kullanıcıUsernameButonunaTıklar() throws InterruptedException {
        page.userName.click();
        Thread.sleep(2000);
    }

    @And("Kullanıcı boş bırakılmayan gecerli bir username girebilmeli")
    public void kullanıcıBoşBırakılmayanGecerliBirUsernameGirebilmeli() throws InterruptedException {
       page.userName.sendKeys(faker.name().username());
        Thread.sleep(2000);
    }



    @And("Kullanıcı email butonuna tıklayabilmeli")
    public void kullanıcıEmailButonunaTıklayabilmeli() throws InterruptedException {
        JavascriptExecutor jsx = (JavascriptExecutor)Driver.getDriver();
        jsx.executeScript("window.scrollBy(0,450)", "");
        Thread.sleep(2000);
        page.email.click();
        Thread.sleep(2000);
    }

    @And("kullanıcı {string} ve {string} i,saretleri iceren email girmeli")
    public void kullanıcıVeISaretleriIcerenEmailGirmeli(String arg0, String arg1) throws InterruptedException {
        String email=faker.internet().emailAddress();
        page.email.sendKeys(email);
        if (!email.contains("@")){
            page.email.sendKeys(email);
        }
        Thread.sleep(2000);
    }

    @And("Kullanıcı email butonunu bos bırakmamalı")
    public void kullanıcıEmailButonunuBosBırakmamalı() throws InterruptedException {
        Assert.assertTrue(page.email.isEnabled());
        Thread.sleep(2000);
    }




}
