package tests.checkboxes;

import base.BrowserManager;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static base.PageInitializer.dataTableSelectionPage;
import static utils.SeleniumUtils.waitForSeconds;

public class CheckboxTests extends BrowserManager {

    /**
     * todo: Before running this test, make sure you switch to the correct URL from the resources/config.properties file
     * URL for this test: www.primefaces.org/primereact-v5/#/datatable/selection
     */
    @Test
    public void testCheckboxUsingProductName() {
        String actualProductName = dataTableSelectionPage.selectCheckboxUsingProductName("Blue Band");
        waitForSeconds(2); // for UI visualization only.
        Assert.assertEquals(actualProductName, "Blue Band", "Incorrect product selected");
    }

    @Test
    public void testCheckboxUsingProductName2(){
        WebElement checkbox = dataTableSelectionPage.selectCheckboxUsingProductName2("Game Controller");

        String isChecked = checkbox.getDomAttribute("aria-checked");
        waitForSeconds(2); // for UI visualization only.
        Assert.assertEquals(isChecked, "true", "Checkbox for 'Game Controller' is not selected.");

        //Optionally, confirm it's a checkbox type
        Assert.assertEquals(checkbox.getAriaRole(), "checkbox", "Element is not a checkbox.");
    }
}
