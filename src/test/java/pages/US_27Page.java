package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_27Page {

    public US_27Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='username']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//span[text()='Items&Titles']")
    public WebElement itemsTitles;

    @FindBy(xpath = "//span[text()='Messages']")
    public WebElement messages;

    @FindBy(xpath = "//span[text()='Name']")
    public WebElement kullaniciName;

    @FindBy(xpath = "//span[text()='Email']")
    public WebElement kullaniciEmail;

    @FindBy(xpath = "//span[text()='Message']")
    public WebElement kullaniciMesaji;

    @FindBy(xpath = "//span[text()='Create a new Message']")
    public WebElement yeniMesajOlustur;

    @FindBy(xpath = "//span[text()='ID']")
    public WebElement Id;

    @FindBy(xpath = "(//span[text()='Edit'])[1]")
    public WebElement editButon;

    @FindBy(xpath = "//input[@name='message']")
    public WebElement yeniMesaj;

    @FindBy(xpath = "(//span[text()='Delete'])[1]")
    public WebElement deleteButon;

    @FindBy(xpath = "(//span[text()='Delete'])[41]")
    public WebElement ikinciDeleteButon;

    @FindBy(xpath = "//*[contains(text(),'A new Message is created with identifier')]")
    public WebElement mesajOlusturma;

    @FindBy(xpath = "//*[contains(text(),'A Message is updated with identifier')]")
    public WebElement masajGuncelleme;

    @FindBy(xpath = "//*[contains(text(),'Message is deleted with identifier')]")
    public WebElement mesajSilme;



}
