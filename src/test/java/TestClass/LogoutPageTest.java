package TestClass;

import PageClass.HomePage;
import PageClass.LoginPage;
import PageClass.LogoutPage;
import org.testng.annotations.Test;

public class LogoutPageTest extends BaseTest {

    @Test
    public void Logout_Page() {

        LoginPage loginPage = new LoginPage(driver);
         HomePage homePage = new HomePage(driver);
        LogoutPage logoutPage= new LogoutPage(driver);
        loginPage.login("practice", "SuperSecretPassword!");
        logoutPage.ClickOnLogoutBtn();

    }
}










