package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_05Page {

    public US_05Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='appointment-btn scrollto']")
    public WebElement appointment;

    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@id='lastName']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@id='ssn']")
    public WebElement ssn;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@id='phone']")
    public WebElement phone;

    @FindBy(xpath = "//div[text()='Your FirstName is required.']")
    public WebElement firstNameRequired;

    @FindBy(xpath = "//div[text()='Your LastName is required.']")
    public WebElement lastNameRequired;

    @FindBy(xpath = "//div[text()='Your SSN is required.']")
    public WebElement ssnRequired;

    @FindBy(xpath = "//div[text()='Your email is required.']")
    public WebElement emailRequired;

    @FindBy(xpath = "//div[text()='Phone number is required.']")
    public WebElement phoneRequired;

    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement profilMenu;

    @FindBy(xpath = "//span[text()='Sign in']")
    public WebElement signIn;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement ikinciSignIn;

    @FindBy(xpath = "//span[text()='MY PAGES(PATIENT)']")
    public WebElement myPages;

    @FindBy(xpath = "//span[text()='My Appointments']")
    public WebElement myAppointments;

    @FindBy(xpath = "//span[text()='ID']")
    public WebElement randevuId;

    @FindBy(xpath = "//button[@id='register-submit']")
    public WebElement appoButon;


}

