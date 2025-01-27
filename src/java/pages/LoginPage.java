package pages;

import org.openqa.selenium.By;

import static base.BrowserManager.getDriver;


public class LoginPage {
    // Web Elements
    private final By usernameField = By.id("username");
    private final By passwordField = By.id("password");
    private final By loginButton = By.className("radius");


    public void setUsername(String username) {
        getDriver().findElement(usernameField).sendKeys(username);
    }

    public void setPassword(String password) {
        getDriver().findElement(passwordField).sendKeys(password);
    }

    public SecureAreaPage clickLoginButton() {
        getDriver().findElement(loginButton).click();
        return new SecureAreaPage();
    }


}
