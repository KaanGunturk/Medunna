package stepDefinitions.uiStep;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.US_05Page;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class US_05StepDefinitions {

    US_05Page us_005Page = new US_05Page();
    Actions actions = new Actions(Driver.getDriver());

    @Given("kullanici {string} anasayfasinda")
    public void kullanici_anasayfasinda(String baseUrl) {

        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));
    }

    @Then("kullanici Make an Appointment butonuna tiklar")
    public void kullanici_make_an_appointment_butonuna_tiklar() {

        us_005Page.appointment.click();
    }

    @Then("kullanici First Name girmeli bos birakilamaz")
    public void kullanici_first_name_girmeli_bos_birakilamaz() {

        actions.sendKeys(Keys.TAB);
        actions.sendKeys(" ").perform();
    }

    @Then("kullanici Last Name girmeli bos birakilamaz")
    public void kullanici_last_name_girmeli_bos_birakilamaz() {

        actions.sendKeys(Keys.TAB);
        actions.sendKeys(" ").perform();
    }

    @Then("kullanici kayitli SSN numarasi girmeli bos birakilamaz")
    public void kullanici_kayitli_ssn_numarasi_girmeli_bos_birakilamaz() {

        actions.sendKeys(Keys.TAB);
        actions.sendKeys(" ").perform();
    }

    @Then("kullanici email adresi girmeli bos birakilamaz")
    public void kullanici_email_adresi_girmeli_bos_birakilamaz() {

        actions.sendKeys(Keys.TAB);
        actions.sendKeys(" ").perform();
    }

    @Then("kullanici telefon numarasi girmeli bos birakilamaz")
    public void kullanici_telefon_numarasi_girmeli_bos_birakilamaz() {

        actions.sendKeys(Keys.TAB);
        actions.sendKeys(Keys.TAB);
        actions.sendKeys(" ").perform();
    }

    @Then("kullanici tum bilgileri girmeden randevu olusturamayacagini gorur")
    public void kullanici_tum_bilgileri_girmeden_randevu_olusturamayacagini_gorur() {

        Assert.assertTrue(us_005Page.firstNameRequired.isDisplayed());
        Assert.assertTrue(us_005Page.lastNameRequired.isDisplayed());
        Assert.assertTrue(us_005Page.ssnRequired.isDisplayed());
        Assert.assertTrue(us_005Page.emailRequired.isDisplayed());
        Assert.assertTrue(us_005Page.phoneRequired.isDisplayed());
    }

    @Then("kullanici sayfayi kapatir")
    public void kullanici_sayfayi_kapatir() {

        Driver.closeDriver();
    }

    @Then("kullanici herhangi bir karakter iceren First Name girer")
    public void kullanici_herhangi_bir_karakter_iceren_first_name_girer() {

        us_005Page.firstName.sendKeys("Patient");

    }

    @Then("kullanici herhangi bir karakter iceren Last Name girer")
    public void kullanici_herhangi_bir_karakter_iceren_last_name_girer() {

        us_005Page.lastName.sendKeys("Team54");

    }

    @Then("kullanici kayitli SSN numarasi girer")
    public void kullanici_kayitli_ssn_numarasi_girer() {

        us_005Page.ssn.sendKeys("485-58-8385");

    }

    @Then("kullanici . ve @ iceren email adresi girer")
    public void kullanici_ve_iceren_email_adresi_girer() {

        us_005Page.email.sendKeys("patientteam54@gmail.com");

    }

    @Then("kullanici ucuncu ve altinci rakamdan sonra - olan on rakamli telefon no girer")
    public void kullanici_ucuncu_ve_altinci_rakamdan_sonra_olan_on_rakamli_telefon_no_girer() {

        us_005Page.phone.sendKeys("234-543-8785");

    }

    @Then("kullanici Send an Appointment Request butonuna tiklar")
    public void kullanici_send_an_appointment_request_butonuna_tiklar() {

        us_005Page.appoButon.sendKeys(Keys.ENTER);

    }

    @Then("kullanici basarili bir sekilde randevu olusturdugunu gorur")
    public void kullanici_basarili_bir_sekilde_randevu_olusturdugunu_gorur() throws InterruptedException {

        Thread.sleep(3000);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(60));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='alert']")));
        Assert.assertTrue(element.isDisplayed());

    }

    @Then("kullanici profil butonuna tiklar")
    public void kullanici_profil_butonuna_tiklar() {

        us_005Page.profilMenu.click();
    }

    @Then("kullanici sing in butonuna tiklar")
    public void kullanici_sing_in_butonuna_tiklar() {

        us_005Page.signIn.click();

    }

    @Then("kullanici username girer")
    public void kullanici_username_girer() {

        us_005Page.username.sendKeys(ConfigReader.getProperty("userNamePatient"));

    }

    @Then("kullanici Password girer")
    public void kullanici_password_girer() {

        us_005Page.password.sendKeys(ConfigReader.getProperty("sifrePatient"));

    }

    @Then("kullanici sign in butonuna tiklar")
    public void kullanici_sign_in_butonuna_tiklar() {

        us_005Page.ikinciSignIn.click();

    }

    @Then("kullanici My Pages butonuna tiklar")
    public void kullanici_my_pages_butonuna_tiklar() {

        us_005Page.myPages.click();

    }

    @Then("kullanici My Appointments butonuna tiklar")
    public void kullanici_my_appointments_butonuna_tiklar() {

        us_005Page.myAppointments.click();

    }

    @Then("kullanici aldigi randevuyu profil sayfasinda gorur")
    public void kullanici_aldigi_randevuyu_profil_sayfasinda_gorur() {

        Assert.assertTrue(us_005Page.randevuId.isDisplayed());

    }

}


