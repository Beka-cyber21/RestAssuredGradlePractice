package DemoQA.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties;

    private ConfigReader() {
    }

    static {
        try {
            String path = "src/main/resources/add.properties";
            FileInputStream fis = new FileInputStream(path);
            properties = new Properties();
            properties.load(fis);
            fis.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getValue(String key) {
        return properties.getProperty(key.trim());
    }
}
