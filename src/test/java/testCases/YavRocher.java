package testCases;

import common.GenericTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.testng.annotations.Test;

public class YavRocher extends GenericTest {
  @Test
  public void FirstStep()

    {
        driver.get("https://www.yves-rocher.fr/");
        driver.findElement(By.xpath("//span[.='mon COMPTE']")).click();
        driver.findElement(By.linkText("Resources")).click();
        driver.findElement(By.linkText("Home")).click();
    }
}
