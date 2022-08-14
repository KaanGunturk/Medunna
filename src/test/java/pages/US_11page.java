package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_11page {
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

    @FindBy (xpath = "//button[@id='save-entity']")
    public WebElement save;

    @FindBy (xpath = "//div[@role='alert']")
    public WebElement message;












}
