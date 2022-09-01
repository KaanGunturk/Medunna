package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US8 {
    public US8(){
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

    @FindBy(xpath = "//li[@id='account-menu']")   // //span[normalize-space()='Team54 Medunna']      (//a[@class='d-flex align-items-center dropdown-toggle nav-link'])[3]
    public WebElement hesapButonu;

    @FindBy(xpath = "//span[text()='Password']")    //   (//*[@class='dropdown-item'])[11]
    public WebElement passwordButonu;

    @FindBy(xpath = "//input[@name='confirmPassword']")
    public WebElement newPasswordConfirmation;

    @FindBy(xpath = "//input[@name='currentPassword']")
    public WebElement currentPassword;

    @FindBy(xpath = "//input[@name='newPassword']")
    public WebElement newPassword;

    @FindBy(xpath = "//input[@name='confirmPassword']")
    public WebElement confirmPassword;

    @FindBy(xpath = "//li[@style='background-color: rgb(255, 0, 0);']")
    public WebElement birinciKutu;

    @FindBy(xpath = "//li[@style='background-color: rgb(255, 153, 0);']")
    public WebElement ikinciKutu;

    @FindBy(xpath = "//li[@style='background-color: rgb(0, 255, 0);']")
    public WebElement besinciKutu;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButonu;

    @FindBy(xpath = "//div[@role='alert']")      // //strong[text()='Password changed!']
    public WebElement passwordChanged;

}
