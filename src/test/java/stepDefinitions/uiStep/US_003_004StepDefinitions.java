package stepDefinitions.uiStep;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.asserts.SoftAssert;
import pages.US_003_004Page;
import utilities.ConfigReader;
import utilities.Driver;


public class US_003_004StepDefinitions {
    US_003_004Page page = new US_003_004Page();

    static SoftAssert softAssert = new SoftAssert();
    static JavascriptExecutor jse=(JavascriptExecutor) Driver.getDriver();

    //us_003
    @Given("YS Kullanici medunna.com adresine gider")
    public void ySkullanici_medunna_com_adresine_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));
    }

    @Given("YS Kullanici Profil butonuna tiklar")
    public void ySkullanici_profil_butonuna_tiklar() {
        page.profilButonu.click();
    }

    @Given("YS Kullanici Register butonuna tiklar")
    public void ySkullanici_register_butonuna_tiklar() {
        page.registerButonu.click();
    }

    @Then("YS Kullanici New password kutusuna en az bir kucuk harfli sifre girer")
    public void ySkullanici_new_password_kutusuna_en_az_bir_kucuk_harfli_sifre_girer() {
        page.newPasswordTextBox.sendKeys("aaaaaaA");
    }

    @Then("YS Kullanici New password kutusuna en az bir buyuk harfli sifre girer")
    public void ySkullanici_new_password_kutusuna_en_az_bir_buyuk_harfli_sifre_girer() {
        page.newPasswordTextBox.sendKeys("aaaaaaA");
    }

    @Then("YS Kullanici New password kutusuna en az bir rakamli sifre girer")
    public void ySkullanici_new_password_kutusuna_en_az_bir_rakamli_sifre_girer() {
        page.newPasswordTextBox.sendKeys("aaaaaa1");
    }

    @Then("YS Kullanici New password kutusuna en az bir ozel karakterli sifre girer")
    public void ySkullanici_new_password_kutusuna_en_az_bir_ozel_karakterli_sifre_girer() {
        page.newPasswordTextBox.sendKeys("aaaaaa*");
    }

    @Then("YS Kullanici New password kutusuna en az yedi karakterli bir sifre girer")
    public void ySkullanici_new_password_kutusuna_en_az_yedi_karakterli_bir_sifre_girer() {
        page.newPasswordTextBox.sendKeys("aaaAA1**");
    }

    @Then("YS Password strength seviyesinin degistigi test edilir")
    public void ySpassword_strength_seviyesinin_degistigi_test_edilir() {
        String expectedStrengthBar1 = "background-color: rgb(255, 153, 0);";
        String expectedStrengthBar2 = "background-color: rgb(255, 153, 0);";

        jse.executeScript("arguments[0].scrollIntoView(true);", page.strengthBarSeviye2);

        String actualStrengthBar1 = page.strengthBarSeviye1.getAttribute("style");
        String actualStrengthBar2 = page.strengthBarSeviye2.getAttribute("style");

        softAssert.assertEquals(expectedStrengthBar1, actualStrengthBar1, "Strength bar 1 seviye degisimi basarisiz sonuclandi");
        softAssert.assertEquals(expectedStrengthBar2, actualStrengthBar2, "Strength bar 2 seviye degisimi basarisiz sonuclandi");
        page.newPasswordTextBox.clear();

    }

    @Then("YS Password strength seviyesinin guclu oldugu test edilir")
    public void ySpassword_strength_seviyesinin_guclu_oldugu_test_edilir() {
        String expectedStrengthBar5 = "background-color: rgb(221, 221, 221);";
        String actualStrengthBar5 = page.strengthBarSeviye5.getAttribute("style");
        softAssert.assertEquals(expectedStrengthBar5, actualStrengthBar5, "Strength bar 5 seviye degisimi basarisiz sonuclandi");
    }

    //us_004
    @Then("YS Kullanici Sign in butonuna tiklar")
    public void ySkullanici_sign_in_butonuna_tiklar() {
        page.signInButonu.click();
    }

    @Then("YS Remember me kutusunun gorunurlulugu kontrol edilir")
    public void ySremember_me_kutusunun_gorunurlulugu_kontrol_edilir() {
        softAssert.assertTrue(page.rememberMeBox.isDisplayed(), "remember me kutusu goruntulenmiyor");
    }

    @Then("YS Did you forget your password? butonunun gorunurlulugu test edilir")
    public void ySdid_you_forget_your_password_butonunun_gorunurlulugu_test_edilir() {
        softAssert.assertTrue(page.didYouForgotPasswordButonu.isDisplayed(), "Did you forget your password? butonu goruntulenmiyor");
    }

    @Then("YS 'You don't have an account yet? Register a new account' butonunun gorunurlulugu test edilir")
    public void ySyou_don_t_have_an_account_yet_register_a_new_account_butonunun_gorunurlulugu_test_edilir() {
        softAssert.assertTrue(page.youDontHaveAccountYetButonu.isDisplayed(),
                "You don't have an account yet? Register a new account butonu goruntulenmiyor");
    }

    @Then("YS Cancel butonunun gorunurlulugu test edilir")
    public void yScancel_butonunun_gorunurlulugu_test_edilir() {
        softAssert.assertTrue(page.cancelButonu.isDisplayed(), "cancel butonu goruntulenmiyor");
    }

    @Then("YS Kullanici Username kutusuna gecerli kullanici adi girer")
    public void ySkullanici_username_kutusuna_gecerli_kullanici_adi_girer() {
        page.usernameTextBox.sendKeys(ConfigReader.getProperty("userNameAdmin"));
    }

    @Then("YS Kullanici Password kutusuna gecerli sifre girer")
    public void ySkullanici_password_kutusuna_gecerli_sifre_girer() {
        page.passwordTextBox.sendKeys(ConfigReader.getProperty("sifreAdmin"));
    }

    @And("YS Kullanici ikinci Sign in butonuna tiklar")
    public void ySkullaniciIkinciSignInButonunaTiklar() {
        page.signInPageSignInButonu.click();
    }

    @Then("YS Basarili giris mesajinin gorunurlulugu test edilir")
    public void ySbasarili_giris_mesajinin_gorunurlulugu_test_edilir() {
        softAssert.assertTrue(page.basariliGiris.isDisplayed(), "basarili giris yapilamadi");
    }

}
