package testCases;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class Exercice2 {
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
        // open url
        driver.get("http://uitestingplayground.com");
        driver.manage().window().setSize(new Dimension(1382, 744));
        //clicker sur le bouton ID
        driver.findElement(By.xpath("//a[contains(text(),'Dynamic ID')]")).click();
        //clicker sur le bouton Ressources
        driver.findElement(By.xpath("//a[contains(text(),'Resources')]")).click();
        //Revener page d'accueil
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        //Revener page dynamic ID
        driver.navigate().forward();
        Thread.sleep(5000);
        //Actualiser la page
        driver.navigate().refresh();
        //fermer la navigateur
        Thread.sleep(5000);
        /*WebElement element=driver.findElement(By.id(""));
        element.*/
        driver.quit();


    }
}
