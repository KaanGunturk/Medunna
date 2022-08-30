package stepDefinitions.uiStep;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.US_15Page;
import utilities.ConfigReader;
import utilities.Driver;
import java.util.Arrays;
import java.util.List;


public class US15_StepDefinitions {

    US_15Page locator = new US_15Page();
    Actions action = new Actions(Driver.getDriver());
    static String idKeeper;

    @Given("yyLaunch web browser and navigate to the home page")
    public void launch_web_browser_and_navigate_to_the_home_page() {
        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));
    }

    @Given("yyClick Account Menu dropbox sign and click Sign In Text")
    public void click_account_menu_dropbox_sign_and_click_sign_in_text() {
        Driver.waitAndClick(locator.accountMenu, 1);
        Driver.wait(1);
        locator.signInButton.click();
        Driver.wait(1);
    }

    @Given("yyClick User Name textbox and enter admin user name {string}")
    public void click_user_name_textbox_and_enter_admin_user_name(String adminUsername) {
        locator.signInUsername.sendKeys(adminUsername);
    }

    @Given("yyClick Password textbox and enter admin password {string}")
    public void click_password_textbox_and_enter_admin_password(String adminPassword) {
        locator.signInPassword.sendKeys(adminPassword);
    }

    @Given("yyClick Sign In button")
    public void click_sign_in_button() {
        Driver.wait(1);
        locator.signInSubmit.click();
    }

    @Then("yyClick Items&Titles button and Patient from dropdown box")
    public void click_items_titles_button_and_patient_from_dropdown_box() {
        Driver.waitAndClick(locator.itemsTitlesMenuButton, 2);
        Driver.waitAndClick(locator.itemsTitlesPatient, 1);
        Driver.wait(1);
    }

    @Then("yyClick Create a new Patient button")
    public void click_create_a_new_patient_button() {
        locator.CreateANewPatient.click();
        Driver.wait(1);
    }

    @And("yyFill in or select these informations {string},{string},{string},{string},{string},{string},{string}")
    public void fill_in_or_select_these_informations(String firstname, String lastname, String birthdate, String email, String phone, String address, String description) {

        locator.newFirstNameInput.sendKeys(firstname);
        locator.newLastNameInput.sendKeys(lastname);
        locator.newBirthDateInput.sendKeys(birthdate);
        Driver.wait(1);
        locator.newUserEmailInput.sendKeys(email);
        locator.newPhoneInput.sendKeys(phone);
        Driver.wait(1);
        Select selectGender = new Select(locator.newGenderSelect);
        selectGender.selectByVisibleText("FEMALE");
        Select selectBlood = new Select(locator.newBloodSelect);
        selectBlood.selectByVisibleText("B+");
        Driver.wait(1);
        locator.newAddressInput.sendKeys(address);
        locator.newDescriptionTextarea.sendKeys(description);
        Driver.wait(1);
        Select selectCountry = new Select(locator.newCountrySelect);
        selectCountry.selectByVisibleText("USA");
        Select selectState = new Select(locator.newStateSelect);
        Driver.wait(1);
        selectState.selectByVisibleText("California");
        Driver.wait(1);
        locator.newSaveButton.click();
        Driver.wait(1);
    }

    @Then("yyVerify the new patient was created by admin successfully Toast Container")
    public void verify_the_new_patient_was_created_by_admin_successfully_toast_container() {
        Driver.wait(1);
        String createdMessage=Driver.waitAndGetText(locator.createdToastContainer);
        Assert.assertTrue(createdMessage.contains("created"));
        System.out.println("createdMessage = " + createdMessage);
        List<String> createdToastList= Arrays.asList(createdMessage.split("\\s"));
        idKeeper= createdToastList.get(7);
        System.out.println("idkeeper = " + idKeeper);
        System.out.println("list sonu id  = "+ createdToastList.get(7));
        Assert.assertFalse(idKeeper.isBlank());
        Assert.assertTrue(idKeeper.replaceAll("\\d","").isBlank());
        Driver.wait(1);

    }

    //TC01502
    @Given("yyClick Items&Titles button and select Patient from dropdown box")
    public void click_items_titles_button_and_select_patient_from_dropdown_box() {
        Driver.wait(1);
        Driver.clickWithJS(locator.itemsTitlesMenuButton);
        Driver.wait(1);
        locator.itemsTitlesPatient.click();
        Driver.wait(1);
    }

    @Given("yySelect id of any patient and click")
    public void select_id_of_any_patient_and_click() {
        Driver.wait(1);
        action.moveToElement(locator.patientCreatedDateColumnTitle);
        Driver.wait(2);
        Driver.clickWithJS(locator.patientCreatedDateColumnTitle);
        Driver.wait(1);

        System.out.println("birinci satir id : "+ locator.firstPatientID.getText()+" and "+  idKeeper);
        locator.firstPatientID.click();
        Driver.wait(1);
    }

    @Then("yyVerify admin can see patient SSN")
    public void verify_admin_can_see_patient_ssn() {
        Assert.assertTrue(locator.ssnCanSee.isDisplayed());
    }

    @Then("yyVerify admin can see patient First Name and Last Name")
    public void verify_admin_can_see_patient_first_name_and_last_name() {
        Assert.assertTrue(locator.firstnameCanSee.isDisplayed());
        Assert.assertTrue(locator.lastnameCanSee.isDisplayed());
    }

    @Then("yyVerify admin can see patient Birth Date and Phone")
    public void verify_admin_can_see_patient_birth_date_and_phone() {
        Assert.assertTrue(locator.birthdateCanSee.isDisplayed());
        Assert.assertTrue(locator.phoneCanSee.isDisplayed());
    }

    @Then("yyVerify admin can see patient Gender and Blood Group")
    public void verify_admin_can_see_patient_gender_and_blood_group() {
        Assert.assertTrue(locator.genderCanSee.isDisplayed());
        Assert.assertTrue(locator.bloodCanSee.isDisplayed());
    }

    @Then("yyVerify admin can see patient Address and Description")
    public void verify_admin_can_see_patient_address_and_description() {
        Assert.assertTrue(locator.addressCanSee.isDisplayed());
        Assert.assertTrue(locator.descriptionCanSee.isDisplayed());
    }

    @Then("yyVerify admin can see patient Created Date and User")
    public void verify_admin_can_see_patient_created_date_and_user() {
        Assert.assertTrue(locator.createdateCanSee.isDisplayed());
        Assert.assertTrue(locator.userCanSee.isDisplayed());
    }

    @Then("yyVerify admin can see patient Country and State City")
    public void verify_admin_can_see_patient_country_and_state_city() {
        Assert.assertTrue(locator.countryCanSee.isDisplayed());
        Driver.wait(1);
        Assert.assertTrue(locator.stateCanSee.isDisplayed());

        System.out.println("locator.ssnCanSee.getText() = " + locator.ssnCanSee.getText());
        System.out.println("locator.firstnameCanSee.getText() = " + locator.firstnameCanSee.getText());
        System.out.println("locator.lastnameCanSee.getText() = " + locator.lastnameCanSee.getText());
        System.out.println("locator.birthdateCanSee.getText() = " + locator.birthdateCanSee.getText());
        System.out.println("locator.phoneCanSee.getText() = " + locator.phoneCanSee.getText());
        System.out.println("locator.genderCanSee.getText() = " + locator.genderCanSee.getText());
        System.out.println("locator.bloodCanSee.getText() = " + locator.bloodCanSee.getText());
        System.out.println("locator.addressCanSee.getText() = " + locator.addressCanSee.getText());
        System.out.println("locator.descriptionCanSee.getText() = " + locator.descriptionCanSee.getText());
        System.out.println("locator.createdateCanSee.getText() = " + locator.createdateCanSee.getText());
        System.out.println("locator.userCanSee.getText() = " + locator.userCanSee.getText());
        System.out.println("locator.countryCanSee.getText() = " + locator.countryCanSee.getText());
        System.out.println("locator.stateCanSee.getText() = " + locator.stateCanSee.getText());
    }
    ////// TC01503
    @Given("yyClick Created Date and click first patient's ID number which is new created patient")
    public void click_created_date_and_click_first_patient_s_id_number_which_is_new_created_patient() {
        Driver.wait(1);
        Driver.waitAndClick(locator.patientCreatedDateColumnTitle,1);
        Driver.wait(1);
        System.out.println(locator.firstPatientID.getText());
        Driver.wait(1);
    }

    @Then("yyVerify it has correct ID which is same with new created patient's id number")
    public void verify_it_has_correct_id_which_is_same_with_new_created_patient_id_number() {

        Assert.assertTrue(locator.firstPatientID.isDisplayed());
        Assert.assertEquals(idKeeper,locator.firstPatientID.getText());
        System.out.println("TC01903 idKeeper = " +idKeeper+" first patient id = "+ locator.firstPatientID.getText());

        Assert.assertTrue(locator.firstNameVerify.isDisplayed());
    }

    @Then("yyClick Edit button, Enter a new data to Description and save")
    public void click_edit_button_enter_a_new_data_to_description_and_save() {
        Driver.wait(1);

        action.moveToElement(locator.patientEditButton).perform();
        Driver.wait(1);
        Driver.waitAndClick(locator.patientEditButton,2);
        Driver.wait(1);
        locator.newDescriptionTextarea.clear();
        Driver.wait(1);
        locator.newDescriptionTextarea.sendKeys("Yenilendi");
        Driver.wait(2);
        Driver.waitAndClick(locator.editPatientSubmitButton,2);
    }

    @Then("yyVerify admin can not assign patient to a doctor. Negative test BUG there is not a Doctor Assign web element")
    public void verify_admin_can_not_assign_patient_to_a_doctor_negative_test_bug_there_is_not_a_doctor_assign_web_element() {
        System.out.println("Admin can not assign patient to a doctor. BUG, there is not a Doctor Assign web element, I can not verify");
    }

    @Then("yyClick Items&Titles and click Patients")
    public void click_items_titles_and_click_patients() {
        Driver.waitAndClick(locator.itemsTitlesMenuButton);
        Driver.wait(1);
        Driver.waitAndClick(locator.itemsTitlesPatient);
        Driver.wait(1);
    }

    @Then("yyClick Created Date and click first patient's ID number")
    public void click_created_date_and_click_first_patient_s_id_number() {
        Driver.wait(2);
        Driver.clickWithJS(locator.patientCreatedDateColumnTitle);
        Driver.wait(1);
        locator.firstPatientID.click();
    }

    @Then("yyVerify ID is correct")
    public void verify_id_is_correct() {
        Assert.assertTrue(locator.idCansee.isEnabled());
        System.out.println("idkeeper from TC01903 = "+idKeeper);//???
        Assert.assertEquals(idKeeper,locator.idCansee.getText());
    }

    //TC01504
    @Given("yyClick Created Date and select first id which is new created patient")
    public void click_created_date_and_select_first_id_which_is_new_created_patient() {
        action.moveToElement(locator.patientCreatedDateColumnTitle);
        Driver.wait(1);
        Driver.clickWithJS(locator.patientCreatedDateColumnTitle);
        Driver.wait(1);
        locator.firstPatientID.click();
    }

    @Then("yyVerify Country is selected USA")
    public void verify_country_is_selected_usa() {
        action.moveToElement(locator.countryCanSee);
        Driver.wait(1);
        Assert.assertTrue(locator.verifyCountryUSA.getText().contains("USA"));
        Driver.wait(1);
    }

    @Then("yyVerify Country data is not blank")
    public void verify_country_data_is_not_blank() {
        Assert.assertFalse(locator.verifyCountryUSA.getText().isBlank());
        Driver.wait(2);
    }

    //////TC01505
    @Given("yyClick Created Date and click first patient's ID number which is new created patient yenimethod")
    public void click_created_date_and_click_first_patients_id_number_which_is_new_created_patient_yenimethod() {
        Driver.clickWithJS(locator.patientCreatedDateColumnTitle);
        Driver.wait(1);
    }

    @Given("yyClick Delete button and click Delete button on the alert")
    public void click_delete_button_and_click_delete_button_on_the_alert() {
        action.moveToElement(locator.deletePatientButton).perform();
        Driver.wait(2);
        Driver.clickWithJS(locator.deletePatientButton);
        Driver.wait(1);
        locator.deleteButtonFromAlert.click();
        Driver.wait(2);
    }

    @Then("yyVerify if you get a successful deleted message")
    public void verify_if_you_get_a_successful_deleted_message() {
        System.out.println("toast " + locator.deletedToastContainer.getText());
        List<String> deletedToastList= Arrays.asList(locator.deletedToastContainer.getText().split("\\s"));
        System.out.println("deletedToastList = " + deletedToastList);
        //System.out.println("list sonu id"+ deletedToastList.get(7));
        //System.out.println("idkeeper  "+idKeeper);
        Assert.assertTrue(locator.deletedToastContainer.getText().contains("deleted"));
        Driver.wait(1);
    }
}