package tests.dropdown;

import base.BrowserManager;
import org.testng.annotations.Test;

import java.util.List;

import static base.PageInitializer.dropdownPage;
import static base.PageInitializer.homePage;
import static org.testng.Assert.*;

public class DropdownTests extends BrowserManager {

    @Test
    public void testSelectOption() {
        var dropdownPage = homePage.clickDropdownLink();
        String option = "Option 1";
        dropdownPage.selectFromDropdown(option);
        List<String> selectedOptions = dropdownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(), 1, "Incorrect number of selections");
        assertTrue(selectedOptions.contains(option), "Option not selected");
    }
}
