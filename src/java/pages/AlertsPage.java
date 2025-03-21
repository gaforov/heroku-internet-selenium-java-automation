package pages;

import org.openqa.selenium.By;

import static base.BrowserManager.getDriver;

public class AlertsPage {
    // Locators
    private final By javascriptAlertButton = By.xpath("//button[text()='Click for JS Alert']");
    private final By javascriptConfirmButton = By.xpath("//button[text()='Click for JS Confirm']");
    private final By javascriptPromptButton = By.xpath("//button[text()='Click for JS Prompt']");
    private final By resultMessageText = By.id("result");


    // Methods
    public void triggerAlert() {
        getDriver().findElement(javascriptAlertButton).click();
    }

    public void triggerConfirm() {
        getDriver().findElement(javascriptConfirmButton).click();
    }

    public void triggerPrompt() {
        getDriver().findElement(javascriptPromptButton).click();
    }

    public void alert_clickToAccept() {
        getDriver().switchTo().alert().accept();
    }

    public void alert_clickToDismiss() {
        getDriver().switchTo().alert().dismiss();
    }

    public String alert_getText() {
        return getDriver().switchTo().alert().getText();
    }

    public String getResultMessage() {
        return getDriver().findElement(resultMessageText).getText();
    }

}
