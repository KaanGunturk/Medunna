package stepDefinitions.uiStep;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.Keys;
import pages.US_08_Page;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.Random;
import java.util.RandomAccess;

public class US_08_StepDefinitions {

    US_08_Page page=new US_08_Page();

    // ----- TC_01 ----- \\

    @Given("AEE Kullanici medunna.com adresine gider")
    public void aee_kullanici_medunna_com_adresine_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));
    }

    @Then("AEE Kullanici Profil butonuna tiklar")
    public void aee_kullanici_profil_butonuna_tiklar() throws InterruptedException {
        page.profilButonu.click();
        Thread.sleep(1000);
    }

    @Then("AEE Kullanici Sign in butonuna tiklar")
    public void aee_kullanici_sign_in_butonuna_tiklar() throws InterruptedException {
        page.signInButonu.click();
        Thread.sleep(1000);
    }

    @And("AEE Kullanici {string} username ve {string} sifresini girer")
    public void aeeKullaniciUsernameVeSifresiniGirer(String username, String password) throws InterruptedException {
        page.usernameTextBox.sendKeys(username);
        Thread.sleep(500);
        page.passwordTextBox.sendKeys(password);
        Thread.sleep(500);
        page.signInButonu2.click();
        Thread.sleep(1300);
    }

    @Then("AEE Kullanici Hesap butonuna tiklar")
    public void aee_kullanici_hesap_butonuna_tiklar() throws InterruptedException {
        page.hesapButonu.click();
        Thread.sleep(700);
    }

    @Then("AEE Kullanici Password butonuna tiklar")
    public void aee_kullanici_password_butonuna_tiklar() throws InterruptedException {
        page.passwordButonu.click();
        Thread.sleep(700);

    }

    @Then("AEE New password confirmation kisminin kullanilabilir oldugu test edilir")
    public void aee_new_password_confirmation_kisminin_kullanilabilir_oldugu_test_edilir() {
        page.newPasswordConfirmation.isDisplayed();
    }

    @And("AEE Kullanici sayfayi kapatir")
    public void aeeKullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }

    // ----- TC_02 ----- \\

    @And("AEE Kullanici New password kismina {string} yazar")
    public void aeeKullaniciNewPasswordKisminaYazar(String onemsiz) throws InterruptedException {
        page.newPassword.sendKeys(onemsiz);
    }


    @And("AEE Kullanici New password kisminin devamina bir kucuk harf yazar")
    public void aeeKullaniciNewPasswordKismininDevaminaBirKucukHarfYazar() throws InterruptedException {
        page.newPassword.sendKeys("a");
        Thread.sleep(700);

    }

    @Then("AEE Password strength seviyesinin degisikligi test edilir")
    public void aeePasswordStrengthSeviyesininDegisikligiTestEdilir() {
        page.ikinciKutu.isDisplayed();
    }

    // ----- TC_03 ----- \\

    @And("AEE Kullanici New password kisminin devamina bir buyuk harf yazar")
    public void aeeKullaniciNewPasswordKismininDevaminaBirBuyukHarfYazar() {
        page.newPassword.sendKeys("A");
    }

    // ----- TC_04 ----- \\

    @And("AEE Kullanici New password kisminin devamina bir rakam yazar")
    public void aeeKullaniciNewPasswordKismininDevaminaBirRakamYazar() {
        page.newPassword.sendKeys("2");
    }

    // ----- TC_05 ----- \\

    @And("AEE Kullanici New password kisminin devamina bir ozel karakter yazar")
    public void aeeKullaniciNewPasswordKismininDevaminaBirOzelKarakterYazar() {
        page.newPassword.sendKeys(".");
    }

    // ----- TC_06 ----- \\

    @Then("AEE Password strength seviyesi ilk kutuda oldugu test edilir")
    public void aeePasswordStrengthSeviyesiIlkKutudaOlduguTestEdilir() throws InterruptedException {
        page.birinciKutu.isDisplayed();
        Thread.sleep(700);
    }

    @Then("AEE Password strength seviyesin guclu oldugu test edilir")
    public void aeePasswordStrengthSeviyesinGucluOlduguTestEdilir() throws InterruptedException {
        page.besinciKutu.isDisplayed();
        Thread.sleep(700);
    }

    // ----- TC_07 ----- \\

    @And("AEE Kullanici Current password kismina {string} eski sifreyi girer")
    public void aeeKullaniciCurrentPasswordKisminaEskiSifreyiGirer(String password) {
        page.currentPassword.sendKeys(password);
    }

    @And("AEE Kullanici New password kismina {string} eski sifreyi girer")
    public void aeeKullaniciNewPasswordKisminaEskiSifreyiGirer(String password) {
        page.newPassword.sendKeys(password);
    }

    @And("AEE Kullanici New password confirmation kismina {string} eski sifreyi girer")
    public void aeeKullaniciNewPasswordConfirmationKisminaEskiSifreyiGirer(String password) {
        page.confirmPassword.sendKeys(password);
    }

    @And("AEE Kullanici Save butonuna tiklar")
    public void aeeKullaniciSaveButonunaTiklar() throws InterruptedException {
        page.saveButonu.click();
        Thread.sleep(1500);
    }

    @And("AEE Kullanici Password Changed yazisini gorur")
    public void aeeKullaniciPasswordChangedYazisiniGorur() {
        page.passwordChanged.isDisplayed();
    }
}
