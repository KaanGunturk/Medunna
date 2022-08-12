package stepDefinitions.uiStep;

import io.cucumber.java.en.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.US_013_014Page;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class US13_14StepDefinitions {

      US_013_014Page page=new US_013_014Page();

      //***************ORTAK KISIM***************
    @Given("ZH Physician Medunna adresine gider")
    public void ZHphysicianMedunnaAdresineGider() {
        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));

    }
    @Given("ZH Physician Sign in1 butonuna tiklar")
    public void ZHphysician_sign_in1_butonuna_tiklar() throws InterruptedException {
       page.accountMenu.click();
       Thread.sleep(5000);
       page.signInButton1.click();
    }


    @Then("ZH Physician username ve sifresini girer")
    public void ZHphysician_username_ve_sifresini_girer() throws InterruptedException {

           page.usernameTextBox.sendKeys(ConfigReader.getProperty("userNamePhysician"));
           Thread.sleep(4000);
           page.passwordTextBox.sendKeys(ConfigReader.getProperty("sifrePhysician"));
           Thread.sleep(4000);
           page.signInButton2.click();
           Thread.sleep(4000);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }



    @Then("ZH Physician My Pages butonuna tiklar")
    public void ZHphysician_my_pages_butonuna_tiklar() throws InterruptedException {
        Thread.sleep(4000);
        page.myPages.click();
    }

    //****************US13_TC01****************

    @And("ZH Physician My Appointments butonuna tiklar")
    public void ZHphysicianMyAppointmentsButonunaTiklar() throws InterruptedException {
        Thread.sleep(2000);
        page.myAppointments.click();

    }

    @And("ZH Physician acilan sayfadaki istenen hastanin edit butonun tiklar")
    public void ZHphysicianAcilanSayfadakiIstenenHastaninEditButonunTiklar() {
        page.showTestResultsTestOlanEditButonu2.click();
    }

    @And("ZH Physician Show Test Results butonuna tiklar")
    public void ZHphysicianShowTestResultsButonunaTiklar() {
        page.showTestResultsButonu.click();
    }

    @And("ZH Physician acilan pencere de View Results butonuna tiklar")
    public void ZHphysicianAcilanPencereDeViewResultsButonunaTiklar() throws InterruptedException {
        Thread.sleep(6000);
        page.viewResults.click();

    }

    @Then("ZH Physician hastaya ait Show Test Results secenekleri gorebilir")
    public void ZHphysicianHastayaAitShowTestResultsSecenekleriGorebilir() {
        List<WebElement> hastabilgileriBaslikListesi = page.showTestResultsBilgileri;

        int istenenBaslikIndexi = -3;
        for (int i = 0; i < hastabilgileriBaslikListesi.size(); i++) {
            if (hastabilgileriBaslikListesi.get(i).getText().equals(hastabilgileriBaslikListesi)) {
                istenenBaslikIndexi = i + 1;

            }
            System.out.println(page.showTestResultsBaslikBilgileri.get(i).getText());
            System.out.println(hastabilgileriBaslikListesi.get(i).getText());

        }
        if (istenenBaslikIndexi != -3) {
            List<WebElement> istenenSutundakiElementler = Driver.getDriver().findElements(By.xpath("//tbody//tr//td[" + istenenBaslikIndexi + "]"));
            for (WebElement each : istenenSutundakiElementler
            ) {
                System.out.println(each);
            }
        }

    }

    @Then("ZH Physician {int} sn bekler")
    public void ZHphysicianSnBekler(int istenenSaniye) {
        try {
            Thread.sleep(istenenSaniye * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    //****************US13_TC02****************

    @And("ZH Physician acilan sayfadaki istenen hastanin Appointments edit butonun tiklar")
    public void ZHphysicianAcilanSayfadakiIstenenHastaninAppointmentsEditButonunTiklar() {
        page.myAppointmentHastaEditButonu.click();
    }
    @And("ZH Physician Request Inpatient seceneginin tiklanabilir oldugunu dogrular")
    public void ZHphysicianRequestInpatientSecenegininTiklanabilirOldugunuDogrular() throws InterruptedException {
        Thread.sleep(3000);
        page.requestInpatientButonu.click();
        Thread.sleep(3000);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(60));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='alert']")));
        System.out.println(element.getText());

        if (page.inpatientMessage.getText().equalsIgnoreCase("InPatient request already done for this appointment")){
           assertTrue(page.inpatientMessage.isDisplayed());
        }else {
            assertTrue(page.inpatientSuccessfulyMessage.isDisplayed());
        }

    }




    //****************US14_TC01****************

    @Then("ZH Kullanici My Inpatients butonuna tiklar")
    public void ZHkullanici_my_inpatients_butonuna_tiklar() {
        page.myInpatients.click();

    }@Then("ZH Kullanici In Patients bilgilerin gorunurlugunu kontrol eder.")
    public void ZHkullaniciInPatientsBilgilerinGorunurlugunuKontrolEder() {
        List<WebElement> myInpatientsBilgileriListesi = page.viewResultsHastaBilgileri;

        int istenenBaslikIndexi = -3;
        for (int i = 0; i < myInpatientsBilgileriListesi.size(); i++) {
            if (myInpatientsBilgileriListesi.get(i).getText().equals(myInpatientsBilgileriListesi)) {
                istenenBaslikIndexi = i + 1;
            }
            System.out.println(page.viewResultsHastaBilgileri.get(i).getText());
            System.out.println(myInpatientsBilgileriListesi.get(i).getText());
        }

        if (istenenBaslikIndexi != -3) {
            List<WebElement> istenenSutundakiElementler = Driver.getDriver().findElements(By.xpath("//tbody//tr//td[" + istenenBaslikIndexi + "]"));
            for (WebElement each : istenenSutundakiElementler
            ) {
                System.out.println(each.getText());
            }
        }
    }


    //****************US14_TC02****************
    @And("ZH Physician My inpatients sekmesine tiklar")
    public void ZHphysicianMyInpatientsSekmesineTiklar() throws InterruptedException {
        Thread.sleep(8000);
        page.myInpatients.click();
    }

    @And("ZH Physician Edit butonuna tiklar")
    public void ZHphysicianEditButonunaTiklar() {
        page.statusDegistirilecekEditButonu.click();
    }

    @Then("ZH Physician sayfayi kapatir")
    public void ZHphysicianSayfayiKapatir() throws InterruptedException {

        page.physicianTeam54Butonu.click();
        Thread.sleep(4000);
        page.signOut.click();



       /* WebElement dropDown=Driver.getDriver().findElement(By.xpath("//li[@class='dropdown show nav-item']"));
        Select select=new Select(dropDown);
        select.selectByIndex(3);
        System.out.println(select.getFirstSelectedOption().getText());
        //Actions actions=new Actions(Driver.getDriver());*/


    }


    @Then("ZH Physician {string} günceller")
    public void ZHphysicianGünceller(String status) {

        WebElement dropDown=Driver.getDriver().findElement(By.xpath("//select[@id='in-patient-status']"));
        Select select=new Select(dropDown);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        select.selectByValue("STAYING");
        page.saveButton.submit();


    }

    @Then("ZH Physician oda numarasini günceller")
    public void ZHphysicianOdaNumarasiniGünceller() {
        WebElement dropDown=Driver.getDriver().findElement(By.xpath("//select[@id='in-patient-room']"));
        Select select=new Select(dropDown);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        select.selectByValue("26880");
        page.saveButton.submit();

    }

    @Then("ZH save butonuna basar")
    public void ZHsaveButonunaBasar() {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        page.saveButton.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        assertFalse(page.saveHataMesaji.isDisplayed());

    }

    @Then("ZH sayfayi kapatir")
    public void ZHsayfayiKapatir() {
        Driver.closeDriver();
    }
}
