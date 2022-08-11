package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_003_004Page {
    public US_003_004Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@data-icon='user']")
    public WebElement profilButonu;

    @FindBy(xpath = "//*[text()='Sign in']")
    public WebElement signInButonu;

    @FindBy(xpath = "//*[@id=\"username\"]")
    public WebElement usernameTextBox;

    @FindBy(xpath = "//*[@id=\"password\"]")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//input[@name='rememberMe']")
    public WebElement rememberMeBox;

    @FindBy(xpath = "//*[text()='Did you forget your password?']")
    public WebElement didYouForgotPasswordButonu;

    @FindBy(xpath = "//*[text()='Register a new account']")
    public WebElement youDontHaveAccountYetButonu;

    @FindBy(xpath = "//*[text()='Cancel']")
    public WebElement cancelButonu;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInPageSignInButonu;

    @FindBy(xpath = "//*[text()='Register']")
    public WebElement registerButonu;


    @FindBy(xpath = "//li[@id='admin-menu']")
    public WebElement basariliGiris;

    @FindBy(xpath = "//input[@name='firstPassword']")
    public WebElement newPasswordTextBox;

    @FindBy(xpath = "//ul[@id='strengthBar']")
    public WebElement strengthBar;

    @FindBy(xpath = "(//li[@style='background-color: rgb(255, 153, 0);'])[1]")
    public WebElement strengthBarSeviye1 ;

    @FindBy(xpath = "(//li[@style='background-color: rgb(255, 153, 0);'])[2]")
    public WebElement strengthBarSeviye2;

    @FindBy(xpath = "(//li[@style='background-color: rgb(221, 221, 221);'])[2]")
    public WebElement strengthBarSeviye3;

    @FindBy(xpath = "(//li[@style='background-color: rgb(221, 221, 221);'])[3]")
    public WebElement strengthBarSeviye4;

    @FindBy(xpath = "(//li[@style='background-color: rgb(0, 255, 0);'])[5]")
    public WebElement strengthBarSeviye5;

}
