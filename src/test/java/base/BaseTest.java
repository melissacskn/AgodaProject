package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class BaseTest {
     protected WebDriver driver;

     @BeforeSuite
     public void setup(){
         System.setProperty("webdriver.chrome.driver","/Users/vngrs/Desktop/chromedriver 3");
         driver =new ChromeDriver();
         driver.get("https://www.agoda.com/tr-tr/");
         driver.manage().window().maximize();


     }

     @AfterSuite
    public void teardown(){
         driver.quit();
     }



}
