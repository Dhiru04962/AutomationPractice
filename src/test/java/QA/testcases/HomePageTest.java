package QA.testcases;

import QA.base.TestBase;
import QA.pages.LoginPage;
import org.testng.annotations.BeforeMethod;

public class HomePageTest extends TestBase {

    LoginPage loginPage;

    public HomePageTest(){
        super();
    }
    @BeforeMethod
    public void setup(){
        initialization();
        loginPage = new LoginPage();
    }

}
