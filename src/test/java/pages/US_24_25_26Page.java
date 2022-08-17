package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US_24_25_26Page {

    public US_24_25_26Page() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//input[@id='username']")
    public WebElement usernameTextBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//a[@id='login-item']")
    public WebElement signInButton1;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton2;

    @FindBy(id = "account-menu")
    public WebElement accountMenu;

    @FindBy(xpath = "//*[text()='MY PAGES']") //"(//a[@class='d-flex align-items-center dropdown-toggle nav-link'])[1]")
    public WebElement myPages;

    @FindBy(xpath = "(//*[text()='My Appointments'])[1]")
    public WebElement myAppointments;

    @FindBy(xpath = "//input[@name='fromDate']")
    public WebElement ilkTarihKutusu;

    @FindBy(xpath = "//input[@name='toDate']")
    public WebElement ikinciTarihKutusu;

    @FindBy(xpath = "(//a[@class='btn btn-primary btn-sm'])[1]")  //(//*[text()='Show Tests'])[1]
    public WebElement showTestRequest;

    @FindBy(xpath = "(//span[@class='d-none d-md-inline'])[1]") // //*[text()='View Results']
    public WebElement kanTahliliGorunum;

    @FindBy(xpath = "(//span[@class='d-none d-md-inline'])[2]") // //*[text()='View Results']
    public WebElement showInvoice;

    @FindBy(xpath = "//tbody//tr")
    public List<WebElement> kanTahliliBilgileri;


}
