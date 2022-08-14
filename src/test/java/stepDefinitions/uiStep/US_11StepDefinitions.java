package stepDefinitions.uiStep;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.US_11page;
import utilities.ConfigReader;
import utilities.Driver;

public class US_11StepDefinitions {

US_11page US11page= new US_11page();
Actions act = new Actions(Driver.getDriver());
Select select= new Select(US11page.statusselect);

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
    public void my_appointments_tiklar() {US11page.myAppointments.click();

    }
    @Then("HIEdit tiklar")
    public void edit_tiklar() {US11page.edit.click();

    }
    @Then("HIid, start and end date, Status, physician and patient gorunur")
    public void id_start_and_end_date_status_physician_and_patient_gorunur() {
        Assert.assertTrue(US11page.id.isDisplayed());
        Assert.assertTrue(US11page.startdate.isDisplayed());
        Assert.assertTrue(US11page.enddate.isDisplayed());
        act.sendKeys(Keys.PAGE_DOWN).perform();
        Assert.assertTrue(US11page.status.isDisplayed());
        act.sendKeys(Keys.PAGE_DOWN).perform();
        Assert.assertTrue(US11page.physician.isDisplayed());



    }
    @Then("HIAnamnesis, Treatment, and Diagnosis kutucuklarina bilgi girebilir")
    public void anamnesis_treatment_and_diagnosis_kutucuklarina_bilgi_girebilir() {
        US11page.anamnesis.click();
        US11page.anamnesis.sendKeys("patient");
        US11page.treatment.click();
        US11page.treatment.sendKeys("medication");
        US11page.diagnosis.click();
        US11page.diagnosis.sendKeys("anxiety");



    }
    @Then("HIprescription and description kutucuklarini bos gecebilir")
    public void prescription_and_description_kutucuklarini_bos_gecebilir() {
        //Textboxlara sadece tiklayip iclerine bilgi girmeden devam ediyoruz
        //"save" tiklandiginda uyari vermedigi takdirde  accaptance criteria'miz pass demektir
        US11page.prescription.click();
        US11page.description.click();

    }
    @Then("HIStatus olarak yalnizca  Pending, Completed, Canceled secilebilir")
    public void status_olarak_yalnizca_pending_completed_canceled_secilebilir() {
        US11page.statusselect.click();
        Assert.assertEquals(US11page.statusselect.getAttribute("value"),"PENDING");
        Assert.assertEquals(US11page.statusselect.getAttribute("value"),"COMPLETED");
        Assert.assertEquals(US11page.statusselect.getAttribute("value"),"CANCELLED");





    }

    @Then("HISave butonuna tiklar")
    public void saveButonunaTiklar() { US11page.save.click();
        
    }

    @Then("HIRandevu olusuturuldu mesaji gorunur")
    public void randevuOlusuturulduMesajiGorunur() {Assert.assertTrue(US11page.message.isDisplayed());
    }
}
