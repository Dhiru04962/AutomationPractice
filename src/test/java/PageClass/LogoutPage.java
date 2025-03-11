package PageClass;

import TestClass.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage extends BaseTest {
    WebDriver driver;

    public By LogoutButton = By.xpath("//i[text()=' Logout']");

    public LogoutPage(WebDriver driver) {
        this.driver = driver;
    }
    public void ClickOnLogoutBtn() {
        driver.findElement(LogoutButton).click();
    }
}
