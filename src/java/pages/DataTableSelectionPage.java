package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.util.List;

import static base.BrowserManager.getDriver;

public class DataTableSelectionPage {
    // Web Elements
    private final By checkboxNames = By.xpath("(//table[@role='grid'])[6]//tr/td[3]");

    // Methods
    public String selectCheckboxUsingProductName(String productName){
        List<WebElement> names = getDriver().findElements(checkboxNames);
        for(WebElement nameElement: names) {
            if (nameElement.getText().equals(productName)){
                String actualProductName = nameElement.getText();
                getDriver().findElement(By.xpath("(//table[@role='grid'])[6]//tr[3]/td[1]")).click();
                return actualProductName; // Return the product name for assertion
            }
        }
        return null; // Return null if the product is not found
    }

    // Refactored, improved version, another way.
    public WebElement selectCheckboxUsingProductName2(String nameToSelect) {
        List<WebElement> names = getDriver().findElements(checkboxNames);
        int checkboxRow = 1; // Row index starts from 1

        for (WebElement nameElement : names) {
            if (nameElement.getText().equals(nameToSelect)) {
                WebElement checkbox = getDriver().findElement(By.xpath("(//table[@role='grid'])[6]//tr[" + checkboxRow + "]/td[1]//div[@role='checkbox']"));
                checkbox.click();
                return checkbox; // Return the checkbox element for assertion
            }
            checkboxRow++;
        }
        throw new NoSuchElementException("No row found with the name: " + nameToSelect);
    }

}
