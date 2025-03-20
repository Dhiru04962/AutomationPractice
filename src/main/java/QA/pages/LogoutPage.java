package QA.pages;

import QA.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage extends TestBase {
    @FindBy(xpath = "//body/div[@id='ui']/div[@class='ui fluid container']/div[@class='ui fluid container']/div[@id='top-header-menu']/div[@class='right menu']/div[@class='ui buttons']/div[@role='listbox']/i[1]")
    WebElement setting_btn ;
    @FindBy(xpath = "//*[@id=\"top-header-menu\"]/div[2]/div[2]/div/div/a[10]")
    WebElement LogoutBtn ;

    public LogoutPage(){
        PageFactory.initElements(driver,this);
    }
    public void ClickSettingBtn(){
        setting_btn.click();
    }
    public void ClickOnLogoutBtn(){
        LogoutBtn.click();
    }
}
