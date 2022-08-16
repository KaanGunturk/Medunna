package smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.US_03_04Page;
import utilities.ConfigReader;
import utilities.Driver;

public class PozitifLoginTest {

    US_03_04Page us_03_04Page = new US_03_04Page();

    @Test
    public void test01() {

        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));

        us_03_04Page.profilButonu.click();
        us_03_04Page.signInButonu.click();
        us_03_04Page.usernameTextBox.sendKeys(ConfigReader.getProperty("userNameAdmin"));
        us_03_04Page.passwordTextBox.sendKeys(ConfigReader.getProperty("sifreAdmin"));

        us_03_04Page.signInPageSignInButonu.click();

        Assert.assertTrue(us_03_04Page.pozitifTestDogrulama.isDisplayed());


        Driver.closeDriver();


    }
}