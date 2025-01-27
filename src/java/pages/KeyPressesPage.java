package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static base.BrowserManager.getDriver;

public class KeyPressesPage {
    private final By keyPressInputField = By.id("target");
    private final By resultText = By.id("result");


    public void enterText(String text) {
        getDriver().findElement(keyPressInputField).sendKeys(text);
    }

    public String getResult(){
        return getDriver().findElement(resultText).getText();
    }

    public void enterSpecialChar(){
        enterText(Keys.chord(Keys.SHIFT, "4"));  // Shift+4 = $,  Shift+5 = %, etc.
    }
}
