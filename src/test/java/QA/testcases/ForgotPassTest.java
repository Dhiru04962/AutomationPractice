package QA.testcases;

import QA.base.TestBase;
import QA.pages.ForgotPasswordPage;
import QA.pages.HomePage;
import QA.pages.LoginPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static QA.utils.TestUtils.IMPLICIT_WAIT;

public class ForgotPassTest extends TestBase {
    LoginPage loginPage;
    ForgotPasswordPage forgotPasswordPage;

    public ForgotPassTest() {
        super();
    }

    @BeforeMethod
    public void setup() {
        initialization();
        loginPage = new LoginPage();

    }
    @Test
    public void ValidateForgotPasaBtn(){
        ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();
        forgotPasswordPage.validateForgotBtn();
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
        forgotPasswordPage.EmailText(prop.getProperty("username"));
    }
}
