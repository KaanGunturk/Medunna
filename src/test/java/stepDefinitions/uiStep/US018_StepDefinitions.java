package stepDefinitions.uiStep;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.US018_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US018_StepDefinitions {

    US018_Page ayberk = new US018_Page();

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
        Assert.assertTrue(ayberk.dogrulamaMesaji.isDisplayed());
    }
}
