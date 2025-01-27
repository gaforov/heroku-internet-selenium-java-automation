package tests.hover;

import base.BrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HoversPage;

import java.time.Duration;

import static base.PageInitializer.homePage;

public class HoverTests extends BrowserManager {

    @Test
    public void testHoverUser1() {
        HoversPage hoversPage = homePage.clickHoversLink();

        // Hover over the 3rd figure and verify the title
        WebElement figure = hoversPage.hoverOverFigure(3);
        String actualTitle = hoversPage.getFigureTitle(figure);
        Assert.assertEquals(actualTitle, "name: user3", "User title is incorrect");
    }

    @Test
    public void testHoverUserByVisibleText() {
        HoversPage hoversPage = homePage.clickHoversLink();

        // Hover over the figure with "user2" and verify the title
        String actualTitle = hoversPage.hoverOverFigure("user2");
        Assert.assertEquals(actualTitle, "name: user2", "User title is incorrect");
    }

    @Test
    public void testHoverUserAndVerifyLink() {
        HoversPage hoversPage = homePage.clickHoversLink();

        // Hover over the 1st figure and verify the link
        WebElement figure = hoversPage.hoverOverFigure(1);
        String actualLink = hoversPage.getFigureLink(figure);
        Assert.assertTrue(actualLink.contains("/users/1"), "User link is incorrect");
    }
}
