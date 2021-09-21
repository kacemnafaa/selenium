package testCases;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Formulaire {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C://webdriver//chromedriver.exe");
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @AfterTest
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void firstTeststeps() throws InterruptedException {
        // va attendre un max de 20 seconde si ne trouve pas l'element
        //driver.manage().timeouts().implicitlyWait(21, TimeUnit.SECONDS);
        WebDriverWait wait=new WebDriverWait(driver,10);

        driver.get("https://nxtgenaiacademy.com/demo-site/");
        driver.manage().window().setSize(new Dimension(1382, 744));
        driver.findElement(By.cssSelector(".vfb-section-1 > li:nth-of-type(1) > .vfb-text")).sendKeys("nafaa");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".vfb-section-1 > li:nth-of-type(2) > .vfb-text")).sendKeys("kacem");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[.='Male']")).click();
       // se.selectByValue("Male");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector(".vfb-item-address span:nth-of-type(1) > .vfb-text")).sendKeys("Bekalta");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".vfb-item-address span:nth-of-type(2) > .vfb-text")).sendKeys("Sidi Szid");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".vfb-item-address span:nth-of-type(3) > .vfb-text")).sendKeys("ll");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".vfb-item-address span:nth-of-type(5) > .vfb-text")).sendKeys("Monastir");
        Thread.sleep(1000);
        Select se = new Select(driver.findElement(By.xpath("//li[@class='vfb-item vfb-item-address  ']//select[@class='vfb-select  ']")));
        se.selectByValue("Tunisia");
        Thread.sleep(5000);

        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".vfb-section-1 > li:nth-of-type(1) > .vfb-text")[contains(text(),'nafaa')]));
       // driver.findElement(By.xpath("//p[contains(text(),'You clicked on Cancel!')]"));
        //driver.findElement(By.xpath("//ul[@class='vfb-section vfb-section-1']/li[1]/input[@class='vfb-text  vfb-medium  required  '][contains(text(),'nafaa')]"));
        // wait.until(ExpectedConditions.u)
       /* driver.findElement(By.xpath("//a[.='Home']")).click();
        List<WebElement> elements= driver.findElements(By.className("products"));
        System.out.println("nombre d'element est"+ elements.size());
        if (elements.size()==3){
            System.out.println("le nombre des livres sont vérifié");
        }
        driver.quit();
    }
    // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='bg-success']")));
    // driver.findElement(By.xpath("//p[contains(text(),'Data calculated on the client side.')]"));*/
}}
