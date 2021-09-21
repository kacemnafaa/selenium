package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;


public class GenericTest  {
    public static WebDriver driver;
    public static WebDriverWait wait;


    String browser =  "chrome";

    @BeforeClass
    public void setUp()  {

        if ("chrome".equals(browser)) {
            System.setProperty("webdriver.chrome.driver", "C://webdriver//chromedriver.exe");
            driver = new ChromeDriver();
        } else if ("firefox".equals(browser)) {
            System.setProperty("webdriver.gecko.driver", "C://webdriver//chromedriver.exe");
            driver = new FirefoxDriver();
        } else {
            driver.quit();
        }


        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    @BeforeMethod
    public void BeforeMethod() {
        driver = driver();
        wait = new WebDriverWait(driver, 30);
    }

    public static WebDriver driver() {
        return driver;
    }


    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
