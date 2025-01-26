package exercises;

import base.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.PropertyReader;

public class Chapter3Solution {

        public static void main(String[] args) {
            DriverManager driverManager = new DriverManager();
            driverManager.setupDriver();  // setup the WebDriver instance
            WebDriver driver = driverManager.getDriver();// get the WebDriver instance
            driver.get(PropertyReader.getProperty("base.url"));

            driver.findElement(By.linkText("Shifting Content")).click();
            driver.findElement(By.linkText("Example 1: Menu Element")).click();

            driver.findElements(By.cssSelector(".example ul li")).forEach(menu -> {
                System.out.println(menu.getText());
            });

            System.out.println("Menu count: " + driver.findElements(By.cssSelector(".example ul li")).size());

        }

}
