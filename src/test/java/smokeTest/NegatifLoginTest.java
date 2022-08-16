package smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;

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
    public void test01() {

        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));

        us_03_04Page.profilButonu.click();
        us_03_04Page.signInButonu.click();
        us_03_04Page.usernameTextBox.sendKeys(ConfigReader.getProperty("validUserName"));
        us_03_04Page.passwordTextBox.sendKeys(ConfigReader.getProperty("wrongPassword"));

        us_03_04Page.signInPageSignInButonu.click();

        Assert.assertTrue(us_03_04Page.negatifTestDogrulama.isDisplayed());


        Driver.closeDriver();


    }
}