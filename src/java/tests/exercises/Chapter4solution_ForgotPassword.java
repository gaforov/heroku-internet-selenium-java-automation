package tests.exercises;

import base.BrowserManager;
import org.testng.annotations.Test;

import static base.PageInitializer.homePage;
import static org.testng.Assert.assertTrue;

public class Chapter4solution_ForgotPassword extends BrowserManager {

    @Test
    public void testForgotPassword() {
        String email = "test@example.com";
        String confirmationMessage = "Internal Server Error";

        var forgotPasswordPage = homePage.clickForgotPasswordLink();
        forgotPasswordPage.enterEmail(email);
        forgotPasswordPage.clickRetrievePasswordButton();
        assertTrue(forgotPasswordPage.getConfirmationMessage().contains(confirmationMessage), "Incorrect message");
    }
}
