package stepDefinitions.uiStep;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import utilities.ConfigReader;
import utilities.Driver;

public class US23 {

    pages.US23 us_023Page = new pages.US23();

    @And("Onceden tedavisi biten hastasini bulur ve show appointmentsa tiklar")
    public void oncedenTedavisiBitenHastasiniBulurVeShowAppointmentsaTiklar() throws InterruptedException {
        us_023Page.ssnSearchForInvoice.sendKeys("555-65-4587");
        Thread.sleep(2000);
        us_023Page.showAppointmentsFor3555.click();

    }
    @And("Payment Invoice Processesin tiklanabilir oldugunu test eder ve tiklar")
    public void paymentInvoiceProcessesinTiklanabilirOldugunuTestEderVeTiklar() {
        Assert.assertTrue(us_023Page.payment.isEnabled());
        us_023Page.payment.click();
    }
    @And("Examfee ve toplam tutarin gorulebildigini test eder")
    public void examfeeVeToplamTutarinGorulebildiginiTestEder() {
        Assert.assertTrue(us_023Page.examFee.isDisplayed());
        Assert.assertTrue(us_023Page.totalCost.isDisplayed());

    }

    @Then("Create Invoice tiklanabilir oldugunu test eder")
    public void createInvoiceTiklanabilirOldugunuTestEder() {
        Assert.assertTrue(us_023Page.createInvoiceButton.isEnabled());
    }


    @And("Odemesi tamamlanmis olan eski hastayi bulur ve appointmentsa tiklar")
    public void odemesiTamamlanmisOlanEskiHastayiBulurVeAppointmentsaTiklar() throws InterruptedException {
        us_023Page.ssnSearchForInvoice.sendKeys(ConfigReader.getProperty("completedPatientSSN"));
        Thread.sleep(2000);
        us_023Page.showAppointments.click();
    }



    @Then("show invoice in tiklanabilir oldugunu test eder")
    public void showInvoiceInTiklanabilirOldugunuTestEder() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(us_023Page.showInvoice.isEnabled());
        
    }

    @And("show invoice a tiklar")
    public void showInvoiceATiklar() {
        JavascriptExecutor executor = (JavascriptExecutor)Driver.getDriver();
        executor.executeScript("arguments[0].click();",us_023Page.showInvoice);
    }


    @Then("invoice sayfasinda oldugunu ve gorebildigini test eder")
    public void invoiceSayfasindaOldugunuVeGorebildiginiTestEder() {
        String url = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals("https://www.medunna.com/invoice-show/153510",url);
        Assert.assertTrue(us_023Page.invoiceShownCost.isDisplayed());
        Assert.assertTrue(us_023Page.invoiceShownName.isDisplayed());


    }
}
