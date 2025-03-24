package QA.pages;

import QA.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends TestBase {
    @FindBy(xpath = "//button[@aria-label='Signin with apple ID']")
    WebElement SignUp ;
//div[@class='nsm7Bb-HzV7m-LgbsSe-bN97Pc-sM5MNb ']

    public SignUpPage(){
        PageFactory.initElements(driver,this);
    }
    public void ClickOnSignUpBtn(){
        SignUp.click();
    }
}
