package DemoQA.page;

import DemoQA.driverPackage.DriverManager;
import DemoQA.helper.WebDriverAction;
import org.openqa.selenium.support.PageFactory;

public abstract class MainPage {
    public MainPage() {
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    public WebDriverAction action = new WebDriverAction();
}
