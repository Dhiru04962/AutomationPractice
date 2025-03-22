package QA.pages;

import QA.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static QA.utils.TestUtils.IMPLICIT_WAIT;

public class RubbishBinPage extends TestBase {
    @FindBy(xpath = "//i[@class='trash alternate outline icon']")
    WebElement Delete_Btn;
    @FindBy(xpath = "//button[@class='ui negative button']")
    WebElement PurgeAll_Btn;
    @FindBy(xpath = "//button[text()='OK']")
    WebElement Ok_Btn;


    public RubbishBinPage() {
        PageFactory.initElements(driver, this);

    }
    public void ClickOnDeleteBtn() {
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT,TimeUnit.SECONDS);
        Delete_Btn.click();
    }
    public void ClickOnPurgeAllBtn() {
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT,TimeUnit.SECONDS);
        PurgeAll_Btn.click();
    }
    public void ClickOnOkBtn() {
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT,TimeUnit.SECONDS);
        Ok_Btn.click();
    }
}