package base;

import pages.*;

public class PageInitializer {
    public static LoginPage loginPage;
    public static SecureAreaPage secureAreaPage;
    public static HomePage homePage;
    public static DropdownPage dropdownPage;
    public static DataTableSelectionPage dataTableSelectionPage;
    public static AlertsPage alertsPage;


    public static void initializePage() {
        loginPage = new LoginPage();
        secureAreaPage = new SecureAreaPage();
        homePage = new HomePage();
        dropdownPage = new DropdownPage();
        dataTableSelectionPage = new DataTableSelectionPage();
        alertsPage = new AlertsPage();
    }
}
