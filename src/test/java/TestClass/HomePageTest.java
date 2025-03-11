package TestClass;

import PageClass.HomePage;
import PageClass.LoginPage;
import TestClass.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    @Test
    public void validateHomepage() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("practice", "SuperSecretPassword!");
        HomePage homePage = new HomePage(driver);
        homePage.validateLogoutBtn();
        homePage.validateText();
        homePage.validateTestCasesHeader();
    }
}
//   public By header_TestCases = By.xpath("//a[text()='Test Cases']");
