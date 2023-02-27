package pom;

import base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ResultHomePage extends Base {
WebDriver driver;


    @FindBy(xpath = "//div[@class='error-message-container error']//h3")
    public WebElement resultLogInFailed;


    @FindBy(xpath = "//span[contains(text(),'Products')]")
    public WebElement resultLogInPassed;


    public ResultHomePage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
public String userTextVerify(){
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
    wait.until(ExpectedConditions.elementToBeClickable(resultLogInPassed));
    return resultLogInPassed.getText();
    }





}
