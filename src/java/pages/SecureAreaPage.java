package pages;

import org.openqa.selenium.By;

import static base.BrowserManager.getDriver;

public class SecureAreaPage {

    private final By loginSuccessMessage = By.id("flash");

    public String getLoginSuccessMessage() {
        return getDriver().findElement(loginSuccessMessage).getText();
    }
}
