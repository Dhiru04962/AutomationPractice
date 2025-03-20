package QA.pages;

import QA.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class HomePage extends TestBase {

    @FindBy(xpath = "//span[@class='user-display']")
    WebElement User_name ;

    public HomePage(){
        PageFactory.initElements(driver,this);

    }
    public boolean VerifyUserNameTittle(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        boolean blResult = false;
       blResult= User_name.isDisplayed();
       return blResult;
    }
}
