package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;
import utils.PropertyReader;

public class BaseTests {
    private DriverManager driverManager;
    protected HomePage homePage;

    @BeforeClass
    public void setup() {
        driverManager = new DriverManager();
        driverManager.setupDriver(); // Initializes the WebDriver
        WebDriver driver = driverManager.getDriver();
        driver.get(PropertyReader.getProperty("base.url"));
        driver.manage().window().maximize();
        homePage = new HomePage(driver);

    }

    @AfterClass
    public void tearDown() {
        driverManager.quitDriver();
    }

}