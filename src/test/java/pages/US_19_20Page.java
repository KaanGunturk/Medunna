package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_19_20Page {

    public US_19_20Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='svg-inline--fa fa-user fa-w-14 ']")
    public WebElement kullaniciIsareti;

    @FindBy(xpath = "//*[*='Sign in']")
    public WebElement signIn;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement UserName;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement Password;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement signInClick;

    @FindBy(xpath = "(//*[@class='d-flex align-items-center dropdown-toggle nav-link'])[1]")
    public WebElement temsTitles;

    @FindBy(xpath = "(//*[*='Staff'])[1]")
    public WebElement staffButton;

    @FindBy(xpath = "//*[@class='svg-inline--fa fa-plus fa-w-14 ']")
    public WebElement createnewStaff;

    @FindBy(xpath = "//input[@id='searchSSN']")
    public WebElement staffssn;



    @FindBy(xpath = "//input[@name='useSSNSearch']")
    public WebElement useSearch;

    @FindBy(xpath = "//button[@class='btn btn-secondary']")
    public WebElement searchUserButton;

    @FindBy(xpath = "//input[@id='staff-firstName']")
    public WebElement stafffirstName;

    @FindBy(xpath = "//input[@id='staff-lastName']")
    public WebElement stafflastName;

    @FindBy(xpath = "//input[@id='staff-birthDate']")
    public WebElement birthDate;

    @FindBy(xpath = "//input[@name='phone']")
    public WebElement phone;

    @FindBy(xpath = "//select[@id='staff-gender']")
    public WebElement gender;

    @FindBy(xpath = "//*[@value='MALE']")
    public WebElement male;

    @FindBy(xpath = "//*[@value='FEMALE']")
    public WebElement female;

    @FindBy(xpath = "//*[@value='OTHER']")
    public WebElement other;

    @FindBy(xpath = "//select[@name='bloodGroup']")
    public WebElement bloodGroup;

    @FindBy(xpath = "//*[@value='Apositive']")
    public WebElement Apositive;

    @FindBy(xpath = "//*[@value='Anegative']")
    public WebElement Anegative;

    @FindBy(xpath = "//*[@value='Bpositive']")
    public WebElement Bpositive;

    @FindBy(xpath = "//*[@value='Opositive']")
    public WebElement Opositive;

    @FindBy(xpath = "//*[@value='Bnegative']")
    public WebElement Bnegative;

    @FindBy(xpath = "//*[@value='Onegative']")
    public WebElement Onegative;

    @FindBy(xpath = "//*[@value='ABpositive']")
    public WebElement ABpositive;

    @FindBy(xpath = "//*[@value='ABnegative']")
    public WebElement ABnegative;

    @FindBy(xpath="//input[@id='staff-adress']")
    public WebElement adress;

    @FindBy(xpath="//input[@id='staff-description']")
    public WebElement description;

    @FindBy(xpath="//input[@id='staff-createdDate']")
    public WebElement createdDate;

    @FindBy(xpath = "//*[@id='staff-user']")
    public WebElement staffUser;

    @FindBy(xpath = "//*[@id='staff-country']")
    public WebElement staffcountry;

    @FindBy(xpath = "//select[@id='staff-cstate']")
    public WebElement Staffcity;

    @FindBy(xpath = "//*[@class='svg-inline--fa fa-save fa-w-14 ']")
    public WebElement saveButton;

    @FindBy(xpath = "(//a[@class='btn btn-primary btn-sm'])")
    public WebElement editButton;

    @FindBy(xpath = "(//*[@class='d-none d-md-inline'])[6]")
    public WebElement deleteButton;

    @FindBy(xpath = "(//*[@class='d-none d-md-inline'])[1]")
    public WebElement viewButton;

    @FindBy(xpath = "//*[@class='svg-inline--fa fa-user-plus fa-w-20 ']")
    public WebElement administration;

    @FindBy(xpath = "//*[@class='dropdown-menu dropdown-menu-right show']")
    public WebElement userManagment;

    @FindBy(xpath = "(//*[@class='d-none d-md-inline'])[60]")
    public WebElement userManagmentView;

    @FindBy(xpath = "(//*[@class='btn btn-danger'])[5]")
    public WebElement deAvtivatedButton;

    @FindBy(xpath = "(//*[@class='svg-inline--fa fa-pencil-alt fa-w-16 '])[20]")
    public WebElement userManagmentEdit;

    @FindBy(xpath = "(//*[@class='form-control is-untouched is-pristine av-valid form-control'])[6]")
    public WebElement userManagmentProfiles;

    @FindBy(xpath = "//*[@class='svg-inline--fa fa-save fa-w-14 ']")
    public WebElement userManagmentsaveButton;

    @FindBy(xpath = "(//*[@class='d-none d-md-inline'])[60]")
    public WebElement  userManagmentdeleteButton;

    @FindBy(xpath="(//th[@class='hand'])[2]")
    public WebElement ssnNumber;

    @FindBy(xpath = "//*[@class='svg-inline--fa fa-pencil-alt fa-w-16 ']")
    public WebElement viewEditButton;



























}
