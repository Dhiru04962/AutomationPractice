package QA.testcases;

import QA.base.TestBase;
import QA.pages.HomePage;
import QA.pages.LoginPage;
import QA.pages.SignUpPage;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignUpPageTest extends TestBase {
    LoginPage loginPage;

    SignUpPage signUpPage;
    public SignUpPageTest() {
        super();
    }

    @BeforeMethod
    public void setup() {
        initialization();
        loginPage = new LoginPage();

    }
    @Test
    public void ClickOnSignUpBtn(){
        SignUpPage signUpPage = new SignUpPage();
        signUpPage.ClickOnSignUpBtn();
    }
}
//a[text()='Forgot your password?']