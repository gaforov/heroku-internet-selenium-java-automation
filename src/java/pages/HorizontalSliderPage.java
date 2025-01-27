package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static base.BrowserManager.getDriver;

public class HorizontalSliderPage {
    // Web Elements
    private final By horizontalSliderBar = By.xpath("//input[@type='range']");
    private final By rangeCounter = By.id("range");

    // Methods
    public void moveSliderToRight(int times) {
        for (int i = 0; i <times; i++) {
        getDriver().findElement(horizontalSliderBar).sendKeys(Keys.chord(Keys.RIGHT));
        }
    }

    public String getRangeCounter() {
        return getDriver().findElement(rangeCounter).getText();
    }

}
