package QA.pages;

import QA.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage extends TestBase {

    @FindBy(xpath = "//a[text()='Forgot your password?']")
    WebElement ForgotPassBtn ;
    @FindBy(xpath = "//input[@id='email']")
    WebElement EmailTextField ;

    public ForgotPasswordPage(){
        PageFactory.initElements(driver,this);
    }
    public  void validateForgotBtn(){
        ForgotPassBtn.isDisplayed();
        ForgotPassBtn.click();
      }
      public void EmailText(String usr){
          EmailTextField.sendKeys(usr);
      }
}
