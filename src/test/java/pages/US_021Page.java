package pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_021Page {

    public US_021Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = " //span[normalize-space()='Show Appointments']")
    public WebElement showAppointments;

    @FindBy(xpath = " //span[normalize-space()='Edit']")
    public WebElement editAppointments;

    @FindBy(xpath = " //span[normalize-space()='Create or Edit an Appointment']")
    public WebElement editAppointmentPage;

    @FindBy(xpath = " //select[@id='appointment-status']")
    public WebElement statusPopup;
    @FindBy(xpath = " //option[@value='UNAPPROVED']")
    public WebElement statusPopupUnapproved;
    @FindBy(xpath = " //option[@value='PENDING']")
    public WebElement statusPopupPending;
    @FindBy(xpath = " //option[@value='COMPLETED']")
    public WebElement statusPopupCompleted;
    @FindBy(xpath = " //option[@value='CANCELLED']")
    public WebElement statusPopupCancelled;
    @FindBy(xpath = " //div[@class='invalid-feedback']")
    public WebElement invalidFeedback;
    @FindBy(xpath = " //textarea[@id='appointment-anamnesis']")
    public WebElement anamnesisArea;
    @FindBy(xpath = " //textarea[@id='appointment-treatment']")
    public WebElement treatmentArea;
    @FindBy(xpath = " //textarea[@id='appointment-diagnosis']")
    public WebElement diagnosisArea;
    @FindBy(xpath = " //select[@id='appointment-physician']")
    public WebElement physicianArea;
    @FindBy(xpath = " //a[@class='btn btn-primary btn-sm']")
    public WebElement showTestsButton;
    @FindBy(xpath = " //span[normalize-space()='Tests']")
    public WebElement isTestsPage;

    public boolean isPresent(WebElement element) { // Ekranda bulunmayan bir elementi Assertun icine boolean deger atamak icin yapilmis method
        try {
            element.isDisplayed();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
