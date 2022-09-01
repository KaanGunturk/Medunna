package smokeTest;



import org.junit.Assert;
import org.junit.Test;
import pages.US3_4;
import utilities.ConfigReader;
import utilities.Driver;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NegatifLoginTest {

     US3_4 us_03_04Page=new US3_4();

    @Test
    public void test01() throws InterruptedException {
        Thread.sleep(2000);
        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));

        us_03_04Page.profilButonu.click();

        Thread.sleep(2000);
        us_03_04Page.signInButonu.click();

        Thread.sleep(2000);
        us_03_04Page.usernameTextBox.sendKeys(ConfigReader.getProperty("validUserName"));

        Thread.sleep(2000);
        us_03_04Page.passwordTextBox.sendKeys(ConfigReader.getProperty("wrongPassword"));

        Thread.sleep(2000);
        us_03_04Page.signInPageSignInButonu.click();

        Thread.sleep(2000);
        Assert.assertTrue(us_03_04Page.negatifTestDogrulama.isDisplayed());

        Thread.sleep(2000);

        Driver.closeDriver();


    }
}