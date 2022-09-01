package smokeTest;



import org.junit.Assert;
import org.junit.Test;
import pages.US3_4;
import utilities.ConfigReader;
import utilities.Driver;


public class PozitifLoginTest{

    US3_4 us_03_04Page = new US3_4();

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