package pom_automation_scalduplit;


import com.aventstack.extentreports.ExtentReports;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.annotations.*;

import java.io.IOException;
import java.sql.*;
import java.time.Duration;
import java.util.HashMap;

public class BaseSetup extends Configuration {

    public static WebDriver driver;
    public static WebDriverWait wait;
    public ResultSet resultSet;

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

        Configuration config = new Configuration();
        ExelReader xlr = new ExelReader();

        String myXlPath = config.prop.getProperty("xlPath");
        String mySheet = config.prop.getProperty("sheetName");


        Object[][] data = xlr.readXl(myXlPath, mySheet);
        return data;


    }


    public BaseSetup() {
        Configuration configuration = new Configuration();
        String conUrl = configuration.prop.getProperty("jdbcUrl");
        String conUser = configuration.prop.getProperty("jdbcUser");
        String conPass = configuration.prop.getProperty("jdbcPass");
        try {
            Connection con = DriverManager.getConnection(conUrl, conUser, conPass);


            Statement q = con.createStatement();
            ResultSet resultSet = q.executeQuery("select * from sakila.login");
            this.resultSet = resultSet;


        } catch (SQLException se) {
            se.printStackTrace();
        }
    }


    public static void scrollIntoView(WebElement element, WebDriver driver) {

        JavascriptExecutor js = ((JavascriptExecutor) driver);

        js.executeScript("arguments[0].scrollIntoView(true);", element);


    }

    @DataProvider(name = "loginDataProvider")
    public Object[][] dataProvider() {
        Object[][] data = {{"sonia@gmail.com", "sony15"},
                {"leti@gmail.com", "leti01"},
                {"marc56@gmail.com", "marc49"}};
        return data;




    }}











