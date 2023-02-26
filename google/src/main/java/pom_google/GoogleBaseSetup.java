package pom_google;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;

import java.time.Duration;

public class GoogleBaseSetup extends GoogleConfiguration {


    public static WebDriver driver;
    public static WebDriverWait wait;


    @BeforeTest
    public static void startBrowser(@Optional("Chrome") String browser, String url) {

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
    public static void closeUp() {
        if (driver instanceof EdgeDriver) {
            driver.quit();
        } else {
            driver.close();
        }
    }


    public boolean isElementVisible(WebElement element) {

        return true;
    }


    public void scrollBy() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeAsyncScript("window.scrollBy(0,3000)", "");


    }
}
