package utils;

import org.openqa.selenium.By;

import static base.BrowserManager.getDriver;

public class SeleniumUtils {

    public void clickLink(String linkText) {
        getDriver().findElement(By.linkText(linkText)).click();
    }

    public static void waitForSeconds(int seconds){
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("Thread was interrupted while waiting", e);
        }
    }
}
