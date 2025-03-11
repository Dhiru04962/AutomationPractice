package PageClass;

import TestClass.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BaseTest {

        WebDriver driver;

        public By username1 = By.xpath("//input[@id='username']");
        public By passwordField = By.xpath("//input[@id='password']");
        public By loginButton = By.xpath("//button[@type='submit']");



        public LoginPage(WebDriver driver) {
            this.driver = driver;
        }
        public void enterUsername(String username) {
            driver.findElement(username1).sendKeys(username);
        }
        public void enterPassword(String password) {
            driver.findElement(passwordField).sendKeys(password);
        }
        public void clickLogin() {
            driver.findElement(loginButton).click();
        }
        public void login(String username, String password) {
            enterUsername(username);
            enterPassword(password);
            clickLogin();

        }
    }

