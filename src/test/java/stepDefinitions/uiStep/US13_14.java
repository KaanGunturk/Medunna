package stepDefinitions.uiStep;

import io.cucumber.java.en.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.US_013_014;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;


public class US13_14 {

      US_013_014 page=new US_013_014();

      //***************ORTAK KISIM***************
    @Given("Physician Medunna adresine gider")
    public void physicianMedunnaAdresineGider() {
        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));

    }
    @Given("Physician Sign in1 butonuna tiklar")
    public void physician_sign_in1_butonuna_tiklar() {
       page.accountMenu.click();
       page.signInButton1.click();
    }


    @Then("Physician username ve sifresini girer")
    public void physician_username_ve_sifresini_girer() {

           page.usernameTextBox.sendKeys(ConfigReader.getProperty("userNamePhysician"));
           page.passwordTextBox.sendKeys(ConfigReader.getProperty("sifrePhysician"));
           page.signInButton2.click();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }

    @Then("Physician My Pages butonuna tiklar")
    public void physician_my_pages_butonuna_tiklar() {
        page.myPages.click();
    }

    //****************US13_TC01****************

    @And("Physician My Appointments butonuna tiklar")
    public void physicianMyAppointmentsButonunaTiklar() {
        page.myAppointments.click();

    }

    @And("Physician acilan sayfadaki istenen hastanin edit butonun tiklar")
    public void physicianAcilanSayfadakiIstenenHastaninEditButonunTiklar() {
        page.myAppointmentHastaEditButonu.click();
    }

    @And("Physician Show Test Results butonuna tiklar")
    public void physicianShowTestResultsButonunaTiklar() {
        page.showTestResultsButonu.click();
    }

    @And("Physician acilan pencere de View Results butonuna tiklar")
    public void physicianAcilanPencereDeViewResultsButonunaTiklar() {
        page.viewResults.click();
    }


    //US13_TC01
    @Then("Physician hastaya ait secenekleri gorebilir")
    public void physicianHastayaAitSecenekleriGorebilir() {
        List<WebElement> hastabilgileriBaslikListesi = page.viewResultsHastaBilgileri;

        int istenenBaslikIndexi = -3;
        for (int i = 0; i < hastabilgileriBaslikListesi.size(); i++) {
            if (hastabilgileriBaslikListesi.get(i).getText().equals(hastabilgileriBaslikListesi)) {
                istenenBaslikIndexi = i + 1;
                break;
            }
        }

        if (istenenBaslikIndexi != -3) {
            List<WebElement> istenenSutundakiElementler = Driver.getDriver().findElements(By.xpath("//tbody//tr//td[" + istenenBaslikIndexi + "]"));
            for (WebElement each : istenenSutundakiElementler
            ) {
                System.out.println(each.getText());
            }
        } else {
            System.out.println("istenen baslik bulunamadi");
        }
    }

    @Then("Kullanici My Inpatients butonuna tiklar")
    public void kullanici_my_inpatients_butonuna_tiklar() {
        page.myInpatients.click();
    }

    //****************US13_TC02****************

    @And("Physician acilan sayfadaki istenen hastanin Appointments edit butonun tiklar")
    public void physicianAcilanSayfadakiIstenenHastaninAppointmentsEditButonunTiklar() {
        page.myAppointmentHastaEditButonu.click();
    }
    @And("Physician Request Inpatient seceneginin tiklanabilir oldugunu dogrular")
    public void physicianRequestInpatientSecenegininTiklanabilirOldugunuDogrular() {
        page.requestInpatientButonu.click();
    }



    //****************US14_TC01****************
    @Then("Kullanici bilgilerin gorunurlugunu kontrol eder.")
    public void kullaniciBilgilerinGorunurlugunuKontrolEder() {
        List<WebElement> myInpatientsBilgileriListesi = page.viewResultsHastaBilgileri;

        int istenenBaslikIndexi = -3;
        for (int i = 0; i < myInpatientsBilgileriListesi.size(); i++) {
            if (myInpatientsBilgileriListesi.get(i).getText().equals(myInpatientsBilgileriListesi)) {
                istenenBaslikIndexi = i + 1;
                break;
            }
        }

        if (istenenBaslikIndexi != -3) {
            List<WebElement> istenenSutundakiElementler = Driver.getDriver().findElements(By.xpath("//tbody//tr//td[" + istenenBaslikIndexi + "]"));
            for (WebElement each : istenenSutundakiElementler
            ) {
                System.out.println(each.getText());
            }
        } else {
            System.out.println("istenen baslik bulunamadi");
        }
    }


    //****************US14_TC02****************
    @And("Physician My inpatients sekmesine tiklar")
    public void physicianMyInpatientsSekmesineTiklar() {
        page.myInpatients.click();
    }

    @And("Physician Edit butonuna tiklar")
    public void physicianEditButonunaTiklar() {
        page.myInpatientsEditButonu.click();
    }

    @And("Physician Status'u günceller")
    public void physicianStatusUGünceller() {

    }

    @Then("Pyhsician rezerve edilmiş odayı günceller")
    public void pyhsicianRezerveEdilmişOdayıGünceller() {

    }


}
