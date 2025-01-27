package tests.keys;

import base.BrowserManager;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KeyPressesPage;

import static base.PageInitializer.homePage;
import static utils.SeleniumUtils.waitForSeconds;

public class KeysTests extends BrowserManager {

    @Test
    public void testBackspace(){
        KeyPressesPage keyPage = homePage.clickKeyPressesLink();
        keyPage.enterText("A" + Keys.BACK_SPACE);
        waitForSeconds(1);
        Assert.assertEquals(keyPage.getResult(), "You entered: BACK_SPACE", "Incorrect result text");
    }

    @Test
    public void testEnterSymbol() {
        KeyPressesPage keyPage = homePage.clickKeyPressesLink();
        keyPage.enterSpecialChar();
        waitForSeconds(2);
        Assert.assertEquals(keyPage.getResult(), "You entered: 4", "Incorrect result text");
    }
}
