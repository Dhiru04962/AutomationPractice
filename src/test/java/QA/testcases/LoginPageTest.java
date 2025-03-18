package QA.testcases;

import QA.base.TestBase;
import QA.pages.LoginPage;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    LoginPage loginPage;

    public LoginPageTest(){
        super();
    }
    @BeforeMethod
    public void setup(){
        initialization();
        loginPage = new LoginPage();
    }
    @Test(priority = 1)
    public void ValidateSignupElementTestOnLoginPage(){
        loginPage.validateLoginBtn();


    }
    @Test(priority = 2)
    public void loginTest(){
        loginPage.login(prop.getProperty("username"), prop.getProperty("Password") );
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
