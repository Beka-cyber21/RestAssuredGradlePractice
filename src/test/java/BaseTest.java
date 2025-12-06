import driverPackage.DriverManager;
import helper.WebDriverAction;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import page.TextBoxPage;

public class BaseTest {
    public static WebDriver driver;

    public static WebDriverAction webDriverAction;

    public static TextBoxPage textBoxPage ;

    @BeforeAll
    public static void setUp() {
        driver = DriverManager.getDriver();
        webDriverAction = new WebDriverAction();
        textBoxPage = new TextBoxPage();
    }
}
