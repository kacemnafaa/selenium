package testCases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;

public class Flachscor {
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
    public void firstTeststeps() {
        // open url
        driver.get("http://www.flashscore.com/");
        driver.manage().window().setSize(new Dimension(1382, 744));

        // GET TITLE
        String Title = driver.getTitle();

        System.out.println("le titre est :" + Title );

        //click on match
        driver.findElement(By.xpath("//div[contains(text(),'Betis')]")).click();
        //Thread.sleep(5000);
        //obtenir l'url de la page
        String url =driver.getCurrentUrl();
        //imprimer  l'url de la page sur la console intrellij
        System.out.println("l'url de la page="+url);
        driver.close();


    }
}
