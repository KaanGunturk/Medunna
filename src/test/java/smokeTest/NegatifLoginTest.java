package smokeTest;



import org.junit.Assert;
import org.junit.Test;
import pages.US_01_02Page;
import pages.US_03_04Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NegatifLoginTest extends TestBaseRapor {

     US_03_04Page us_03_04Page=new US_03_04Page();

    @Test
    public void test01() throws InterruptedException {
        extentTest=extentReports.createTest("Negatif Login", "Gecerli username ve gecersiz sifre ile giris yapilamaz");
        Thread.sleep(2000);
        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));
        extentTest.info("Medunna anasayfaya gidildi");

        us_03_04Page.profilButonu.click();
        extentTest.info("Ilk profil butonuna tiklandi ");
        Thread.sleep(2000);
        us_03_04Page.signInButonu.click();
        extentTest.info("Giris butonuna tiklandi ");
        Thread.sleep(2000);
        us_03_04Page.usernameTextBox.sendKeys(ConfigReader.getProperty("validUserName"));
        extentTest.info("Gecerli username yazildi");
        Thread.sleep(2000);
        us_03_04Page.passwordTextBox.sendKeys(ConfigReader.getProperty("wrongPassword"));
        extentTest.info("Gecersiz password yazildi");
        Thread.sleep(2000);
        us_03_04Page.signInPageSignInButonu.click();
        extentTest.info("Sign in  butonuna tiklandi ");
        Thread.sleep(2000);
        Assert.assertTrue(us_03_04Page.negatifTestDogrulama.isDisplayed());
        extentTest.info("Kullaici giris yapamadi");
        Thread.sleep(2000);

        Driver.closeDriver();


    }
}