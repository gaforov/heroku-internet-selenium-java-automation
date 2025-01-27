package tests.exercises;


import org.openqa.selenium.By;
import utils.PropertiesUtil;

import base.BrowserManager;

public class Chapter3Solution_MenuCount extends BrowserManager {

        public static void main(String[] args) {
            BrowserManager browserManager = new BrowserManager();
            browserManager.startBrowser();
            getDriver().get(PropertiesUtil.getProperty("base.url"));

            getDriver().findElement(By.linkText("Shifting Content")).click();
            getDriver().findElement(By.linkText("Example 1: Menu Element")).click();

            getDriver().findElements(By.cssSelector(".example ul li")).forEach(menu -> {
                System.out.println(menu.getText());
            });

            System.out.println("Menu count: " + getDriver().findElements(By.cssSelector(".example ul li")).size());

            getDriver().quit();

        }

}
