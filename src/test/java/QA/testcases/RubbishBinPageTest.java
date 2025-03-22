package QA.testcases;

import QA.base.TestBase;
import QA.pages.HomePage;
import QA.pages.LoginPage;
import QA.pages.RubbishBinPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RubbishBinPageTest extends TestBase {

    LoginPage loginPage;
    RubbishBinPage rubbishBinPage;
    public RubbishBinPageTest() {
        super();
    }
    @BeforeMethod
    public void setup() {
        initialization();
        loginPage = new LoginPage();
        loginPage.login(prop.getProperty("username"), prop.getProperty("Password") );

    }
    @Test(priority = 1)
    public void ClickPurgeAllBtn(){
        RubbishBinPage rubbishBinPage1=   new RubbishBinPage();
        rubbishBinPage1.ClickOnDeleteBtn();
        rubbishBinPage1.ClickOnPurgeAllBtn();
        rubbishBinPage1.ClickOnOkBtn();
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
