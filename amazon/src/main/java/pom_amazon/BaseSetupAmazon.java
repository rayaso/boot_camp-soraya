package pom_amazon;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import net.bytebuddy.build.Plugin;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverListener;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class BaseSetupAmazon extends ConfigAmazon {
    public static WebDriver driver;

    public static WebDriverWait wait;
    public static WebDriverListener listener;

    public ExtentSparkReporter htmlReporter;
    public ExtentReports extent;
    public ExtentTest test;


    @BeforeTest()
    public static void startBrowser(@Optional("Edge") String browser, String url)  {

        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        }
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.manage().window().maximize();
        driver.get(getUrl());
    }


   @AfterTest
    public  void closeUp() {
        if (driver instanceof EdgeDriver) {
            driver.quit();
        } else {
            driver.close();
        }}


    public boolean isElementVisible(WebElement element) {

        return true;
    }



    //@BeforeTest/*or if i have multiple test i have to write before class*/
    /*public void setExtent() {
        htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/test-output/myReport.html");
        htmlReporter.config().setDocumentTitle("Automation Report");
        htmlReporter.config().setReportName("Functional Report");
        htmlReporter.config().setTheme(Theme.DARK);
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        extent.setSystemInfo("hostName", "localHost");
        extent.setSystemInfo("operating", "windows");
        extent.setSystemInfo("testerName", "soraya");
        extent.setSystemInfo("browser", "edge");
    }

    @AfterTest
    public void endReport() {
        extent.flush();

    }

    @AfterMethod
    public void tearDown(ITestResult result) throws IOException {


        if (result.getStatus() == ITestResult.FAILURE) {
            test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + "test case failed", ExtentColor.RED));
            test.log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable() + "test case failed", ExtentColor.RED));
            String screenshotPath = getScreenshot(driver, result.getName());
            test.fail("test case failed snapshot is below" + test.addScreenCaptureFromPath(screenshotPath));

        } else if (result.getStatus() == ITestResult.SKIP) {
            test.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + "test case skipped", ExtentColor.RED));

        } else if (result.getStatus() == ITestResult.SUCCESS) {
            test.log(Status.PASS, MarkupHelper.createLabel(result.getName() + "test case pass", ExtentColor.GREEN));

        }
        driver.quit();
    }


    public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException {
        String dateName = new SimpleDateFormat("yyyMMddhhmmss").format(new Date());
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String destination = System.getProperty("user.dir") + "\\Screenshot\\" + screenshotName + dateName + ".png";
        File finalDestination = new File(destination);
        FileUtils.copyFile(source, finalDestination);
        return destination;


    }*/







}




