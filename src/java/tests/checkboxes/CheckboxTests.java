package tests.checkboxes;

import base.BrowserManager;
import org.testng.annotations.Test;
import pages.DataTableSelectionPage;

import static base.PageInitializer.dataTableSelectionPage;
import static utils.SeleniumUtils.waitForSeconds;

public class CheckboxTests extends BrowserManager {

    @Test
    public void testCheckbox() {
        dataTableSelectionPage.locateRowByName();
        waitForSeconds(3);
    }

    @Test
    public void testCheckTheCheckboxByName(){
        dataTableSelectionPage.selectCheckboxByName("Game Controller");
    }
}
