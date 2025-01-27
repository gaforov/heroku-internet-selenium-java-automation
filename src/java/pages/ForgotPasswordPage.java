package pages;

import org.openqa.selenium.By;

import static base.BrowserManager.getDriver;

public class ForgotPasswordPage {
    // Web Elements
    private final By emailField = By.id("email");
    private final By retrievePasswordButton = By.id("form_submit");
    private final By confirmationMessage = By.xpath("//h1[contains(text(), 'Internal Server Error')]");

    // Methods
    public void enterEmail(String emailAddress) {
        getDriver().findElement(emailField).sendKeys(emailAddress);
    }

    public void clickRetrievePasswordButton() {
        getDriver().findElement(retrievePasswordButton).click();
        // website is broken at the moment of testing. Otherwise, should return to EmailSentPage, and we should change 'void' type to 'EmailSentPage' and add:
        // return new EmailSentPage();
    }

    public String getConfirmationMessage() {
        return getDriver().findElement(confirmationMessage).getText();
    }
}
