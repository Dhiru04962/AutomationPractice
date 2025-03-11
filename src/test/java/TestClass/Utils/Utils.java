package TestClass.Utils;

import TestClass.BaseTest;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

public class Utils extends BaseTest {

    public static WebDriverWait waitForElement(WebDriver driver, By locator, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        return (WebDriverWait) wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void waitForElementToBeClickable(WebDriver driver, By locator, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
    public static void takeScreenshot(WebDriver driver, String screenshotName) {
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(srcFile, new File("screenshots/" + screenshotName + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void refreshPage(WebDriver driver) {
        driver.navigate().refresh();
    }

    public static void navigateBack(WebDriver driver) {
        driver.navigate().back();
    }

    public static void navigateForward(WebDriver driver) {
        driver.navigate().forward();
    }

}
