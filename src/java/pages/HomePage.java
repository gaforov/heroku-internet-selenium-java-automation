package pages;

import org.openqa.selenium.By;

import static base.BrowserManager.getDriver;

public class HomePage {

//    private final By formAuthenticationLink = By.linkText("Form Authentication");

    public LoginPage clickFormAuthenticationLink() {
        clickLink("Form Authentication");
        return new LoginPage();
    }

    public DropdownPage clickDropdownLink() {
        clickLink("Dropdown");
        return new DropdownPage();
    }

    public ForgotPasswordPage clickForgotPasswordLink() {
        clickLink("Forgot Password");
        return new ForgotPasswordPage();
    }

    public HoversPage clickHoversLink() {
        clickLink("Hovers");
        return new HoversPage();
    }

    public KeyPressesPage clickKeyPressesLink() {
        clickLink("Key Presses");
        return new KeyPressesPage();
    }

    public HorizontalSliderPage clickHorizontalSliderLink() {
        clickLink("Horizontal Slider");
        return new HorizontalSliderPage();
    }

    public AlertsPage clickAlertsPageLink() {
        clickLink("JavaScript Alerts");
        return new AlertsPage();
    }

    private void clickLink(String linkText) {
        getDriver().findElement(By.linkText(linkText)).click();
    }

}
