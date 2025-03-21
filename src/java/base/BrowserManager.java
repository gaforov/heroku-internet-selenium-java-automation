package base;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.PropertiesUtil;

import java.time.Duration;

import static base.PageInitializer.initializePage;

public class BrowserManager {
    private static WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public WebDriver startBrowser() {
        // Load properties
        //PropertiesUtil.loadProperties(System.getProperty("user.dir") + "/src/resources/configs/config.properties");

        if (driver == null) { // Avoid reinitializing if a session is already active
            String browser = PropertiesUtil.getProperty("browser").toLowerCase();

            switch (browser) {
                case "chrome" -> driver = new ChromeDriver();
                case "edge" -> driver = new EdgeDriver();
                default -> throw new IllegalArgumentException("Unsupported browser: " + browser);
            }

            driver.manage().window().setPosition(new Point(1500, -1500));
            driver.manage().window().maximize();
            driver.get(PropertiesUtil.getProperty("base.url"));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }

        initializePage();
        return driver;
    }

    @AfterMethod(alwaysRun = true)
    public void quitBrowser() {
        if (driver != null) {
            driver.quit();
            driver = null; // Reset for proper re-initialization
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
