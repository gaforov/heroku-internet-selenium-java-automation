package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
    
    protected WebDriver driver;
    
    public void setupDriver() {
        if (driver == null) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
    }

    public WebDriver getDriver() {
        if (driver == null) {
            throw new IllegalStateException("Driver not initialized. Call setupDriver() first or ensure it is initialized automatically.");
        }
        return driver;
    }

    // Failsafe initialization (optional)
    public WebDriver getOrCreateDriver() {
        if (driver == null) {
            setupDriver();
        }
        return driver;
    }

    public void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

}
