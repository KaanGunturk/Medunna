package smokeTest;



import org.junit.Assert;
import org.junit.Test;
import pages.US_03_04Page;
import utilities.ConfigReader;
import utilities.Driver;


public class PozitifLoginTest{

    US_03_04Page us_03_04Page = new US_03_04Page();

    @Test
    public void test01() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));

        Thread.sleep(2000);
        us_03_04Page.profilButonu.click();

        Thread.sleep(2000);
        us_03_04Page.signInButonu.click();

        Thread.sleep(2000);
        us_03_04Page.usernameTextBox.sendKeys(ConfigReader.getProperty("userNameAdmin"));

        Thread.sleep(2000);
        us_03_04Page.passwordTextBox.sendKeys(ConfigReader.getProperty("sifreAdmin"));

        Thread.sleep(2000);
        us_03_04Page.signInPageSignInButonu.click();

        Assert.assertTrue(us_03_04Page.pozitifTestDogrulama.isDisplayed());

        Thread.sleep(2000);
        Driver.closeDriver();


    }
}