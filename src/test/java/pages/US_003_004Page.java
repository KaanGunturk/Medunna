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
    WebElement profilButonu;

    @FindBy(xpath = "//*[text()='Sign in']")
    WebElement signInButonu;

    @FindBy(xpath = "//input[@name=‘username’]")
    WebElement usernameTextBox;

    @FindBy(xpath = "//input[@name=‘username’]")
    WebElement passwordTextBox;

    @FindBy(xpath = "//*[text()='Remember me’]")
    WebElement rememberMeBox;

    @FindBy(xpath = "//*[text()='Did you forget your password?']")
    WebElement didYouForgotPasswordButonu;

    @FindBy(xpath = "(//div[@class=\"alert alert-warning fade show”])[2]")
    WebElement youDontHaveAccountYetButonu;

    @FindBy(xpath = "//*[text()='Cancel']")
    WebElement cancelButonu;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement signInPageSignInButonu;

    @FindBy(xpath = "//*[text()='Register']")
    WebElement RegisterButonu;

    @FindBy(xpath = "//input[@name='firstPassword']")
    WebElement newPasswordTextBox;

    @FindBy(xpath = "//ul[@id='strengthBar']")
    WebElement strengthBar;

    @FindBy(xpath = "(//li[@class=‘point’])[1]")
    WebElement strengthBarSeviye1 ;

    @FindBy(xpath = "(//li[@class=‘point’])[2]")
    WebElement trengthBarSeviye2;

    @FindBy(xpath = "(//li[@class=‘point’])[3]")
    WebElement trengthBarSeviye3;

    @FindBy(xpath = "(//li[@class=‘point’])[4]")
    WebElement trengthBarSeviye4;

    @FindBy(xpath = "(//li[@class=‘point’])[5]")
    WebElement trengthBarSeviye5;



}
