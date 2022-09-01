package stepDefinitions.uiStep;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class US21 {

    pages.US21 us021Page = new pages.US21();


    @Then("Show appointments butonuna tiklar")
    public void show_appointments_butonuna_tiklar() {
        us021Page.showAppointments.click();
    }

    @Then("Appointmen'i duzenlemek icin edit butonuna tiklar")
    public void appointmen_i_duzenlemek_icin_edit_butonuna_tiklar() {
        us021Page.editAppointments.click();
    }

    @Then("Appointment duzenleme sayfasinda oldugunu test eder")
    public void appointment_duzenleme_sayfasinda_oldugunu_test_eder() {
        us021Page.editAppointmentPage.click();
    }

    @Then("Status acilir menusune tiklar")
    public void status_acilir_menusune_tiklar() {
        us021Page.statusPopup.click();
    }
    @Then("Menude UNAPPROVED, PENDING or CANCELLED opsiyonlarinin aktif oldugunu test eder")
    public void menude_unapproved_pendıng_or_cancelled_opsiyonlarinin_aktif_oldugunu_test_eder() {
        Assert.assertTrue(us021Page.statusPopupUnapproved.isEnabled());
        Assert.assertTrue(us021Page.statusPopupPending.isEnabled());
        Assert.assertFalse(us021Page.statusPopupCompleted.isEnabled());
        Assert.assertTrue(us021Page.statusPopupCancelled.isEnabled());
    }
    @Then("Anamnesis, Treatment or Diagnosis bolumlerini bos birakabildigini test eder")
    public void anamnesis_treatment_or_diagnosis_bolumlerini_bos_birakabildigini_test_eder() {
        us021Page.anamnesisArea.clear();
        us021Page.treatmentArea.clear();
        us021Page.diagnosisArea.clear();


        us021Page.isPresent(us021Page.invalidFeedback);
    }
    @Then("Hasta icin bir doktor secebilecegini test eder")
    public void hasta_icin_bir_doktor_secebilecegini_test_eder() throws InterruptedException {
        Thread.sleep(2000);
        Select select = new Select(us021Page.physicianArea);
        select.selectByValue("135673");
    }

    @Then("Show tests butonuna tiklar")
    public void show_tests_butonuna_tiklar() {
        us021Page.showTestsButton.click();
    }
    @Then("Kullanicinin test sonuclari sayfasinda oldugunu test eder")
    public void kullanicinin_test_sonuclari_sayfasinda_oldugunu_test_eder() {
        us021Page.isTestsPage.isDisplayed();
    }

}
