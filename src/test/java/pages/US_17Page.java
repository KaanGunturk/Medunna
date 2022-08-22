package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_17Page {

    public US_17Page() {

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

    @FindBy(xpath = "//*[text()='Items&Titles']")
    public WebElement itemsTitlesButonu;

    @FindBy(xpath = "//*[text()='Test Item']")
    public WebElement testItem;

    @FindBy(xpath = "//*[text()='Create a new Test Item']")
    public WebElement createNewTestItem;


    @FindBy(xpath = "//input[@name='name']")
    public WebElement Name;

    @FindBy (xpath = "//input[@name='description']")
    public WebElement Description;

    @FindBy(xpath = "//input[@name='price']")
    public WebElement Price;

    @FindBy(xpath = "//input[@name='defaultValMin']")
    public WebElement defaultValMin;

    @FindBy(xpath = "//input[@name='defaultValMax']")
    public WebElement defaultValMax;

    @FindBy(xpath = "//input[@name='createdDate']")
    public WebElement createdDate;

    @FindBy(xpath = "//*[@id='save-entity']")
    public WebElement SaveButonu;

    @FindBy(xpath = "//a[@href='/c-test-item/205486/edit?page=44&sort=id,asc']")
    public WebElement editButonu;

    @FindBy(xpath = "//*[text()='Save']")
    public WebElement saveKaydetButonu;

   // @FindBy(xpath = "//a[@class='btn btn-info btn-sm']")
   // public WebElement viewButonu;

    @FindBy(xpath = "//a[@href='/c-test-item/205486']")
    public WebElement viewButton;

    @FindBy(xpath = "//*[text()='Test Item']")
    public WebElement testItemSayfasiniGor;



    @FindBy(xpath = "//a[@href='/c-test-item/205486/delete?page=44&sort=id,asc']")
    public WebElement deleteButonu;

    @FindBy(xpath = "//*[@id='jhi-confirm-delete-cTestItem']")
    public WebElement tekrarDeleteButonu;



}
