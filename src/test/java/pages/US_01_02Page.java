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


}
