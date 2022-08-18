package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class US018_Page {

    public US018_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement profilSimgesi;

    @FindBy(xpath = "//*[text()='Sign in']")
    public WebElement signInButton1;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "(//*[text()='Sign in'])[3]")
    public WebElement sing_in_button2;

    @FindBy(xpath = "//*[text()='Administration']")
    public WebElement administration;

    @FindBy(xpath = "//*[text()='User management']")
    public WebElement userManagement;

    @FindBy(xpath = "//*[text()='Items&Titles']")
    public WebElement itemsAndTitles;

    @FindBy(xpath = "(//*[text()='Physician'])[1]")
    public WebElement physician;

    @FindBy(xpath = "//*[text()='Create a new Physician']")
    public WebElement createANewPhysician;

    @FindBy(xpath = "//*[text()='Create a new user']")
    public WebElement createANewUser;


    @FindBy(xpath = "//input[@name='login']")
    public WebElement loginTextBox;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstNameTextBox;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastNameTextBox;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailTextBox;

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement ssnTextBox;

    @FindBy(xpath = "//select[@id='authorities']")
    public WebElement roleDdm;

    @FindBy(xpath = "//*[text()='User found with search SSN']")
    public WebElement dogrulamaMesaji;

    @FindBy(xpath = "//*[text()='A new Physician is created with identifier 202913']")
    public WebElement dogrulamaMesaji2;

    @FindBy(xpath = "//*[text()='A Physician is updated with identifier 202913']")
    public WebElement dogrulamaMesaji3;

    @FindBy(xpath = "//*[text()='A Physician is deleted with identifier 202943']")
    public WebElement dogrulamaMesaji4;

    @FindBy(xpath = "//*[text()='Save']")
    public WebElement saveButton;

    @FindBy(xpath = "//*[text()='Search User']")
    public WebElement searchUser;

    @FindBy(id = "searchSSN")
    public WebElement searchSSN;

    @FindBy(id = "useSSNSearch")
    public WebElement useSSNSearchCheckBox;

    @FindBy(id = "//thead//tr")
    public List<WebElement> doctorInfo;

    @FindBy(id = "//input[@name='birthDate']")
    public WebElement birthDate;

    @FindBy(id = "//input[@id='physician-phone']")
    public WebElement phone;

    @FindBy(id = "//input[@name='adress']")
    public WebElement adress;

    @FindBy(xpath = "//select[@id='physician-gender']")
    public WebElement genderDdm;

    @FindBy(xpath = "//select[@id='physician-speciality']")
    public WebElement specialityDdm;

    @FindBy(id = "//input[@id='physician-description']")
    public WebElement description;

    @FindBy(id = "//input[@id='physician-examFee']")
    public WebElement examFee;

    @FindBy(xpath = "//select[@id='physician-country']")
    public WebElement countryDdm;

    @FindBy(xpath = "//input[@id='file_image']")
    public WebElement dosyaSecButton;

    @FindBy(xpath = "(//a[@class='btn btn-primary btn-sm'])[1]")
    public WebElement editButton;

    @FindBy(xpath = "(//a[@class='btn btn-danger btn-sm'])[1]")
    public WebElement deleteButton;

    @FindBy(xpath = "//button[@id='jhi-confirm-delete-physician']")
    public WebElement deleteButton2;

}
