package stepDefinitions.uiStep;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import pages.US_19_20Page;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.*;

public class US_19_20StepDefinitions {
    US_19_20Page page = new US_19_20Page();
    Faker faker = new Faker();
    Random rnd = new Random();
    List<String> ssnNumber = new ArrayList<>();

    //us_19_tc_01
    @When("ht Kullanıcı https:\\/\\/medunna.com adresine gidilir")
    public void htKullanıcıHttpsMedunnaComAdresineGidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));
    }


    @And("ht Kullanıcı profil isaretine tıklanır.")
    public void htKullanıcıProfilIsaretineTıklanır() {
        page.kullaniciIsareti.click();


    }

    @And("ht Sign in butonuna tıklanır.")
    public void htSignInButonunaTıklanır() {
        page.signIn.click();
    }

    @And("ht Username girer")
    public void htUsernameGirer() {
        page.UserName.sendKeys("healthprojectteam54");
    }

    @And("ht Password girer")
    public void htPasswordGirer() {
        page.Password.sendKeys("AiGAYmJSJp.EN98");
    }

    @And("ht Sign in butonuna tıklar")
    public void htSignInButonunaTıklar() {
        page.signInClick.click();
    }

    @And("ht Tems&titles tıkalr")
    public void htTemsTitlesTıkalr() throws InterruptedException {
        Thread.sleep(1000);
        page.temsTitles.click();

    }

    @And("ht Staff i secer")
    public void htStaffISecer() {
        page.staffButton.click();
    }

    @And("ht tum ssn numaralarını alir.")
    public void htTumSsnNumaralarınıAlir() {
        List<WebElement> ssnElemnt = Driver.getDriver().findElements(By.xpath("//tbody/tr/td[2]"));

        System.out.println(ssnElemnt.size());

        for (int i = 0; i < ssnElemnt.size(); i++) {
            ssnNumber.add(ssnElemnt.get(i).getText());
        }
        System.out.println(ssnNumber);
    }

    @And("ht Create a new staff e tıklar")
    public void htCreateANewStaffETıklar() {
        page.createnewStaff.click();
    }

    @And("ht Ssn numarası girer")
    public void htSsnNumarasıGirer() {


        page.staffssn.sendKeys(ssnNumber.get(faker.number().numberBetween(1, 20)));

    }

    @And("ht Use search tıklar")
    public void htUseSearchTıklar() {
        page.useSearch.click();
    }

    @And("ht Search user e tıklar")
    public void htSearchUserETıklar() {
        page.searchUserButton.click();
    }

    @And("ht First Name, Last name,Birth Date,Phone,Gender,Blood Group,Address,Description,Created Date,User,Country,State\\/City kısımlarını doldurur.\"")
    public void htFirstNameLastNameBirthDatePhoneGenderBloodGroupAddressDescriptionCreatedDateUserCountryStateCityKısımlarınıDoldurur() {
        page.temsTitles.click();
        page.staffButton.click();
        page.createnewStaff.click();
        int ssnilk=faker.number().numberBetween(100,999);
        int ssniki=faker.number().numberBetween(10,99);
        int ssnson=faker.number().numberBetween(1000,9999);
        page.staffssn.sendKeys(ssnilk+"-"+ssniki+"-"+ssnson);
        page.stafffirstName.sendKeys(faker.name().firstName());
        page.stafflastName.sendKeys(faker.name().lastName());
        JavascriptExecutor jse = (JavascriptExecutor)Driver.getDriver();
        jse.executeScript("window.scrollBy(0,250)", "");
        Date date=faker.date().birthday();
        page.birthDate.sendKeys(date.toString());
        page.phone.sendKeys("(336) 546-5245");
        page.gender.click();
        page.female.click();
        page.bloodGroup.click();
        page.ABnegative.click();
        jse.executeScript("window.scrollBy(0,250)", "");
        page.adress.sendKeys(faker.address().fullAddress());
        page.description.sendKeys(faker.job().field());
        page.staffcountry.sendKeys(faker.address().country().intern());
        jse.executeScript("window.scrollBy(0,250)", "");
        page.Staffcity.sendKeys(faker.address().cityName());

    }

    @And("ht Save butonuna tıklar.")
    public void htSaveButonunaTıklar() {

        page.saveButton.click();
    }


    //us_19_tc_02
    @And("ht view butonundan herhangi birini görüntüler")
    public void htViewButonundanHerhangiBiriniGörüntüler() {

    }

    @And("ht Edit butonuna tıklar")
    public void htEditButonunaTıklar() {

    }

    @And("ht Herhangi bir bilgiyi degistirir")
    public void htHerhangiBirBilgiyiDegistirir() {

    }

    @And("ht Delete butonuna tıklar")
    public void htDeleteButonunaTıklar() {
    }

    //us_20_tc_01
    @And("ht Administration a tıklar")
    public void htAdministrationATıklar() {
    }

    @And("ht Usere managment secer")
    public void htUsereManagmentSecer() {

    }

    @And("ht Kayıtlı kişilerin görünürlüğünü kontrol eder")
    public void htKayıtlıKişilerinGörünürlüğünüKontrolEder() {

    }

    //US_20_TC_02
    @And("ht Deavtivated olan kısımı activedet yapabilir")
    public void htDeavtivatedOlanKısımıActivedetYapabilir() {
    }

    @And("ht Profiles kısmından rol ataması yapar")
    public void htProfilesKısmındanRolAtamasıYapar() {

    }

    @And("ht Herhangi bir kişinin delete butonuna tıklar")
    public void htHerhangiBirKişininDeleteButonunaTıklar() {
    }


}

