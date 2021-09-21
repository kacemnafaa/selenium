package testCases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.Map;

public class DropDown {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C://webdriver//chromedriver.exe");
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void firstTeststeps() throws InterruptedException {
        // va attendre un max de 20 seconde si ne trouve pas l'element
        //driver.manage().timeouts().implicitlyWait(21, TimeUnit.SECONDS);
        WebDriverWait wait=new WebDriverWait(driver,10);

        driver.get("https://nxtgenaiacademy.com/demo-site/");
        driver.manage().window().maximize();
        WebElement webelement =driver.findElement(By.id("vfb-13-country"));

        Select select = new Select( webelement);

        select.selectByValue("Tunisia");

    }}
