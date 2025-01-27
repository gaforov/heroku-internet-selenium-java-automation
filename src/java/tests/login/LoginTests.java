package tests.login;

import base.BrowserManager;
import org.testng.annotations.Test;

import static base.PageInitializer.homePage;
import static org.testng.Assert.assertTrue;

public class LoginTests extends BrowserManager {

    @Test
    public void testSuccessfulLogin() {
        var loginPage = homePage.clickFormAuthenticationLink();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        var secureAreaPage = loginPage.clickLoginButton();
        assertTrue(secureAreaPage.getLoginSuccessMessage().contains("You logged into a secure area!"), "Login message is incorrect");
    }
}
