package Webpages;

import UtilLibraries.ExcelOperation;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class SuperTestScript {
    public static WebDriver driver;
    @BeforeTest
    public void startTest(){
        String browser = "Chrome";
        String url = "https://www.saucedemo.com/";
        if (browser.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        else if (browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else{
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }
    @AfterTest
    public void stopTest(){
        driver.close();
    }
}
