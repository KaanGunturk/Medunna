package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class US15 {
    public US15() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@aria-haspopup='true']")
    public WebElement icon;

    @FindBy(xpath = "//a[@class='dropdown-item']")
    public WebElement firstSign_in;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement usernameTextbox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordTextbox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement secondSign_in;

    @FindBy(xpath = "//span[text()='Enes ArslanAdmin']")
    public WebElement sign_inControl;

    @FindBy(xpath = "//span[text()='Items&Titles']")
    public WebElement items_titles;

    @FindBy(xpath = "(//a[@href='/patient'])[1]")
    public WebElement patientSelect_items_titles;

    @FindBy(id = "jh-create-entity")
    public WebElement createAnewPatientButton;

    @FindBy(xpath = "//input[@id='patient-firstName']")
    public WebElement patientFirstName;
    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement patientLastName;
    @FindBy(xpath = "//input[@name='email']")
    public WebElement patientEmail;
    @FindBy(xpath = "//input[@name='phone']")
    public WebElement patientPhoneNumber;
    @FindBy(xpath = "//input[@name='adress']")
    public WebElement patientAdress;
    @FindBy(xpath = "//input[@name='birthDate']")
    public WebElement patientBirthDay;
    @FindBy(xpath = "//select[@name='country.id']")
    public WebElement patientCountry;
    @FindBy(xpath = "//select[@name='cstate.id']")
    public WebElement patientState;
    @FindBy(xpath = "//span[text()='Save']")
    public WebElement patientSave;
    @FindBy(xpath = "//div[@role='alert']")
    public WebElement patientAlert;
    @FindBy(xpath = "/html/body/div/div/div/div[4]/div/div/div/div/div[1]/div/table/thead/tr/th[12]/span")
    public WebElement patientCreatedDate;
    @FindBy(xpath = "/html/body/div/div/div/div[4]/div/div/div/div/div[1]/div/table/tbody/tr[1]/td[3]")
    public WebElement patientFirstNameActualData;
    @FindBy(xpath = "/html/body/div/div/div/div[4]/div/div/div/div/div[1]/div/table/tbody/tr[1]/td[7]")
    public WebElement patientEmailActualData;

    public void adminLogin() {
        firstSign_in.click();
        usernameTextbox.sendKeys(ConfigReader.getProperty("userNameAdmin"));
        passwordTextbox.sendKeys(ConfigReader.getProperty("sifreAdmin"));
        secondSign_in.click();
    }

    @FindBy (xpath = "(//a[@class='btn btn-link btn-sm'])[1]")
    public WebElement ilkIDnumber;
    @FindBy (xpath = "//span[text()='SSN']")
    public WebElement ssnNumberControl;
    @FindBy (xpath = "//span[text()='First Name']")
    public WebElement firstnameControl;
    @FindBy (xpath = "//div/dl/dd[3]")
    public WebElement lastnameControl;
    @FindBy (xpath = "//span[text()='Address']")
    public WebElement adressControl;
    @FindBy(xpath = "(//span[text()='Patient'])[2]")
    public WebElement patientControl;

    @FindBy(xpath="//span[text()='Edit']")
    public WebElement editButton;

    @FindBy(xpath="//select[@name='bloodGroup']")
    public WebElement bloodGroup;

    @FindBy(xpath="//span[text()='Appointment']")
    public WebElement itemsTitlesAppointment;

    @FindBy(xpath="//span[text()='Create a new Appointment']")
    public WebElement createANewAppointment;

    @FindBy(xpath="//input[@name='endDate']")
    public WebElement appointmentEndDate;

    @FindBy(xpath="//select[@name='status']")
    public WebElement appointmentStatus;

    @FindBy(xpath="//select[@name='physician.id']")
    public WebElement appointmentDoctorSelect;

    @FindBy(xpath="//select[@name='patient.id']")
    public WebElement appointmentHastaSelect;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement appointmentSaveButton;

    @FindBy(xpath = "(//a[@class='btn btn-danger btn-sm'])[1]")
    public WebElement deleteButton;

    @FindBy(xpath = "//button[@id='jhi-confirm-delete-patient']")
    public WebElement deleteButtonSecond;


    @FindBy(xpath = "(//a[@class='btn btn-link btn-sm'])[1]")
    public WebElement idPatientKayitAPI;

    @FindBy(xpath = "//select[@name='gender']")
    public WebElement patientGender;
    @FindBy(xpath = "//select[@name='bloodGroup']")
    public WebElement patientBloodGroup;


    //US15_TC05
    @FindBy(xpath = "//tbody/tr/td[2]")
    public List<WebElement> listOfAllStates;

    @FindBy(xpath = "(//*[@class='page-link'])[8]")
    public WebElement nextPagelink;

    @FindBy(xpath = "//span[text()='State/City']")
    public WebElement stateCityButton;
}
