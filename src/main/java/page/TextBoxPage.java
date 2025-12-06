package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextBoxPage {

    @FindBy(id = "userName")
    public WebElement userName;

    @FindBy(id ="userEmail")
    public WebElement userEmail;

    @FindBy(id="currentAddress")
    public WebElement currentAddress;

    @FindBy(id="permanentAddress")
    public WebElement permanentAddress;

    @FindBy(id="submit")
    public WebElement submit;
}
