package QA.testcases;

import QA.base.TestBase;
import QA.pages.DocumentPage;
import QA.pages.HomePage;
import QA.pages.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DocumentTest extends TestBase {
    LoginPage loginPage;
    DocumentPage documentPage;

    public DocumentTest() {
        super();
    }

    @BeforeMethod
    public void setup() {
        initialization();
        loginPage = new LoginPage();
        loginPage.login(prop.getProperty("username"), prop.getProperty("Password"));
    }
    @Test
    public void ValidateDocumentPage() {
        DocumentPage documentPage = new DocumentPage();
        documentPage.ClickOnDocumentBtn();

        documentPage.validateDocumentPage();

        documentPage.clickOnNewFolder();

        documentPage.EnterValueTextField(prop.getProperty("Value"));

        documentPage.clickOnSaveBtn();
    }
//    @Test(priority = 2)
//    public void ClickOnFolderBtn() {
//        DocumentPage documentPage = new DocumentPage();
//
//    }
//    @Test(priority = 3)
//    public void EnterTextValue() {
//        DocumentPage documentPage = new DocumentPage();
//
//    }
//    @Test(priority = 4)
//    public void ClickSaveBtn() {
//        DocumentPage documentPage = new DocumentPage();
//
//    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
