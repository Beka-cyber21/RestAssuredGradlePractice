package demoQA.page;

import demoQA.driverPackage.DriverManager;
import demoQA.helper.WebDriverAction;
import org.openqa.selenium.support.PageFactory;

public abstract class MainPage {
    public MainPage() {
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    public WebDriverAction action = new WebDriverAction();
}
