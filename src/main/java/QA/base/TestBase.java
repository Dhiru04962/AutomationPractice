package QA.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static QA.utils.TestUtils.IMPLICIT_WAIT;
import static QA.utils.TestUtils.PAGE_LOAD_TIMEOUT;

public class TestBase {

public static WebDriver driver ;
public static Properties prop;

    public TestBase(){
        try{
            prop = new Properties();
            FileInputStream ip = new FileInputStream("C:\\Users\\admin\\IdeaProjects\\AutomationProject\\src\\main\\java\\QA\\Config\\config.properties");
            prop.load(ip);
        }catch (FileNotFoundException e){
            e.printStackTrace();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void initialization(){
        String browserName = prop.getProperty("browser");
        if (browserName.equals("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if (browserName.equals("FF")){
            WebDriverManager.chromedriver().setup();
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT,TimeUnit.SECONDS);

        driver.get(prop.getProperty("url"));

    }

}
