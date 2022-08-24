package stepDefinitions.uiStep;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.US_27Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import static utilities.ReusableMethods.waitFor;

public class US_27StepDefinitions {

    US_27Page us_27Page = new US_27Page();
    Actions actions = new Actions(Driver.getDriver());

    @Then("Kullanici username girer")
    public void kullanici_username_girer() {
        us_27Page.username.sendKeys(ConfigReader.getProperty("userNameAdmin"));
        waitFor(1);

    }
    @Then("Kullanici Password girer")
    public void kullanici_password_girer() {
        us_27Page.password.sendKeys(ConfigReader.getProperty("sifreAdmin"));
        waitFor(1);

    }
    @Then("kullanici Items&Titles butonuna tiklar")
    public void kullanici_ıtems_titles_butonuna_tiklar() {
        us_27Page.itemsTitles.click();
        waitFor(1);

    }
    @Then("kullanici Messages butonuna tiklar")
    public void kullanici_messages_butonuna_tiklar() {
        us_27Page.messages.click();
        waitFor(1);

    }
    @Then("Kullanici tum mesajlari yazarlarini ve e-postalarini gorur")
    public void kullanici_tum_mesajlari_yazarlarini_ve_e_postalarini_gorur() {
        Assert.assertTrue(us_27Page.kullaniciName.isDisplayed());
        Assert.assertTrue(us_27Page.kullaniciEmail.isDisplayed());
        Assert.assertTrue(us_27Page.kullaniciMesaji.isDisplayed());
        waitFor(1);

    }
    @Then("kullanici Create a new Message butonuna tiklar")
    public void kullanici_create_a_new_message_butonuna_tiklar() {
        us_27Page.yeniMesajOlustur.click();
        waitFor(1);

    }
    @Then("kullanici mesaj bilgilerini girip save botonuna tiklar")
    public void kullanici_mesaj_bilgilerini_girip_save_botonuna_tiklar()  {

        actions.sendKeys(Keys.TAB);
        actions.sendKeys("esra");
        actions.sendKeys(Keys.TAB);
        actions.sendKeys("patientteam54@gmail.com");
        actions.sendKeys(Keys.TAB);
        actions.sendKeys("patient");
        actions.sendKeys(Keys.TAB);
        actions.sendKeys("hello world");
        actions.sendKeys(Keys.TAB);
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        waitFor(2);

    }
    @Then("kullanici yeni mesaj olusturdugunu gorur")
    public void kullanici_yeni_mesaj_olusturdugunu_gorur() {
        Assert.assertTrue(us_27Page.mesajOlusturma.isDisplayed());
        waitFor(4);

    }
    @Then("kullanici mesajin sagindaki edit butonuna tiklar")
    public void kullanici_mesajin_sagindaki_edit_butonuna_tiklar() {
        us_27Page.Id.click();
        waitFor(2);
        us_27Page.editButon.click();
        waitFor(2);

    }
    @Then("kullanici mesaji guncelleyip save butonuna tiklar")
    public void kullanici_mesaji_guncelleyip_save_butonuna_tiklar() {
        us_27Page.yeniMesaj.clear();
        waitFor(1);
        us_27Page.yeniMesaj.sendKeys("hello medunna");
        waitFor(1);
        actions.sendKeys(Keys.TAB);
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        waitFor(1);

    }
    @Then("kullanici mesaji guncelledigini gorur")
    public void kullanici_mesaji_guncelledigini_gorur() {
        Assert.assertTrue(us_27Page.masajGuncelleme.isDisplayed());
        waitFor(4);

    }
    @Then("kullanici mesajin sagindaki delete butonuna tiklar")
    public void kullanici_mesajin_sagindaki_delete_butonuna_tiklar() {
        us_27Page.Id.click();
        waitFor(2);
        us_27Page.deleteButon.click();
        waitFor(2);
    }
    @Then("kullanici gelen mesajda tekrar delete butonuna tiklar")
    public void kullanici_gelen_mesajda_tekrar_delete_butonuna_tiklar() {
        us_27Page.ikinciDeleteButon.click();
        waitFor(2);

    }
    @Then("kullanici mesajin silindigini gorur")
    public void kullanici_mesajin_silindigini_gorur() {
        Assert.assertTrue(us_27Page.mesajSilme.isDisplayed());
        waitFor(4);

    }
}
