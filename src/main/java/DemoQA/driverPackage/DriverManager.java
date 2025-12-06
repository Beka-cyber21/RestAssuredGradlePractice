package DemoQA.driverPackage;

import org.openqa.selenium.WebDriver;
import DemoQA.utils.ConfigReader;

public class DriverManager {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            switch (ConfigReader.getValue("browser").toLowerCase()) {
                case "chrome":
                    driver = WebChromeDriver.loadChromeDriver();
                    break;
                default:
                    throw new IllegalArgumentException("Вы ввели неправильное название драйвера.");
            }
        }
        return driver;
    }

    public static void closeDriver() {
        try {
            if (driver != null) {
                driver.close();
                driver.quit();
                driver = null;
            }
        } catch (Exception e) {
            System.out.println("Ошибка при закрытии драйвера");
        }
    }
}
