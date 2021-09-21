package testCases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Automatitest {
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

        driver.get("http://practice.automationtesting.in/");
        driver.manage().window().setSize(new Dimension(1382, 744));
        driver.findElement(By.xpath("//a[.='Shop']")).click();
       // wait.until(ExpectedConditions.u)
        driver.findElement(By.xpath("//a[.='Home']")).click();
        List<WebElement> elements= driver.findElements(By.className("products"));
        System.out.println("nombre d'element est"+ elements.size());
        if (elements.size()==3){
            System.out.println("le nombre des livres sont vérifié");
        }
        driver.quit();
    }
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='bg-success']")));
       // driver.findElement(By.xpath("//p[contains(text(),'Data calculated on the client side.')]"));

}
