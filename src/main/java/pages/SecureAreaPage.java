package pages;

import base.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
    private WebDriver driver;

    public SecureAreaPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By loginSuccessMessage = By.id("flash");

    public String getLoginSuccessMessage() {
        return driver.findElement(loginSuccessMessage).getText();
    }
}
