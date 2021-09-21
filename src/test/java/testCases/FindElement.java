package testCases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindElement {
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
        // open url
        driver.get("http://www.uitestingplayground.com/");
        driver.manage().window().setSize(new Dimension(1382, 744));
        //Passer à la page Sample APP
        driver.findElement(By.xpath("//a[.='Sample App']")).click();
        /* Thread.sleep(5000); */
        List<WebElement> elementName= driver.findElements(By.tagName("input"));
        if (elementName.size() !=0)
        {
            System.out.println(elementName.size()+" Element found by TagName as input \n ");

        for (WebElement inputElement:elementName) {
            System.out.println(inputElement.getAttribute("placeholder"));
            inputElement.sendKeys("admin");

        }
        Thread.sleep(5000);
        driver.close();
}}}
