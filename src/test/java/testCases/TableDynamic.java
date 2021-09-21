package testCases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.Map;

public class TableDynamic {
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

        driver.get("https://www.seleniumeasy.com/test/table-sort-search-demo.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@name='alertbox']")).click();
        //driver.manage().timeouts().implicitlyWait(21, TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@name='confirmalertbox']")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//p[contains(text(),'You clicked on Cancel!')]"));
}}
