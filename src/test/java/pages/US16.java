package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US16 {
    public US16() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement kullaniciSembolu;

    @FindBy(xpath = "//*[text()='Sign in']")
    public  WebElement signInButonu;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement usarname;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "(//*[text()='Sign in'])[3]")
    public WebElement signIn2;

    @FindBy(xpath = "//*[text()='Items&Titles']")
    public WebElement ItemsTitles;

    @FindBy(xpath = "(//*[text()='Room'])[1]")
    public WebElement Room;

    @FindBy(xpath = "//*[text()='Create a new Room']")
    public WebElement YeniOda;

    @FindBy(xpath = "//input[@name='roomNumber']")
    public WebElement roomNumber;

    @FindBy(xpath = "//select[@name='roomType']")
    public WebElement roomType;

    @FindBy(xpath = "//input[@name='status']")
    public WebElement status;

    @FindBy(xpath = "//input[@name='price']")
    public WebElement price;

    @FindBy(xpath = "//input[@name='description']")
    public WebElement  description;

    @FindBy(xpath = "//input[@name='createdDate']")
    public WebElement  createdDate;

    @FindBy(xpath = "//*[text()='Save']")
    public WebElement save;

    @FindBy(xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")
    public WebElement OdaOnaylandi;


    @FindBy(xpath = "(//*[text()='Delete'])[1]")
    public WebElement delete;

    @FindBy(xpath = "(//*[text()='Edit'])[1]")
    public WebElement edit;

    @FindBy(xpath = "(//a[@class='page-link'])[9]")
    public  WebElement sonSayfa;

    @FindBy(xpath = "(//*[text()='Full'])[2]")
    public WebElement full;

    @FindBy(xpath = "(//*[text()='Available'])[4]")
    public WebElement Available;

    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement priceUyariYazisi;

    @FindBy(xpath = "//*[text()='Room Type']")
    public WebElement roomTybeListe;

    @FindBy(xpath = "//tr//td[3]")
    public WebElement twin;

    @FindBy(xpath = "//tr//td[3]")
    public WebElement deycare;

    @FindBy(xpath = "//*[text()='Confirm delete operation']")
    public WebElement deleteYazisi;

    @FindBy(xpath = "(//*[text()='Delete'])[21]")
    public WebElement delete2;









}
