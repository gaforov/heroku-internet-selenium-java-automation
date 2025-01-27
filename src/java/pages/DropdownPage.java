package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static base.BrowserManager.getDriver;

public class DropdownPage {
    private final By dropdown = By.id("dropdown");


    public void selectFromDropdown(String option) {
        findDropdownElement().selectByVisibleText(option);
    }

    public List<String> getSelectedOptions() {
        return findDropdownElement().getAllSelectedOptions().stream().map(WebElement::getText).toList();
    }

    private Select findDropdownElement() {
        return new Select(getDriver().findElement(dropdown));
    }

}
