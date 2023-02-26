package pom_amazon;

import amazon.com.eventdriverlisteners.ListenersForAllIcon;
import amazon.com.eventdriverlisteners.ListenersTestActionS;
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
    public static ExtentSparkReporter spark;
    public static ExtentReports extent;
    public ExtentTest logger;
public static JavascriptExecutor jsDriver;

    @BeforeTest()
    public static void startBrowser(@Optional("Edge") String browser, String url) throws IOException {

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
    @BeforeTest()
    public void startReport() throws IOException {
        extent = new ExtentReports();
        spark = new ExtentSparkReporter(System.getProperty("user.dir") + "/test-output/TestReports.html");
        extent.attachReporter(spark);


        //for design purposes
        extent.setSystemInfo("host name", "software testing");
        extent.setSystemInfo("envirenment", "qa");
        extent.setSystemInfo("name", "soraya");
        spark.config().setDocumentTitle("testReports");
        spark.config().setTheme(Theme.DARK);
    }




    @BeforeMethod
    public void setup(){
        driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.get(getUrl());
    }

    @AfterMethod
    public void getResult(ITestResult result) throws Exception {
        if (result.getStatus() == ITestResult.FAILURE) {
            logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + "test case failed", ExtentColor.RED));
            logger.log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable() + "test case failed", ExtentColor.RED));
            String screenshotPath = getScreenshot(driver, result.getName());
            logger.fail("test case failed snapshot is below" + logger.addScreenCaptureFromPath(screenshotPath));

        } else if (result.getStatus() == ITestResult.SKIP) {
            logger.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + "test case skipped", ExtentColor.RED));

        } else if (result.getStatus() == ITestResult.SUCCESS) {
            logger.log(Status.PASS, MarkupHelper.createLabel(result.getName() + "test case pass", ExtentColor.GREEN));

        }

        driver.close();

        }

    public static  String getScreenshot(WebDriver driver,String screenshotName)throws IOException{
        String dateName=new SimpleDateFormat("yyyMMddhhmmss").format(new Date());
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source=ts.getScreenshotAs(OutputType.FILE);
        String destination=System.getProperty("user.dir")+"\\Screenshot\\"+screenshotName+dateName+".png";
        File finalDestination=new File(destination);
        FileUtils.copyFile(source,finalDestination);
        return destination;

    }

   /* public void listenersS(){
        WebDriverListener listener = new DriverEventListners.DriverEventListener();
        driver = new EventFiringDecorator(listener).decorate(driver);}*/


   /* public void listenersOnActionS() {

        EventFiringWebDriver eventDriver = new EventFiringWebDriver(driver);
        ListenersTestActionS listeners1 = new ListenersTestActionS();
        eventDriver.register(listeners1);
        eventDriver.get(getUrl());
        eventDriver.findElement
                (By.xpath("//a[@class='nav-logo-link nav-progressive-attribute']")).click();

    }*/

  /*  public void listenersOnAllIcon() {

        EventFiringWebDriver eventDriver = new EventFiringWebDriver(driver);
        ListenersForAllIcon Listeners2 = new ListenersForAllIcon();
        eventDriver.register(Listeners2);
        eventDriver.get(getUrl());
        eventDriver.findElement
                (By.xpath("//select[@class='nav-search-dropdown searchSelect nav-progressive-attrubute nav-progressive-search-dropdown']")).click();

    }*/


   @AfterTest
    public  void closeUp() {
        if (driver instanceof EdgeDriver) {
            driver.quit();
        } else {
            driver.close();
        }}
    @AfterTest
       public void endReport(){
            extent.flush();
        }



    public boolean isElementVisible(WebElement element) {

        return true;
    }








}
