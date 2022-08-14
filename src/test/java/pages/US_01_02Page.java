package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_01_02Page {

    public US_01_02Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='svg-inline--fa fa-user fa-w-14 ']")
    public WebElement kullaniciSembolu;

    @FindBy(xpath = "(//*[@data-icon='sign-in-alt'])[2]")
    public WebElement register;

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement ssn;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement userName;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@name='firstPassword']")
    public WebElement newPassword;

    @FindBy(xpath="//*[@id='strengthBar']")
    public WebElement passwordStrength;

    @FindBy(xpath="//input[@name='secondPassword']")
    public WebElement getNewPasswordConfirmation;

    @FindBy(xpath = "//button[@id='register-submit']")
    public WebElement signinRegister;


    public static class US_11page {
        public US_11page() {
            PageFactory.initElements(Driver.getDriver(), this);
        }

        @FindBy(xpath = "//*[@class='svg-inline--fa fa-user fa-w-14 ']")
        public WebElement accountmenu;

        @FindBy (xpath = "//a[@id='login-item']")
        public WebElement ilkSignin;

        @FindBy (xpath = "//input[@id='username']")
        public WebElement username;

        @FindBy (xpath = "//input[@id='password']")
        public WebElement password;

        @FindBy (xpath = "//button[@type='submit']")
        public WebElement ikinciSignin;

        @FindBy (xpath = "//button[@type='submit']")
        public WebElement myPages;

        @FindBy (xpath = "(//*[text()='My Appointments'])[1]")
        public WebElement myAppointments;

        @FindBy (xpath = "//*[text()='Edit']")
        public WebElement edit;

        @FindBy (xpath = "//*[text()='ID']")
        public WebElement id;

        @FindBy (xpath = "//*[text()='Start DateTime']")
        public WebElement startdate;

        @FindBy (xpath = "//*[text()='End DateTime']")
        public WebElement enddate;

        @FindBy (xpath = "//*[text()='Status']")
        public WebElement status;

        @FindBy (xpath = "//*[text()='Physician']")
        public WebElement physician;

        @FindBy (xpath = "//textarea[@name='anamnesis']")
        public WebElement anamnesis;

        @FindBy (xpath = "//textarea[@name='treatment']")
        public WebElement treatment;

        @FindBy (xpath = "//textarea[@name='diagnosis']")
        public WebElement diagnosis;

        @FindBy (xpath = "//textarea[@name='prescription']")
        public WebElement prescription;

        @FindBy (xpath = "//textarea[@name='description']")
        public WebElement description;

        @FindBy (xpath = "//select[@name='status']")
        public WebElement statusselect;

        @FindBy (xpath = "//button[@type='submit']")
        public WebElement save;












    }
}
