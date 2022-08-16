package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US_10_12Page {




    public US_10_12Page() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@data-icon='user']")
    public WebElement profilButonu;

    @FindBy(xpath = "//*[text()='Sign in']")
    public WebElement signInButonu;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement usernameTextBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signIn2Butonu;


    @FindBy(xpath = "//*[text()='MY PAGES']")
    public WebElement myPages;

    @FindBy(xpath = "//*[text()='My Appointments']")
    public WebElement myAppointments;


    @FindBy(xpath = "//input[@id='fromDate']")
    public WebElement zamanDilimi1;

    @FindBy(xpath = "//input[@id='toDate']")
    public WebElement zamanDilimi2;


    @FindBy(xpath = "  //*[text()='ID']")
    public WebElement id;

    @FindBy(xpath = "//*[text()='Start DateTime']")
    public WebElement startDateTime;

    @FindBy(xpath = "//*[text()='End DateTime']")
    public WebElement endDateTime;

    @FindBy(xpath = "//*[text()='Status']")
    public WebElement status;

    @FindBy(xpath = "//*[text()='Edit']")
    public WebElement hastaEditButon;

    @FindBy(xpath = "//a[@class='btn btn-success btn-sm']")
    public WebElement requestATestButon;

    @FindBy(xpath = "//*[@id='c-test-item-heading']")
    public WebElement testitemsTablo;


    @FindBy(xpath = "//tr//td[2]")
    public List<WebElement> isimListesi;



}






