package stepDefinitions.uiStep;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
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

public class US018_StepDefinitions {

    US018_Page ayberk = new US018_Page();

    Actions actions = new Actions(Driver.getDriver());

    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

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
        js.executeScript("arguments[0].scrollIntoView(true);", ayberk.saveButton);
        ayberk.saveButton.click();
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
    }

    @And("admin use search check box tiklar")
    public void adminUseSearchCheckBoxTiklar() {
        ayberk.useSSNSearchCheckBox.click();
        ReusableMethods.waitFor(1);
    }

    @And("admin tarih girer")
    public void adminTarihGirer() {
        js.executeScript("arguments[0].click();", ayberk.birthDate);
        ayberk.birthDate.sendKeys("18121980");
        ReusableMethods.waitFor(1);
    }

    @And("admin telefon {string} girer")
    public void adminTelefonGirer(String tel) {
        ayberk.phone.sendKeys(tel);
        ReusableMethods.waitFor(1);

    }

    @And("admin adres {string} girer")
    public void adminAdresGirer(String address) {
        ayberk.adress.sendKeys(address);
        ReusableMethods.waitFor(1);
    }

    @And("admin cinsiyet belirler")
    public void adminCinsiyetBelirler() {
        Select select = new Select(ayberk.genderDdm);
        select.selectByVisibleText("MALE");
        ReusableMethods.waitFor(1);
    }

    @And("admin uzmanlik belirler")
    public void adminUzmanlikBelirler() {
        Select select = new Select(ayberk.specialityDdm);
        select.selectByVisibleText("Dermatology");
        ReusableMethods.waitFor(1);
    }

    @And("admin description {string} girer")
    public void adminDescriptionGirer(String desc) {
        ayberk.description.sendKeys(desc);
        ReusableMethods.waitFor(1);
    }

    @And("admin fotograf yukler")
    public void adminFotografYukler() throws AWTException {
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
    }

    @And("admin {string} dolar ucret belirler")
    public void adminDolarUcretBelirler(String exam) {
        js.executeScript("arguments[0].scrollIntoView(true);", ayberk.examFee);
        ayberk.examFee.sendKeys(exam);
    }

    @And("admin country secer")
    public void adminCountrySecer() {
        Select select = new Select(ayberk.countryDdm);
        select.selectByVisibleText("THE UNITED KINGDOM");
    }

    @Then("dogrulama mesajinin gorundugunu test eder")
    public void dogrulamaMesajininGorundugunuTestEder() {

        Assert.assertTrue(ayberk.dogrulamaMesaji.isDisplayed());
    }

    @And("admin edit butona tiklar")
    public void adminEditButonaTiklar() {
        ayberk.editButton.click();
    }

    @Then("edit icin dogrulama mesajinin gorundugunu test eder")
    public void editIcinDogrulamaMesajininGorundugunuTestEder() {
        Assert.assertTrue(ayberk.dogrulamaMesaji3.isDisplayed());
    }

    @Then("admin bütün doktorların bilgilerinin görüldügünü test eder")
    public void adminBütünDoktorlarınBilgilerininGörüldügünüTestEder() {
        //List<Object> expectedData = new List();
        for (int i = 0; i < ayberk.table.size(); i++) {
            System.out.println(ayberk.table.get(i).getText());
            Assert.assertTrue(ayberk.table.get(i).isDisplayed());
        }

    }
}
