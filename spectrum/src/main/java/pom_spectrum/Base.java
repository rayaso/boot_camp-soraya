package pom_spectrum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;

import java.io.IOException;
import java.time.Duration;

public class Base extends Config{


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
    @DataProvider(name = "Excel Data Provider"/*any name you want just in your test should be the same*/)

    public Object[][] dataP() throws IOException {

        Config config = new Config();
        ExelReader xlr = new ExelReader();

        String myXlPath = config.prop.getProperty("xlPath");
        String mySheet = config.prop.getProperty("sheetName");


        Object[][] data = xlr.readXl(myXlPath, mySheet);
        return data;

}}
