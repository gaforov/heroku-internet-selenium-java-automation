package pages;

import base.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage{
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    // Web Elements
    private final By usernameField = By.id("username");
    private final By passwordField = By.id("password");
    private By loginButton = By.className("radius");


    public void setUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void setPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public SecureAreaPage clickLoginButton() {
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }


}
