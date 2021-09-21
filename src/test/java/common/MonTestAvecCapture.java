package common;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class MonTestAvecCapture {
    static ExtentTest test;
    static ExtentReports report;
    private WebDriver driver;

    @BeforeClass
    public void startTest() {
        report = new ExtentReports(System.getProperty("user.dir") + "\\ExtentReportResults.html");
        test = report.startTest(this.getClass().getSimpleName());
    }

    @Test
    public void extentReportsDemo() throws IOException {
        System.setProperty("webdriver.chrome.driver", "D://webdriver//chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.yahoo.fr");
        if (driver.getTitle().equals("Google")) {
            test.log(LogStatus.PASS, "Navigated to the specified URL");
        } else {
            test.log(LogStatus.FAIL, test.addScreenCapture(capture(driver)) + "Test Failed");

        }

    }

    @AfterClass
    public static void endTest() {

        report.endTest(test);
        report.flush();
    }

    public static String capture(WebDriver driver) throws IOException {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File Dest = new File("src/../ErrImages/" + System.currentTimeMillis()
                + ".png");
        String errflpath = Dest.getAbsolutePath();
        FileUtils.copyFile(scrFile, Dest);
        return errflpath;
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
