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
    public void locateRowByName(){
        List<WebElement> names = getDriver().findElements(checkboxNames);
        for(WebElement nameElement: names) {
            if (nameElement.getText().equals("Blue Band")){
                getDriver().findElement(By.xpath("(//table[@role='grid'])[6]//tr[3]/td[1]")).click();
            }
        }
    }

    // Refactored, improved version:
    public void selectCheckboxByName(String nameToSelect) {
        List<WebElement> names = getDriver().findElements(checkboxNames);
        int checkboxRow = 1; // Row index starts from 1

        for (WebElement nameElement : names) {
            if (nameElement.getText().equals(nameToSelect)) {
                getDriver().findElement(By.xpath("(//table[@role='grid'])[6]//tr[" + checkboxRow + "]/td[1]")).click();
                return;
            }
            checkboxRow++;
        }
        throw new NoSuchElementException("No row found with the name: " + nameToSelect);
    }

}
