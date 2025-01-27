package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static base.BrowserManager.getDriver;

public class DataTableSelectionPage {
    // Web Elements
    private final By checkboxTable = By.xpath("//h5[contains(text(), 'Checkbox')]");
    private final By checkboxNames = By.xpath("(//table[@role='grid'])[6]//tr/td[3]");
    private final By checkboxes = By.xpath("(//table[@role='grid'])[6]//tr/td[1]");


    // Methods
    public void locateRowByName(){
        List<WebElement> names = getDriver().findElements(checkboxNames);
        for(WebElement name: names) {
            if (name.getText().equals("Blue Band")){
//                List<WebElement> checkboxes = getDriver().findElements(By.xpath("(//table[@role='grid'])[6]//tr[3]/td[1]"));
                getDriver().findElement(By.xpath("(//table[@role='grid'])[6]//tr[3]/td[1]")).click();
            }
        }
    }

}
