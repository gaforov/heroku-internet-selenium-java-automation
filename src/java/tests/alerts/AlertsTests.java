package tests.alerts;

import base.BrowserManager;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlertsPage;

import static base.PageInitializer.homePage;

public class AlertsTests extends BrowserManager {

    @Test
    public void testJsAlert() {
        AlertsPage alertsPage = homePage.clickAlertsPageLink();
        alertsPage.triggerAlert();
        System.out.println(alertsPage.alert_getText()); // Print for debugging only.
        alertsPage.alert_clickToAccept();
        Assert.assertEquals(alertsPage.getResultMessage(), "You successfully clicked an alert", "Alert result message is incorrect.");
    }
}
