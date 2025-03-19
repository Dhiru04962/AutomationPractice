package QA.pages;

import QA.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {

    @FindBy(xpath = "//input[@name='email']")
    WebElement Company_tittle ;
    @FindBy(xpath = "//span[text()='Dhirendra  kumar ']")
    WebElement User_name ;

    public HomePage(){
        PageFactory.initElements(driver,this);
    }
    public void VerifyCompanyTittle(){
        driver.getTitle();
    }
    public void VerifyUserNameTittle(){
        driver.getTitle();
    }
}
