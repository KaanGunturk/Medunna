package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US_15Page extends BasePage {

    public US_15Page()    { PageFactory.initElements(Driver.getDriver(),this); }


    // -- > US005
    @FindBy (xpath = "(//img[@alt='Logo'])")               // <-- home page
    public WebElement homePageLogo;
    @FindBy(xpath = "(//span[text()='Make an'])")
    public WebElement makeAnAppointmentButton;
    @FindBy(xpath = "//h2[text()='Make an Appointment']")
    public WebElement makeAppoinmentTitle;
    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstNameInputBox;
    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastNameInputBox;
    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement ssnInputBox;
    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailInputBox;
    @FindBy(xpath = "//input[@name='phone']")
    public WebElement phoneInputBox;
    @FindBy(xpath = "//input[@name='appoDate']")
    public WebElement dateTimeInputBox;
    @FindBy(xpath ="//button/span[text()='Send an Appointment Request']" )
    public WebElement appointmentRequestButton;

    @FindBy(xpath = "//div[contains(text(),'Saved')]")
    public WebElement savedToastContainer;
    @FindBy(xpath = "//span[text()='Melinda Patient']")    // US05
    public WebElement melindaPatientAccount;

    @FindBy(xpath ="//li[@id='account-menu']/a")
    public WebElement accountMenu;
    @FindBy(xpath = "//a[@id='login-item']")
    public WebElement signInButton;                 //US05-US015
    @FindBy(xpath = "//input[@name='username']")
    public WebElement signInUsername;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement signInPassword;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInSubmit;
    @FindBy(xpath = "//span[text()='Team90 Admin']")
    public WebElement verifySignedInAdmin;

    @FindBy(id = "account-menu")
    public WebElement accountSignMenu;
    @FindBy(xpath = "//span[text()='Sign out']")
    public WebElement signOut;

    //  -->  US015 Patient - US19  Staff
    @FindBy(xpath ="//body/div/div/div//div[2]/nav/div//ul/li[8]/a/span[text()='Administration']")      //"//span[text()='Administration']")
    public WebElement administrationButton;
    @FindBy(xpath ="//span[text()='User management']" )
    public WebElement userManagementButton;

    @FindBy(xpath = "//span[text()='Create a new user']")
    public WebElement createANewUser;
    @FindBy(xpath = "//input[@name='login']")
    public WebElement newUserLoginInput;
    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement newUserFirstNameInput;
    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement newUserLastNameInput;
    @FindBy(xpath = "//input[@name='email']")
    public WebElement newUserEmailInput;
    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement newUserSsnInput;
    @FindBy(xpath = "//select[@name='langKey']")
    public WebElement newUserLanguageDropdown;
    @FindBy(id = "authorities")
    public WebElement newUserProfilesOptions;
    // ayri ayri locate edilebilir
    @FindBy(xpath = "//option[text()='ROLE_USER']")
    public WebElement newUserProfilesUserOption;
    @FindBy(xpath = "//option[text()='ROLE_PATIENT']")
    public WebElement newUserProfilesPatientOption;
    @FindBy(xpath = "//option[text()='ROLE_STAFF']")
    public WebElement newUserProfilesStaffOption;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement newUserSaveButton;


    //US15 newPatient and US19 newStaff
    @FindBy(xpath = "//span[text()='Items&Titles']")
    public WebElement itemsTitlesMenuButton;
    @FindBy(xpath = "//span[text()='Patient']")
    public WebElement itemsTitlesPatient;
    @FindBy(xpath = "//span[text()='Create a new Patient']")
    public WebElement CreateANewPatient;
    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement newFirstNameInput;
    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement newLastNameInput;
    @FindBy(xpath = "//input[@name='birthDate']")
    public WebElement newBirthDateInput;
    @FindBy(xpath = "//input[@name='phone']")
    public WebElement newPhoneInput;
    @FindBy(xpath = "//select[@name='gender']")
    public WebElement newGenderSelect;
    @FindBy(xpath = "//select[@name='bloodGroup']")
    public WebElement newBloodSelect;
    @FindBy(xpath ="//input[@name='adress']" )
    public WebElement newAddressInput;
    @FindBy(xpath ="//textarea[@name='description']" )              // for patient
    public WebElement newDescriptionTextarea;
    @FindBy(xpath = "//input[@name='description']")         //for staff
    public WebElement descriptionInput;
    @FindBy(xpath = "//*[@id=\"staff-user\"]")
    public WebElement newUserSelect;
    @FindBy(xpath = "//select[@name='country.id']")
    public WebElement newCountrySelect;
    @FindBy(xpath = "//select[@name='cstate.id']")
    public WebElement newStateSelect;
    @FindBy(xpath = "//span[text()='Save']")
    public WebElement newSaveButton;

    // TOAST Containers
    @FindBy(xpath = "//div[contains(text(),'created')]")
    public WebElement createdToastContainer;
    @FindBy(xpath = "//div[contains(text(),'deleted')]")
    public WebElement deletedToastContainer;
    @FindBy(xpath = "//div[contains(text(),'found')]")
    public WebElement foundToastContainer;
    @FindBy(xpath = "//div[contains(text(),'updated')]")
    public WebElement updatedToastContainer;


    @FindBy(xpath = "//thead/tr/th[8]/span[text()='Created date']\")")
    public WebElement createdDateColumnTitle;
    @FindBy(xpath ="//table/thead/tr/th[12]/span[text()='Created Date']")   //"//thead//tr[1]//th[12]") //    //span[text()='Created Date']") //thead//tr[1]//th[12]
    public WebElement patientCreatedDateColumnTitle;

    @FindBy(xpath ="//table/tbody/tr[1]/td[1]/a")
    public WebElement firstPatientID;
    @FindBy(xpath = "//tbody/tr/td//span[text()='View']")
    public WebElement viewPatient;
    @FindBy(xpath = "//h2/b")           // US15-US19
    public WebElement idCansee;
    @FindBy(xpath = "//dd[1]")
    public WebElement ssnCanSee;
    @FindBy(xpath = "//dd[2]")
    public WebElement firstnameCanSee;
    @FindBy(xpath = "//dd[3]")
    public WebElement lastnameCanSee;
    @FindBy(xpath = "//dd[4]")
    public WebElement birthdateCanSee;
    @FindBy(xpath = "//dd[5]")
    public WebElement phoneCanSee;
    @FindBy(xpath = "//dd[6]")
    public WebElement genderCanSee;
    @FindBy(xpath = "//dd[7]")
    public WebElement bloodCanSee;
    @FindBy(xpath = "//dd[8]")
    public WebElement addressCanSee;
    @FindBy(xpath = "//dd[9]")
    public WebElement descriptionCanSee;
    @FindBy(xpath = "//dd[10]")
    public WebElement createdateCanSee;
    @FindBy(xpath = "//dd[11]")
    public WebElement userCanSee;
    @FindBy(xpath = "//dd[12]")
    public WebElement countryCanSee;
    @FindBy(xpath = "//dd[13]")
    public WebElement stateCanSee;

    @FindBy(xpath = "//tbody/tr[1]//td[16]/div/a[3]")
    public WebElement deletePatientButton;
    @FindBy(xpath = "//button/span[text()='Delete']")
    public WebElement deleteButtonFromAlert;

    @FindBy(xpath = "//table/tbody/tr[1]/td[16]/div/a[2]")
    public WebElement patientEditButton;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement editPatientSubmitButton;
    @FindBy(xpath = "//tbody/tr[1]/td[3]")
    public WebElement firstNameVerify;

    // --> Create Staff
    @FindBy(xpath = "//a/span[text()='Register']")
    public WebElement accountRegisterButton;
    @FindBy(name = "ssn")
    public WebElement registrationSsn;
    @FindBy(name = "firstName")
    public WebElement registrationFirstname;
    @FindBy(name = "lastName")
    public WebElement registrationLastname;
    @FindBy(name = "username")
    public WebElement registrationUsername;
    @FindBy(name = "email")
    public WebElement registrationEmail;
    @FindBy(name = "firstPassword")
    public WebElement registrationNewPassword;
    @FindBy(name = "secondPassword")
    public WebElement registrationConfirmPassword;
    @FindBy(xpath = "//div/div[2]/div/p")   //"//div/div/div/div[2]/div/p")
    public WebElement pageDowntoRegister;
    @FindBy(id = "register-submit")
    public WebElement registrationRegisterButton;

    @FindBy(xpath = "//div/ul/li[7]/a")
    public WebElement accountMenuAfterSignout;

    //savedToast kullanilir
    @FindBy(xpath ="//td[text()='stfmehlika']/../td/button")      //"//table/tbody/tr[4]/td[5]/button/span")             //"//td[text()='mehlikastf']/../td[5]/button/span")
    // td[text()='111-22-1930']/../td[5]/button
    public WebElement deactivatedActivatedButton;

    @FindBy(xpath = "//span[text()='Staff']")
    public WebElement itemsTitlesStaff;
    @FindBy(id = "jh-create-entity")
    public WebElement createANewStaffButton;
    @FindBy(id = "searchSSN")
    public WebElement staffSsnInput;
    @FindBy(id = "useSSNSearch")
    public WebElement useSearchSsnCheckbox;
    @FindBy(xpath = "//button[text()='Search User']")
    public WebElement ssnSearchUserButton;


    //populated Staff Informations  = staff check
    @FindBy(xpath ="//tbody/tr/td[1]/a")                 //"//body/div/div/div/div[4]/div/div/div/div/div//dl/dd[1]") //
    public WebElement firststaffIDCheck;
    @FindBy(xpath ="//span[text()='ID']/../../th[11]/span[text()='Created Date']")      //"//thead/tr/th[11]/span[text()='Created Date']")        //"//table/thead/tr/th[11]/span[text()=\'Created Date\']")
    public WebElement staffCeratedDate;
    @FindBy(xpath = "//h2/span[text()='Staff']/../b")          //"//div/h2/b[text()]")    //"//body/div/div/div/div[4]/div/div/div/div/div/h2/b")
    public WebElement staffPageIDCheck;
    @FindBy(xpath = "//tbody/tr[1]/td[15]/div/a[2]")
    public WebElement staffEditButton;
    @FindBy(id = "save-entity")
    public WebElement staffEditSaveButton;
    @FindBy(xpath = "//tbody/tr[1]/td[15]/div/a[3]")
    public WebElement staffDeleteButton;
    @FindBy(xpath = "(//button[@id='jhi-confirm-delete-staff'])/span[text()='Delete']")
    public WebElement staffDeleteAlertDelete;

    // delete from Administration
    @FindBy(xpath = "//thead/tr[1]/th[8]/span")
    public WebElement administrationCreatedDateColumn;
    @FindBy(xpath = "//td[@class='text-right']/div/a[3]")
    public WebElement administrationUserDeleteButton;


//            @FindBy(xpath = "(//div[@class='form-group'])[3]/div/input")
//            public WebElement staffLoginEdit;
//            @FindBy(xpath = "(//div[@class='form-group'])[3]/div/input")
//            public WebElement staffFirstnameEdit;
//            @FindBy(xpath = "(//div[@class='form-group'])[3]/div/input")
//            public WebElement staffLastnameEdit;
//            @FindBy(xpath = "(//div[@class='form-group'])[3]/div/input")
//            public WebElement staffEmailEdit;
//            @FindBy(xpath = "//input[@id='activated']")
//            public WebElement staffEditActivatedCehckbox;


    // ids
    @FindBy(xpath = "//tbody/tr/td[1]")
    public List<WebElement> staffIDs;

    @FindBy(xpath = "//dd[text()='USA']")
    public WebElement verifyCountryUSA;
}