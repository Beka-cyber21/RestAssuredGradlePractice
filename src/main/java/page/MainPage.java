package page;

import driverPackage.DriverManager;
import helper.WebDriverAction;
import org.openqa.selenium.support.PageFactory;

public abstract class MainPage {
    public MainPage() {
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    public WebDriverAction action = new WebDriverAction();
}
