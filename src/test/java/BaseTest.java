import demoQA.driverPackage.DriverManager;
import demoQA.helper.WebDriverAction;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import demoQA.page.TextBoxPage;

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
