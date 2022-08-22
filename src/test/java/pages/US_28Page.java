package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_28Page {

    public US_28Page(){
        PageFactory.initElements(Driver.getDriver(),this);
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
    public WebElement signInButonu2;

    @FindBy(xpath = "//span[text()='Items&Titles']")
    public WebElement itemTitlesButonu;

    @FindBy(xpath = "//span[text()='Country']")
    public WebElement countryButonu;

    @FindBy(xpath = "//span[text()='Create a new Country']")
    public WebElement createNewCountryButonu;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement nameTextBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement creatCountrySaveButonu;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement creatCountryBasariMesaji;

    @FindBy(xpath = "//span[text()='State/City']")
    public WebElement stateCityButonu;

    @FindBy(xpath = "//span[text()='Create a new State/City']")
    public WebElement creatCtiyButonu;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement cityNameTextBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement creatCitySaveButonu;

    @FindBy(xpath = "//select[@name='state.id']")
    public WebElement countrySecmeButonu;

    @FindBy(xpath = "//div[@class='Toastify__toast Toastify__toast--error toastify-toast']")
    public WebElement creatCityBasarisizlikMesaji;

    @FindBy(xpath = "(//a[@class='btn btn-danger btn-sm'])[600]")
    public WebElement countryDeleteButonu;

    @FindBy(xpath = "//button[@id='jhi-confirm-delete-country']")
    public WebElement acilanPencereDeleteButonu;

    @FindBy(xpath = "//div[@class='Toastify__toast Toastify__toast--success toastify-toast']")
    public WebElement countryDeleteBasariMesaji;


}
