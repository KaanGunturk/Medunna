package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public abstract class Base {
    public Base(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
