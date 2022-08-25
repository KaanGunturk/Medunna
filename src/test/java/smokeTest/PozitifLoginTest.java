package smokeTest;



import org.junit.Assert;
import org.junit.Test;
import pages.US_03_04Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class PozitifLoginTest extends TestBaseRapor {

    US_03_04Page us_03_04Page = new US_03_04Page();

    @Test
    public void test01() throws InterruptedException {
        extentTest=extentReports.createTest("Pozitif Login","Gecerli username ve sifre ile giris yapabilir");
        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));
        extentTest.info("Medunna anasayfaya gidildi");
        Thread.sleep(2000);
        us_03_04Page.profilButonu.click();
        extentTest.info("Ilk profil butonuna tiklandi ");
        Thread.sleep(2000);
        us_03_04Page.signInButonu.click();
        extentTest.info("Giris butonuna tiklandi ");
        Thread.sleep(2000);
        us_03_04Page.usernameTextBox.sendKeys(ConfigReader.getProperty("userNameAdmin"));
        extentTest.info("Gecerli username yazildi");
        Thread.sleep(2000);
        us_03_04Page.passwordTextBox.sendKeys(ConfigReader.getProperty("sifreAdmin"));
        extentTest.info("Gecerli password yazildi");
        Thread.sleep(2000);
        us_03_04Page.signInPageSignInButonu.click();
        extentTest.info("Sign in  butonuna tiklandi ");
        Assert.assertTrue(us_03_04Page.pozitifTestDogrulama.isDisplayed());
        extentTest.info("Kullanici basarili sekilde giris yapti");
        Thread.sleep(2000);
        Driver.closeDriver();


    }
}