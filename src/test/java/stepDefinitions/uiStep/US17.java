package stepDefinitions.uiStep;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.ConfigReader;
import utilities.Driver;

public class US17 {

    pages.US17 page = new pages.US17();

    @Given("Nhl Admin Medunna adresine gider")
    public void nhlAdminMedunnaAdresineGider() {

        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));

    }

    @Given("Nhl Admin profil butonuna tiklar")
    public void nhl_admin_profil_butonuna_tiklar() {

        page.profilButonu.click();
    }

    @Then("Nhl Admin giris yapmak icin sign in butonuna basar")
    public void nhl_admin_giris_yapmak_icin_sign_in_butonuna_basar() {

        page.signInButonu.click();
    }

    @Then("Nhl Admin username ile sifresini girer")
    public void nhl_admin_username_ile_sifresini_girer() {

        page.usernameTextBox.sendKeys(ConfigReader.getProperty("userNameAdmin"));
        page.passwordTextBox.sendKeys(ConfigReader.getProperty("sifreAdmin"));

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("Nhl Admin sign in butonuna basar")
    public void nhl_admin_sign_in_butonuna_basar() {

        page.signIn2Butonu.click();
    }

    @Then("Nhl Admin Item-Titles butonuna tiklar")
    public void nhl_admin_ıtem_titles_butonuna_tiklar() throws InterruptedException {

        page.itemsTitlesButonu.click();
        Thread.sleep(2000);
    }

    @And("Nhl Admin Test Item butonuna tiklar")
    public void nhlAdminTestItemButonunaTiklar() throws InterruptedException {

        page.testItem.click();
        Thread.sleep(3000);
    }

    @Then("Nhl Admin acilan sayfada Create a new Test Item butonuna tiklar")
    public void nhl_admin_acilan_sayfada_create_a_new_test_ıtem_butonuna_tiklar() throws InterruptedException {

        page.createNewTestItem.click();
        Thread.sleep(3000);

    }


    @And("Nhl Admin \"test items; Name, Description, price Default min value Default max value ve created date bilgilerini girer")
    public void nhlAdminTestItemsNameDescriptionPriceDefaultMinValueDefaultMaxValueVeCreatedDateBilgileriniGirer() throws InterruptedException {

        page.Name.sendKeys("mavi_hemoglobin");
        page.Price.sendKeys("125");
        page.defaultValMin.sendKeys("11");
        page.defaultValMax.sendKeys("15");
        page.createdDate.sendKeys("19.08.2022 00:00");


        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.DOWN);
        actions.sendKeys(Keys.DOWN);

        Thread.sleep(1000);

    }



    @And("Nhl Admin kaydet butonuna basar")
    public void nhlAdminKaydetButonunaBasar() throws InterruptedException {

        page.SaveButonu.click();

    }


    @And("Nhl Admin acilan sayfada Edit butonuna tiklar")
    public void nhlAdminAcilanSayfadaEditButonunaTiklar() throws InterruptedException {


        Driver.getDriver().navigate().to("https://medunna.com/c-test-item?page=44&sort=id,asc");
        Thread.sleep(5000);


        page.editButonu.click();

        Thread.sleep(1000);
    }


    @Then("Nhl Admin  test items bilgilerini gunceller")
    public void nhlAdminTestItemsBilgileriniGunceller() throws InterruptedException {

        page.Name.clear();
        page.Name.sendKeys("pembe_hemoglobin");
        page.Description.sendKeys(" ");
        Thread.sleep(1000);

        page.Price.clear();
        page.Price.sendKeys("150");
        Thread.sleep(1000);

        page.defaultValMin.clear();
        page.defaultValMin.sendKeys("15");
        Thread.sleep(1000);

        page.defaultValMax.clear();
        page.defaultValMax.sendKeys("19");
        Thread.sleep(1000);

        page.createdDate.clear();
        page.createdDate.sendKeys("21.08.2022 00:00");
        Assert.assertTrue(page.createdDate.equals("21.08.2022 00:00"));


        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.DOWN);
        actions.sendKeys(Keys.DOWN);
        actions.sendKeys(Keys.DOWN);
        actions.sendKeys(Keys.DOWN);
        actions.sendKeys(Keys.DOWN);
        actions.sendKeys(Keys.DOWN);
        Thread.sleep(3000);

    }

    @Then("Nhl Admin Save butonuna tiklar")
    public void nhlAdminSaveButonunaTiklar() {

        page.saveKaydetButonu.click();


    }

    @Then("Nhl Admin view butonuna tiklar")
    public void nhlAdminViewButonunaTiklar() throws InterruptedException {


        Driver.getDriver().navigate().to("https://medunna.com/c-test-item?page=44&sort=id,asc");
        Thread.sleep(5000);


        page.viewButton.click();
        Thread.sleep(7000);
    }

    @And("Nhl Admin istedigi test ögelerini görüntüler")
    public void nhlAdminIstedigiTestÖgeleriniGörüntüler() throws InterruptedException {

        Thread.sleep(3000);
    }

    @Then("Nhl Admin Delete butonuna tiklar")
    public void nhlAdminDeleteButonunaTiklar() throws InterruptedException {


        Driver.getDriver().navigate().to("https://medunna.com/c-test-item?page=44&sort=id,asc");
        Thread.sleep(5000);

        page.deleteButonu.click();

        Thread.sleep(3000);

    }

    @And("Nhl Admin cikan ekranda tekrar Delete butonuna tiklar")
    public void nhlAdminCikanEkrandaTekrarDeleteButonunaTiklar() {


        page.tekrarDeleteButonu.click();
    }


    @Then("Nhl Admin sayfayi kapatir")
    public void nhl_admin_sayfayi_kapatir() {


        Driver.closeDriver();
    }




}




