package uiTest;

import org.junit.jupiter.api.Test;

public class TextBoxTest extends BaseTest {
    @Test
    public void firstTest(){
        driver.get("https://demoqa.com/text-box");
        textBoxPage.createNewAccountWithConstant();

    }
}
