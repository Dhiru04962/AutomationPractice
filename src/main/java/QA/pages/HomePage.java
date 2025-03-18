package QA.pages;

import QA.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {

    @FindBy(xpath = "//input[@name='email']")
    WebElement username ;

    public HomePage(){
        PageFactory.initElements(driver,this);
    }

}
