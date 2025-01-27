package tests.slides;

import base.BrowserManager;
import org.testng.Assert;
import org.testng.annotations.Test;

import static base.PageInitializer.homePage;
import static utils.SeleniumUtils.waitForSeconds;

public class SliderTests extends BrowserManager {

    @Test
    public void testHorizontalSlider() {
        var horizontalSliderPage = homePage.clickHorizontalSliderLink();
        horizontalSliderPage.moveSliderToRight(6);
        waitForSeconds(2);
//        System.out.println(horizontalSliderPage.getRangeCounter());
        Assert.assertEquals(horizontalSliderPage.getRangeCounter(), "3", "Incorrect range count");
    }
}
