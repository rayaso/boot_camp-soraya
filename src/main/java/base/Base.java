package base;

import config.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Base extends Config {



    public static WebDriver driver;
    public static WebDriverWait wait;



    public static void startBrowser( String browser, String url) {

        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        }
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.manage().window().maximize();
        driver.get(url);


    }
public void sendKeysToElement(WebElement element,String Keys){
        element.sendKeys(Keys);
}
public void clickOnElement(WebElement element){
        element.click();

}

    public void closeUp() {

            driver.quit();

    }


    public boolean isElementVisible(WebElement element) {

        return true;
    }




}














