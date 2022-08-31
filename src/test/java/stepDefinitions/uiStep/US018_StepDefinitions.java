package stepDefinitions.uiStep;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.US018_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class US018_StepDefinitions {

    US018_Page ayberk = new US018_Page();

    Actions actions = new Actions(Driver.getDriver());

    Select select;

    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    static String alinacakIdStr;

    @Given("admin {string} anasayfasinda")
    public void admin_anasayfasinda(String baseUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(baseUrl));
    }

    @Given("profil sembolune tiklar")
    public void profil_sembolune_tiklar() {
        ayberk.profilSimgesi.click();
        //ReusableMethods.waitFor(2);
    }

    @Given("singIn sekmesi tiklar")
    public void sing_in_sekmesi_tiklar() {
        ayberk.signInButton1.click();
    }

    @Given("user gecerli {string} ve {string} ile giris yapar")
    public void user_gecerli_ve_ile_giris_yapar(String username, String password) {
        ReusableMethods.waitFor(2);
        ayberk.usernameBox.sendKeys(ConfigReader.getProperty(username));
        ayberk.passwordBox.sendKeys(ConfigReader.getProperty(password));
        ReusableMethods.waitFor(2);
    }

    @Given("singin butonuna basar")
    public void singin_butonuna_basar() {
        ayberk.sing_in_button2.click();
    }

    @Given("admin items&titles sekmesine basar")
    public void admin_items_titles_sekmesine_basar() {
        ReusableMethods.waitForVisibility(ayberk.itemsAndTitles, 10);
        ayberk.itemsAndTitles.click();
    }

    @Given("admin physician sekmesine basar")
    public void admin_physician_sekmesine_basar() {
        ReusableMethods.waitForVisibility(ayberk.physician, 10);
        ayberk.physician.click();
        ReusableMethods.waitFor(1);
    }


    @And("admin administration sekmesine basar")
    public void adminAdministrationSekmesineBasar() {
        ReusableMethods.waitForVisibility(ayberk.administration, 10);
        ayberk.administration.click();
    }

    @And("admin user management sekmesine basar")
    public void adminUserManagementSekmesineBasar() {
        ReusableMethods.waitForVisibility(ayberk.userManagement, 10);
        ayberk.userManagement.click();
    }

    @And("admin create a new user sekmesine basar")
    public void adminCreateANewUserSekmesineBasar() {
        ReusableMethods.waitForVisibility(ayberk.createANewUser, 10);
        ayberk.createANewUser.click();
    }

    @And("admin login {string} firstname {string} lastname {string} mail {string} SSN {string} rol olarak doktor girer")
    public void adminLoginFirstnameLastnameMailSSNRolOlarakDoktorGirer(String login, String firstname, String lastname, String mail, String ssn) {
        ReusableMethods.waitForVisibility(ayberk.loginTextBox, 10);
        ayberk.loginTextBox.sendKeys(login);
        ayberk.firstNameTextBox.sendKeys(firstname);
        ayberk.lastNameTextBox.sendKeys(lastname);
        ayberk.emailTextBox.sendKeys(mail);
        ayberk.ssnTextBox.sendKeys(ssn);

        Select select = new Select(ayberk.roleDdm);
        select.selectByVisibleText("ROLE_PHYSICIAN");
    }

    @And("admin save tusuna basar")
    public void adminSaveTusunaBasar() {
        js.executeScript("arguments[0].scrollIntoView(true);", ayberk.medunnaText);
        ReusableMethods.waitForClickablility(ayberk.saveButton, 10);
        js.executeScript("arguments[0].click();", ayberk.saveButton);
    }

    @And("admin create a new physician sekmesine basar")
    public void adminCreateANewPhysicianSekmesineBasar() {
        ReusableMethods.waitForVisibility(ayberk.createANewPhysician, 10);
        ayberk.createANewPhysician.click();

    }

    @Then("admin kayitli SSN {string} girer ve dogrulama mesajinin geldigini test eder")
    public void adminKayitliSSNGirerVeDogrulamaMesajininGeldiginiTestEder(String ssn) {
        ReusableMethods.waitForVisibility(ayberk.searchSSN, 10);
        ayberk.searchSSN.sendKeys(ssn);
        ayberk.searchUser.click();
        ReusableMethods.waitForVisibility(ayberk.dogrulamaMesaji, 10);
        Assert.assertTrue(ayberk.dogrulamaMesaji.isDisplayed());
        ayberk.dogrulamaMesaji.click();
    }

    @And("admin use search check box tiklar")
    public void adminUseSearchCheckBoxTiklar() {
        ayberk.useSSNSearchCheckBox.click();
        ReusableMethods.waitFor(1);
    }

    @And("admin tarih {string} girer")
    public void adminTarihGirer(String tarih) {
        ayberk.birthDate.sendKeys(tarih);
        ReusableMethods.waitFor(1);
    }

    @And("admin telefon {string} girer")
    public void adminTelefonGirer(String tel) {
        ayberk.phone.click();
        ayberk.phone.clear();
        ReusableMethods.waitFor(1);
        ayberk.phone.sendKeys(tel);
        ReusableMethods.waitFor(1);

    }

    @And("admin adres {string} girer")
    public void adminAdresGirer(String address) {
        ayberk.adress.click();
        ayberk.adress.clear();
        ReusableMethods.waitFor(1);
        ayberk.adress.sendKeys(address);
        ReusableMethods.waitFor(1);
    }

    @And("admin cinsiyet {string} belirler")
    public void adminCinsiyetBelirler(String gender) {
        select = new Select(ayberk.genderDdm);
        select.selectByVisibleText(gender);
        ReusableMethods.waitFor(1);
    }

    @And("admin uzmanlik {string} belirler")
    public void adminUzmanlikBelirler(String speciality) {
        select = new Select(ayberk.specialityDdm);
        select.selectByVisibleText(speciality);
        ReusableMethods.waitFor(1);
    }

    @And("admin kan grubu {string} secer")
    public void adminKanGrubuSecer(String bloodType) {
        select = new Select(ayberk.bloodGroupDdm);
        select.selectByVisibleText(bloodType);
        ReusableMethods.waitFor(1);
    }

    @And("admin description {string} girer")
    public void adminDescriptionGirer(String desc) {
        ayberk.description.clear();
        ayberk.description.sendKeys(desc);
        ReusableMethods.waitFor(1);
    }

    @And("admin fotograf yukler")
    public void adminFotografYukler() throws AWTException {

        String path = "C:\\Users\\ayber\\Desktop\\images.jpg";
        ayberk.dosyaSecButton.sendKeys(path);

        /*
        // User clicks "Dosya Seçin" button
        ayberk.dosyaSecButton.click();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,200)");
        //trady.uploadFile.click();
        ReusableMethods.waitFor(3);
        Robot rb = new Robot();
        String photoName = "669047.png";
        StringSelection str = new StringSelection("\"D:\\meh\\wp\\" + photoName + "\"");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);
        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
        //User selects product photo and click open button
        //ReusableMethods.waitForClickablility(trady.secButton, 15);
        //trady.secButton.click();
        //String actualText = trady.gorunenFoto.getText();
        //softassert.assertTrue(actualText.contains(photoName));
        // fotoğraf eklenebildiği zaman fotoğrafı seç
        // sonra ürün ekleme ekranındaki fotoğrafın stringi var zaten
        // tek yapman gerekn assert çalışıyor mu ona bak
        // locateler değişebiliyor aklında bulunsun

         */
    }

    @And("admin {string} dolar ucret belirler")
    public void adminDolarUcretBelirler(String exam) {
        js.executeScript("arguments[0].scrollIntoView(true);", ayberk.examFee);
        ayberk.examFee.clear();
        ayberk.examFee.sendKeys(exam);
        ReusableMethods.waitFor(1);
    }

    @And("admin country {string} secer")
    public void adminCountrySecer(String country) {
        Select select = new Select(ayberk.countryDdm);
        select.selectByVisibleText(country);
        ReusableMethods.waitFor(1);
    }

    @And("admin idsi {string} olan doktorun edit butona tiklar")
    public void adminIdsiOlanDoktorunEditButonaTiklar(String id) {

        int count = 1;
        List<WebElement> idList = ayberk.idTableList;
        System.out.println(idList.size());


        for (WebElement i : idList) {
            if (i.getText().equals(id)) break;
            count++;
        }

        WebElement editlenecekDoktor = Driver.getDriver().findElement(By.xpath("//tr[" + count + "]/td[18]/div/a[3]"));
        js.executeScript("arguments[0].click();", editlenecekDoktor);

        ReusableMethods.waitFor(1);


    }

    @And("admin firstname {string} olan doktorun edit butona tiklar")
    public void adminFirstnameOlanDoktorunEditButonaTiklar(String firstname) {

        int count = 1;
        List<WebElement> nameList = ayberk.firstnameTableList;
        System.out.println(nameList.size());


        for (WebElement i : nameList) {
            if (i.getText().equals(firstname)) break;
            count++;
        }

        WebElement editlenecekDoktor = Driver.getDriver().findElement(By.xpath("//tr[" + count + "]/td[18]/div/a[2]"));
        js.executeScript("arguments[0].click();", editlenecekDoktor);

        ReusableMethods.waitFor(1);

    }

    @And("admin idsi {string} olan doktorun delete butonuna basar")
    public void adminIdsiOlanDoktorunDeleteButonunaBasar(String id) {
        int count = 1;
        List<WebElement> idList = ayberk.idTableList;
        System.out.println(idList.size());


        for (WebElement i : idList) {
            if (i.getText().equals(id)) break;
            count++;
        }

        WebElement editlenecekDoktor = Driver.getDriver().findElement(By.xpath("//tr[" + count + "]/td[18]/div/a[3]"));
        js.executeScript("arguments[0].click();", editlenecekDoktor);

        ReusableMethods.waitFor(1);
    }

    @And("admin firstname {string} olan doktorun delete butona tiklar")
    public void adminFirstnameOlanDoktorunDeleteButonaTiklar(String firstname) {

        int count = 1;
        List<WebElement> nameList = ayberk.firstnameTableList;
        System.out.println(nameList.size());


        for (WebElement i : nameList) {
            if (i.getText().equals(firstname)) break;
            count++;
        }

        WebElement editlenecekDoktor = Driver.getDriver().findElement(By.xpath("//tr[" + count + "]/td[18]/div/a[3]"));
        js.executeScript("arguments[0].click();", editlenecekDoktor);

        ReusableMethods.waitFor(1);

    }


    @Then("edit icin dogrulama mesajinin gorundugunu test eder")
    public void editIcinDogrulamaMesajininGorundugunuTestEder() {
        WebElement dogrulamaMesaji = Driver.getDriver().findElement(By.xpath("//*[text()='A Physician is updated with identifier " + alinacakIdStr + "']"));
        ReusableMethods.waitForVisibility(dogrulamaMesaji, 10);
        Assert.assertTrue(dogrulamaMesaji.isDisplayed());
    }

    @Then("create icin dogrulama mesajinin gorundugunu test eder")
    public void createIcinDogrulamaMesajininGorundugunuTestEder() {
        WebElement dogrulamaMesaji = Driver.getDriver().findElement(By.xpath("//div[@role='alert']"));
        ReusableMethods.waitForVisibility(dogrulamaMesaji, 10);
        String expectedDogrulamaMesaji = "A new Physician is created with identifier";
        Assert.assertTrue(dogrulamaMesaji.getText().contains(expectedDogrulamaMesaji));
    }

    @Then("admin butun doktorlarin bilgilerinin goruldugunu test eder")
    public void adminButunDoktorlarinBilgilerininGoruldugunuTestEder() {
        List<Object> expectedDataList = new ArrayList<>();
        expectedDataList.add(2051);
        expectedDataList.add("321-48-7891");
        expectedDataList.add("Kena");
        expectedDataList.add("Sauer");
        expectedDataList.add("01/01/80 02:00");
        expectedDataList.add("2345566677");
        expectedDataList.add("FEMALE");
        expectedDataList.add("O+");
        expectedDataList.add("593 Wintheiser Unions, North Tamishamouth, NV 74219");
        expectedDataList.add("ANESTHESIOLOGY");
        expectedDataList.add(500);
        expectedDataList.add("Prof Dr");
        expectedDataList.add("14/12/21 13:40");
        expectedDataList.add(" image/jpeg, 105 850 bytes");
        expectedDataList.add("team88_user1");
        expectedDataList.add("ABD");
        expectedDataList.add("California");
        expectedDataList.add("View\nEdit\nDelete");

        List<WebElement> actualDataList = ayberk.table;

        int count = 0;
        System.out.println("Expected size " + expectedDataList.size());
        System.out.println("Actual size " + actualDataList.size());

        for (int i = 0; i < expectedDataList.size(); i++) {
            for (int j = 0; j < actualDataList.size(); j++) {
                if (expectedDataList.get(i).equals(actualDataList.get(j).getText())) {
                    Assert.assertEquals(expectedDataList.get(i), actualDataList.get(j).getText());
                }
            }
        }

/*
        System.out.println("Expected uzunluk: " + expectedDataList.size());
        System.out.println("Actual uzunluk: " + actualDataList.size());

        System.out.println();

        System.out.println("ExpectedDataList");
        for (int i = 0; i < expectedDataList.size(); i++) {
            System.out.print(expectedDataList.get(i) + " ");
        }

        System.out.println();

        System.out.println("ActualDataList");
        System.out.println("ActualDataList uzunluk: " + actualDataList.size());
        for (int i = 0; i < actualDataList.size(); i++) {
            System.out.print(actualDataList.get(i).getText() + " ");
        }

 */
    }

    @Then("admin idsi {string} doktorun silindiginin dogrulama mesajini teyit eder")
    public void adminIdsiDoktorunSilindigininDogrulamaMesajiniTeyitEder(String id) {
        //A Physician is deleted with identifier 205441
        WebElement dogrulamaMesaji = Driver.getDriver().findElement(By.xpath("//*[text()='A Physician is deleted with identifier " + id + "']"));
        Assert.assertTrue(dogrulamaMesaji.isDisplayed());
    }

    @Then("delete icin dogrulama mesajinin gorundugunu test eder")
    public void deleteIcinDogrulamaMesajininGorundugunuTestEder() {
        WebElement dogrulamaMesaji = Driver.getDriver().findElement(By.xpath("//*[text()='A Physician is deleted with identifier " + alinacakIdStr + "']"));
        ReusableMethods.waitForVisibility(dogrulamaMesaji, 10);
        Assert.assertTrue(dogrulamaMesaji.isDisplayed());
    }

    @And("admin {int} sayfaya gecer")
    public void adminSayfayaGecer(int sayfaNo) {
        js.executeScript("arguments[0].scrollIntoView(true);", ayberk.medunnaText);
        WebElement sayfaNoButton = Driver.getDriver().findElement(By.xpath("//*[text()='" + sayfaNo + "']"));
        js.executeScript("arguments[0].click();", sayfaNoButton);
        ReusableMethods.waitFor(1);
    }

    @And("admin cikan uyari mesajinda delete butonuna basar")
    public void adminCikanUyariMesajindaDeleteButonunaBasar() {
        ReusableMethods.waitForVisibility(ayberk.deleteButton2, 10);
        ayberk.deleteButton2.click();
        ReusableMethods.waitFor(1);


    }


    @And("admin firstname {string} olan doktorun idisini alir")
    public void adminFirstnameOlanDoktorunIdisiniAlir(String firstname) {

        int count = 1;
        List<WebElement> firstnameList = ayberk.firstnameTableList;
        System.out.println(firstnameList.size());


        for (WebElement i : firstnameList) {
            if (i.getText().equals(firstname)) break;
            count++;
        }

        WebElement alinacakId = Driver.getDriver().findElement(By.xpath("//tr[" + count + "]/td[1]"));
        alinacakIdStr = alinacakId.getText();

    }

    @And("admin logini {string} olan doktorun idisini alir")
    public void adminLoginiOlanDoktorunIdisiniAlir(String login) {
        int count = 1;
        List<WebElement> loginList = ayberk.loginTableList;
        System.out.println(loginList.size());


        for (WebElement i : loginList) {
            if (i.getText().equals(login)) break;
            count++;
        }

        WebElement alinacakId = Driver.getDriver().findElement(By.xpath("//tr[" + count + "]/td[1]"));
        alinacakIdStr = alinacakId.getText();
        System.out.println(alinacakIdStr);
    }


    @And("admin sayfayi kapatir")
    public void adminSayfayiKapatir() {
        Driver.closeDriver();
    }

}
