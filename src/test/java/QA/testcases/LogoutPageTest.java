package QA.testcases;

import QA.base.TestBase;
import QA.pages.HomePage;
import QA.pages.LoginPage;
import QA.pages.LogoutPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LogoutPageTest extends TestBase {

    LogoutPage logoutPage1;
    HomePage homePage;
    LoginPage loginPage;

    public LogoutPageTest() {
        super();
    }

    @BeforeMethod
    public void setup() {
        initialization();
        loginPage = new LoginPage();
        loginPage.login(prop.getProperty("username"), prop.getProperty("Password"));
    }
    @Test
    public void ClickOnSettingBtn() throws InterruptedException {
        LogoutPage logoutPage = new LogoutPage();
        Thread.sleep(1000);
        logoutPage.ClickSettingBtn();
    }
    @Test
    public void ClickOnLogoutBtn() {
        LogoutPage logoutPage = new LogoutPage();
        logoutPage.ClickOnLogoutBtn();
    }
}

