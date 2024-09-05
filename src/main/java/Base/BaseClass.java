package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

public class BaseClass {
    //declare web driver object
    public WebDriver driver;

    @BeforeClass
    //method executed before the first test method
    public void setUp(){
        //set the system property to use the chrome driver from the file
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers/chromedriver-mac-arm64/chromedriver");
        //init driver as chrome
        driver=new ChromeDriver();
        //Maximize the browser window
        driver.manage().window().maximize();
        //set wait time before opening the url
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        //navigate to the URL
        //driver.get("https://github.com");

    }
    @AfterClass
    public void tearDown(){
        //close all browser windows and ends the web driver session
        if(driver != null) {
            driver.quit();
        }
    }
}
