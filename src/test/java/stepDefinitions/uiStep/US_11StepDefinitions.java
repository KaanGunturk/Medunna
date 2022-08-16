package stepDefinitions.uiStep;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.US_11Page;
import utilities.ConfigReader;
import utilities.Driver;

public class US_11StepDefinitions {

US_11Page US11page= new US_11Page();
Actions act = new Actions(Driver.getDriver());


    @Given("Kullanici medunna sayfasina gider")
    public void kullanici_medunna_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));}

    @Then("HIaccount menu’ye tiklar")
    public void account_menu_ye_tiklar() {US11page.accountmenu.click();

    }
    @Then("HIsign in tiklar")
    public void sign_in_tiklar() {US11page.ilkSignin.click();

    }
    @Then("HIusername and password girer")
    public void username_and_password_girer() {US11page.username.sendKeys("PhysicianTeam54"+ Keys.ENTER);
        US11page.password.sendKeys("PhysicianTeam54"+ Keys.ENTER);

    }
    @Then("HIOnay icin Sign in tiklar")
    public void onay_icin_sign_in_tiklar() { US11page.ikinciSignin.click();}

    @Then("HIMy Pages tiklar")
    public void my_pages_tiklar() {US11page.myPages.click();

    }
    @Then("HIMy Appointments tiklar")
    public void my_appointments_tiklar() {
      US11page.myAppointments.click();
    }
    @Then("HIEdit tiklar")
    public void edit_tiklar() {US11page.edit.click();

    }
    @Then("HIid, start and end date, Status, physician and patient gorunur")
    public void id_start_and_end_date_status_physician_and_patient_gorunur() throws InterruptedException {
        Assert.assertTrue(US11page.id.isDisplayed());
        Assert.assertTrue(US11page.startdate.isDisplayed());
        Assert.assertTrue(US11page.enddate.isDisplayed());
        act.sendKeys(Keys.PAGE_DOWN).perform();
        Assert.assertTrue(US11page.status.isDisplayed());
        //act.sendKeys(Keys.PAGE_DOWN).perform();
        Assert.assertTrue(US11page.physician.isDisplayed());
        Thread.sleep(5000);



    }
    @Then("HIAnamnesis, Treatment, and Diagnosis kutucuklarina bilgi girebilir")
    public void anamnesis_treatment_and_diagnosis_kutucuklarina_bilgi_girebilir() throws InterruptedException {
        act.sendKeys(Keys.PAGE_UP).perform();
        act.moveToElement(US11page.anamnesis).click().perform();

        //US11page.anamnesis.click();
        US11page.anamnesis.sendKeys("patient");
        act.sendKeys(Keys.PAGE_DOWN).perform();


        US11page.treatment.click();
        Thread.sleep(5000);
        US11page.treatment.sendKeys("medication");
        act.sendKeys(Keys.TAB);

        US11page.diagnosis.sendKeys("anxiety");



    }
    @Then("HIprescription and description kutucuklarini bos gecebilir")
    public void prescription_and_description_kutucuklarini_bos_gecebilir() throws InterruptedException {
        //Textboxlara sadece tiklayip iclerine bilgi girmeden devam ediyoruz
        //"save" tiklandiginda uyari vermedigi takdirde  accaptance criteria'miz pass demektir
        act.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(5000);
        US11page.prescription.click();
        US11page.description.click();

    }
    @Then("HIStatus olarak yalnizca  Pending, Completed, Canceled secilebilir")
    public void status_olarak_yalnizca_pending_completed_canceled_secilebilir() throws InterruptedException {
        Select select= new Select(US11page.statusselect);
        act.sendKeys(Keys.PAGE_UP).perform();
        act.sendKeys(Keys.PAGE_UP).perform();
        Thread.sleep(3000);
        act.sendKeys(Keys.PAGE_DOWN).perform();
        US11page.statusselect.click();
        Assert.assertEquals(US11page.statusselect.getAttribute("value"),"PENDING");
        //Assert.assertEquals(US11page.statusselect.getAttribute("value"),"COMPLETED");
        //Assert.assertEquals(US11page.statusselect.getAttribute("value"),"CANCELLED");





    }

    @Then("HISave butonuna tiklar")
    public void saveButonunaTiklar() throws InterruptedException {
        act.sendKeys(Keys.PAGE_DOWN).perform();
        act.sendKeys(Keys.PAGE_DOWN).perform();
        act.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        US11page.save.click();
        
    }

    @Then("HIRandevu olusuturuldu mesaji gorunur")
    public void randevuOlusuturulduMesajiGorunur() {
        act.sendKeys(Keys.PAGE_UP).perform();
        act.sendKeys(Keys.PAGE_UP).perform();
        Assert.assertTrue(US11page.message.isDisplayed());
    }
}
