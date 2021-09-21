package testCases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;

public class getTest {
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
        driver.get("http://www.uitestingplayground.com/");
        driver.manage().window().setSize(new Dimension(1382, 744));

        // GET TITLE
        String Title = driver.getTitle();
        int Length;
        Length = driver.getTitle().length();
        System.out.println("le titre est :" + Title + "" + " la langueur est :" + Length);

        //get url and verify
        String currentURL = driver.getCurrentUrl();
        if (currentURL.equals("http://www.uitestingplayground.com/")) {
            System.out.println("on est dans la page correcte");
        } else {
            System.out.println("Erreur");
        }


        //get source code

        String sourcePage = driver.getPageSource();
        int sourcePageLength = sourcePage.length();

        //print length

        System.out.println("la langueur de sourcePage est :" + sourcePageLength);

    }
}
