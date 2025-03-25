package QA.pages;

import QA.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static QA.utils.TestUtils.IMPLICIT_WAIT;

public class ForgotPasswordPage extends TestBase {

    @FindBy(xpath = "//a[text()='Forgot your password?']")
    WebElement ForgotPassBtn ;
    @FindBy(xpath = "//input[@id='email']")
    WebElement EmailTextField ;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement ClickOnRestBtn ;

    public ForgotPasswordPage(){
        PageFactory.initElements(driver,this);
    }
    public  void validateForgotBtn(){
        ForgotPassBtn.isDisplayed();
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
        ForgotPassBtn.click();
      }
      public void EmailText(String usr){
          EmailTextField.sendKeys(usr);
      }
      public void ClickOnRestBtn(){
          ClickOnRestBtn.click();
      }
}
