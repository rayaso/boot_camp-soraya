package pom_bankofamerica;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

public class BaseBankOfAmerica extends ConfigBankOfAmerica {


    public static WebDriver driver;
    public static WebDriverWait wait;


    @BeforeTest
    public static void startBrowser(@Optional("Edge") String browser, String url) {

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


    @DataProvider(name = "loginDataProvider")
    public Object[][] dataProvider() {
        Object[][] data = {{"sonia@gmail.com", "sony15"},
                {"leti@gmail.com", "leti01"},
                {"marc56@gmail.com", "marc49"}};
        return data;


    }


    public static void scrollIntoView(WebElement element, WebDriver driver) {

        JavascriptExecutor js = ((JavascriptExecutor) driver);

        js.executeScript("arguments[0].scrollIntoView(true);", element);


    }

}










