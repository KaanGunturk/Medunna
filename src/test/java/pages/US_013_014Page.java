package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US_013_014Page {

    public US_013_014Page() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//input[@id='username']")
    public WebElement usernameTextBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//a[@id='login-item']")
    public WebElement signInButton1;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton2;

    @FindBy(id = "account-menu")
    public WebElement accountMenu;

    @FindBy(xpath = "//*[text()='MY PAGES']") //"(//a[@class='d-flex align-items-center dropdown-toggle nav-link'])[1]")
    public WebElement myPages;

    @FindBy(xpath = "//*[text()='My Inpatients']")
    public WebElement myInpatients;

    @FindBy(xpath = "//*[text()='InPatient request already done for this appointment']")
    public WebElement myInpatientMesaji;

    @FindBy(xpath = "(//*[text()='My Appointments'])[1]")
    public WebElement myAppointments;

    @FindBy(xpath = "//span[@class='d-none d-md-inline']")
    public WebElement myAppointmentHastaEditButonu;

    @FindBy(xpath = "(//span[@class='d-none d-md-inline'])[2]")
    public WebElement statusDegistirilecekEditButonu;

    @FindBy(xpath = "(//a[@class='btn btn-primary btn-sm'])[2]")
    public WebElement showTestResultsTestOlanEditButonu2;

    @FindBy(xpath = "//button[@id='save-entity']")
    public WebElement statusDegisikliginiKaydedecekSubmit;


    @FindBy(xpath = "//a[@class='btn btn-danger btn-sm']")
    public WebElement showTestResultsButonu;

    @FindBy(xpath = "//a[@class='btn btn-info btn-sm']") //a[@class='btn btn-info btn-sm']//*[text()='View Results']
    public WebElement viewResults;

    //US13_TC01
    @FindBy(xpath = "//tbody//tr")
    public List <WebElement> viewResultsHastaBilgileri;

    @FindBy(xpath = "//tbody//tr")
    public List <WebElement> showTestResultsBilgileri;

    @FindBy(xpath = "//thead//tr")
    public List <WebElement> showTestResultsBaslikBilgileri;

    @FindBy(xpath = "//*[text()='Request Inpatient']")
    public WebElement requestInpatientButonu;

    @FindBy(xpath = "//a[@class='btn btn-primary btn-sm']")
    public WebElement myInpatientsEditButonu;

    @FindBy(xpath = "//div[text()='InPatient request already done for this appointment']")
    public WebElement inpatientMessage;

    @FindBy(xpath = "//div[text()='A new In Patient is created with identifier']")
    public WebElement inpatientSuccessfulyMessage;

    @FindBy(xpath = "//*[text()='Physician Team54']")
    public WebElement physicianTeam54Butonu;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[6]")
    public WebElement signOut;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement saveHataMesaji;










}
