package stepDefinitions.uiStep;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.US_06_07Page;
import utilities.ConfigReader;
import utilities.Driver;

import static org.junit.Assert.assertTrue;

public class US_06_07StepDefinitions {

    US_06_07Page us_06_07page=new US_06_07Page();

    @Given("medunna sayfasında")
    public void medunna_sayfasında() {

        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));

    }

    @Then("kullanici  profil simgesine tiklar")
    public void kullanici_profil_simgesine_tiklar() {
        us_06_07page.kullaniciSembolu.click();


    }

    @Then("Kullanici sign in sekmesine tiklar")
    public void kullanici_sign_in_sekmesine_tiklar() {
        us_06_07page.settingButonu.click();

    }

    @Then("Kullanici valid username ve valid password girisi yapar")
    public void kullanici_valid_username_ve_valid_password_girisi_yapar() {
        us_06_07page.Username.sendKeys("UserTeam54");
        us_06_07page.password.sendKeys("UserTeam54");

    }

    @Then("Kullanici sign in butonuna tiklar")
    public void kullanici_sign_in_butonuna_tiklar() {

        us_06_07page.signIn.click();

    }

    @Then("Kullanıcı bilgi sekmesine tıklar acılan DDM-den Setting seçeneğine tıklar")
    public void kullanıcı_bilgi_sekmesine_tıklar_acılan_ddm_den_setting_seçeneğine_tıklar(){

        us_06_07page.profilButonu.click();
        us_06_07page.settingButonu.click();

    }

    @Then("{string} kutucukları görünür olmalı")
    public void kutucukları_görünür_olmalı(String string) {

        assertTrue(us_06_07page.firstname.isDisplayed());
        assertTrue(us_06_07page.lastname.isDisplayed());
        assertTrue(us_06_07page.email.isDisplayed());

    }

    @Then("Kullanıcı {string} secenegini güncelleyebilmeli")
    public void kullanıcı_secenegini_güncelleyebilmeli(String string) {

        us_06_07page.firstname.clear();
        us_06_07page.firstname.sendKeys("Saniye");

        us_06_07page.lastname.clear();
        us_06_07page.lastname.sendKeys("Güneri");
        us_06_07page.email.clear();
        us_06_07page.email.sendKeys("saniyeguneri1989@gmail.com");
        us_06_07page.saveButonu.click();


    }

    @Then("Kullanıcı güncelleme işlemini yaptığında {string} yazısının görünürlügünü kaydeder")
    public void kullanıcı_güncelleme_işlemini_yaptığında_yazısının_görünürlügünü_kaydeder(String string) {

        us_06_07page.guncellendiYazisi.isDisplayed();

    }
    @Then("kullanici profile tiklar")
    public void kullanici_profile_tiklar() {
        us_06_07page.kullaniciSembolu.click();
    }



    @Then("Kullanici username ve password girisi yapar")
    public void kullanici_username_ve_password_girisi_yapar() {
        us_06_07page.Username.sendKeys("PatientTeam54");
        us_06_07page.password.sendKeys("PatientTeam54");

    }

    @Then("Kullanici My Pages secenegine tiklar")
    public void kullanici_my_pages_secenegine_tiklar() {
        us_06_07page.MyPages.click();


    }

    @Then("Kullanici acilan dropdownda \"Make an Appointment\"secenegine tiklar")
    public void kullanici_acilan_dropdownda_make_an_appointment_secenegine_tiklar() {
        us_06_07page.makeApp.click();

    }

    @Then("Kullanici \"First Name,LastName,SSN,Email,Phone\"textbox'larini doldurur")
    public void kullanici_first_name_last_name_ssn_email_phone_textbox_larini_doldurur() {
        us_06_07page.isim.clear();
        us_06_07page.isim.sendKeys("SANİYE");
        us_06_07page.soyisim.clear();
        us_06_07page.soyisim.sendKeys("GÜNERİ");
        us_06_07page.ssn.clear();
        us_06_07page.ssn.sendKeys("374-23-3759");
        us_06_07page.phone.clear();
        us_06_07page.phone.sendKeys("5520824855");
        us_06_07page.email2.clear();
        us_06_07page.email2.sendKeys("saniyeguneri1989@gmail.com");

    }

    @Then("Kullanici \"Appointment Date Time\"kismina guncel tarih girer")
    public void kullanici_appointment_date_time_kismina_guncel_tarih_girer() {

        us_06_07page.appoDate.clear();
        us_06_07page.appoDate.sendKeys("12.08.2022");

    }

    @Then("Kullanici {string} tiklar")
    public void kullanici_tiklar(String string) {

        us_06_07page.request.click();

    }

    @Then("Kullanici \"Appointment registration saved\"yazisini gorur")
    public void kullanici_appointment_registration_saved_yazisini_gorur() {
        us_06_07page.guncellendiYazisi.isDisplayed();

    }
    @Then("Kullanici \"Appointment Date Time\"kismina ileri bir tarih girer")
    public void kullanici_appointment_date_time_kismina_ileri_bir_tarih_girer() {
        us_06_07page.appoDate.clear();
        us_06_07page.appoDate.sendKeys("30.12.2022");
    }

    @Then("Kullanici girdiginiz tarih uygun degil uyarisi alir")
    public void kullanici_girdiginiz_tarih_uygun_degil_uyarisi_alir() {



    }
    @Then("Kullanici \"Appointment Date Time\"kismina gecmis bir tarih girer")
    public void kullanici_appointment_date_time_kismina_gecmis_bir_tarih_girer() {

        us_06_07page.appoDate.clear();
        us_06_07page.appoDate.sendKeys("12.12.2021");

    }

    @Then("Kullanici {string} uyari yazisini gorur")
    public void kullanici_uyari_yazisini_gorur(String string) {

        us_06_07page.girilemezYazisi.isDisplayed();

    }

    @Then("Kullanici {string} butonuna tikladiginda kayit etmemeli veya tiklanamamali")
    public void kullanici_butonuna_tikladiginda_kayit_etmemeli_veya_tiklanamamali(String string) {

        us_06_07page.request.click();

    }
    @Then("Kullanici textboxlari doldurur, tarih textbox'ini gg\\/aa\\/yy formatinda girer")
    public void kullanici_textboxlari_doldurur_tarih_textbox_ini_gg_aa_yy_formatinda_girer() {

        us_06_07page.appoDate.click();
        us_06_07page.appoDate.sendKeys("11.08.2022");
        us_06_07page.request.click();

    }


    @Then("Kullanici acilan dropdownda \"My Appointment\"secenegine tiklar")
    public void kullanici_acilan_dropdownda_my_appointment_secenegine_tiklar() {

        us_06_07page.myAppo.click();





    }

    @Then("Kullanici girdigi tarih formatiyla {string} deki formatin ayni oldugunu dogrular")
    public void kullanici_girdigi_tarih_formatiyla_deki_formatin_ayni_oldugunu_dogrular(String string) {

        for (WebElement each:us_06_07page.randevuListesi
        ) {
            System.out.println(" randevuListesi : "+ each.getText());

        }


        Assert.assertTrue(us_06_07page.randevuListesi.equals(us_06_07page.randevuListesi));




    }

}
