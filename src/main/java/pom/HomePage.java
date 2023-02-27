package pom;

import base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends Base {

WebDriver driver;
    @FindBy(xpath = "//input[@id='user-name']")
    public WebElement username;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;
    @FindBy(xpath = "//input[@id='login-button']")
    public WebElement logIn;

    public HomePage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }


    public void enterUsername(String usernameOne) {

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(username));
       sendKeysToElement(username,usernameOne);

    }



    public void enterPassword(String passwordOne) {

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(password));
        sendKeysToElement(password,passwordOne);

    }


    public void clickLogin() {

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(logIn));
        clickOnElement(logIn);

    }





  /*  @Then("error message will show{string}")
    public void error_message_will_show(String expectedErrorMessage) {
        String actualErrorMessage=driver.findElement(By.xpath("//div[@class='error-message-container error']//h3")).getText();
        System.out.println("error message:"+actualErrorMessage);
        Assert.assertEquals(actualErrorMessage,expectedErrorMessage);

    }*/
}






