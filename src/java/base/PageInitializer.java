package base;

import pages.DropdownPage;
import pages.HomePage;
import pages.LoginPage;
import pages.SecureAreaPage;

public class PageInitializer {
    public static LoginPage loginPage;
    public static SecureAreaPage secureAreaPage;
    public static HomePage homePage;
    public static DropdownPage dropdownPage;


    public static void initializePage() {
        loginPage = new LoginPage();
        secureAreaPage = new SecureAreaPage();
        homePage = new HomePage();
        dropdownPage = new DropdownPage();
    }
}
