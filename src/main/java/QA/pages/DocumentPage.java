package QA.pages;

import QA.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static QA.utils.TestUtils.IMPLICIT_WAIT;

public class DocumentPage extends TestBase {


    @FindBy(xpath = "//i[@class='file icon']")
    WebElement DocumentBtn;
    @FindBy(xpath = "//span[@class='selectable ']")
    WebElement document;

    @FindBy(xpath = "//button[normalize-space()='New Folder']")
    WebElement Folder;

    @FindBy(xpath = "//input[@name='addFolderName']")
    WebElement InputFolderText;
    @FindBy(xpath = "//button[@class='ui button']")
    WebElement SaveBtn;


    public DocumentPage() {
        PageFactory.initElements(driver, this);
    }
    public void ClickOnDocumentBtn() {

        DocumentBtn.click();
    }
    public void validateDocumentPage() {

        document.isDisplayed();
    }

    public void clickOnNewFolder() {

        Folder.click();
    }

    public void EnterValueTextField(String text) {

        InputFolderText.sendKeys(text);
    }

    public void clickOnSaveBtn() {

        SaveBtn.click();
    }
}
