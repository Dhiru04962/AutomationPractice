package QA.pages;

import QA.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class LoginPage extends TestBase {

    @FindBy(xpath = "//input[@name='email']")
    WebElement username ;
    @FindBy(xpath = "//input[@name='password']")
    WebElement password ;
    @FindBy(xpath = "//div[text()='Login']")
    WebElement LoginBtn ;
    @FindBy(xpath = "//a[text()='Sign Up']")
    WebElement SignUpBtn ;

    public LoginPage(){
        PageFactory.initElements(driver,this);
    }
   public  void validateLoginBtn(){
       LoginBtn.isDisplayed();

   }
   public void login (String usr, String psd){
       username.sendKeys(usr);
       password.sendKeys(psd);
       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       LoginBtn.click();
   }
}
