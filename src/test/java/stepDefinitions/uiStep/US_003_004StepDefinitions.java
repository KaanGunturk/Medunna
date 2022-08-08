package stepDefinitions.uiStep;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.US_003_004Page;
import utilities.ConfigReader;
import utilities.Driver;


public class US_003_004StepDefinitions {
     US_003_004Page page = new US_003_004Page();

     //us_003
    @Given("Kullanici medunna.com adresine gider")
    public void kullanici_medunna_com_adresine_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));
    }

    @Given("Kullanici Profil butonuna tiklar")
    public void kullanici_profil_butonuna_tiklar() {

    }

    @Given("Kullanici Register butonuna tiklar")
    public void kullanici_register_butonuna_tiklar() {

    }

    @Then("Kullanici New password kutusuna en az bir kucuk harfli sifre girer")
    public void kullanici_new_password_kutusuna_en_az_bir_kucuk_harfli_sifre_girer() {

    }

    @Then("Password strength seviyesinin degistigi test edilir")
    public void password_strength_seviyesinin_degistigi_test_edilir() {

    }

    @Then("Kullanici New password kutusuna en az bir buyuk harfli sifre girer")
    public void kullanici_new_password_kutusuna_en_az_bir_buyuk_harfli_sifre_girer() {

    }

    @Then("Kullanici New password kutusuna en az bir rakamli sifre girer")
    public void kullanici_new_password_kutusuna_en_az_bir_rakamli_sifre_girer() {

    }

    @Then("Kullanici New password kutusuna en az bir ozel karakterli sifre girer")
    public void kullanici_new_password_kutusuna_en_az_bir_ozel_karakterli_sifre_girer() {

    }

    @Then("Kullanici New password kutusuna en az yedi karakterli bir sifre girer")
    public void kullanici_new_password_kutusuna_en_az_yedi_karakterli_bir_sifre_girer() {

    }

    @Then("Password strength seviyesinin guclu oldugu test edilir")
    public void password_strength_seviyesinin_guclu_oldugu_test_edilir() {

    }

    //us_004
    @Then("Kullanici Sign in butonuna tiklar")
    public void kullanici_sign_in_butonuna_tiklar() {

    }

    @Then("Remember me kutusunun gorunurlulugu kontrol edilir")
    public void remember_me_kutusunun_gorunurlulugu_kontrol_edilir() {

    }

    @Then("Did you forget your password? butonunun gorunurlulugu test edilir")
    public void did_you_forget_your_password_butonunun_gorunurlulugu_test_edilir() {

    }

    @Then("'You don't have an account yet? Register a new account' butonunun gorunurlulugu test edilir")
    public void you_don_t_have_an_account_yet_register_a_new_account_butonunun_gorunurlulugu_test_edilir() {

    }

    @Then("Cancel butonunun gorunurlulugu test edilir")
    public void cancel_butonunun_gorunurlulugu_test_edilir() {

    }

    @Then("Kullanici Username kutusuna gecerli kullanici adi girer")
    public void kullanici_username_kutusuna_gecerli_kullanici_adi_girer() {

    }

    @Then("Kullanici Password kutusuna gecerli sifre girer")
    public void kullanici_password_kutusuna_gecerli_sifre_girer() {

    }

    @Then("Basarili giris mesajinin gorunurlulugu test edilir")
    public void basarili_giris_mesajinin_gorunurlulugu_test_edilir() {

    }

}
