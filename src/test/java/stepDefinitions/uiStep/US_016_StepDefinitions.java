package stepDefinitions.uiStep;

import com.github.javafaker.Faker;
//import com.mongodb.client.model.geojson.LineString;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.US_016Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;
import java.util.Random;

public class US_016_StepDefinitions {

    US_016Page us_016Page=new US_016Page();

    Actions actions = new Actions(Driver.getDriver());
    Random rand = new Random();
    int rdn = 999999;
    String roomrandm = String.valueOf(rand.nextInt(rdn));
    String rndPrice= String.valueOf(rand.nextInt(rdn));


    @Given("Admin www.medunna.com adresine gitmelidir")
    public void admin_www_medunna_com_adresine_gitmelidir() {

        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));

}
    @Then("Admin profil butonuna tiklar")
    public void admin_profil_butonuna_tiklar() {
        us_016Page.kullaniciSembolu.click();



    }

    @Then("Admin giris yapmak icin Sign In butonuna tiklar")
    public void admin_giris_yapmak_icin_sign_ın_butonuna_tiklar() {

        us_016Page.signInButonu.click();

    }

    @Then("Admin username ve sifreyi girer")
    public void admin_username_ve_sifreyi_girer() {

        us_016Page.usarname.sendKeys("healthprojectteam54");
        us_016Page.password.sendKeys("AiGAYmJSJp.EN98");

    }

    @Then("Admin Sing In butonuna tiklar")
    public void admin_sing_ın_butonuna_tiklar() {

        us_016Page.signIn2.click();

    }

    @Then("Admin Item-Titles butonuna tiklar")
    public void admin_ıtem_titles_butonuna_tiklar() {

        us_016Page.ItemsTitles.click();

    }

    @Then("Admin acilan sayfada room butonuna tiklar")
    public void admin_acilan_sayfada_room_butonuna_tiklar() {

        us_016Page.Room.click();

    }

    @Then("Admin açılan sayfada create a new room butonunun görünürlüğünü test eder")
    public void admin_açılan_sayfada_create_a_new_room_butonunun_görünürlüğünü_test_eder() {

        us_016Page.YeniOda.isDisplayed();

    }

    @Then("Admin create a new room butonuna tıklar")
    public void admin_create_a_new_room_butonuna_tıklar() {
        us_016Page.YeniOda.click();

    }

    @Then("AdminRoom Number, Room Type, Price, Status' e tik koyar, Description ve Created Date bilgilerini girip kaydet butonunu tiklar")
    public void admin_room_number_room_type_price_status_e_tik_koyar_description_ve_created_date_bilgilerini_girip_kaydet_butonunu_tiklar() {

       // us_016Page.roomNumber.sendKeys("765867");
        us_016Page.roomNumber.sendKeys(roomrandm);

        us_016Page.roomType.sendKeys("TWIN");

        us_016Page.status.click();

        us_016Page.price.sendKeys(rndPrice);
        //us_016Page.price.sendKeys("14000");

        us_016Page.description.sendKeys("çok güzel oda");

        us_016Page.createdDate.sendKeys("26.08.2022");

        us_016Page.save.click();


    }

    @Then("Admin basarili sekilde kaydetilip kaydettilmedigini kontrol eder")
    public void admin_basarili_sekilde_kaydetilip_kaydettilmedigini_kontrol_eder() {
        us_016Page.OdaOnaylandi.isDisplayed();


    }

    @Then("Admin {string} seceneğinin görünürlüğünü test eder")
    public void admin_seceneğinin_görünürlüğünü_test_eder(String string) {

        us_016Page.roomNumber.isDisplayed();

    }

    @Then("Admin {string} bir oda numarası girer ve enique olmalıdır")
    public void admin_bir_oda_numarası_girer_ve_enique_olmalıdır(String string) {

        us_016Page.roomNumber.sendKeys(roomrandm);

    }

    @Then("Admin {string} seçeneğini tıklar")
    public void admin_seçeneğini_tıklar(String string) {
        us_016Page.roomType.click();

    }

    @Then("Admin TWIN, DELUXE, PREMIUM_DELUXE, SUIT ve DAYCARE seçeneklerinin görünürlüğünü test eder")
    public void admin_twın_deluxe_premıum_deluxe_suıt_ve_daycare_seçeneklerinin_görünürlüğünü_test_eder() throws InterruptedException {

        Select select=new Select(us_016Page.roomType);
        Thread.sleep(2000);
        select.selectByValue("DELUXE");
        List<WebElement>tumOpsiyonlar=select.getOptions();
        for (WebElement each:tumOpsiyonlar) {

            System.out.println(each.getText());
            Assert.assertTrue(each.isDisplayed());

        }

        Thread.sleep(3000);

    }

    @Then("Admin TWIN, DELUXE, PREMIUM_DELUXE, SUIT ve DAYCARE seçeneklerini listeler")
    public void admin_twın_deluxe_premıum_deluxe_suıt_ve_daycare_seçeneklerini_listeler() {

    }

    @Then("Admin çıkan seçenekelrden herhangi birini seçer")
    public void admin_çıkan_seçenekelrden_herhangi_birini_seçer() {

        us_016Page.roomType.click();

    }

    @Then("Admin Status butonuna tiklar ve Status'u full olarak belirler")
    public void admin_status_butonuna_tiklar_ve_status_u_full_olarak_belirler() throws InterruptedException {

        us_016Page.roomNumber.sendKeys(roomrandm);
        us_016Page.roomType.sendKeys("DELUXE");
        us_016Page.status.click();
        us_016Page.price.sendKeys(rndPrice);
        us_016Page.description.sendKeys("full verecek");
        us_016Page.createdDate.sendKeys(Keys.TAB);
        us_016Page.createdDate.sendKeys(Keys.TAB);
        us_016Page.createdDate.sendKeys(Keys.TAB);
        us_016Page.createdDate.sendKeys(Keys.TAB);
        us_016Page.createdDate.sendKeys(Keys.TAB);
        us_016Page.save.click();
        Thread.sleep(3000);
        JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver(); //sayfayı asagı kaydır
        js2.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(3000);
        us_016Page.sonSayfa.click();

       Thread.sleep(3000);
        us_016Page.full.isDisplayed();

    }

    @Then("Kullanici Status butonunu bos birakir ve Status'u available olarak belirler")
    public void kullanici_status_butonunu_bos_birakir_ve_status_u_available_olarak_belirler() throws InterruptedException {
        us_016Page.YeniOda.click();
        us_016Page.roomNumber.sendKeys(roomrandm);
        us_016Page.roomType.sendKeys("DELUXE");
        us_016Page.status.sendKeys(Keys.TAB);
        us_016Page.price.sendKeys(rndPrice);
        us_016Page.description.sendKeys("Avaible verecek");
        us_016Page.createdDate.sendKeys(Keys.TAB);
        us_016Page.createdDate.sendKeys(Keys.TAB);
        us_016Page.createdDate.sendKeys(Keys.TAB);
        us_016Page.createdDate.sendKeys(Keys.TAB);
        us_016Page.createdDate.sendKeys(Keys.TAB);
        us_016Page.save.click();
        Thread.sleep(3000);
        JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver(); //sayfayı asagı kaydır
        js2.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(3000);
        us_016Page.sonSayfa.click();

        Thread.sleep(3000);
        us_016Page.Available.isDisplayed();





    }

    @Then("Admin price kısmına gecerli bir fiyat eklendiğini test eder")
    public void admin_price_kısmına_gecerli_bir_fiyat_eklendiğini_test_eder() throws InterruptedException {

        us_016Page.roomNumber.sendKeys(roomrandm);
        us_016Page.roomType.sendKeys("DELUXE");
        us_016Page.status.click();
        us_016Page.price.sendKeys(rndPrice);
        us_016Page.description.sendKeys("Gecerli fiyat girdi");
        us_016Page.createdDate.sendKeys(Keys.TAB);
        us_016Page.createdDate.sendKeys(Keys.TAB);
        us_016Page.createdDate.sendKeys(Keys.TAB);
        us_016Page.createdDate.sendKeys(Keys.TAB);
        us_016Page.createdDate.sendKeys(Keys.TAB);
        us_016Page.save.click();
        Thread.sleep(5000);




    }

    @Then("Admin Price kutusunu bos birakir ve Save bastiktan sonra {string} uyari yazisini gorur")
    public void admin_price_kutusunu_bos_birakir_ve_save_bastiktan_sonra_uyari_yazisini_gorur(String string) throws InterruptedException {
         us_016Page.YeniOda.click();
        us_016Page.roomNumber.sendKeys(roomrandm);
        us_016Page.roomType.sendKeys("DELUXE");
        us_016Page.status.click();
        us_016Page.price.sendKeys(Keys.TAB);
        Assert.assertTrue(us_016Page.priceUyariYazisi.isDisplayed());
        Thread.sleep(2000);



    }
    @Then("Admin {string} kutusunu bos birakir ve Save butonuna tiklar")
    public void admin_kutusunu_bos_birakir_ve_save_butonuna_tiklar(String string) throws InterruptedException {
        us_016Page.roomNumber.sendKeys(roomrandm);
        us_016Page.roomType.sendKeys("DELUXE");
        us_016Page.status.click();
        us_016Page.price.sendKeys(rndPrice);
        us_016Page.description.sendKeys(Keys.TAB);
        us_016Page.createdDate.sendKeys(Keys.TAB);
        us_016Page.createdDate.sendKeys(Keys.TAB);
        us_016Page.createdDate.sendKeys(Keys.TAB);
        us_016Page.createdDate.sendKeys(Keys.TAB);
        us_016Page.createdDate.sendKeys(Keys.TAB);
        us_016Page.save.click();
        Assert.assertTrue(us_016Page.OdaOnaylandi.isDisplayed());
        Thread.sleep(5000);


    }

    @Then("Admin \"A new Room is created with identifier\"mesajinin görünürlüğünü test eder")
    public void admin_a_new_room_is_created_with_identifier_mesajinin_görünürlüğünü_test_eder() {

        Assert.assertTrue(us_016Page.OdaOnaylandi.isDisplayed());


    }

    @Then("Admin {string} kutusunu doldurur ve Save butonuna tiklar")
    public void admin_kutusunu_doldurur_ve_save_butonuna_tiklar(String string) {
        us_016Page.YeniOda.click();
        us_016Page.roomNumber.sendKeys(roomrandm);
        us_016Page.roomType.sendKeys("DELUXE");
        us_016Page.status.click();
        us_016Page.price.sendKeys(rndPrice);
        us_016Page.description.sendKeys("Basaracagım");
        us_016Page.createdDate.sendKeys(Keys.TAB);
        us_016Page.createdDate.sendKeys(Keys.TAB);
        us_016Page.createdDate.sendKeys(Keys.TAB);
        us_016Page.createdDate.sendKeys(Keys.TAB);
        us_016Page.createdDate.sendKeys(Keys.TAB);
        us_016Page.save.click();
        Assert.assertTrue(us_016Page.OdaOnaylandi.isDisplayed());

    }


    @Then("Admin {string} kısmına güncel tarih girer ve save tuşuna basar")
    public void admin_kısmına_güncel_tarih_girer_ve_save_tuşuna_basar(String string) throws InterruptedException {
        us_016Page.roomNumber.sendKeys(roomrandm);
        us_016Page.roomType.sendKeys("DELUXE");
        us_016Page.status.click();
        us_016Page.price.sendKeys(rndPrice);
        us_016Page.description.sendKeys(Keys.TAB);
        us_016Page.createdDate.sendKeys(Keys.TAB);
        us_016Page.createdDate.sendKeys(Keys.TAB);
        us_016Page.createdDate.sendKeys(Keys.TAB);
        us_016Page.createdDate.sendKeys(Keys.TAB);
        us_016Page.createdDate.sendKeys(Keys.TAB);
        us_016Page.save.click();
        Assert.assertTrue(us_016Page.OdaOnaylandi.isDisplayed());
        Thread.sleep(3000);

    }

    @Then("Admin {string} kısmına geçmiş tarih girer ve save tuşuna basar")
    public void admin_kısmına_geçmiş_tarih_girer_ve_save_tuşuna_basar(String string) {
        us_016Page.YeniOda.click();
        us_016Page.roomNumber.sendKeys(roomrandm);
        us_016Page.roomType.sendKeys("DELUXE");
        us_016Page.status.click();
        us_016Page.price.sendKeys(rndPrice);
        us_016Page.createdDate.sendKeys("20.08.2022");
        us_016Page.save.click();
        Assert.assertTrue(us_016Page.OdaOnaylandi.isDisplayed());



    }

    @Then("Admin {string} kismina tiklar ve gorunen sayfalarin {string} ve {string} oldugunu goruntuler")
    public void admin_kismina_tiklar_ve_gorunen_sayfalarin_ve_oldugunu_goruntuler(String string, String string2, String string3) {
        us_016Page.roomTybeListe.click();
        Assert.assertTrue(us_016Page.twin.isDisplayed());
        us_016Page.roomTybeListe.click();
        Assert.assertTrue(us_016Page.deycare.isDisplayed());


    }

    @Then("Admin açılan sayfada kayıtlı odalardan birinin {string} butonuna tıklar")
    public void admin_açılan_sayfada_kayıtlı_odalardan_birinin_butonuna_tıklar(String string) {
        us_016Page.edit.click();


    }
    @Then("Admin açılan sayfada oda türünü düzenleyip save tuşuna basar")
    public void admin_açılan_sayfada_oda_türünü_düzenleyip_save_tuşuna_basar() {
        us_016Page.roomNumber.clear();
        us_016Page.roomNumber.sendKeys(roomrandm);
        us_016Page.roomType.sendKeys("DELUXE");
        us_016Page.status.click();
        us_016Page.price.clear();
        us_016Page.price.sendKeys(rndPrice);
        us_016Page.description.clear();
        us_016Page.description.sendKeys("düzenlendi");
        us_016Page.createdDate.sendKeys("27.08.2022");
        us_016Page.createdDate.sendKeys(Keys.TAB);
        us_016Page.createdDate.sendKeys(Keys.TAB);

        us_016Page.save.click();


    }

    @Then("Admin {string} yazısının görünürlüğünü test eder")
    public void admin_yazısının_görünürlüğünü_test_eder(String string) {
        Assert.assertTrue(us_016Page.OdaOnaylandi.isDisplayed());

    }
    @Then("Admin Delete tusuna basar")
    public void admin_delete_tusuna_basar() {
        us_016Page.delete.click();

    }

    @Then("Admin Confirm Delete Operation uyarisini gorur")
    public void admin_confirm_delete_operation_uyarisini_gorur() {
        us_016Page.deleteYazisi.isDisplayed();

    }

    @Then("Admin Delete butonuna tiklar")
    public void admin_delete_butonuna_tiklar() {
        us_016Page.delete2.click();

    }

    @Then("Admin \"A Room is deleted...\"yazan uyarının görünürlüğünü test eder")
    public void admin_a_room_is_deleted_yazan_uyarının_görünürlüğünü_test_eder() {
        Assert.assertTrue(us_016Page.OdaOnaylandi.isDisplayed());

    }




}