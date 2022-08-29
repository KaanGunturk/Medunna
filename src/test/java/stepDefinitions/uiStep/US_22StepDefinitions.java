package stepDefinitions.uiStep;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.US_022_StaffEditPage;
import utilities.Driver;

public class US_22StepDefinitions {

    US_022_StaffEditPage staffEditPage = new US_022_StaffEditPage();
    @Then("SSN numarasini girer")
    public void ssn_numarasini_girer() {
        staffEditPage.PatientSSNSearchBox.sendKeys("564-45-4269");
    }
    @Then("Show appoinmant butonuna tiklar")
    public void show_appoinmant_butonuna_tiklar() throws InterruptedException {
        Thread.sleep(5000);
        staffEditPage.ShowAppoinments.click();
    }
    @Then("show test butonuna tiklar")
    public void show_test_butonuna_tiklar() throws InterruptedException {
        Thread.sleep(5000);
        staffEditPage.ShowTest.click();
    }
    @Then("view results butonuna tiklar")
    public void view_results_butonuna_tiklar() throws InterruptedException {
        Thread.sleep(5000);
        staffEditPage.ViewResult.click();
    }
    @Then("test sonuclarinin gorulebilir oldugunu test eder")
    public void test_sonuclarinin_gorulebilir_oldugunu_test_eder() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue(staffEditPage.ViewResultWithNumber.isDisplayed());
    }
}
