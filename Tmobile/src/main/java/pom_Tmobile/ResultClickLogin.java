package pom_Tmobile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ResultClickLogin extends Base{



    @FindBy(xpath = "//input[@id='usernameTextBox']")
    public WebElement resultClickLoginEmail;
    @FindBy(xpath = "//button[@id='lp1-next-btn]//span")
    public WebElement next;


    @FindBy(xpath = "//div[@class='server-error-alert']//span")
    public WebElement resultResultClickLogin;

    public ResultClickLogin() {
        PageFactory.initElements(driver, this);
    }

    public void clickResultClickLoginEmail(String email) {
         wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        //wait.until(ExpectedConditions.elementToBeClickable(resultClickLoginEmail));
        resultClickLoginEmail.sendKeys(email);
    }

    public void clickNext() {
         wait = new WebDriverWait(driver, Duration.ofSeconds(30));
       // wait.until(ExpectedConditions.elementToBeClickable(next));
        next.click();
    }
public void doNext(String email){
    clickResultClickLoginEmail(email);
        clickNext();
}

}
