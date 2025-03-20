package QA.testcases;

import QA.base.TestBase;
import QA.pages.HomePage;
import QA.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {

    LoginPage loginPage;
    HomePage homePage;


    public HomePageTest() {
        super();
    }

    @BeforeMethod
    public void setup() {
        initialization();
        loginPage = new LoginPage();
        loginPage.login(prop.getProperty("username"), prop.getProperty("Password") );

    }

    @Test(priority = 1)
    public void validateCompanyNameTittle(){
        HomePage homePage=   new HomePage();
       Assert.assertTrue( homePage.VerifyUserNameTittle());
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
