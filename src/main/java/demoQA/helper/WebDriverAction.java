package demoQA.helper;

import demoQA.driverPackage.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebDriverAction {

    Actions actions = new Actions(DriverManager.getDriver());

    public WebDriverAction click(WebElement element) {
        scrollToElement(element)
                .actions.click(element)
                .perform();
        return this;
    }

    public WebDriverAction sendKeys(WebElement element, String string) {
        scrollToElement(element)
                .actions.sendKeys(element, string)
                .perform();
        return this;
    }

    public WebDriverAction scrollToElement(WebElement element) {
        actions.scrollToElement(element)
                .perform();
        return this;
    }
}
