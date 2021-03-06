package testCases;// Generated by Selenium IDE
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class FirstTest {
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
  public void firsTest() {
    driver.get("http://www.uitestingplayground.com/");
    driver.manage().window().setSize(new Dimension(1382, 744));
    driver.findElement(By.linkText("Class Attribute")).click();
    driver.findElement(By.linkText("Resources")).click();
    driver.findElement(By.linkText("Home")).click();
  }
}
