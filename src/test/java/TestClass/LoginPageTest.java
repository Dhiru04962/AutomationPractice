package TestClass;

import PageClass.HomePage;
import PageClass.LoginPage;
import TestClass.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

        @Test
        public void verifyLogin() {

            LoginPage loginPage = new LoginPage(driver);
            HomePage homePage = new HomePage(driver);

            loginPage.login("practice", "SuperSecretPassword!");

        }
    }

