package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US6_7 {
    public US6_7() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//*[@class='svg-inline--fa fa-user fa-w-14 ']")
    public WebElement kullaniciSembolu;

    @FindBy(xpath = "//*[text()='Sign in']")
    public  WebElement signInButonu;

    @FindBy(xpath = "//*[@name='username']")
    public  WebElement Username;

    @FindBy(xpath = "//*[@name='password']")
    public WebElement password;


    @FindBy(xpath = "(//*[text()='Sign in'])[3]")
    public WebElement signIn;


    @FindBy(xpath = "//*[@id=\"account-menu\"]/a/span")
    public WebElement profilButonu;

    @FindBy(xpath = "//*[@id=\"account-menu\"]/div/a[1]/span")
    public WebElement settingButonu;

    @FindBy(xpath = "//*[@name='firstName']")
    public  WebElement firstname;

    @FindBy(xpath = "//*[@name='lastName']")
    public  WebElement lastname;

    @FindBy(xpath = "//*[@name='email']")
    public  WebElement email;

    @FindBy(xpath = "//*[@type='submit']")
    public  WebElement saveButonu;

    @FindBy(xpath = "//*[text()='Settings saved!']")
    public WebElement guncellendiYazisi;

    @FindBy(xpath = "//*[text()='MY PAGES(PATIENT)']")
    public WebElement MyPages;

    @FindBy(xpath = "(//*[text()='Make an Appointment'])[1]")
    public WebElement makeApp;

    @FindBy(xpath = "//*[@name='firstName']")
    public WebElement isim;

    @FindBy(xpath = "//*[@name='lastName']")
    public WebElement soyisim;

    @FindBy(xpath = "//*[@name='ssn']")
    public WebElement ssn;

    @FindBy(xpath = "//*[@name='email']")
    public WebElement email2;

    @FindBy(xpath = "//*[@name='phone']")
    public WebElement phone;

    @FindBy(xpath = "//*[@name='appoDate']")
    public WebElement appoDate;

    @FindBy(xpath = "//*[text()='Send an Appointment Request']")
    public WebElement request;

    @FindBy(xpath = "//*[text()='Appointment registration saved!']")
    public WebElement onayYazisi;

    @FindBy(xpath = "//*[text()='Appointment date can not be past date!']")
    public WebElement girilemezYazisi;


    @FindBy(xpath = "(//*[text()='My Appointments'])[1]")
    public WebElement myAppo;


    @FindBy(xpath = "//table//tr")
    public List<WebElement> randevuListesi;












}

