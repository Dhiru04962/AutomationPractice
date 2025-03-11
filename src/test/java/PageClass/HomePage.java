package PageClass;

import TestClass.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BaseTest {

    WebDriver driver;
    public By LogoutBtn = By.xpath("//i[text()=' Logout']");
    public By HomePage_Text = By.xpath("//a[text()='Home']");
    public By header_TestCases = By.xpath("//a[text()='Test Cases']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void validateLogoutBtn() {
        driver.findElement(LogoutBtn).isDisplayed();
    }

    public void validateText() {
        driver.findElement(HomePage_Text).isDisplayed();
    }

    public void validateTestCasesHeader() {
        driver.findElement(header_TestCases).click();
    }
}


