package pages;

import base.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private By formAuthenticationLink = By.linkText("Form Authentication");

    public WebElement getFormAuthenticationLink() {
        return driver.findElement(formAuthenticationLink);
    }


    public LoginPage clickFormAuthenticationLink() {
        getFormAuthenticationLink().click();
        return new LoginPage(driver);
    }
}
