package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextBoxPage extends MainPage {

    public final static String USER_NAME= "Akmatov Bektur";
    public final static String USER_EMAIL= "akmatovmak99@gmail.com";
    public final static String USER_CURRENT_ADDRESS= "Кыргызстан";
    public final static String USER_PERMANENT_ADDRESS= "г.Бишкек";

    @FindBy(id = "userName")
    public WebElement userName;

    @FindBy(id = "userEmail")
    public WebElement userEmail;

    @FindBy(id = "currentAddress")
    public WebElement currentAddress;

    @FindBy(id = "permanentAddress")
    public WebElement permanentAddress;

    @FindBy(id = "submit")
    public WebElement submit;

    public TextBoxPage createNewAccount(String textUserName, String textUserEmail, String textCurrentAddress, String textPermanentAddress) {
        action.sendKeys(userName, textUserName)
                .sendKeys(userEmail, textUserEmail)
                .sendKeys(currentAddress, textCurrentAddress)
                .sendKeys(permanentAddress, textPermanentAddress)
                .click(submit);
        return this;
    }
    public TextBoxPage createNewAccountWithConstant() {
        action.sendKeys(userName, USER_NAME)
                .sendKeys(userEmail, USER_EMAIL)
                .sendKeys(currentAddress, USER_CURRENT_ADDRESS)
                .sendKeys(permanentAddress, USER_PERMANENT_ADDRESS)
                .click(submit);
        return this;
    }
}
